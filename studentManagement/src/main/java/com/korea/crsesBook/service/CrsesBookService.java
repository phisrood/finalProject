package com.korea.crsesBook.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.korea.dto.ClassRoom_InfoVO;
import com.korea.dto.ClassRoom_UsetimeVO;
import com.korea.dto.LectureVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_BreakeDownVO;
import com.korea.dto.Pro_tt_noViewVO;

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
public interface CrsesBookService {
	/**
	 * @param i 
	 * @param session 
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람조회
	public List<Lecture_BreakeDownVO> getCrsesBookList(int pro_dep_no);
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
	 * @param lb 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람수정
	public void updateCrsesBook(Lecture_BreakeDownVO lb);
	/**
	 * @return 
	 * @param data 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람승인/반려
	public int updateCrsesBookDecide(String data, String approve);
	
	/**
	 * 학수번호 체크
	 * @param
	 * @return 
	 * @throws 
	 */
	public boolean getLbNoMatch(String lbNo);
	
	/**
	 * 수강편람리스트 가져오기(행정)
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<Lecture_BreakeDownVO> getCrsesBookListByEmp();
	/**
	 * 수강편람리스트 가져오기(교수)
	 * @param
	 * @return 
	 * @throws 
	 */
	public Lecture_BreakeDownVO getCrsesBook(String lb_no);
	
	/**
	 * 강의실 리스트 가져오기(교수)
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<ClassRoom_InfoVO> getClassroomInfo();
	
	/**
	 * 강의실 리스트 가져오기(교수)
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<ClassRoom_UsetimeVO> getClassroomTime(String classroom);
	
	/**
	 * @return 
	 * 강의입력(교수)
	 * @param LectureVO
	 * @return 
	 * @throws 
	 */
	public String insertLecture(LectureVO lecture);
	
	/**
	 * 강의실 사용시간(교수)
	 * @param ClassRoom_UsetimeVO
	 * @return 
	 * @throws 
	 */
	public void insertClassroomUsetime(ClassRoom_UsetimeVO classroomUsetime);
	
	/**
	 * @param use_id 
	 * 강의조회(교수)
	 * @param 
	 * @return List<LectureViewVO>
	 * @throws 
	 */
	public List<LectureViewVO> getLectureList(String use_id);
	/**
	 * 
	 * 강의조회(학생)
	 * @param 
	 * @return List<LectureViewVO>
	 * @throws 
	 */
	public List<LectureViewVO> getLectureListByStu();
	
	/**
	 * @return 
	 * 
	 * 교수 시간표 가져오기
	 * @param 
	 * @return List<LectureViewVO>
	 * @throws 
	 */
	public List<Pro_tt_noViewVO> getProTime(String pro_id);


	
}
