/**
 * @programName : EmailService.java
 * @author      : ������
 * @date        : 2018-06-11
 * @function    : ���ϸ� ����
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������	   2018-06-11	�ʾ�
 */ 

package com.gsitm.user.service;

import com.gsitm.common.dto.*;

public interface EmailService {
	public void sendMail(EmailDTO dto);
}
