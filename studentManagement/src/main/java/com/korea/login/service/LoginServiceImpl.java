package com.korea.login.service;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.ProfessorVO;
import com.korea.dto.School_PersonVO;
import com.korea.dto.StudentVO;
import com.korea.dto.UsersVO;
import com.korea.login.controller.MailSenderMain;
import com.korea.login.dao.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO dao;

	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public UsersVO getLoginInfo(String id) {
		// TODO Auto-generated method stub
		
		return dao.getLoginInfo(id);
	}
	/**
	 * 패스워드초기화
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateLoginPwdSearch(String id, String birth) {
		StudentVO studentVO = new StudentVO();
		ProfessorVO professorVO = new ProfessorVO();
		School_PersonVO school_PersonVO = new School_PersonVO();
		if(id.length()==8){
			studentVO.setStud_use_id(id);
			studentVO.setStud_birth(birth);
			studentVO = dao.getLoginPwdSearchStu(studentVO);
			if(studentVO.getStud_email() != null){
				MailSenderMain.sendMailInfoStu(studentVO);
				dao.updatePwdChangeStu(studentVO);
			}
		}else if(id.length() == 7){
			professorVO.setPro_use_id(id);
			professorVO.setPro_birth(birth);
			professorVO = dao.getLoginPwdSearchPro(professorVO);
			if(professorVO.getPro_email() != null){
				MailSenderMain.sendMailInfoPro(professorVO);
				dao.updatePwdChangePro(professorVO);
				
			}
		}else if(id.length() == 6){
			school_PersonVO.setSp_use_id(id);
			school_PersonVO.setSp_birth(birth);
			school_PersonVO = dao.getLoginPwdSearchEmp(school_PersonVO);
			if(school_PersonVO.getSp_email() != null){
				MailSenderMain.sendMailInfoEmp(school_PersonVO);
				dao.updatePwdChangeEmp(school_PersonVO);
			}
		}
	}



}
