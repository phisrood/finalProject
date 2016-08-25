package com.korea.cyberCam.noticeBBS.dao;

public interface CyberCamNoticeBBSDAO {

	//공지사항 리스트
	public void getNoticeBBSList();
	
	//공지사항 상세보기
	public void getNoticeBBSDetail();
	
	//공지사항 등록
	public void insertNoticeBBS();
	
	//공지사항 삭제
	public void deleteNoticeBBS();
	
	//공지사항 수정
	public void updateNoticeBBS();
	
	//공지사항 파일다운로드
	public void getNoticeFileDown();
}
