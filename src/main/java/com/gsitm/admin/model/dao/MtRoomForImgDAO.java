package com.gsitm.admin.model.dao;

import java.util.Map;

import com.gsitm.common.dto.MeetingRoomDTO;

/**
 * @programName : MtForImgDAO.java
 * @author      : ������
 * @date        : 2018. 6. 15. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
public interface MtRoomForImgDAO {

	Map<String, Object> getByteMtImage(MeetingRoomDTO meetingRoomDTO);
}
