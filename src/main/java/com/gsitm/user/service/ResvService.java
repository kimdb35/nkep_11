/**
 * @programName : ResvService.java
 * @author      : ������
 * @date        : 2018-06-11
 * @function    : ���ϸ� ����
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������	   2018-06-11	�ʾ�
 */ 

package com.gsitm.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsitm.user.model.dao.ResvDAOImpl;

@Service(value="resvService")
public class ResvService {
	
	@Resource(name="resvDao")
	private ResvDAOImpl rDao;
	
	
}

