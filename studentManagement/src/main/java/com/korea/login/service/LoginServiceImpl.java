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
import java.util.HashMap;
import java.util.Map;

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
	 * 패스워드찾기
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getLoginPwdSearch(String id, String birth) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", id);
		params.put("birth", birth);
		
		if(id.length()==8){
			StudentVO studentVO = dao.getLoginPwdSearchStu(params);
			if(studentVO != null){
				MailSenderMain.sendMailInfoStu(studentVO);
			}
		}else if(id.length() == 7){
			ProfessorVO professorVO = dao.getLoginPwdSearchPro(params);
			if(professorVO != null){
				MailSenderMain.sendMailInfoPro(professorVO);
				
			}
		}else if(id.length() == 6){
			School_PersonVO school_PersonVO = dao.getLoginPwdSearchEmp(params);
			if(school_PersonVO != null){
				MailSenderMain.sendMailInfoEmp(school_PersonVO);
			}
		}
	}



}
