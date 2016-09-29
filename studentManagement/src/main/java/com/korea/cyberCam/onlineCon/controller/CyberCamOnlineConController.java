package com.korea.cyberCam.onlineCon.controller;
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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.korea.cyberCam.onlineCon.service.CyberCamOnlineConService;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Online_Con_StudentListVO;
import com.korea.dto.Online_Con_ViewVO;
import com.korea.dto.Online_Con_Watchcheck_ViewVO;
import com.korea.dto.Online_ContentsVO;
import com.korea.dto.UsersVO;
import com.korea.dto.WatchStudentsVO;
import com.korea.dto.Watch_StatusVO;

@Controller
public class CyberCamOnlineConController {
	
	@Autowired
	CyberCamOnlineConService cyberCamOnlineConService;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 삭제
	@RequestMapping(value="/cyberCampus/pro/onlineConInsertForm")
	public String onlineConInsertForm(){
		String url = "/cyberCampus/pro/onlineConInsertForm";	
		return url;
	}
	
	/**
	 * @throws IOException 
	 * @throws IllegalStateException 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 등록
	@RequestMapping(value="/cyberCampus/pro/onlineConReg", method=RequestMethod.POST)
	public String onlineConReg(Online_ContentsVO onlineContentsVO,HttpServletRequest request,HttpSession session) throws IllegalStateException, IOException {
		String url = "/cyberCampus/pro/onlineConInsertForm";
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/common/onlineContentsAF");
		
		// 세션
		int lec_no = Integer.parseInt((String) session.getAttribute("pro_lec_no"));
		onlineContentsVO.setOc_lec_no(lec_no);
		
		MultipartFile multipartFile = onlineContentsVO.getFile();
		Attachment_FileVO attachFileVO = new Attachment_FileVO();
		if(!multipartFile.isEmpty()){
			String aftername = System.currentTimeMillis()+multipartFile.getOriginalFilename();
			File file = new File(uploadPath,aftername);
			multipartFile.transferTo(file);
			
			attachFileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachFileVO.setAf_aftername(aftername);
			attachFileVO.setAf_path(uploadPath);
		}
		
		int oc_no = cyberCamOnlineConService.insertOnlineCon(onlineContentsVO,attachFileVO);
		
		onlineContentsVO.setOc_lec_no(Integer.parseInt((String) session.getAttribute("pro_lec_no")));
		
		List<Online_Con_StudentListVO> StudentMap = cyberCamOnlineConService.getOnlinConStudents(onlineContentsVO.getOc_lec_no());	
		List<WatchStudentsVO> WatchList = new ArrayList<WatchStudentsVO>();
		
		for(int i=0; i<StudentMap.size();i++){
			WatchStudentsVO watchVO = new WatchStudentsVO();
			watchVO.setWs_oc_lec_no(Integer.parseInt((String) session.getAttribute("pro_lec_no")));
			watchVO.setWs_oc_no(oc_no);
			watchVO.setWs_stud_use_id(StudentMap.get(i).getCb_stud_use_id());
			WatchList.add(i, watchVO);
			System.out.println(watchVO.getWs_stud_use_id());
		}
		cyberCamOnlineConService.insertOnlineConStudentList(WatchList);
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 수정
	@RequestMapping(value="/pro/onlineConUpdate", method=RequestMethod.GET)
	public String onlineConUpdate(){
		String url = "";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 삭제
	@RequestMapping(value="/pro/onlineConDelete", method=RequestMethod.GET)
	public String onlineConDelete(){
		String url = "";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 조회(학생)
	@RequestMapping(value={"/cyberCampus/stu/onlineConList"})
	public String onlineConListStu(HttpSession session,Model model){
		String url = "/cyberCampus/stu/onlineConList";
		int lec_no  =  (int) session.getAttribute("stu_lec_no");
		
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String loginUser = user.getUse_id();
		
		List<Online_ContentsVO> onlineConList =  cyberCamOnlineConService.getOnlineConList(lec_no,loginUser);	
		
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("onlineConList", onlineConList);
		return url;
	}
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 조회(학과)
	@RequestMapping(value={"/cyberCampus/stu/onlineConView"}, method=RequestMethod.GET)
	@ResponseBody
	public HashMap<String, String> onlineConListPro(@RequestParam(value="af_no")String af_no,
			@RequestParam(value="oc_no")String oc_no,
			@RequestParam(value="oc_lec_no")String oc_lec_no,
			@RequestParam(value="loginUser")String loginUser,
			HttpServletResponse response){
		Attachment_FileVO file = cyberCamOnlineConService.getAF(Integer.parseInt(af_no));
		String path = "http://192.168.206.102:8080/resources/common/onlineContentsAF/"+file.getAf_aftername();
		Online_Con_ViewVO conViewTimeVO = new Online_Con_ViewVO();
		conViewTimeVO.setWs_oc_lec_no(Integer.parseInt(oc_lec_no));
		conViewTimeVO.setWs_oc_no(Integer.parseInt(oc_no));
		conViewTimeVO.setWs_stud_use_id(loginUser);
		
		HashMap<String, String> params = new HashMap<String, String>();
		int watchTime = cyberCamOnlineConService.getWatchTime(conViewTimeVO);
		params.put("watchTime", ""+watchTime);
		params.put("path", path);
		return params;
	}
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 진도체크
	@RequestMapping(value={"/cyberCampus/pro/onlineConList"})
	public String OnlineConList(HttpSession session,Model model){
		String url = "/cyberCampus/pro/onlineConList";
		
		// 세션
		String lec_no = (String) session.getAttribute("pro_lec_no");
		
		List<Online_Con_Watchcheck_ViewVO> watchCheckList = cyberCamOnlineConService.getOnlineConList(lec_no);
		List<Online_ContentsVO> onlineConList = cyberCamOnlineConService.getOnlineConList2(lec_no);
		
		model.addAttribute("onlineConList",onlineConList);
		model.addAttribute("watchCheckList", watchCheckList);
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 진도체크
	@RequestMapping(value={"/cyberCampus/stu/timeCheck"}, method=RequestMethod.POST)
	public void onlineConListPro(int oc_time,String loginUser,String oc_no,String oc_lec_no,String full_time){

		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		Map<String,String> params = new HashMap<String,String>();
		params.put("loginUser", loginUser);
		params.put("oc_no", oc_no);
		params.put("oc_lec_no", oc_lec_no);
		params.put("oc_time", oc_time+"");
		
		cyberCamOnlineConService.updateOnlineConTime(params,full_time);
		
	}
	
	@RequestMapping(value={"/cyberCampus/pro/deleteCon"}, method=RequestMethod.POST)
	public void deleteCon(int oc_no){
		cyberCamOnlineConService.deleteCon(oc_no);
	}
}
