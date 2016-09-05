package com.korea.acadeCal.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
	
	/**
	 * 학사일정 가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<Colleage_CalendarVO> getAcadeCalList() {
		return session.selectList("AcadeCal.acadeList");
	}
	/**
	 * 학사일정 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String insertAcadeCal() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 학사일정 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateAcadeCal() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 학사일정 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String deleteAcadeCal() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 학사일정 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getAcadeDetail() {
		// TODO Auto-generated method stub
		
	}

}
