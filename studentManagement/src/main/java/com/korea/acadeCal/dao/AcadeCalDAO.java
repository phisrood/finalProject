package com.korea.acadeCal.dao;

public interface AcadeCalDAO {

	//학사일정 조회
	public String getAcadeCalList();
	
	//학사일정 등록
	public String insertAcadeCal();
	
	//학사일정 수정 
	public String updateAcadeCal();
	
	//학사일정 삭제
	public String deleteAcadeCal();
	
	//학사일정 상세보기
	public void getAcadeDetail();
}
