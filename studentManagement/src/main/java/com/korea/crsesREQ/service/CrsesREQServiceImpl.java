package com.korea.crsesREQ.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<String, String> params = new HashMap<String, String>();
		
		
		params = semesOperation();
		params.put("id", id);
		
		
		List<ScoreViewVO> scoreViewList = crsesREQDAO.getScoreCalcu(params);
		
		if(scoreViewList != null){
			score = scoreOperation(scoreViewList);
		}
		
		
		
		return score;
	}
	
	
	//직전학기 계산 메서드
	private Map semesOperation() {
		//현재 연도/월 가져옴
		Date date = new Date();
		
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		
		
		int beforeYear = 0; //직전연도
		int beforeSemes = 0; //직전학기
		
		//6월까지 1학기, 7월부터 2학기
		if(month < 7){//1학기 ex) 2016 1학기의 직전학기 ==> 2015 2학기 == 년도 -1 학기 +1
			beforeSemes = 1; //1학기
			beforeYear = year-1;
			beforeSemes = beforeSemes+1;
		}else if(month >=6){//2학기 ex) 2016 2학기의 직전학기 ==> 2016 1학기 == 년도 그대로 / 학기 -1
			beforeSemes = 2; //2학기
			beforeYear = year;
			beforeSemes = beforeSemes-1;
		}
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("year", Integer.toString(beforeYear));
		params.put("semes", Integer.toString(beforeSemes));
		
		return params;
	}
	
	//학점계산메서드
	private float scoreOperation(List<ScoreViewVO> scoreViewList) {
		float scoreAvg = 0; //평균점수(총학점/총점)
		float scoreSum = 0; //총점 = 학점*점수
		float semesSum = 0; //총학점
		
		
		for (int i = 0; i < scoreViewList.size(); i++) {
			float score = 0; //개별 점수
			float semes = 0; // 총 학점
			switch(scoreViewList.get(i).getCb_grade()){
				case "A+" : score = (float)4.5; break;
				case "A0" : score = (float)4.3; break;
				case "A-" : score = (float)4.0; break;
				case "B+" : score = (float)3.5; break;
				case "B0" : score = (float)3.3; break;
				case "B-" : score = (float)3.0; break;
				case "C+" : score = (float)2.5; break;
				case "C0" : score = (float)2.3; break;
				case "C-" : score = (float)2.0; break;
				case "D+" : score = (float)1.5; break;
				case "D0" : score = (float)1.3; break;
				case "D-" : score = (float)1.0; break;
			}
			
			semes = Integer.parseInt(scoreViewList.get(i).getLb_credit()); //학점가져와
			semesSum += semes; //총학점에 덧셈
			
			scoreSum += score*semes; //학점*점수 총점수에 저장
		}
		
		scoreAvg = (float)((int)((scoreSum/semesSum)*100+1))/100; //나누기~ 평균학점에저장
		
		
		return scoreAvg;
	}
	/**
	 * 학점제한
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public int crsesLimit(float score) {
		int limit = 0;
		
		if(score >= 4.0){
			limit = 21;
		}else{
			limit = 18;
		}
		
		return limit;
	}

}
