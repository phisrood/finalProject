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
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.cyberCam.noticeBBS.service.CyberCamNoticeBBSService;
import com.korea.dto.Cyber_LectureNoticeViewVO;
import com.korea.dto.UsersVO;

@Controller
public class CyberCamMainController {
	
	@Autowired
	CyberCamNoticeBBSService noticeService;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//사이버캠퍼스 메인
	@RequestMapping(value={"/cyberCampus/stu/cyberClassMain","/cyberCampus/pro/cyberClassMain"}, method=RequestMethod.POST)
	public String cyberClassMainByStu(HttpSession session,String pro_lec_no,@RequestParam(value="lec_no" ,defaultValue="0")int stu_lec_no,
			Model model){
		String url="/cyberCampus/common/cyberClassMain";
		int lec_no = 0;
		
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		if(user.getAuthority().equals("ROLE_STU")){
			session.setAttribute("stu_lec_no", stu_lec_no);
		}else if(user.getAuthority().equals("ROLE_PRO")){
			session.setAttribute("pro_lec_no", pro_lec_no);
		}
		
		if(pro_lec_no == null){
			lec_no = stu_lec_no;
		}else if(stu_lec_no == 0){
			lec_no = Integer.parseInt(pro_lec_no);
		}
		
		List<Cyber_LectureNoticeViewVO> noticeList = noticeService.getNoticeBBSList(lec_no);
		
		model.addAttribute("noticeList", noticeList);
		
		return url;
	}

}




