package com.korea.scoreInquiry.service;

public interface ScoreInquiryService {

	//전체 성적 조회
	public void getScoreListAll();
	
	//현재학기 성적조회
	public void getScoreListNow();
	
	//학과생 성적조회
	public void getScoreListDepartment();
	
	//수강생 성적조회
	public void getScoreListPro();
}
