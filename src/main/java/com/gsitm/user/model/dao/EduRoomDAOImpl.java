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

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.EducationRoomDTO;

@Repository
public class EduRoomDAOImpl implements EduRoomDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<EducationRoomDTO> getEduRoomList(EducationRoomDTO educationRoomDTO) {
		return sqlSession.selectList("eduRoom.getEduRoomList", educationRoomDTO);
	}

}
