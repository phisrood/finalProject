package com.korea.crsesBook.service;

public interface CrsesBookService {

	//수강편람조회
	public void getCrsesBookList();
	
	//수강편람등록
	public void insertCrsesBook();
	
	//수강편람수정
	public void updateCrsesBook();
	
	//수강편람승인/반려
	public void updateCrsesBookDecide();
	
	
}
