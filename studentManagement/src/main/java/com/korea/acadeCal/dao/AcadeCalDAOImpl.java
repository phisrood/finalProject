package com.korea.acadeCal.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.CalendarVO;
import com.korea.dto.Colleage_CalendarVO;

/**
 * @Class Name : AcadeCalDAO.java
 * @Description : 학사일정 관련 DAO 클래스
 * @Modification Information
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */

@Repository
public class AcadeCalDAOImpl implements AcadeCalDAO{
	
	@Autowired
	SqlSession session;
	
	//학사일정 조회리스트
	@Override
	public List<Colleage_CalendarVO> getAcadeCalList() {
		return session.selectList("AcadeCal.acadeList");
	}
	
	//학사일정 등록
	@Override
	public void insertAcadeCal(CalendarVO calendarVO) {
		session.insert("AcadeCal.acadeInsert", calendarVO);
	}
	
	//학사일정수정
	@Override
	public void updateAcadeCal(CalendarVO calendarVO) {
		session.update("AcadeCal.acadeUpdate", calendarVO);
	}
	
	//학사일정삭제
	@Override
	public void deleteAcadeCal(String id) {
		session.delete("AcadeCal.acadeDelete", id);
	}

	//학사일정 드랍이벤트
	@Override
	public void updateAcadeDropCal(CalendarVO calendarVO) {
		session.update("AcadeCal.acadeDropUpdate", calendarVO);
	}
	
	//학사일정 리사이즈이벤트
	@Override
	public void updateAcadeResizeCal(CalendarVO calendarVO) {
		session.update("AcadeCal.acadeResizeUpdate", calendarVO);
	}

}
