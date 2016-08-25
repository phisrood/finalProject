package com.korea.notice.service;


public interface NoticeService {
	
	//공지사항 게시판 리스트 Select 최신 20~30개씩
	public void getNoticeNewList();
	
	//공지사항 미리보기 Select + 조회
	public void getNoticeInfo();
	
	//공지사항 게시판 리스트 Select 
	public void getNoticeAllList();
	
	//공지사항 수정
	public void updateNotice();
	
	//공지사항 삭제
	public void deleteNotice();
	
	//공지사항 등록
	public void insertNotice();
	
	//파일다운로드
	public void getNoticeFileDown();
	
}
