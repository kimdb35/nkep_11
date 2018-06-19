package com.gsitm.user.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.WorkSpaceDTO;

/**
 * @programName : WorkSpaceDAOImpl.java
 * @author      : ������
 * @date        : 2018. 6. 13. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
@Repository
public class WorkSpaceDAOImpl implements WorkSpaceDAO {
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<WorkSpaceDTO> getWorkSpaceList(WorkSpaceDTO workSpaceDTO) {
		return sqlSession.selectList("workSpace.getWorkSpaceList");
	}
	
}
