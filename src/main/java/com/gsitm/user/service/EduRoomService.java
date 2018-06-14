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

import com.gsitm.common.dto.EducationRoomDTO;
import com.gsitm.user.model.dao.EduRoomDAO;

@Service
public class EduRoomService {

	@Inject
	private EduRoomDAO eduRoomDAO;
	
	public List<EducationRoomDTO> getEduRoomList(EducationRoomDTO educationRoomDTO){
		return eduRoomDAO.getEduRoomList(educationRoomDTO);
	}
}
