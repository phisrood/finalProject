package com.korea.indivInfoManage.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.dto.StudentVO;
import com.korea.dto.TestVO;
import com.korea.dto.UsersVO;
import com.korea.indivInfoManage.service.IndivInfoManageService;

@Controller
public class IndivInfoManageController {
	
	@Autowired
	IndivInfoManageService indivInfoManageService;
	
	//개인정보 조회
	@RequestMapping(value="/stu/indivInfo", method=RequestMethod.GET)
	public String indivInfo(HttpSession session, Model model){
		String url = "/stu/colleage/indivInfo";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		
		StudentVO studentVO =  indivInfoManageService.getIndivInfo(loginUser.getUse_id());
		model.addAttribute("studentVO",studentVO);
		
		return url;
	}
	
	//개인정보 수정
	@RequestMapping(value="/stu/indivUpdate", method=RequestMethod.GET)
	public String indivUpdate(){
		String url = "";
		
		return url;
	}
	
	//학적변동현황
	@RequestMapping(value="/stu/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeList(){
		String url = "/stu/colleage/colleageChangeList";
		
		return url;
	}
	//학적변동현황
	@RequestMapping(value="/pro/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeListByPro(){
		String url = "/pro/colleageChangeList";
		
		return url;
	}
	//학적변동현황
	@RequestMapping(value="/emp/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeListByEmp(){
		String url = "/emp/colleageChangeList";
		
		return url;
	}
}
