package com.korea.colleageManage.dao;

import java.util.List;
import java.util.Map;

import com.korea.dto.Colleage_Register_ChangeVO;

/**
 * @Interface Name : IndivInfoManageDAO.java
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
public interface ColleageManageDAO {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	// 휴/복학 신청
	public int insertSchoolReREQ(Map<String, String> map);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	// 휴/복학 신청현황조회
	public  List<Colleage_Register_ChangeVO> getSchoolReREQList(String stud_use_id);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	// 휴/복학신청승인/반려
	public String updateSchoolReREQDecide();
}
