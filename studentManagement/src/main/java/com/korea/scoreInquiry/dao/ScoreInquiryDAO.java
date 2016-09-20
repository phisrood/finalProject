package com.korea.scoreInquiry.dao;

import java.util.List;
import java.util.Map;

import com.korea.dto.Course_BreakDownVO;
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
public interface ScoreInquiryDAO {
	/**
	 * @return 
	 * @param id 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//전체 성적 조회
	public List<ScoreViewVO> getScoreListAll(String id);
	/**
	 * @param params 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//현재학기 성적조회
	public List<ScoreViewVO> getScoreListNow(Map<String, String> params);
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
	
	/**
	 * 강의목록 가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<LectureViewVO> getLectureList(Map<String, String> map);
	
	/**
	 * 수강생가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<StudentViewVO> getStudentList(List<String> cbList);
	
	/**
	 * 수강생id가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<String> getCourseBreakDownList(String lec_no);
}
