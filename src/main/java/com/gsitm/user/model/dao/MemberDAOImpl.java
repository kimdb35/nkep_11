package com.gsitm.user.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.EmployeeDTO;
import com.gsitm.common.dto.TeamDTO;

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
@Repository(value="memDao")
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<EmployeeDTO> showTeamMember(String teamSeq) {
		return sqlSession.selectList("member.showTeamMember", teamSeq);
	}
	
	@Override
	public TeamDTO showTeamInfo(String empId) {
		return sqlSession.selectOne("member.showTeamInfo", empId);
	}
	
	@Override
	public int memCount(String empId) {
		return sqlSession.selectOne("member.memCount", empId);
	}

	@Override
	public List<EmployeeDTO> allMemberListAjax() {
		return sqlSession.selectList("member.allMemberListAjax");
	}

}
