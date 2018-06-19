package com.gsitm.user.mail;

import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.velocity.VelocityEngineUtils;

public class SimpleRegistrationNotifier {

   @Autowired
   private VelocityEngine ve;
   
   @Autowired
   private JavaMailSender autoMailSender;
   
   public void sendMail(String email, int mgrNo, String empNm, String partyNm, String resDateToString, String startDateToString, String endDateToString) {
      try {
            MimeMessage message = autoMailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
            
            messageHelper.setSubject("ȸ�ǽ� ���� ���� �ȳ��Դϴ�.");   //����
            messageHelper.setFrom("stackover92@gmail.com","ȸ�ǽǰ�����");   //�����»��
            messageHelper.setTo(email);   //�޴»��
            System.out.println("��������� �� ���÷������� �Ӥ��褧�⤿�ä���������");
            Map model = new HashMap<String, String>();
            model.put("mgrNo", mgrNo);
            model.put("mreDate", empNm);
            model.put("partyNm", partyNm);
            model.put("resDateToString", resDateToString);
            model.put("startDateToString", startDateToString);
            model.put("endDateToString", endDateToString);
            System.out.println("model: " + model);
            String text = VelocityEngineUtils.mergeTemplateIntoString(
                  ve, "com/gsitm/user/mail/mailForm_default.vm", "UTF-8", model);
            System.out.println("���ϰ�����..");
            messageHelper.setText(text, true);   
            autoMailSender.send(message);
            
         } catch (Exception ex) {
            ex.printStackTrace();
         }
   }
}