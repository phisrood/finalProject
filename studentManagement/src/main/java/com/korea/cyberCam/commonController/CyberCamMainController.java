package com.korea.cyberCam.commonController;
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
public class CyberCamMainController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//사이버캠퍼스 메인
	@RequestMapping(value={"/cyberCampus/stu/cyberClassMain","/cyberCampus/pro/cyberClassMain"}, method=RequestMethod.GET)
	public String cyberClassMainByPro(){
		String url="/cyberCampus/common/cyberClassMain";
		
		return url;
	}
	//
	
}
