package com.korea.login.service;

import java.util.Map;

import com.korea.dto.Professor_InfoViewVO;
import com.korea.dto.School_PersonInfoViewVO;
/**
 * @Interface Name : IndivInfoManageDAO.java
 * @Description : 로그인 service
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.09.06.  	한돈희        		개발완료
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
import com.korea.dto.UsersVO;


public interface LoginService {
	
	/**
	 * 로그인정보 가져오기
	 * @param id
	 * @return UsersVO
	 */
	public UsersVO getLoginInfo(String id);
	
	/**
	 * 비밀번호 찾기(임시비밀번호 저장)
	 * @param id, birth
	 * @return int
	 */
	public int updateLoginPwdSearch(String id, String birth);

	/**
	 * 로그인된 교수 정보 가져오기
	 * @param id
	 * @return Professor_InfoViewVO
	 */
	public Professor_InfoViewVO getProdivInfo(String id);

	/**
	 * 로그인 된 행정 정보 가져오기
	 * @param id
	 * @return School_PersonInfoViewVO
	 */
	public School_PersonInfoViewVO getEmpdivInfo(String id);

	/**
	 * 로그인 정보 체크
	 * @param checkMap
	 * @return UsersVO
	 */
	public UsersVO getLoginCheck(Map<String, String> checkMap);

}
