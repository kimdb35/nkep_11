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

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gsitm.user.service.ResvService;

@Controller
@RequestMapping("/resv/*")
public class ResvController {
	@Resource(name="resvService")
	private ResvService ResvService;
	
	@RequestMapping("resvStep1.do")
	public String resvStep1() {
		return "user/rsvSelectWork";
	}
	
	@RequestMapping("resvStep2.do")
	public String resvStep2() {
		return "user/reservation";
	}
}
