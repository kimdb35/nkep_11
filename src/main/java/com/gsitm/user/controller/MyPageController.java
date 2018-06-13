/**
 * @programName : MyPageController.java
 * @author      : �赿��
 * @date        : 2018. 6. 11. 
 * @function    : mypage ó�� controller
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
package com.gsitm.user.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gsitm.common.dto.BlackListLogDTO;
import com.gsitm.common.dto.EmployeeDTO;
import com.gsitm.user.service.BlackListService;
import com.gsitm.user.service.ResvService;


@Controller
public class MyPageController {
	
	
	@Resource(name="blkService")
	private BlackListService bService;
	
	@Resource(name="resvService")
	private ResvService rService;

	
	@RequestMapping(value="/myPage/info.do", method=RequestMethod.GET)
	public ModelAndView myPageInfoView(HttpSession session) {
		ModelAndView model = new ModelAndView("user/myPage/myInfo");
		EmployeeDTO emp = (EmployeeDTO) session.getAttribute("sessionID");
		List<BlackListLogDTO> blkList = bService.forUserList(emp.getEmpId());
		int blkCount = bService.blackListCount(emp.getEmpId());
		model.addObject("blkList", blkList);
		model.addObject("blkCount", blkCount);
		return model;
	}
	
	
	@RequestMapping(value="/myPage/myReserva.do", method=RequestMethod.GET)
	public String myPageRsvView() {
		return "user/myPage/myReservation";
	}
}
