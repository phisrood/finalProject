package com.korea.period.controller;
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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.dto.NoticeViewVO;

@Controller
public class PeriodController  {
	
	//공지사항 수정 폼이동
	@RequestMapping(value="/emp/periodSetting", method=RequestMethod.GET)
	public String periodPage(){
		String url="emp/periodSetting";

		return url;
	}
	//공지사항 수정 폼이동
	@RequestMapping(value="/emp/updateCrsesInquiryPeriod", method=RequestMethod.GET)
	public String updateCrsesInquiryPeriod(){
		String url="emp/updateCrsesInquiryPeriod";
		
		return url;
	}
	
	
	
	
}
