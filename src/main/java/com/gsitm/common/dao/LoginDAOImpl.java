package com.gsitm.common.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.EmployeeDTO;

/**
 * @programName : LoginDAOImpl.java
 * @author      : �赿��
 * @date        : 2018. 6. 11. 
 * @function    : �α��� ó��, DAO. security ���� �� �α��� ó��
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
@Repository(value="loginDao")
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int loginCheck(String empId, String empPw) {
		EmployeeDTO emp = new EmployeeDTO(empId, empPw);
		return sqlSession.selectOne("member.loginCheck",emp);
	}
	
	@Override
	public EmployeeDTO empInfo(String empId) {
		return sqlSession.selectOne("member.empInfo", empId);
	}
	
	
}
