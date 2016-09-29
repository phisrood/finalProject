package com.korea.login.dao;

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
import java.util.Map;

import com.korea.dto.ProfessorVO;
import com.korea.dto.Professor_InfoViewVO;
import com.korea.dto.School_PersonInfoViewVO;
import com.korea.dto.School_PersonVO;
import com.korea.dto.StudentVO;
import com.korea.dto.UsersVO;

public interface LoginDAO {

	/**
	 * 로그인정보 가져오기
	 * @param id
	 * @return UsersVO
	 */
	public UsersVO getLoginInfo(String id);
	
	/**
	 * 비밀번호 찾기(학생)
	 * @param studentVO
	 * @return StudentVO
	 */
	public StudentVO getLoginPwdSearchStu(StudentVO studentVO);
	
	/**
	 * 비밀번호 찾기(교수)
	 * @param studentVO
	 * @return professorVO
	 */
	public ProfessorVO getLoginPwdSearchPro(ProfessorVO professorVO);
	
	/**
	 * 비밀번호 찾기(행정)
	 * @param school_PersonVO
	 * @return School_PersonVO 
	 */
	public School_PersonVO getLoginPwdSearchEmp(School_PersonVO school_PersonVO);
	
	/**
	 * 비밀번호 변경(학생)
	 * @param studentVO
	 * @return void
	 */
	public void updatePwdChangeStu(StudentVO studentVO);
	
	/**
	 * 비밀번호 변경(교수)
	 * @param professorVO
	 * @return void
	 */
	public void updatePwdChangePro(ProfessorVO professorVO);
	
	/**
	 * 비밀번호 변경(행정)
	 * @param school_PersonVO
	 * @return void
	 */
	public void updatePwdChangeEmp(School_PersonVO school_PersonVO);
	
	/**
	 * 로그인 정보 가져오기(교수)
	 * @param id
	 * @return Professor_InfoViewVO
	 */
	public Professor_InfoViewVO getProdivInfo(String id);
	
	/**
	 * 로그인 정보 가져오기(행정)
	 * @param id
	 * @return School_PersonInfoViewVO
	 */
	public School_PersonInfoViewVO getEmpdivInfo(String id);
	
	/**
	 * 로그인정보 체크
	 * @param checkMap
	 * @return UsersVO
	 */
	public UsersVO getLoginCheck(Map<String, String> checkMap);
}
