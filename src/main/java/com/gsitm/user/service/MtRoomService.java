/**
 * @programName : MtRoomService.java
 * @author      : ������
 * @date        : 2018. 6. 14. 
 * @function    : ȸ�ǽ� ����
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������ 	  2018-06-14    �ʾ� 	
 */ 

package com.gsitm.user.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.gsitm.common.dto.MeetingRoomDTO;
import com.gsitm.user.model.dao.MtRoomDAO;

@Service
public class MtRoomService {

	@Inject
	private MtRoomDAO mtRoomDAO;
	
	public List<MeetingRoomDTO> getMtRoomList(MeetingRoomDTO meetingRoomDTO){
		return mtRoomDAO.getMtRoomList(meetingRoomDTO);
	}
}
