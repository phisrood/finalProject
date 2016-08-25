package com.korea.majorREQ.dao;

public interface MajorREQDAO {
	
	///////////////////////부전공///////////////////////
	
	//부전공 신청
	public String insertBelongMinorREQ();
	
	//소속학과 부전공 신청내역 출력
	public String getBelongMinorREQList();
	
	//소속학과 부전공 신청 승인/반려
	public String updateBelongMinorREQDecide();
	
	//타학과 부전공 신청내역 출력
	public String getOthorsMinorREQList();
	
	//타학과 부전공 신청 승인/반려
	public String getOthorsMinorREQDecide();
	
	///////////////////////다전공///////////////////////
	
	//다전공 신청
	public String insertBelongMajorREQ();
	
	//소속학과 다전공 신청내역 출력
	public String getBelongMajorREQList();
	
	//소속학과 다전공 신청 승인/반려
	public String updateBelongMajorREQDecide();
	
	//타학과 다전공 신청내역 출력
	public String getOthorsMajorREQList();
	
	//타학과 다전공 신청 승인/반려
	public String getOthorsMajorREQDecide();
}
