package com.korea.crsesREQ.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.korea.dto.ClassRoom_UsetimeVO;
import com.korea.dto.Course_BreakDownVO;
import com.korea.dto.CrsesListViewVO;
import com.korea.dto.CrsesList_stu_ViewVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_Time_ViewVO;
import com.korea.dto.ScoreViewVO;
import com.korea.dto.Student_InquiryList_ViewVO;

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
	 * @param id 
	 * @param lec_no 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강신청취소
	public void deleteCrsesREQ(Map<String,String> map);
	/**
	 * @return 
	 * @param id 
	 * 수강신청한 리스트 
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<CrsesList_stu_ViewVO> getCrsesREQList(String id);
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
	
	/**
	 * @return String id
	 * 학생수 가져오기
	 * @param int
	 * @throws 
	 */
	public void updatePersonCount(String lec_no);
	
	/**
	 * @return String id
	 * 신청한 강의 시간표 가져오기
	 * @param int
	 * @throws 
	 */
	public List<Lecture_Time_ViewVO> getClassroomByLecNo(List<CrsesList_stu_ViewVO> crsesReqList);
	
	/**
	 * @return 
	 * 가능인원 늘리기
	 * @param 
	 * @throws 
	 */
	public void deletePersonCount(String lec_no);
	
	/**
	 * @return 
	 * @return 
	 * 강의등록번호로 시간표가져오기
	 * @param 
	 * @throws 
	 */
	public List<Lecture_Time_ViewVO> getClassroomByLecNo(String lec_no);
	

	/**
	 * @return List<Lecture_Time_ViewVO>
	 * 강의등록번호로 시간표가져오기(수강신청내역조회)
	 * @param 
	 * @throws 
	 */
	public List<Lecture_Time_ViewVO> getClassroomByInquiryList(List<Student_InquiryList_ViewVO> inquiryList);
	/**
	 * @return LectureViewVO
	 * 강의정보가져오기
	 * @param lec_no
	 */
	public LectureViewVO getLectureInfo(int lec_no);
}
