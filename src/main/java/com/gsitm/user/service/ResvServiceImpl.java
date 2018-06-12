/**
 * @programName : ResvServiceImpl.java
 * @author      : ������
 * @date        : 2018-06-11
 * @function    : ���ϸ� ����
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������	   2018-06-11	�ʾ�
 */ 
package com.gsitm.user.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.gsitm.user.model.dao.ResvDAO;
import com.gsitm.common.dto.ResvDTO;

@Service
public class ResvServiceImpl implements ResvService {

	@Inject
	ResvDAO resvDao;
	
	@Override
	public void create(ResvDTO dto) {
		// TODO Auto-generated method stub
		resvDao.create(dto);
	}

}
