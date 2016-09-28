package com.korea.login.dao;
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
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.ProfessorVO;
import com.korea.dto.Professor_InfoViewVO;
import com.korea.dto.School_PersonInfoViewVO;
import com.korea.dto.School_PersonVO;
import com.korea.dto.StudentVO;
import com.korea.dto.UsersVO;

@Repository
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	SqlSession session;

	//로그인정보가져오기(세션)
	@Override
	public UsersVO getLoginInfo(String id) {
		return (UsersVO) session.selectOne("Login.loginInfo", id);
	}

	//비밀번호찾기(학생)
	@Override
	public StudentVO getLoginPwdSearchStu(StudentVO studentVO) {
		return (StudentVO) session.selectOne("Login.searchPwdStu", studentVO);
	}
	
	//비밀번호찾기(교수)
	@Override
	public ProfessorVO getLoginPwdSearchPro(ProfessorVO professorVO) {
		return (ProfessorVO) session.selectOne("Login.searchPwdPro", professorVO);
	}
	
	//비밀번호찾기(행정)
	@Override
	public School_PersonVO getLoginPwdSearchEmp(School_PersonVO school_PersonVO) {
		return (School_PersonVO) session.selectOne("Login.searchPwdEmp", school_PersonVO);
	}

	//임시비밀번호초기화(학생)
	@Override
	public void updatePwdChangeStu(StudentVO studentVO) {
		session.update("Login.changePwdStu", studentVO);
	}

	//임시비밀번호초기화(교수)
	@Override
	public void updatePwdChangePro(ProfessorVO professorVO) {
		session.update("Login.changePwdPro", professorVO);
	}

	//임시비밀번호초기화(행정)
	@Override
	public void updatePwdChangeEmp(School_PersonVO school_PersonVO) {
		session.update("Login.changePwdEmp", school_PersonVO);
	}

	//로그인정보(교수)
	@Override
	public Professor_InfoViewVO getProdivInfo(String id) {
		return (Professor_InfoViewVO) session.selectOne("Login.proInfo", id);
	}

	//로그인정보(행정)
	@Override
	public School_PersonInfoViewVO getEmpdivInfo(String id) {
		return (School_PersonInfoViewVO) session.selectOne("Login.empInfo", id);
	}

	//로그인 아이디패스워드 체크
	public UsersVO getLoginCheck(Map<String, String> checkMap) {
		return (UsersVO) session.selectOne("Login.loginCheck", checkMap);
	}



}
