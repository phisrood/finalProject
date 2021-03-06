package com.korea.acadeCal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.acadeCal.dao.AcadeCalDAO;
import com.korea.dto.CalendarVO;
import com.korea.dto.Colleage_CalendarVO;

/**
 * @Class Name : AcadeCalServiceImpl.java
 * @Description : 학사일정관리 서비스 클래스
 * @Modification Information
 * @author 이영만
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
@Service
public class AcadeCalServiceImpl implements AcadeCalService{
	
	@Autowired
	AcadeCalDAO acadeCalDAO;
	
	
	//학사일정 조회
	@Override
	public List<Colleage_CalendarVO> getAcadeCalList() {
		
		return acadeCalDAO.getAcadeCalList();
	}
	
	//학사일정등록
	@Override
	public void insertAcadeCal(CalendarVO calendarVO) {
		acadeCalDAO.insertAcadeCal(calendarVO);
		
	}
	
	//학사일정수정
	@Override
	public void updateAcadeCal(CalendarVO calendarVO) {
		acadeCalDAO.updateAcadeCal(calendarVO);
	}
	
	//학사일정삭제
	@Override
	public void deleteAcadeCal(String id) {
		acadeCalDAO.deleteAcadeCal(id);
	}

	//학사일정드랍
	@Override
	public void updateAcadeDropCal(CalendarVO calendarVO) {
		acadeCalDAO.updateAcadeDropCal(calendarVO);
	}
	
	//학사일정 리사이즈 이벤트
	@Override
	public void updateAcadeResizeCal(CalendarVO calendarVO) {
		acadeCalDAO.updateAcadeResizeCal(calendarVO);
	}

}
