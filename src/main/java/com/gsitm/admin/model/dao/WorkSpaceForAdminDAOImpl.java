package com.gsitm.admin.model.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.WorkSpaceDTO;

/**
 * @programName : WorkSpaceForAdminDAOImpl.java
 * @author      : ������
 * @date        : 2018. 6. 13. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
@Repository
public class WorkSpaceForAdminDAOImpl implements WorkSpaceForAdminDAO{

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<WorkSpaceDTO> getWorkSpaceListForAdmin(WorkSpaceDTO workSpaceDTO) {
		return sqlSession.selectList("workSpace.getWorkSpaceListForAdmin");
	}

	@Override
	public WorkSpaceDTO getWorkSpaceForAdmin(WorkSpaceDTO workSpaceDTO) {
		return null;
	}

	@Override
	public void insertWorkSpaceForAdmin(WorkSpaceDTO workSpaceDTO) {
		sqlSession.insert("workSpace.insertWorkSpaceForAdmin", workSpaceDTO);
	}

	@Override
	public void deleteWorkSpaceForAdmin(WorkSpaceDTO workSpaceDTO) {
		sqlSession.delete("workSpace.deleteWorkSpaceForAdmin", workSpaceDTO);
	}

	@Override
	public Map<String, Object> getByteImage(WorkSpaceDTO workSpaceDTO) {
		return sqlSession.selectOne("workSpace.getByteImage", workSpaceDTO);
	}

	@Override
	public WorkSpaceDTO getWorkSpaceByWorkSeq(WorkSpaceDTO workSpaceDTO) {
		return sqlSession.selectOne("workSpace.getWorkSpaceByWorkSeq",workSpaceDTO);
	}

	@Override
	public void updateWorkSpaceNotIncludePic(WorkSpaceDTO workSpaceDTO) {
		sqlSession.update("workSpace.updateWorkSpaceNotIncludePic", workSpaceDTO);
	}

	@Override
	public void updateWorkSpaceIncludePic(WorkSpaceDTO workSpaceDTO) {
		sqlSession.update("workSpace.updateWorkSpaceIncludePic",workSpaceDTO);
	}

}
