package com.korea.crsesREQ.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.korea.dto.ClassRoom_UsetimeVO;
import com.korea.dto.CrsesListViewVO;
import com.korea.dto.Lecture_Time_ViewVO;
import com.korea.dto.ScoreViewVO;

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
public interface CrsesREQDAO {
	/**
	 * @param params 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강리스트 조회
	public List<CrsesListViewVO> getCrsesAllList(Map<String, String> params);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강리스트 검색
	public void getCrsesSearch();
	/**
	 * @throws SQLException 
	 * @param id 
	 * @param lec_no 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강신청(수강신청 가능 학점 배제)
	public void insertCrsesREQ(Map<String,String> map) ;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강신청취소
	public void deleteCrsesREQ();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강신청한 리스트
	public void getCrsesREQList();
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
	
	//직전학기 성적조회
	public List<ScoreViewVO> getScoreCalcu(Map<String, String> params);
	
	/**
	 * @return List<ClassRoom_UsetimeVO>
	 * 개인 정보 조회
	 * @param Map<String, String> params
	 * @throws 
	 */
	public List<Lecture_Time_ViewVO> getClassroom(Map<String, String> params);
	
	/**
	 * @return String id
	 * 학기가져오기
	 * @param int
	 * @throws 
	 */
	public int getSemester(String id);
}
