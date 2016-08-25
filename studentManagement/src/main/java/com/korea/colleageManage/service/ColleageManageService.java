package com.korea.colleageManage.service;

public interface ColleageManageService {

	// 휴/복학 신청
	public String insertSchoolReREQ();
	
	// 휴/복학 신청현황조회
	public String getSchoolReREQList();
	
	// 휴/복학신청승인/반려
	public String updateSchoolReREQDecide();
}
