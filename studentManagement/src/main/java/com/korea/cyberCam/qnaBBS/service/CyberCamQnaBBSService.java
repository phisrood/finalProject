package com.korea.cyberCam.qnaBBS.service;

import java.util.List;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.LectureVO;
import com.korea.dto.Question_BoardVO;

/**
 * @Interface Name : IndivInfoManageDAO.java
 * @Description : 개인 정보 조회 / 수정 및 학적 변동 현황
 * @Modification Information
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
public interface CyberCamQnaBBSService {
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 리스트
	public List<Question_BoardVO> getQnaBBSList(String stud_use_id);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 상세보기
	public void getQnaBBSDetail();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 등록
	public void insertQnaBBS(Attachment_FileVO attachment_FileVO);
	
	//강의목록 조회
	public List<LectureVO> selectlectureList();
	
	
	public int selectQnaBBSAF_NO();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 삭제
	public void deleteQnaBBS();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 수정
	public void updateQnaBBS();
	public void insertQnaBBSFinal(Question_BoardVO question_BoardVO);
}
