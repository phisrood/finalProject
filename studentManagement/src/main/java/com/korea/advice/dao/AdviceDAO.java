package com.korea.advice.dao;
/**
 * @Class Name : AdviceController.java
 * @Description : 학사일정관리 서비스 클래스
 * @Modification Information
 * @author 이영만
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
public interface AdviceDAO {
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//받은 상담 신청조회(교수)
	public void getAdviceResponsList();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//보낸 상담 신청조회(학생)
	public void getAdviceRequestList();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//상담신청
	public void insertAdviceREQ();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//상담신청 삭제
	public void deleteAdviceREQ();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//상담신청 수정
	public void updateAdviceREQ();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//상담답변
	public void insertAdviceReply();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//상담가능일자 입력
	public void insertAdviceDate();
}
