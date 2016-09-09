package com.korea.majorREQ.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.Major_AssignVO;
import com.korea.dto.ScoreViewVO;
import com.korea.dto.Student_InfoViewVO;
import com.korea.dto.SubmitVO;
import com.korea.majorREQ.dao.MajorREQDAO;

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
public class MajorREQServiceImpl implements MajorREQService{
	
	@Autowired
	MajorREQDAO dao;
	/**
	 * 부/다전공 신청
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertBelongMinorREQ(Student_InfoViewVO studentInfo, SubmitVO submitVO, int selec) {
		
			submitVO.setSb_stud_use_id(studentInfo.getUse_id()); //신청자
			submitVO.setSb_major_dep_no(studentInfo.getDep_no()); //전공 번호
			submitVO.setSb_majordepartment(studentInfo.getDep_name()); //전공 이름
			submitVO.setSb_mk_no(Integer.toString(selec));
			dao.insertBelongMinorREQ(submitVO);
	}


	/**
	 * 소속학과 부/다전공신청리스트
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<SubmitVO> getBelongMajorREQList(String depno) {
		return dao.getBelongMajorREQList(depno);
	}

	/**
	 * 타학과 부/다전공 신청리스트
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<SubmitVO> getOthorsMajorREQList(String depno) {
		// TODO Auto-generated method stub
		return dao.getOthorsMajorREQList(depno);
	}

	//평균학점, 이수한 학기 계산메서드
	@Override
	public Map<String, Object> getScore(String id) {
		float score = 0;
		int semes = 0;
		
		List<ScoreViewVO> scoreViewList = dao.getScoreList(id);
		
		if(scoreViewList.size() != 0){
			score = scoreOperation(scoreViewList);
			semes = semesOperation(scoreViewList);
		}
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("score", score);
		result.put("semes", semes);
		
		return result;
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
		
		scoreAvg = (float)((int)((scoreSum/semesSum)*100))/100; //나누기~ 평균학점에저장
		
		
		return scoreAvg;
	}
	
	//이수학점 계산
	private int semesOperation(List<ScoreViewVO> scoreViewList) {
		int semes = 0;
		
		for (ScoreViewVO score : scoreViewList) {
			semes += Integer.parseInt(score.getLb_credit());
		}
		
		return semes;
	}
	@Override
	public List<SubmitVO> getReqList(String id) {
		return dao.getReqList(id);
	}


	@Override
	public Student_InfoViewVO getREQPersonInfo(String id) {
		return dao.getREQPersonInfo(id);
	}


	@Override
	public SubmitVO getReqStuInfo(String sb_no) {
		return dao.getReqStuInfo(sb_no);
	}


	@Override
	public int updateReqDecide(String sb_no, int result) {
		
		int confirm = 0;
		int semes = 0;
		if(result <= 2){//소속학과
			if(result == 1){//소속학과 승인일때
				confirm = 1;
			}else if(result == 2){//소속학과 반려일때	
				confirm = 2;
			}
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("sb_no", sb_no);
			params.put("confirm", confirm);
			dao.updateReqBelongDecide(params);
			
		}else if(result > 2){//타학과
			if(result == 3){//타학과 승인일때
				confirm = 1;
				
			}else if(result == 4){//타학과 반려일때
				confirm = 2;
				
			}			
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("sb_no", sb_no);
			params.put("confirm", confirm);
			dao.updateReqOthersDecide(params);
		}
		
		SubmitVO submit = dao.getReqStuInfo(sb_no);
		int belong = Integer.parseInt(submit.getSb_majordepartmentsubmityn());//소속학과 승인여부
		int others = Integer.parseInt(submit.getSb_requestdepartmentyn());//타학과 승인여부
		
		if(belong==1 && others==1){//둘다 승인일때
			//인서트구현
			List<ScoreViewVO> scoreViewList = dao.getScoreList(submit.getSb_stud_use_id());
			if(scoreViewList.size() != 0){
				semes = semesOperation(scoreViewList);
			}
			Major_AssignVO major_AssignVO = new Major_AssignVO();
			major_AssignVO.setMa_stud_use_id(submit.getSb_stud_use_id());
			major_AssignVO.setMa_dep_no(submit.getSb_dep_no());
			major_AssignVO.setMa_mk_no(Integer.parseInt(submit.getSb_mk_no()));
			major_AssignVO.setMa_credit(semes);
			
			dao.insertMajor_Assign(major_AssignVO);
		}
		
		
		return confirm;
	}



}
