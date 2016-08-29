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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndivInfoManageController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/indivInfo", method=RequestMethod.GET)
	public String indivInfo(){
		String url = "/stu/colleage/indivInfo";
		
		return url;
	}
	/**
	 * 개인 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/indivUpdate", method=RequestMethod.GET)
	public String indivUpdate(){
		String url = "";
		
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
