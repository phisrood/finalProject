package com.korea.crsesREQ.dao;

public interface CrsesREQDAO {

	//수강리스트 조회
	public void getCrsesList();
	
	//수강리스트 검색
	public void getCrsesSearch();
	
	//수강신청(수강신청 가능 학점 배제)
	public void insertCrsesREQ();
	
	//수강신청취소
	public void deleteCrsesREQ();
	
	//수강신청한 리스트
	public void getCrsesREQList();
	
	//신청한 수강시간표 조회(시간표 중복 배제)
	public void getCrsesREQTimeTablePDF();
	
	//수간신청기간설정
	public void insertCrsesREQPeriod();
}
