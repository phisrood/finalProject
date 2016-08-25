package com.korea.cyberCam.freeBBS.service;

public interface CyberCamFreeBBSService {

	//자유게시판 리스트
	public void getFreeBBSList();
	
	//자유게시판 상세보기
	public void getFreeBBSDetail();
	
	//자유게시판 등록
	public void insertFreeBBS();
	
	//자유게시판 삭제
	public void deleteFreeBBS();
	
	//자유게시판 수정
	public void updateFreeBBS();
	
	//답글등록
	public void insertFreeBBSReplyReg();
	
	//답글삭제
	public void deleteFreeBBSReply();
	
	//답글수정
	public void updateFreeBBSReply();
	
}
