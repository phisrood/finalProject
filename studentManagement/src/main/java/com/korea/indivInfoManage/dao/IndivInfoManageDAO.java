package com.korea.indivInfoManage.dao;

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

import com.korea.dto.StudentVO;


public interface IndivInfoManageDAO {

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
	public StudentVO getIndivInfo(String id);
	
	//개인신상정보 수정
	public String updateIndiv();
	/**
	 * 학적 변동 현황
	 * @param
	 * @return 
	 * @throws 
	 */
	public String getColleageChangeList();
}
