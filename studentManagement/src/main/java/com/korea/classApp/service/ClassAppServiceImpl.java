package com.korea.classApp.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.classApp.dao.ClassAppDAO;
import com.korea.dto.Appraisal_ManageVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_ChartVO;

/**
 * @Class Name : ClassAppServiceImpl.java
 * @Description : 수업평가 관련 서비스
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일     		수정자          수정내용
 *    -------      -------     -------------------
 *   2016.09.05		김양문		수업평가 항목관리
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Service
public class ClassAppServiceImpl implements ClassAppService{
	@Autowired
	private ClassAppDAO classAppDAO;
	
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 등록
	@Override
	public void insertClassApp(String content) {
		classAppDAO.insertClassApp(content);
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 조회
	@Override
	public void getClassAppProList() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 통계
	@Override
	public void getClassAppProStat() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 입력
	@Override
	public void InsertClassAppInput() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Appraisal_ManageVO> getClassAppList() {
		return classAppDAO.getClassAppList();
	}
	
	
	//수업평가 삭제
	@Override
	public void deleteClassApp(String am_no) {
		classAppDAO.deleteClassApp(am_no);
	}
	
	//행정에서 저장하면 -> 교수쪽으로 데이터 이동
	@Override
	public void insertAppProSave() {
		
		Map<String, String> params = new HashMap<String, String>();
		params = semesOperation();
		
		//수업평가 목록을 리스트에 가져옴
		List<Appraisal_ManageVO> appList = classAppDAO.getClassAppList();
		//현재학기 강의내역 가져옴
		List<LectureViewVO> lectureList = classAppDAO.getLectureList(params);
		
		//강의마다 수업평가 목록을 넘.
		for (int i = 0; i < lectureList.size(); i++) {
			for (int j = 0; j < appList.size(); j++) {
				Lecture_ChartVO chart = new Lecture_ChartVO();
				chart.setLc_lec_no(lectureList.get(i).getLec_no());
				chart.setLc_appraisalquestion(appList.get(j).getAm_content());
				classAppDAO.insertProClassApp(chart);
			}
		}
				
	}
	
	//현재학기 계산 메서드
	private Map semesOperation() {
		//현재 연도/월 가져옴
		Date date = new Date();
		
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		
		int semes = 0; //학기
		
		
		//6월까지 1학기, 7월부터 2학기
		if(month < 7){//1학기 ex) 2016 1학기의 직전학기 ==> 2015 2학기 == 년도 -1 학기 +1
			semes = 1; //1학기
		}else if(month >=6){//2학기 ex) 2016 2학기의 직전학기 ==> 2016 1학기 == 년도 그대로 / 학기 -1
			semes = 2; //2학기
		}
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("year", Integer.toString(year));
		params.put("semes", Integer.toString(semes));
		
		return params;
	}

}
