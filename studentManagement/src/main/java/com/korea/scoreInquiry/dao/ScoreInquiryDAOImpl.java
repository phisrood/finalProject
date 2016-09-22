package com.korea.scoreInquiry.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Course_BreakDownVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.ScoreViewVO;
import com.korea.dto.StudentViewVO;

/**
 * @Class Name : IndivInfoManageController.java
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
@Repository
public class ScoreInquiryDAOImpl implements ScoreInquiryDAO{
	
	@Autowired
	SqlSession session;
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<ScoreViewVO> getScoreListAll(String id) {
		return session.selectList("scoreInquiry.getScoreListAll", id);
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<ScoreViewVO> getScoreListNow(Map<String, String> params) {
		return session.selectList("scoreInquiry.getScoreListNow",params);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getScoreListDepartment() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getScoreListPro() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<LectureViewVO> getLectureList(Map<String,String> map) {
		return session.selectList("scoreInquiry.getLecutreList", map);
	}
	@Override
	public List<StudentViewVO> getStudentList(List<Course_BreakDownVO> cbList) {
		return session.selectList("scoreInquiry.getStudentList", cbList);
	}
	@Override
	public List<Course_BreakDownVO> getCourseBreakDownList(String lec_no) {
		return session.selectList("scoreInquiry.getCourseBreakDownList", lec_no);
	}
	@Override
	public void insertGrade(List<Course_BreakDownVO> cbList) {
		for(Course_BreakDownVO cb : cbList){
			session.update("scoreInquiry.insertGrade", cb);
		}
		
	}

}
