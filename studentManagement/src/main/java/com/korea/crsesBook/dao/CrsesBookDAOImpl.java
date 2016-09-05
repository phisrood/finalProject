package com.korea.crsesBook.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.ClassRoom_InfoVO;
import com.korea.dto.ClassRoom_UsetimeVO;
import com.korea.dto.Lecture_BreakeDownVO;

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
 *    2016.09.01	김양문			수강편람 관련 메소드
 *    2016.09.02	김양문			강의개설 관련 메소드
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Repository
public class CrsesBookDAOImpl implements CrsesBookDAO{
	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<Lecture_BreakeDownVO> getCrsesBookList() {
		return sqlSession.selectList("crsesBook.getCrsesBookList");
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertCrsesBook(Lecture_BreakeDownVO lbVO) {
		sqlSession.insert("crsesBook.insertLectureBreak", lbVO);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateCrsesBook(Lecture_BreakeDownVO lb) {
		sqlSession.update("crsesBook.updateCrsesBook", lb);		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public int updateCrsesBookDecide(String[] checkedlbNo, String approve) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("array", checkedlbNo);
		map.put("approve", approve);
		return sqlSession.update("crsesBook.updateCrsesBookDecide", map);
		
	}
	//학수번호체크
	@Override
	public String getLbNoMatch(String lbNo) {
		String result = (String) sqlSession.selectOne("crsesBook.getLbNoMatch", lbNo);
		return result;
	}
	
	//수강편람 가져오기(행정)
	@Override
	public List<Lecture_BreakeDownVO> getCrsesBookListByEmp() {
		return sqlSession.selectList("crsesBook.getCrsesBookListByEmp");
	}
	@Override
	public Lecture_BreakeDownVO getCrsesBook(String lb_no) {
		return (Lecture_BreakeDownVO) sqlSession.selectOne("crsesBook.getCrsesBook", lb_no);
	}
	@Override
	public List<ClassRoom_InfoVO> getClassroomInfo() {
		return sqlSession.selectList("crsesBook.getClassroomInfo");
	}
	@Override
	public List<ClassRoom_UsetimeVO> getClassroomTime(String classroom) {
		return sqlSession.selectList("crsesBook.getClassroomTime", classroom);
	}

}
