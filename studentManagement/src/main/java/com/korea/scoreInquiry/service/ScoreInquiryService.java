package com.korea.scoreInquiry.service;

import java.util.List;
import java.util.Map;

import com.korea.dto.LectureViewVO;
import com.korea.dto.ScoreViewVO;
import com.korea.dto.StudentViewVO;
import com.korea.dto.Student_InfoViewVO;

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
public interface ScoreInquiryService {
	/**
	 * @return 
	 * @param id 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//전체 성적 조회
	public Map<Object, Object> getScoreListAll(String id);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//현재학기 성적조회
	public List<ScoreViewVO> getScoreListNow(String id);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학과생 성적조회
	public void getScoreListDepartment();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강생 성적조회
	public void getScoreListPro();
	//성적계산
	public Map<String, Object> getScoreCalcu(List<ScoreViewVO> scoreList);
	
	/**
	 * 강의정보가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<LectureViewVO> getLectureList(String use_id);
	
	/**
	 * 수강생가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	public Map getStudentList(String lec_no);
	
	/**
	 * @param grade2 
	 * 성적입력
	 * @param
	 * @return 
	 * @throws 
	 */
	public void insertGrade(String lec_no,String[] use_id, String[] score, String[] grade);
}
