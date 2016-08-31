package com.korea.crsesBook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
	public void updateCrsesBook() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateCrsesBookDecide(String[] checkedlbNo) {
		sqlSession.update("crsesBook.updateCrsesBookDecide", checkedlbNo);
		
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

}
