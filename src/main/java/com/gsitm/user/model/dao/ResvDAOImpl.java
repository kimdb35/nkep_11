/**
 * @programName : ResvDAOImpl.java
 * @author      : ������
 * @date        : 2018-06-11
 * @function    : ���ϸ� ����
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������	   2018-06-11	�ʾ�
 */ 
package com.gsitm.user.model.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsitm.common.dto.ResvDTO;

@Repository
public class ResvDAOImpl implements ResvDAO {
	
	@Inject
	SqlSession sqlSession;

	@Override
	public void create(ResvDTO dto){
		// TODO Auto-generated method stub
		sqlSession.insert("resv.insert", dto);
	}

}
