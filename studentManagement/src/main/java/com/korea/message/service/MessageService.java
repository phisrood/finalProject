package com.korea.message.service;


public interface MessageService {
	
	//새로운 쪽지 리스트 안읽은쪽지만 출력
	public void getMessageNewList();
	
	//전체 쪽지 리스트
	public void getMessageAllList();
	
	//쪽지조회
	public void getMessageInfo();
	
	//수신사용자검색 다른쪽 VO 리턴
	public void getMessageUserSearch();
	
	//쪽지발신
	public void insertMessage();
	
	//쪽지삭제
	public void deleteMessage();
	
	
	
	
}
