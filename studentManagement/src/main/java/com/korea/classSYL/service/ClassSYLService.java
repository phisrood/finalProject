package com.korea.classSYL.service;

import java.util.List;

import com.korea.dto.Class_SYLLBUSVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_Time_ViewVO;

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
public interface ClassSYLService {
	/**
	 * @param classSyl 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//강의계획서 등록
	public void insertClassSYL(Class_SYLLBUSVO classSyl);
	/**
	 * @param classSyl 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//강의계획서 수정
	public void updateClassSYL(Class_SYLLBUSVO classSyl);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//강의계획서 삭제
	public void deleteClassSYL();

	/**
	 * 강의계획서 조회(교수)
	 * @param LectureViewVO
	 * @return 
	 * @throws 
	 */
	public LectureViewVO getLectureInfo(String lec_no);
	
	/**
	 * 강의계획서 조회(교수)
	 * @param Class_SYLLBUSVO
	 * @return 
	 * @throws 
	 */
	public Class_SYLLBUSVO getClassSYLInfo(String lec_no);
	
	/**
	 * 강의시간
	 * @param Class_SYLLBUSVO
	 * @return 
	 * @throws 
	 */
	public List<Lecture_Time_ViewVO> getLectureTimeInfo(String lec_no);
	
}
