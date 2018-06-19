/**
 * @programName : MtRoomDAOImpl.java
 * @author      : ������
 * @date        : 2018-06-14
 * @function    : ȸ�ǽ� DAOImpl
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������	   2018-06-14	�ʾ�
 */ 
package com.gsitm.user.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.MeetingRoomDTO;

@Repository
public class MtRoomDAOImpl implements MtRoomDAO {
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<MeetingRoomDTO> getMtRoomList(MeetingRoomDTO meetingRoomDTO) {
		return sqlSession.selectList("mtRoom.getMtRoomList", meetingRoomDTO);
	}

	@Override
	public List<MeetingRoomDTO> getAnyRoomInfo(String roomSeq) {
		return sqlSession.selectList("mtRoom.getAnyRoomInfo", roomSeq);
	}

}
