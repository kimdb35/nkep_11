package com.gsitm.admin.model.dao;

import java.util.List;
import java.util.Map;

import com.gsitm.common.dto.WorkSpaceDTO;

/**
 * @programName : WorkSpaceForAdminDAO.java
 * @author      : ������
 * @date        : 2018. 6. 13. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
public interface WorkSpaceForAdminDAO {

	List<WorkSpaceDTO> getWorkSpaceListForAdmin(WorkSpaceDTO workSpaceDTO);
	
	WorkSpaceDTO getWorkSpaceForAdmin(WorkSpaceDTO workSpaceDTO);
	
	void insertWorkSpaceForAdmin(WorkSpaceDTO workSpaceDTO);
	
	void deleteWorkSpaceForAdmin(WorkSpaceDTO workSpaceDTO);

	Map<String, Object> getByteImage(WorkSpaceDTO workSpaceDTO);

	WorkSpaceDTO getWorkSpaceByWorkSeq(WorkSpaceDTO workSpaceDTO);

	void updateWorkSpaceNotIncludePic(WorkSpaceDTO workSpaceDTO);

	void updateWorkSpaceIncludePic(WorkSpaceDTO workSpaceDTO);
}
