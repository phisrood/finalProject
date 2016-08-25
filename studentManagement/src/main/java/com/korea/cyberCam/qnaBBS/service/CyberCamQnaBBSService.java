package com.korea.cyberCam.qnaBBS.service;

public interface CyberCamQnaBBSService {

	//qna게시판 리스트
	public void getQnaBBSList();
	
	//qna게시판 상세보기
	public void getQnaBBSDetail();
	
	//qna게시판 등록
	public void insertQnaBBS();
	
	//qna게시판 삭제
	public void deleteQnaBBS();
	
	//qna게시판 수정
	public void updateQnaBBS();
}
