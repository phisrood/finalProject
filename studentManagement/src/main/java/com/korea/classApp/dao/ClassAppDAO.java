package com.korea.classApp.dao;

import java.util.List;
import java.util.Map;

import com.korea.dto.Appraisal_ManageVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_ChartVO;

/**
 * @Interface Name : ClassAppDAO.java
 * @Description : 수업평가 관리
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일      		수정자          수정내용
 *    -------      -------     -------------------
 *   2016.09.05		김양문		수업평가 항목관리
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
public interface ClassAppDAO {
	/**
	 * @param content 
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 등록
	public void insertClassApp(String content);
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 조회
	public void getClassAppProList();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 통계
	public void getClassAppProStat();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 입력
	public void InsertClassAppInput();
	
	/**
	 * 수업평가항목 관리
	 * @param
	 * @return List<Appraisal_ManageVO>
	 * @throws 
	 */
	public List<Appraisal_ManageVO> getClassAppList();
	
	//수업평가 삭제
	public void deleteClassApp(String am_no);
	
	public List<LectureViewVO> getLectureList(Map<String, String> params);
	//등록
	public void insertProClassApp(Lecture_ChartVO chart);
}
