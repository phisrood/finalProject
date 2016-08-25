package com.korea.cyberCam.studyBBS.service;

public interface CyberCamStudyBBSService {

	//학습게시판 리스트
	public void getStudyBBSList();
	
	//학습게시판 상세보기
	public void getStudyBBSDetail();
	
	//학습게시판 등록
	public void insertStudyBBS();
	
	//학습게시판 삭제
	public void deleteStudyBBS();
	
	//학습게시판 수정
	public void updateStudyBBS();
	
	//학습게시판 파일다운로드
	public void getStudyBBSFileDown();
}
