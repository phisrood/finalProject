package com.korea.indivInfoManage.service;

public interface IndivInfoManageService {

	//개인신상정보 조회
	public String getIndivInfo();
	
	//개인신상정보 수정
	public String updateIndiv();
	
	//학적변동현황
	public String getColleageChangeList();
}
