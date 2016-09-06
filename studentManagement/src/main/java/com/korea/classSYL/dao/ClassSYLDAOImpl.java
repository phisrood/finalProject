package com.korea.classSYL.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Class_SYLLBUSVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_Time_ViewVO;

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
public class ClassSYLDAOImpl implements ClassSYLDAO{
	@Autowired
	private SqlSession sqlSession;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertClassSYL() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateClassSYL() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteClassSYL() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public Class_SYLLBUSVO getClassSYLInfo() {
		return null;
		
	}
	@Override
	public LectureViewVO getLectureInfo(String lec_no) {
		return (LectureViewVO) sqlSession.selectOne("crsesBook.getLectureInfo", lec_no);
	}
	@Override
	public List<Lecture_Time_ViewVO> getLectureTime(String lec_no) {
		return sqlSession.selectList("crsesBook.getLectureTime", lec_no);
	}
}
