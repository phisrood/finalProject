package com.korea.indivInfoManage.dao;

public interface IndivInfoManageDAO {

	//개인신상정보 조회
	public String getIndivInfo();
	
	//개인신상정보 수정
	public String updateIndiv();
	
	//학적변동현황
	public String getColleageChangeList();
}
