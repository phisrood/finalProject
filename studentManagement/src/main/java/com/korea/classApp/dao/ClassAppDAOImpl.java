package com.korea.classApp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.AppLecture_ViewVO;
import com.korea.dto.Appraisal_ManageVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_ChartVO;
import com.korea.dto.Lecture_Chart_ViewVO;

/**
 * @Class Name : ClassAppDAOImpl.java
 * @Description : 수업평가 관련 dao
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일      		수정자          수정내용
 *    -------      -------     -------------------
 *   2016.09.05		김양문		수업평가항목관리
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Repository
public class ClassAppDAOImpl implements ClassAppDAO{
	@Autowired
	private SqlSession sqlSession;
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertClassApp(String content) {
		sqlSession.insert("classApp.insertClassApp", content);
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getClassAppProList() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getClassAppProStat() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void InsertClassAppInput() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Appraisal_ManageVO> getClassAppList() {
		return sqlSession.selectList("classApp.getClassAppList");
	}
	
	@Override
	public void deleteClassApp(String am_no) {
		sqlSession.delete("classApp.deleteClassApp", am_no);
	}
	@Override
	public List<LectureViewVO> getLectureList(Map<String, String> params) {
		return sqlSession.selectList("classApp.lectureList", params);
	}
	@Override
	public void insertProClassApp(Lecture_ChartVO chart) {
		sqlSession.insert("classApp.insertProClassApp", chart);
	}
	@Override
	public List<AppLecture_ViewVO> getAppLecture(Map<String, String> params) {
		return sqlSession.selectList("classApp.appLectureList", params);
	}
	
	@Override
	public List<Lecture_ChartVO> getLecture_Chart(String lec_no) {
		return sqlSession.selectList("classApp.getLecChart", lec_no);
	}
	@Override
	public void updateLectureChart(Lecture_ChartVO chartVO) {
		sqlSession.update("classApp.updateLectureChart", chartVO);
	}
	@Override
	public void updateAppYN(Map<String, String> params) {
		sqlSession.update("classApp.updateAppYN", params);
	}
	@Override
	public List<LectureViewVO> getLectureListPro(String id) {
		return sqlSession.selectList("classApp.getLectureListPro", id);
	}
	@Override
	public List<Lecture_Chart_ViewVO> getLectureChartPro(String lec_no) {
		return sqlSession.selectList("classApp.getLectureChartPro", lec_no);
	}

}
