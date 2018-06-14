package com.gsitm.user.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.gsitm.common.dto.WorkSpaceDTO;
import com.gsitm.user.model.dao.WorkSpaceDAO;

/**
 * @programName : WorkSpaceService.java
 * @author      : ������
 * @date        : 2018. 6. 13. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
@Service
public class WorkSpaceService {

	@Inject
	private WorkSpaceDAO workSpaceDAO;
	
	public List<WorkSpaceDTO> getWorkSpaceList(WorkSpaceDTO workSpaceDTO){
		return workSpaceDAO.getWorkSpaceList(workSpaceDTO);
	}
}
