package com.korea.crsesBook.dao;

import java.util.List;

import com.korea.dto.Lecture_BreakeDownVO;

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
public interface CrsesBookDAO {
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람조회
	public List<Lecture_BreakeDownVO> getCrsesBookList();
	/**
	 * @param lbVO 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람등록
	public void insertCrsesBook(Lecture_BreakeDownVO lbVO);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람수정
	public void updateCrsesBook();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람승인/반려
	public void updateCrsesBookDecide();
	
	/**
	 * 학수번호 체크
	 * @param
	 * @return 
	 * @throws 
	 */
	public String getLbNoMatch(String lbNo);
	/**
	 * 수강편람가져오기(행정)
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<Lecture_BreakeDownVO> getCrsesBookListByEmp();
}
