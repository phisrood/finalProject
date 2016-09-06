package com.korea.classSYL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.classSYL.dao.ClassSYLDAO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_Time_ViewVO;

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
@Service
public class ClassSYLServiceImpl implements ClassSYLService{
	@Autowired
	private ClassSYLDAO classSYLDAO;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertClassSYL() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateClassSYL() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteClassSYL() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getClassSYLInfo() {
		// TODO Auto-generated method stub
		
	}

	//강의계획서
	@Override
	public LectureViewVO getLectureInfo(String lec_no) {
		LectureViewVO lecture = classSYLDAO.getLectureInfo(lec_no);
		List<Lecture_Time_ViewVO> timeList = classSYLDAO.getLectureTime(lec_no);
		String classroom = "";
		for(Lecture_Time_ViewVO time : timeList){
			if(lecture.getLec_no().equals(time.getLec_no())){
				classroom += time.getTt_time()+","+ time.getCi_roomname()+":"+time.getCi_roomnumber()+"<br>"; 
			}
		}
		lecture.setClassroom(classroom);
		return lecture;
	}

}
