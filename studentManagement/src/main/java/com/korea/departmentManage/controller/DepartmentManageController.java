package com.korea.departmentManage.controller;
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
public class DepartmentManageController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학과정보조회
	@RequestMapping(value="/emp/departmentInfoList", method=RequestMethod.GET)
	public String departmentInfoList(){
		String url = "/emp/departmentInfoList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//신설학과 등록
	@RequestMapping(value="/emp/departmentInsert", method=RequestMethod.GET)
	public String departmentInsert(){
		String url = "/emp/departmentInsert";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학과정보 수정
	@RequestMapping(value="/emp/departmentUpdate", method=RequestMethod.GET)
	public String departmentUpdate(){
		String url = "/emp/departmentUpdate";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학과폐지
	@RequestMapping(value="/emp/departmentOnOff", method=RequestMethod.GET)
	public String departmentOnOff(){
		String url = "";
		
		return url;
	}
}
