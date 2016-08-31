package com.korea.login.service;

import com.korea.dto.Professor_InfoViewVO;
import com.korea.dto.School_PersonInfoViewVO;
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
import com.korea.dto.UsersVO;


public interface LoginService {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//로그인 액터별 VO 분기


	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	public UsersVO getLoginInfo(String id);
	

	//비밀번호찾기
	public void updateLoginPwdSearch(String id, String birth);

	//교수정보
	public Professor_InfoViewVO getProdivInfo(String id);

	//행정정보
	public School_PersonInfoViewVO getEmpdivInfo(String id);

}
