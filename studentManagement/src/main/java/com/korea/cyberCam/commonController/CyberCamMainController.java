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
 *       수정일          수정자                수정내용
 *    -------      -------     -------------------
 *    2016.08.29.     조현욱              최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.dto.UsersVO;

@Controller
public class CyberCamMainController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//사이버캠퍼스 메인
	@RequestMapping(value={"/cyberCampus/stu/cyberClassMain","/cyberCampus/pro/cyberClassMain"}, method=RequestMethod.POST)
	public String cyberClassMainByStu(HttpSession session,String pro_lec_no,@RequestParam(value="lec_no" ,defaultValue= "0",required=false)int stu_lec_no){
		String url="/cyberCampus/common/cyberClassMain";
		
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		if(user.getAuthority().equals("ROLE_STU")){
			System.out.println("학생");
			session.setAttribute("stu_lec_no", stu_lec_no);
		}else if(user.getAuthority().equals("ROLE_PRO")){
			System.out.println("교수");
			session.setAttribute("pro_lec_no", pro_lec_no);
		}
		
		return url;
	}
}
