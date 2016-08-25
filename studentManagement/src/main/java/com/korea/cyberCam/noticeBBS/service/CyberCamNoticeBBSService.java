package com.korea.cyberCam.noticeBBS.service;

public interface CyberCamNoticeBBSService {

	//공지사항게시판 리스트
	public void getNoticeBBSList();
	
	//공지사항게시판 상세보기
	public void getNoticeBBSDetail();
	
	//공지사항게시판 등록
	public void insertNoticeBBS();
	
	//공지사항게시판 삭제
	public void deleteNoticeBBS();
	
	//공지사항게시판 수정
	public void updateNoticeBBS();

	//공지사항 파일다운로드
	public void getNoticeFileDown();
}
