package com.gsitm.user.model.dao;

import java.util.List;

import com.gsitm.common.dto.WorkSpaceDTO;


/**
 * @programName : WorkSpaceDAO.java
 * @author      : ������
 * @date        : 2018. 6. 13. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
public interface WorkSpaceDAO {

	List<WorkSpaceDTO> getWorkSpaceList(WorkSpaceDTO workSpaceDTO);
}
