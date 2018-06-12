package com.gsitm.common.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsitm.common.dao.LoginDAOImpl;
import com.gsitm.common.dto.EmployeeDTO;

/**
 * @programName : LoginService.java
 * @author      : �赿��
 * @date        : 2018. 6. 11. 
 * @function    : �α��� ó��. ��ť��Ƽ ���� ��, �α��� ó��
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
@Service(value="loginService")
public class LoginService {

	@Resource(name="loginDao")
	private LoginDAOImpl lDao;
	
	/**
	 * @methodName : loginCheck 
	 * @author     : �赿�� 
	 * @date       : 2018. 6. 11. 
	 * @function   : �α��� üũ
	 * @param empId
	 * @param empPw
	 * @return
	 */ 
	public boolean loginCheck(String empId, String empPw) {
		boolean loginCheck = false;
		
		if(lDao.loginCheck(empId, empPw) != 0) {
			loginCheck = true;
		}
		
		return loginCheck;
	}
	
	/**
	 * @methodName : empInfo 
	 * @author     : �赿�� 
	 * @date       : 2018. 6. 11. 
	 * @function   : �Էµ� ���̵� ��� ����
	 * @param empId
	 * @return
	 */ 
	public EmployeeDTO empInfo(String empId) {
		return lDao.empInfo(empId);
	}
}
