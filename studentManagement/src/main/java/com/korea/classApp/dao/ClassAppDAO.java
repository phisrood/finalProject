package com.korea.classApp.dao;

public interface ClassAppDAO {

	//수업평가 등록
	public void insertClassApp();
	
	//수업평가 조회
	public void getClassAppProList();
	
	//수업평가 통계
	public void getClassAppProStat();
	
	//수업평가 입력
	public void InsertClassAppInput();
}
