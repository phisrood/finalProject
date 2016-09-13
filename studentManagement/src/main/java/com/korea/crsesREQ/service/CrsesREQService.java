package com.korea.crsesREQ.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.korea.dto.Course_BreakDownVO;
import com.korea.dto.CrsesListViewVO;
import com.korea.dto.CrsesList_stu_ViewVO;

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
public interface CrsesREQService {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강리스트 조회
	public List<CrsesListViewVO> getCrsesAllList();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강리스트 검색
	public void getCrsesSearch();
	/**
	 * @param string 
	 * @param lec_no 
	 * 개인 정보 조회
	 * @param
	 * @throws 
	 */
	//수강신청(수강신청 가능 학점 배제)
	public void insertCrsesREQ(String lec_no, String lb_no, int credit,String id,HttpServletResponse response);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강신청취소
	public void deleteCrsesREQ(String lec_no, String id);
	/**
	 * @return 
	 * @param string 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강신청한 리스트
	public List<CrsesList_stu_ViewVO> getCrsesREQList(String string);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//신청한 수강시간표 조회(시간표 중복 배제)
	public void getCrsesREQTimeTablePDF();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수간신청기간설정
	public void insertCrsesREQPeriod();
	/**
	 * @return 
	 * @param score 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학점제한
	public int crsesLimit(float score);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//시간표중복배제
	public void timeTableOverlap();
	
	/**
	 * 직전학기 성적조회
	 * @param
	 * @return 
	 * @throws 
	 */
	public float getScoreCalcu(String id);
	
	/**
	 * 학기가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	public int getSemester(String id);
	
	
}
