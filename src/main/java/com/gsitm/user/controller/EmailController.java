/**
 * @programName : EmailController.java
 * @author      : ������
 * @date        : 2018-06-11
 * @function    : ���ϸ� ����
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������	   2018-06-11	�ʾ�
 */ 
package com.gsitm.user.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gsitm.common.dto.EmailDTO;
import com.gsitm.user.service.EmailService;

@Controller
@RequestMapping("/email/*")
public class EmailController {
	@Inject
	EmailService emailService;
	
	@RequestMapping("write.do")
	public String write() {
		return "user/contact";	//email/write.jsp�� ������
	}
	
	@RequestMapping("send.do")
	public String send(@ModelAttribute EmailDTO dto, Model model){
		try {
			emailService.sendMail(dto);
			model.addAttribute("message", "������ �߼۵Ǿ����ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
			emailService.sendMail(dto);
			model.addAttribute("message", "������ �߼� ����...");
		}
		return "/user/contact";	// write.jsp �� ������
	}
}
