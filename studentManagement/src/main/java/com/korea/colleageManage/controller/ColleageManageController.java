package com.korea.colleageManage.controller;
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
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.colleageManage.service.ColleageManageService;
import com.korea.dto.Colleage_Register_ChangeVO;
import com.korea.dto.UsersVO;


@Controller
public class ColleageManageController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	// 휴/복학 신청양식 출력
	
	@Autowired
	ColleageManageService colleageManageService;
	

	
	
	
	@RequestMapping(value="/stu/schoolReModel", method=RequestMethod.GET)
	public String schoolReModel(HttpSession session, Model model){
		String url = "/stu/schoolReModel";

		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		List<Colleage_Register_ChangeVO> Colleage_Register_ChangeVO=  colleageManageService.getSchoolReREQList(stud_use_id);
		model.addAttribute("Colleage_Register_ChangeVO", Colleage_Register_ChangeVO);
		
		return url;
	}
	

	

	// 휴/복학 신청
	@RequestMapping(value="/stu/schoolReREQ", method=RequestMethod.POST)
	public String schoolReREQ(HttpSession session, Model model,
			@RequestParam(value="ad_reqdate_start", defaultValue="")String ad_reqdate_start,
			@RequestParam(value="ad_reqdate_end", defaultValue="")String ad_reqdate_end,
			HttpServletRequest request, HttpServletResponse response
			)throws IOException{
		String url="redirect:/stu/schoolReModel";
		  
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		String option = request.getParameter("option");
		String changesayou = request.getParameter("sayou");

		Map<String, String> map = new HashMap<String, String>();
		map.put("option", option);
		map.put("ad_reqdate_start", ad_reqdate_start);
		map.put("ad_reqdate_end", ad_reqdate_end);
		map.put("changesayou", changesayou);
		map.put("stud_use_id", stud_use_id);
		
		colleageManageService.insertSchoolReREQ(map);
		
	/*	
		PrintWriter writer = response.getWriter();
		   response.setContentType("text/html;charset=UTF-8");
		   writer.println("<script type='text/javascript'>");
	       writer.println("alert('성공적으로 신청되었습니다.');");
	       writer.println("</script>");
	       writer.flush();*/
	   
		return url;
	}

	@RequestMapping(value="/emp/schoolReREQList", method=RequestMethod.GET)
	public String schoolReREQList(){
		String url="/emp/schoolReREQList";
		
		return url;
	}
	
	
	// 휴/복학 신청승인/반려
	@RequestMapping(value="/emp/schoolReREQDecide", method=RequestMethod.GET)
	public String schoolReREQDecide(){
		String url="";
		
		return url;
	}
	
	
}
