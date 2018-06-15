package com.gsitm.admin.model.dao;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.MeetingRoomDTO;

/**
 * @programName : MtRoomForImgDAOImpl.java
 * @author      : ������
 * @date        : 2018. 6. 15. 
 * @function    : 
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
@Repository
public class MtRoomForImgDAOImpl implements MtRoomForImgDAO{

	@Inject
	private SqlSession sqlSession;

	@Override
	public Map<String, Object> getByteMtImage(MeetingRoomDTO meetingRoomDTO) {
		return sqlSession.selectOne("mtRoom.getByteMtImage", meetingRoomDTO);
	}

}
