package com.korea.indivInfoManage.service;

import com.korea.dto.StudentVO;

public interface IndivInfoManageService {

	//개인신상정보 조회
	public StudentVO getIndivInfo(String id);
	
	//개인신상정보 수정
	public String updateIndiv();
	
	//학적변동현황
	public String getColleageChangeList();
}
