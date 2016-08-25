package com.korea.departmentManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DepartmentManageController {

	//학과정보조회
	@RequestMapping(value="/emp/departmentInfoList", method=RequestMethod.GET)
	public String departmentInfoList(){
		String url = "";
		
		return url;
	}
	
	//신설학과 등록
	@RequestMapping(value="/emp/departmentInsert", method=RequestMethod.GET)
	public String departmentInsert(){
		String url = "";
		
		return url;
	}
	
	//학과정보 수정
	@RequestMapping(value="/emp/departmentUpdate", method=RequestMethod.GET)
	public String departmentUpdate(){
		String url = "";
		
		return url;
	}
	
	//학과폐지
	@RequestMapping(value="/emp/departmentOnOff", method=RequestMethod.GET)
	public String departmentOnOff(){
		String url = "";
		
		return url;
	}
}
