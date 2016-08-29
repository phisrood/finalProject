package com.korea.memberManage.controller;
/**
 * @Class Name : MemberManageController.java
 * @Description : 학생 및 교수 및 교직원 정보 조회 / 등록 / 수정 / 비활성화
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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberManageController {
	/**
	 * 학생 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/stuInfoList", method=RequestMethod.GET)
	public String stuInfoList(){
		String url="";
		
		return url;
	}
	/**
	 * 학생 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/stuInfoInsert", method=RequestMethod.GET)
	public String stuInfoInsert(){
		String url="";
		
		return url;
	}
	/**
	 * 학생 정보 등록 ( 신입생 엑셀 등록 )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/stuInfoInsertExcel", method=RequestMethod.GET)
	public String stuInfoInsertExcel(){
		String url="";
		
		return url;
	}
	/**
	 * 학생 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/stuInfoUpdate", method=RequestMethod.GET)
	public String stuInfoUpdate(){
		String url="";
		
		return url;
	}
	/**
	 * 학생 정보 비활성화 ( on / off )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/stuInfoOnOff", method=RequestMethod.GET)
	public String stuInfoOnOff(){
		String url="";
		
		return url;
	}
	
	///////////////////////////교수/////////////////////////
	
	/**
	 * 교수 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/proInfoList", method=RequestMethod.GET)
	public String proInfoList(){
		String url="";
		
		return url;
	}
	/**
	 * 교수 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/proInfoInsert", method=RequestMethod.GET)
	public String proInfoInsert(){
		String url="";
		
		return url;
	}
	/**
	 * 교수 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/proInfoUpdate", method=RequestMethod.GET)
	public String proInfoUpdate(){
		String url="";
		
		return url;
	}
	/**
	 * 교수 정보 비활성화 ( on / off )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/proInfoOnOff", method=RequestMethod.GET)
	public String proInfoOnOff(){
		String url="";
		
		return url;
	}
	
	///////////////////////////교직원/////////////////////////
	
	/**
	 * 교직원 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/empInfoList", method=RequestMethod.GET)
	public String empInfoList(){
		String url="";
		
		return url;
	}
	/**
	 * 교직원 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/empInfoInsert", method=RequestMethod.GET)
	public String empInfoInsert(){
		String url="";
		
		return url;
	}
	/**
	 * 교직원 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/empInfoUpdate", method=RequestMethod.GET)
	public String empInfoUpdate(){
		String url="";
		
		return url;
	}
	/**
	 * 교직원 정보 비활성화 ( on / off )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/empInfoOnOff", method=RequestMethod.GET)
	public String empInfoOnOff(){
		String url="";
		
		return url;
	}
	
}
