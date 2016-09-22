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

import com.korea.dto.Period;
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

	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public UsersVO getLoginInfo(String id) {
		return (UsersVO) session.selectOne("Login.loginInfo", id);
	}

	/**
	 * 비밀번호찾기 학생
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public StudentVO getLoginPwdSearchStu(StudentVO studentVO) {
		return (StudentVO) session.selectOne("Login.searchPwdStu", studentVO);
	}
	
	/**
	 * 비밀번호찾기 교수
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public ProfessorVO getLoginPwdSearchPro(ProfessorVO professorVO) {
		return (ProfessorVO) session.selectOne("Login.searchPwdPro", professorVO);
	}
	
	/**
	 * 비밀번호찾기 교직원
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public School_PersonVO getLoginPwdSearchEmp(School_PersonVO school_PersonVO) {
		return (School_PersonVO) session.selectOne("Login.searchPwdEmp", school_PersonVO);
	}

	@Override
	public void updatePwdChangeStu(StudentVO studentVO) {
		session.update("Login.changePwdStu", studentVO);
	}

	@Override
	public void updatePwdChangePro(ProfessorVO professorVO) {
		session.update("Login.changePwdPro", professorVO);
	}

	@Override
	public void updatePwdChangeEmp(School_PersonVO school_PersonVO) {
		session.update("Login.changePwdEmp", school_PersonVO);
	}

	@Override
	public Professor_InfoViewVO getProdivInfo(String id) {
		return (Professor_InfoViewVO) session.selectOne("Login.proInfo", id);
	}

	@Override
	public School_PersonInfoViewVO getEmpdivInfo(String id) {
		return (School_PersonInfoViewVO) session.selectOne("Login.empInfo", id);
	}

	@Override
	public Period getPeriodAll() {
		return (Period) session.selectOne("Login.getPeriod");
	}



}
