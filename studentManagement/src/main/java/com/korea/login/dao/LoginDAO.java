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
import com.korea.dto.TestVO;
import com.korea.dto.UsersVO;
import com.korea.dto.UsersVO;

public interface LoginDAO {
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
	
	//비밀번호찾기 학생
	public StudentVO getLoginPwdSearchStu(StudentVO studentVO);

	//비밀번호찾기 교수
	public ProfessorVO getLoginPwdSearchPro(ProfessorVO professorVO);

	//비밀번호찾기 교직원
	public School_PersonVO getLoginPwdSearchEmp(School_PersonVO school_PersonVO);

	//비밀번호변경 학생
	public void updatePwdChangeStu(StudentVO studentVO);
	
	//비밀번호변경 교수
	public void updatePwdChangePro(ProfessorVO professorVO);
	
	//비밀번호변경 교직원
	public void updatePwdChangeEmp(School_PersonVO school_PersonVO);

	//교수 정보가져오기
	public Professor_InfoViewVO getProdivInfo(String id);

	//행정 정보 가져오기
	public School_PersonInfoViewVO getEmpdivInfo(String id);

	public UsersVO getLoginCheck(Map<String, String> checkMap);
}
