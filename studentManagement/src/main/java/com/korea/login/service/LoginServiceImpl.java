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
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.Period;
import com.korea.dto.ProfessorVO;
import com.korea.dto.Professor_InfoViewVO;
import com.korea.dto.School_PersonInfoViewVO;
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
	public int updateLoginPwdSearch(String id, String birth) {
		int chk = 1;
		
		
		StudentVO studentVO = new StudentVO();
		ProfessorVO professorVO = new ProfessorVO();
		School_PersonVO school_PersonVO = new School_PersonVO();
		
		//임시비밀번호
		String tempPwd = pwdTemp();
		
		//학생일때
		if(id.length()==8){
			try {
				studentVO.setStud_use_id(id);
				studentVO.setStud_birth(birth);
				studentVO = dao.getLoginPwdSearchStu(studentVO);
				if(studentVO.getStud_email() != null){
					MailSenderMain.sendMailInfoStu(studentVO, tempPwd);
					//그냥 아무vo에 임시비밀번호 넣어서 초기화
					studentVO.setStud_regno1(tempPwd);
					dao.updatePwdChangeStu(studentVO);
					chk = 3;
					
				}				
			} catch (Exception e) {
				chk = 2;
			}
		//교수일때
		}else if(id.length() == 7){
			try {
				professorVO.setPro_use_id(id);
				professorVO.setPro_birth(birth);
				professorVO = dao.getLoginPwdSearchPro(professorVO);
				if(professorVO.getPro_email() != null){
					MailSenderMain.sendMailInfoPro(professorVO, tempPwd);
					
					professorVO.setPro_regno1(tempPwd);
					dao.updatePwdChangePro(professorVO);
					chk = 3;
				}
			} catch (Exception e) {
				chk = 2;
			}
		//행정일때
		}else if(id.length() == 6){
			
			try {
				school_PersonVO.setSp_use_id(id);
				school_PersonVO.setSp_birth(birth);
				school_PersonVO = dao.getLoginPwdSearchEmp(school_PersonVO);
				if(school_PersonVO.getSp_email() != null){
					MailSenderMain.sendMailInfoEmp(school_PersonVO, tempPwd);
					
					school_PersonVO.setSp_regno1(tempPwd);
					dao.updatePwdChangeEmp(school_PersonVO);
					chk=3;
				}
			} catch (Exception e) {
				chk = 2;
			}
		}
		
		return chk;
	}
	
	@Override
	public Professor_InfoViewVO getProdivInfo(String id) {
		return dao.getProdivInfo(id);
	}
	@Override
	public School_PersonInfoViewVO getEmpdivInfo(String id) {
		return dao.getEmpdivInfo(id);
	}
	
	//임시비밀번호
	private static String pwdTemp(){
		String tempPwd = "";
		
			for(int i = 0; i < 8; i++){
				char lowerStr = (char)(Math.random() * 26 + 97);
				if(i%2 == 0){
				tempPwd += (int)(Math.random() * 10);
				}else{
				tempPwd += lowerStr;
				}
			}		
		return tempPwd;
	}
	
	public UsersVO getLoginCheck(Map<String, String> checkMap) {
		return dao.getLoginCheck(checkMap);

	}

}
