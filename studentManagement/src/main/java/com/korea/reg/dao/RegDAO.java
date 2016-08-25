package com.korea.reg.dao;

public interface RegDAO {
	
	//학생 등록 내역조회
	public void getRegList();
		
	//재적생 등록 현황
	public void getRegExpelList();
	
	//등록금 납부처리
	public void updateRegHandle();
}
