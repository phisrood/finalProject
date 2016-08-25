package com.korea.memberManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberManageController {

	
	//학생정보조회
	@RequestMapping(value="/emp/stuInfoList", method=RequestMethod.GET)
	public String stuInfoList(){
		String url="";
		
		return url;
	}
	
	//학생정보등록
	@RequestMapping(value="/emp/stuInfoInsert", method=RequestMethod.GET)
	public String stuInfoInsert(){
		String url="";
		
		return url;
	}
	
	//학생정보등록(신입생 엑셀등록)
	@RequestMapping(value="/emp/stuInfoInsertExcel", method=RequestMethod.GET)
	public String stuInfoInsertExcel(){
		String url="";
		
		return url;
	}
	
	//학생정보수정
	@RequestMapping(value="/emp/stuInfoUpdate", method=RequestMethod.GET)
	public String stuInfoUpdate(){
		String url="";
		
		return url;
	}
	
	//학생정보 비활성화onoff
	@RequestMapping(value="/emp/stuInfoOnOff", method=RequestMethod.GET)
	public String stuInfoOnOff(){
		String url="";
		
		return url;
	}
	
	///////////////////////////교수/////////////////////////
	
	//교수정보조회
	@RequestMapping(value="/emp/proInfoList", method=RequestMethod.GET)
	public String proInfoList(){
		String url="";
		
		return url;
	}
	
	//교수정보등록
	@RequestMapping(value="/emp/proInfoInsert", method=RequestMethod.GET)
	public String proInfoInsert(){
		String url="";
		
		return url;
	}
	
	//교수정보수정
	@RequestMapping(value="/emp/proInfoUpdate", method=RequestMethod.GET)
	public String proInfoUpdate(){
		String url="";
		
		return url;
	}
	
	//교수정보 비활성화onoff
	@RequestMapping(value="/emp/proInfoOnOff", method=RequestMethod.GET)
	public String proInfoOnOff(){
		String url="";
		
		return url;
	}
	
	///////////////////////////교직원/////////////////////////
	
	//교직원정보조회
	@RequestMapping(value="/emp/empInfoList", method=RequestMethod.GET)
	public String empInfoList(){
		String url="";
		
		return url;
	}
	
	//교직원정보등록
	@RequestMapping(value="/emp/empInfoInsert", method=RequestMethod.GET)
	public String empInfoInsert(){
		String url="";
		
		return url;
	}
	
	//교직원정보수정
	@RequestMapping(value="/emp/empInfoUpdate", method=RequestMethod.GET)
	public String empInfoUpdate(){
		String url="";
		
		return url;
	}
	
	//교직원정보 비활성화onoff
	@RequestMapping(value="/emp/empInfoOnOff", method=RequestMethod.GET)
	public String empInfoOnOff(){
		String url="";
		
		return url;
	}
	
}
