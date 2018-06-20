package com.gsitm.admin.model.dao;

import java.util.List;
import java.util.Map;

import com.gsitm.common.dto.EmployeeDTO;
import com.gsitm.common.dto.WorkSpaceDTO;

/**
 * @programName : EmployeeForAdminDAO.java
 * @author      : ������
 * @date        : 2018. 6. 13. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
public interface EmployeeForAdminDAO {

	List<EmployeeDTO> getWorkSpaceListForAdmin(EmployeeDTO employeeDTO);

	List<EmployeeDTO> getNormalForAdmin(EmployeeDTO employeeDTO);

	void changeEmpMgrToNormal(EmployeeDTO employeeDTO);

	void changeEmpNormalToMgr(EmployeeDTO employeeDTO);
	
}
