package com.korea.crsesBook.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.crsesBook.dao.CrsesBookDAO;
import com.korea.dto.ClassRoom_InfoVO;
import com.korea.dto.ClassRoom_UsetimeVO;
import com.korea.dto.LectureVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_BreakeDownVO;
import com.korea.dto.Lecture_Time_ViewVO;
import com.korea.dto.Pro_tt_noViewVO;

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
	public List<Lecture_BreakeDownVO> getCrsesBookList(int pro_dep_no) {
		return crsesBookDAO.getCrsesBookList(pro_dep_no);
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
		lecture.setLec_placement(crsesBookDAO.getPlacement(lecture));
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
	@Override
	public List<LectureViewVO> getLectureList(String use_id) {
		List<LectureViewVO> lectureList = crsesBookDAO.getLectureList(use_id);
		List<Lecture_Time_ViewVO> timeList = crsesBookDAO.getLectureTimeList(use_id);
		for(LectureViewVO lecture : lectureList){
			String classroom = "";
			for(Lecture_Time_ViewVO time : timeList){
				if(lecture.getLec_no().equals(time.getLec_no())){
					classroom += time.getTt_time()+","+ time.getCi_roomname()+":"+time.getCi_roomnumber()+"<br>";
				}
			}
			lecture.setClassroom(classroom);
		}
		return lectureList;
	}
	@Override
	public List<LectureViewVO> getLectureListByStu() {
		List<LectureViewVO> lectureList = crsesBookDAO.getLectureListByStu();
		List<Lecture_Time_ViewVO> timeList = crsesBookDAO.getLectureTimeListByStu();
		for(LectureViewVO lecture : lectureList){
			String classroom = "";
			for(Lecture_Time_ViewVO time : timeList){
				if(lecture.getLec_no().equals(time.getLec_no())){
					classroom += time.getTt_time()+","+ time.getCi_roomname()+":"+time.getCi_roomnumber()+"<br>";
				}
			}
			lecture.setClassroom(classroom);
		}
		return lectureList;
	}
	@Override
	public List<Pro_tt_noViewVO> getProTime(String pro_id) {
		List<Pro_tt_noViewVO> timeList = crsesBookDAO.getProTime(pro_id);
		
		return timeList;
	}
	

}
