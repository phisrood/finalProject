package com.korea.majorREQ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MajorREQController {

	//부전공 신청양식 출력
	@RequestMapping(value="/stu/minorModel", method=RequestMethod.GET)
	public String minorREQModel(){
		String url="";
		
		return url;
	}
	
	///////////////////////// 부전공 ////////////////////////////
	
	//부전공 신청
	@RequestMapping(value="/stu/belongMinorREQ", method=RequestMethod.GET)
	public String belongMinorREQ(){
		String url="";
		
		return url;
	}
	
	//소속학과 부전공 신청내역 출력
	@RequestMapping(value="/pro/belongMinorREQList", method=RequestMethod.GET)
	public String belongMinorREQList(){
		String url="/pro/belongMinorREQList";
		
		return url;
	}
	
	//소속학과 부전공신청내역 승인/반려
	@RequestMapping(value="/pro/belongMinorREQDecide", method=RequestMethod.GET)
	public String belongMinorREQDecide(){
		String url="";
		
		return url;
	}
	
	//타학과 부전공 신청내역 출력
	@RequestMapping(value="/pro/othersMinorREQList", method=RequestMethod.GET)
	public String othersMinorREQList(){
		String url="/pro/othersMinorREQList";
		
		return url;
	}
	
	//타학과 부전공신청내역 승인/반려
	@RequestMapping(value="/pro/othersMinorREQDecide", method=RequestMethod.GET)
	public String othersMinorREQDecide(){
		String url="";
		
		return url;
	}
	
	///////////////////////// 다전공 ////////////////////////////
	
	//다전공 신청
	@RequestMapping(value="/stu/belongMajorREQ", method=RequestMethod.GET)
	public String belongMajorREQ(){
		String url="";
		
		return url;
	}
	
	//소속학과 다전공 신청내역 출력
	@RequestMapping(value="/pro/belongMajorREQList", method=RequestMethod.GET)
	public String belongMajorREQList(){
		String url="";
		
		return url;
	}
	
	//소속학과 다전공신청내역 승인/반려
	@RequestMapping(value="/emp/belongMajorREQDecide", method=RequestMethod.GET)
	public String belongMajorREQDecide(){
		String url="";
		
		return url;
	}
	
	//타학과 다전공 신청내역 출력
	@RequestMapping(value="/pro/othersMajorREQList", method=RequestMethod.GET)
	public String othersMajorREQList(){
		String url="";
		
		return url;
	}
	
	//타학과 다전공신청내역 승인/반려
	@RequestMapping(value="/emp/othersMajorREQDecide", method=RequestMethod.GET)
	public String othersMajorREQDecide(){
		String url="";
		
		return url;
	}
}
