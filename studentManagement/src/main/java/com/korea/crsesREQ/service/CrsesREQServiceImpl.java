package com.korea.crsesREQ.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.crsesREQ.dao.CrsesREQDAO;
import com.korea.dto.ScoreViewVO;

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
public class CrsesREQServiceImpl implements CrsesREQService{
	
	@Autowired
	CrsesREQDAO crsesREQDAO;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getCrsesList() {
		// TODO Auto-generated method stub
		
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
	public void insertCrsesREQ() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteCrsesREQ() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getCrsesREQList() {
		// TODO Auto-generated method stub
		
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
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void crsesLimit() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void timeTableOverlap() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 직전학기 성적조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public float getScoreCalcu(String id) {
		//계산후 리턴
		float score = 0;
		
		
		
		List<ScoreViewVO> scoreViewList = crsesREQDAO.getScoreCalcu(id);
		
		if(scoreViewList != null){
			score = scoreOperation(scoreViewList);
		}
		
		
		
		return score;
	}
	
	
	//학점연산 메서드
	private float scoreOperation(List<ScoreViewVO> scoreViewList) {
		//현재 연도/월 가져옴
		Date date = new Date();
		
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		
		
		int beforeYear = 0; //직전연도
		int beforeSemes = 0; //직전학기
		
		//6월까지 1학기, 7월부터 2학기
		if(month < 7){//1학기 ex) 2016 1학기의 직전학기 ==> 2015 2학기 == 년도 -1 학기 +1
			beforeSemes = 1;
			beforeYear = year-1;
			beforeSemes = beforeSemes+1;
		}else if(month >=6){//2학기 ex) 2016 2학기의 직전학기 ==> 2016 1학기 == 년도 그대로 / 학기 -1
			beforeSemes = 2;
			beforeYear = year;
			beforeSemes = beforeSemes-1;
		}
		
		return 0;
	}

}
