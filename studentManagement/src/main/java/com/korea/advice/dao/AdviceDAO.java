package com.korea.advice.dao;

public interface AdviceDAO {

	//받은 상담 신청조회(교수)
	public void getAdviceResponsList();
	
	//보낸 상담 신청조회(학생)
	public void getAdviceRequestList();
	
	//상담신청
	public void insertAdviceREQ();
	
	//상담신청 삭제
	public void deleteAdviceREQ();
	
	//상담신청 수정
	public void updateAdviceREQ();
	
	//상담답변
	public void insertAdviceReply();
	
	//상담가능일자 입력
	public void insertAdviceDate();
}
