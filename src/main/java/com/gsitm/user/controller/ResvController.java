/**
 * @programName : ResvController.java
 * @author      : ������
 * @date        : 2018-06-11
 * @function    : ���� ����
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

import com.gsitm.user.service.ResvService;

@Controller
@RequestMapping("/resv/*")
public class ResvController {
	@Inject
	ResvService ResvService;
	
	@RequestMapping("resvStep1.do")
	public String resvStep1() {
		return "user/rsvSelectWork";
	}
	
	@RequestMapping("resvStep2.do")
	public String resvStep2() {
		return "user/reservation";
	}
}
