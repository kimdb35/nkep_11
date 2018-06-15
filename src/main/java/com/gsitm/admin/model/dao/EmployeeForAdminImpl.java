package com.gsitm.admin.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.EmployeeDTO;

/**
 * @programName : EmployeeForAdminImpl.java
 * @author      : ������
 * @date        : 2018. 6. 14. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
@Repository
public class EmployeeForAdminImpl implements EmployeeForAdminDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<EmployeeDTO> getWorkSpaceListForAdmin(EmployeeDTO employeeDTO) {
		return sqlSession.selectList("member.getWorkSpaceListForAdmin", employeeDTO);
	}

	@Override
	public List<EmployeeDTO> getNormalForAdmin(EmployeeDTO employeeDTO) {
		return sqlSession.selectList("member.getNormalForAdmin",employeeDTO);
	}

	@Override
	public void changeEmpMgrToNormal(EmployeeDTO employeeDTO) {
		sqlSession.update("member.changeEmpMgrToNormal", employeeDTO);
	}

	@Override
	public void changeEmpNormalToMgr(EmployeeDTO employeeDTO) {
		sqlSession.update("member.changeEmpNormalToMgr",employeeDTO);
	}

}
