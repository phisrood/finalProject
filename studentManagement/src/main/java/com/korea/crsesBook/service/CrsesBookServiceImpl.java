package com.korea.crsesBook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.crsesBook.dao.CrsesBookDAO;
import com.korea.dto.ClassRoom_InfoVO;
import com.korea.dto.ClassRoom_UsetimeVO;
import com.korea.dto.LectureVO;
import com.korea.dto.Lecture_BreakeDownVO;

/**
 * @Class Name : CrsesBookServiceImpl.java
 * @Description : 수강편람/강의개설 관련 서비스
 * @Modification Information
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.2
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
@Service
public class CrsesBookServiceImpl implements CrsesBookService{
	
	@Autowired
	private CrsesBookDAO crsesBookDAO;
	
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<Lecture_BreakeDownVO> getCrsesBookList() {
		return crsesBookDAO.getCrsesBookList();
	}
	/**
	 * 수강편람 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertCrsesBook(Lecture_BreakeDownVO lbVO) {
		crsesBookDAO.insertCrsesBook(lbVO);
	}
	/**
	 * 수강편람 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateCrsesBook(Lecture_BreakeDownVO lb) {
		crsesBookDAO.updateCrsesBook(lb);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public int updateCrsesBookDecide(String lbNo, String approve) {
		String[] checkedlbNo =lbNo.split(",");
		return crsesBookDAO.updateCrsesBookDecide(checkedlbNo,approve);
	}
	@Override
	public boolean getLbNoMatch(String lbNo) {
		String getLbNo = crsesBookDAO.getLbNoMatch(lbNo);
		//true면 사용가능, false면 사용불가
		if(getLbNo==null || getLbNo.equals("null")){
			return true;
		}
		return false;
	}
	@Override
	public List<Lecture_BreakeDownVO> getCrsesBookListByEmp() {
		return crsesBookDAO.getCrsesBookListByEmp();
	}
	@Override
	public Lecture_BreakeDownVO getCrsesBook(String lb_no) {
		return crsesBookDAO.getCrsesBook(lb_no);
	}
	@Override
	public List<ClassRoom_InfoVO> getClassroomInfo() {
		return crsesBookDAO.getClassroomInfo();
	}
	//강의실 시간표 가져오기
	@Override
	public List<ClassRoom_UsetimeVO> getClassroomTime(String classroom) {
		return crsesBookDAO.getClassroomTime(classroom);
	}
	@Override
	public String insertLecture(LectureVO lecture) {
		return crsesBookDAO.insertLecture(lecture);
		
	}
	@Override
	public void insertClassroomUsetime(ClassRoom_UsetimeVO classroomUsetime) {
		List<ClassRoom_UsetimeVO> timeList = new ArrayList<ClassRoom_UsetimeVO>();
		String[] time = classroomUsetime.getCu_tt_no().split(",");
		for(String tt_no: time){
			ClassRoom_UsetimeVO usetimeVO = new ClassRoom_UsetimeVO();
			usetimeVO.setCu_lec_no(classroomUsetime.getCu_lec_no());
			usetimeVO.setCu_ci_no(classroomUsetime.getCu_ci_no());
			usetimeVO.setCu_tt_no(tt_no);
			timeList.add(usetimeVO);
		}
		crsesBookDAO.insertClassroomUsetime(timeList);
	}


}
