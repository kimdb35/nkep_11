package com.gsitm.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @programName : InfoController.java
 * @author      : ������
 * @date        : 2018. 6. 12. 
 * @function    : �Ұ� ������ ó�� controller
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������ 	  2018-06-12    �ʾ� 	
 */ 

@Controller
@RequestMapping("/info/*")
public class InfoController {
	
	@RequestMapping("workspace.do")
	public String workspaceInfoView() {
		return "user/info/workspaceInfo";
	}
}
