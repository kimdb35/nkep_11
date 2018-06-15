package com.gsitm.admin.model.dao;

import java.util.Map;

import com.gsitm.common.dto.EducationRoomDTO;

/**
 * @programName : EduRoomForImgDAO.java
 * @author      : ������
 * @date        : 2018. 6. 14. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
public interface EduRoomForImgDAO {

	Map<String, Object> getByteEduImage(EducationRoomDTO educationRoomDTO);
}
