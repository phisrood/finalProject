package com.korea.indivInfoManage.service;

/**
 * @Interface Name : IndivInfoManageService.java
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

import com.korea.dto.Colleage_Register_ChangeVO;
import com.korea.dto.StudentVO;
import com.korea.dto.Student_InfoViewVO;


public interface IndivInfoManageService {

	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	public String getIndivInfo();
	/**
	 * 개인 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */


	//개인신상정보 조회
	public Student_InfoViewVO getIndivInfo(String stud_use_id);
	
	

	//개인신상정보 수정
	public int updateIndiv(StudentVO studentVO);
	/**
	 * 학적 변동 현황
	 * @param
	 * @return 
	 * @throws 
	 */
	
	//개인신상정보 수정
	public int updateIndiv(Map<String, String> params);
	/**
	 * 학적 변동 현황
	 * @param
	 * @return 
	 * @throws 
	 */
	
	
	
	public int updateImage(Map<String, String> map);
	/**
	 * 이미지
	 * @param
	 * @return 
	 * @throws 
	 */
	
	public int insertImage(Map<String, String> insertMap);
	/**
	 * 이미지
	 * @param
	 * @return 
	 * @throws 
	 */
	
	
	//학적변동현황 불러오기
	public List<Colleage_Register_ChangeVO> getColleageChangeList(String stud_use_id);
	
	
	//af_no 찾아오기
	public int selectafno();
	
	//af_no 찾아온 값 업데이트
	public int updateafno(Map<String, String> para);
	
	

	
	
	
	
}
