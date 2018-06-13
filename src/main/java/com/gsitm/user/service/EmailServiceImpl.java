/**
 * @programName : EmailServiceImpl.java
 * @author      : ������
 * @date        : 2018-06-11
 * @function    : ���ϸ� ����
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������	   2018-06-11	�ʾ�
 */ 
package com.gsitm.user.service;

import javax.annotation.Resource;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.gsitm.common.dto.EmailDTO;



@Service("emailService")
public class EmailServiceImpl implements EmailService {

	@Resource(name="mailSender")
	JavaMailSenderImpl mailSender;	// ���� �߼� ��ü
	
	public void sendMail(EmailDTO dto) {
		try {
			MimeMessage msg = mailSender.createMimeMessage();
			// ���� ������ �߰�
			msg.addRecipient(RecipientType.TO, 
					new InternetAddress(dto.getReceiveMail()));
			// ���� �߽���
			msg.addFrom(new InternetAddress[] {
					new InternetAddress(dto.getSenderMail(),
					dto.getSenderName())
			});
			// ���� ����
			msg.setSubject(dto.getSubject(), "utf-8");
			// ���� ����
			msg.setText(dto.getMessage(), "utf-8");
			// �̸��� ����
			mailSender.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}