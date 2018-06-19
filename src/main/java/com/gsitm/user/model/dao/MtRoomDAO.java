/**
 * @programName : MtRoomDAO.java
 * @author      : ������
 * @date        : 2018-06-14
 * @function    : ȸ�ǽ� DAO
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������	   2018-06-11	�ʾ�
 */ 
package com.gsitm.user.model.dao;

import java.util.List;

import com.gsitm.common.dto.MeetingRoomDTO;

public interface MtRoomDAO {
	List<MeetingRoomDTO> getMtRoomList(MeetingRoomDTO meetingRoomDTO);
	List<MeetingRoomDTO> getAnyRoomInfo(String roomSeq);
}
