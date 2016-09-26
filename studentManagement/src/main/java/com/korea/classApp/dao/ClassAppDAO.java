package com.korea.classApp.dao;

import java.util.List;
import java.util.Map;

import com.korea.dto.AppLecture_ViewVO;
import com.korea.dto.Appraisal_ManageVO;
import com.korea.dto.Course_BreakDownVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_ChartVO;
import com.korea.dto.Lecture_Chart_ViewVO;

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
	//수강하는현재학기과목가져오기
	public List<AppLecture_ViewVO> getAppLecture(Map<String, String> params);
	//차트가져오기
	public List<Lecture_ChartVO> getLecture_Chart(String lec_no);
	//chartupdate
	public void updateLectureChart(Lecture_ChartVO chartVO);
	//했는지안했는지 여부 업데이트
	public void updateAppYN(Map<String, String> params);
	//교수 과목 가져오기
	public List<LectureViewVO> getLectureListPro(String id);
	//교수 차트
	public List<Lecture_Chart_ViewVO> getLectureChartPro(String lec_no);
	public List<Lecture_ChartVO> getStuClassAppList(String lec_no);
}
