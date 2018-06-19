package com.gsitm.common.dao;

import com.gsitm.common.dto.EmployeeDTO;

/**
 * @programName : LoginDAO.java
 * @author      : �赿��
 * @date        : 2018. 6. 11. 
 * @function    : �α��� ó��  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
public interface LoginDAO {

	
	/**
	 * @methodName : loginCheck 
	 * @author     : �赿�� 
	 * @date       : 2018. 6. 11. 
	 * @function   : �α��� üũ. id, pw�� ���ؼ� ����� ����� �� count  
	 * @param empId : ���̵�
	 * @param empPw : ��й�ȣ
	 * @return
	 */ 
	int loginCheck(String empId, String empPw);
	
	/**
	 * @methodName : empInfo 
	 * @author     : �赿�� 
	 * @date       : 2018. 6. 11. 
	 * @function   : ��� ������ �ѷ��ֱ� ����.. id, �̸�, role �� return  
	 * @param empId : ���̵�
	 * @return
	 */ 
	EmployeeDTO empInfo(String empId);
	
}
