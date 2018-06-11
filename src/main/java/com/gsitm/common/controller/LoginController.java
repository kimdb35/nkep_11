package com.gsitm.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @programName : LoginController.java
 * @author      : �赿��
 * @date        : 2018. 6. 11. 
 * @function    : �α��� ��Ʈ�ѷ�
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
@Controller
public class LoginController {
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginPageView() {
		return "login";
	}
}
