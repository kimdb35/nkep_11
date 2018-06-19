/**
 * @programName : EduRoomDAO.java
 * @author      : ������
 * @date        : 2018. 6. 14. 
 * @function    : ������ DAO
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������ 	  2018-06-14    �ʾ� 	
 */ 
package com.gsitm.user.model.dao;

import java.util.List;

import com.gsitm.common.dto.EducationRoomDTO;

public interface EduRoomDAO {
	List<EducationRoomDTO> getEduRoomList(EducationRoomDTO educationRoomDTO);
	
	
	List<EducationRoomDTO> getAnyRoomInfo(String roomSeq);
}
