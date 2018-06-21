package com.gsitm.common.dto;

/**
 * @programName : ResvDTO.java
 * @author      : ������
 * @date        : 2018-06-11
 * @function    : ���� ����
 *
 * [�̸�]   [������]     [����]
 * ----------------------------------------------------------
 * ������	   2018-06-11	�ʾ�
 */

public class ResvDTO {
	private String rsvSeq;
	private double rsvCnt;
	private String rsvDate;
	private String rsvFdate;
	private String roomSeq;
	private String roomType;
	private double rsvPrice;
	private String rsvType;
	private String workSeq;
	private String applicant;

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getRsvSeq() {
		return rsvSeq;
	}

	public void setRsvSeq(String rsvSeq) {
		this.rsvSeq = rsvSeq;
	}

	public double getRsvCnt() {
		return rsvCnt;
	}

	public void setRsvCnt(double rsvCnt) {
		this.rsvCnt = rsvCnt;
	}

	public String getRsvDate() {
		return rsvDate;
	}

	public void setRsvDate(String rsvDate) {
		this.rsvDate = rsvDate;
	}

	public String getRsvFdate() {
		return rsvFdate;
	}

	public void setRsvFdate(String rsvFdate) {
		this.rsvFdate = rsvFdate;
	}

	public String getRoomSeq() {
		return roomSeq;
	}

	public void setRoomSeq(String roomSeq) {
		this.roomSeq = roomSeq;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getRsvPrice() {
		return rsvPrice;
	}

	public void setRsvPrice(double rsvPrice) {
		this.rsvPrice = rsvPrice;
	}

	public String getRsvType() {
		return rsvType;
	}

	public void setRsvType(String rsvType) {
		this.rsvType = rsvType;
	}

	public String getWorkSeq() {
		return workSeq;
	}

	public void setWorkSeq(String workSeq) {
		this.workSeq = workSeq;
	}

}
