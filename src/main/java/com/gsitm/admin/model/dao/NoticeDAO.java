package com.gsitm.admin.model.dao;

import java.util.List;
import java.util.Map;

import com.gsitm.common.dto.NoticeDTO;


/**
 * @programName : NoticeDAO.java
 * @author      : ������
 * @date        : 2018. 6. 17. 
 * @function    :  
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * 
 */ 
public interface NoticeDAO {

	List<NoticeDTO> getNoticeList(NoticeDTO noticeDTO);
	
	void deleteNotice(NoticeDTO noticeDTO);
	
	void insertNotice(NoticeDTO noticeDTO);
}
