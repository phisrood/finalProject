package com.korea.acadeCal.dao;

import java.util.List;

import com.korea.dto.CalendarVO;
import com.korea.dto.Colleage_CalendarVO;

/**
 * @Interface Name : AcadeCalDAO.java
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
public interface AcadeCalDAO {
	/**
	 * 학사일정 조회
	 * @param
	 * @return List
	 */
	public List<Colleage_CalendarVO> getAcadeCalList();
	/**
	 * 학사일정 등록
	 * @param calendarVO
	 * @return void
	 */
	public void insertAcadeCal(CalendarVO calendarVO);
	/**
	 * 학사일정 수정
	 * @param calendarVO 
	 * @return void
	 */
	public void updateAcadeCal(CalendarVO calendarVO);
	/**
	 * 학사일정 삭제
	 * @param id
	 * @return void
	 */
	public void deleteAcadeCal(String id);
	/**
	 * 학사일정 드랍이벤트
	 * @param calendarVO
	 * @return void
	 */
	public void updateAcadeDropCal(CalendarVO calendarVO);
	/**
	 * 학사일정 리사이즈 이벤트
	 * @param calendarVO
	 * @return void
	 */
	public void updateAcadeResizeCal(CalendarVO calendarVO);
}
