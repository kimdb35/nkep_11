package com.gsitm.admin.model.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.EducationRoomDTO;

/**
 * @programName : EduRoomForImgDAOImpl.java
 * @author      : ������
 * @date        : 2018. 6. 14. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
@Repository
public class EduRoomForImgDAOImpl implements EduRoomForImgDAO{

	@Inject
	private SqlSession sqlSession;

	@Override
	public Map<String, Object> getByteEduImage(EducationRoomDTO educationRoomDTO) {
		return sqlSession.selectOne("eduRoom.getByteEduImage", educationRoomDTO);
	}

}
