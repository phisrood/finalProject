package com.korea.indivInfoManage.controller;
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


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.dto.StudentVO;
import com.korea.dto.Student_InfoViewVO;
import com.korea.dto.UsersVO;
import com.korea.indivInfoManage.service.IndivInfoManageService;

@Controller
public class IndivInfoManageController {

	@Autowired
	IndivInfoManageService indivInfoManageService;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/indivInfo", method=RequestMethod.GET)
	public String indivInfo(HttpSession session, Model model){
		String url = "/stu/colleage/indivInfo";
		
		//세션 아이디 받아오기
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		
		
		//받아온 아이디로 검색결과 출력
		Student_InfoViewVO studentVO =  indivInfoManageService.getIndivInfo(stud_use_id);
		model.addAttribute("studentVO",studentVO);
	
		return url;
	}
	/**
	 * 개인 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/indivUpdate", method=RequestMethod.POST)
	public String indivUpdate(HttpSession session, Model model, StudentVO studentVO,
							@RequestParam(value="after_use_pwd1", defaultValue="")String password){
		String url = "/stu/colleage/indivInfo";
		
		
		
		
		//세션 아이디 받아오기
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		
		
		//받아온 아이디로 수정
		indivInfoManageService.updateIndiv(studentVO);
		
		
		indivInfoManageService.updateIndiv(password);
		
		
		
		//받아온 아이디로 검색결과 출력
		Student_InfoViewVO studentViewVO =  indivInfoManageService.getIndivInfo(stud_use_id);
		model.addAttribute("studentVO",studentViewVO);
		

		
		
		return url;
	}
	/**
	 * 학적 변동 현황 ( 학생 )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeList(){
		String url = "/stu/colleage/colleageChangeList";
		
		return url;
	}
	/**
	 * 학적 변동 현황 ( 학과 )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/pro/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeListByPro(){
		String url = "/pro/colleageChangeList";
		
		return url;
	}
	/**
	 * 학적 변동 현황 ( 행정 )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeListByEmp(){
		String url = "/emp/colleageChangeList";
		
		return url;
	}
}
