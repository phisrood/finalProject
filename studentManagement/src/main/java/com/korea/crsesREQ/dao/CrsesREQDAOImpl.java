package com.korea.crsesREQ.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.ClassRoom_UsetimeVO;
import com.korea.dto.Course_BreakDownVO;
import com.korea.dto.CrsesListViewVO;
import com.korea.dto.CrsesList_stu_ViewVO;
import com.korea.dto.Lecture_Time_ViewVO;
import com.korea.dto.ScoreViewVO;
import com.korea.dto.Student_InquiryList_ViewVO;

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
public class CrsesREQDAOImpl implements CrsesREQDAO{
	
	@Autowired
	SqlSession session;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<CrsesListViewVO> getCrsesAllList(Map<String, String> params) {
		// TODO Auto-generated method stub
		return session.selectList("CrsesREQ.crsesAllList", params);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getCrsesSearch() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertCrsesREQ(Map<String, String> map) {
		session.insert("CrsesREQ.insertCrses", map);	
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteCrsesREQ(Map<String,String> map) {
		session.delete("CrsesREQ.deleteCrsesReq", map);	
	}
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<CrsesList_stu_ViewVO> getCrsesREQList(String id) {
		return session.selectList("CrsesREQ.getCrsesList", id);		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getCrsesREQTimeTablePDF() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertCrsesREQPeriod() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 직전학기 성적조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<ScoreViewVO> getScoreCalcu(Map<String, String> params) {
		
		return session.selectList("CrsesREQ.getScoreViewList", params);
	}
	@Override
	public List<Lecture_Time_ViewVO> getClassroom(Map<String, String> params) {
		return session.selectList("CrsesREQ.getClassroom", params);
	}
	@Override
	public int getSemester(String id) {
		return (int) session.selectOne("CrsesREQ.getSemester", id);
	}
	@Override
	public void updatePersonCount(String lec_no) {
		session.update("CrsesREQ.increasePersonCount", lec_no);
	}
	@Override
	public List<Lecture_Time_ViewVO> getClassroomByLecNo(
			List<CrsesList_stu_ViewVO> crsesReqList) {
		List<String> lec_noList = new ArrayList<String>();
		for(CrsesList_stu_ViewVO crsesList: crsesReqList){
			lec_noList.add(crsesList.getLec_no());
		}
		return session.selectList("CrsesREQ.getClassroomByLecNoList", lec_noList);
	}
	@Override
	public void deletePersonCount(String lec_no) {
		session.update("CrsesREQ.decreasePersonCount", lec_no);
		
	}
	@Override
	public List<Lecture_Time_ViewVO> getClassroomByLecNo(String lec_no) {
		return session.selectList("CrsesREQ.getClassroomByLecNo", lec_no);
		
	}
	@Override
	public List<Lecture_Time_ViewVO> getClassroomByInquiryList(List<Student_InquiryList_ViewVO> inquiryList) {
		List<String> lec_noList = new ArrayList<String>(); 			
		for(Student_InquiryList_ViewVO stuVO : inquiryList){
			lec_noList.add(stuVO.getLec_no());
		}
		return session.selectList("CrsesREQ.getClassroomByLecNoList", lec_noList);
	}

}
