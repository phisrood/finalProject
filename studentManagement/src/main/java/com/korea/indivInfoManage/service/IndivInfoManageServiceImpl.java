package com.korea.indivInfoManage.service;

/**
 * @Class Name : IndivInfoManageServiceImpl.java
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


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.Colleage_Register_ChangeVO;
import com.korea.dto.StudentVO;
import com.korea.dto.Student_InfoViewVO;
import com.korea.indivInfoManage.dao.IndivInfoManageDAO;


@Service
public class IndivInfoManageServiceImpl implements IndivInfoManageService{


	@Autowired
	private IndivInfoManageDAO indivInfoManageDAO;

	@Override
	public Student_InfoViewVO getIndivInfo(String stud_use_id) {
		String ddd = "할수있냐?";
		
		String aaa = "즐";
		return indivInfoManageDAO.getIndivInfo(stud_use_id);
		
	}
	/**
	 * 개인 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public int updateIndiv(StudentVO studentVO) {
		return indivInfoManageDAO.updateIndiv(studentVO);
	}
	
	
	//학적변동현황 불러오기
	@Override
	public List<Colleage_Register_ChangeVO> getColleageChangeList(String stud_use_id) {
	
		return indivInfoManageDAO.getColleageChangeList(stud_use_id);
	}
	@Override
	public String getIndivInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int updateIndiv(Map<String, String> params) {
	
		return indivInfoManageDAO.updateIndiv(params);
	}
	@Override
	public int updateImage(Map<String, String> map) {
		
		return indivInfoManageDAO.updateImage(map);
	}
	
	@Override
	public int insertImage(Map<String, String> insertMap) {
		return indivInfoManageDAO.insertImage(insertMap);
	}

	
	
	
	//방금 등록된 사진의 af_no 가져오기
	@Override
	public int selectafno() {
		return indivInfoManageDAO.selectafno();
	}
	
	//방금 등록된 사진의 af_no 가져와서 업데이트
	@Override
	public int updateafno(Map<String, String> para) {
		
		return (int) indivInfoManageDAO.updateafno(para);
	}
}
