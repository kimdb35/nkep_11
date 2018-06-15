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

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsitm.common.dto.ResvConfirmInfoDTO;
import com.gsitm.common.dto.ResvItemInfoDTO;
import com.gsitm.common.dto.ResvUserInfoDTO;
import com.gsitm.user.model.dao.ResvDAOImpl;

@Service(value="resvService")
public class ResvService {
	
	@Resource(name="resvDao")
	private ResvDAOImpl rDao;
	
	public List<ResvUserInfoDTO> showResvUserList(String rsvSeq) {
		return rDao.showResvUserList(rsvSeq);
	}

	public List<ResvItemInfoDTO> showResvItemList(String rsvSeq) {
		return rDao.showResvItemList(rsvSeq);
	}

	public List<ResvConfirmInfoDTO> showResvConfirmList(String empId) {
		return rDao.showResvConfirmList(empId);
	}
	
	public int resvCount(String empId) {
		return rDao.resvCount(empId);
	}
	
	public ResvConfirmInfoDTO showResvDetail(String rsvSeq) {
		return rDao.showResvDetail(rsvSeq);
	}
}

