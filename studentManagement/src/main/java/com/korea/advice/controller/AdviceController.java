package com.korea.advice.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.korea.advice.service.AdviceService;
import com.korea.dto.ADBInsertVO;
import com.korea.dto.AdviceVO;
import com.korea.dto.Advice_BoardVO;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.UsersVO;

/**
 * @Class Name : AdviceController.java
 * @Description : 학사일정관리 서비스 클래스
 * @Modification Information
 * @author 이영만
 * @since 2016.08.25.
 * @version 1.0
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Controller
public class AdviceController {
	@Autowired
	AdviceService adviceService;

	/**
	 * 받은 상담신청 조회(교수)
	 * @param model, session
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/pro/adviceResponsList")
	public String adviceResponsList(Model model, HttpSession session) {
		String url = "/pro/adviceResponsList";

		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String pro_use_id = user.getUse_id();

		List<AdviceVO> adviceResList = adviceService.getAdviceResponsList(pro_use_id);
		model.addAttribute("adviceResList", adviceResList);
		
		return url;
	}

	/**
	 * 보낸 상담 신청 조회(학생)
	 * @param model, session
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/stu/adviceRequestList")
	public String adviceRequestList(Model model, HttpSession session) {
		String url = "/stu/adviceRequestList";

		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = user.getUse_id();

		List<AdviceVO> adviceReqList = adviceService.getAdviceRequestList(stud_use_id);
		List<ProfessorVO> professorList = adviceService.getProfessorList(stud_use_id);

		model.addAttribute("adviceReqList", adviceReqList);
		model.addAttribute("professorList", professorList);

		return url;
	}

	/**
	 * 상담신청
	 * @param adviceVO, session
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/stu/adviceREQ", method = RequestMethod.POST)
	public String adviceREQ(AdviceVO adviceVO, HttpSession session) {
		String url = "redirect:adviceRequestList";
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		adviceVO.setAd_stud_use_id(user.getUse_id());

		adviceService.insertAdviceREQ(adviceVO);

		return url;
	}

	/**
	 * 상담가능일자 입력
	 * @param ad_no
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/stu/adviceCancel", method = RequestMethod.POST)
	public String adviceDate(String[] ad_no) {
		String url = "redirect:/stu/adviceRequestList";
			for (int i = 0; i < ad_no.length; i++) {
				adviceService.updateAdviceCancel(Integer.parseInt(ad_no[i]));
			}

		return url;
	}

	/**
	 * 상담 확인 폼이동
	 * @param ad_no, model
	 * @return String
	 * @throws IOException
	 */
	@RequestMapping(value = "/pro/updateAdviceConfirmForm", method = RequestMethod.GET)
	public String updateAdviceConfirmForm(int ad_no, Model model) throws IOException {
		String url = "/pro/Consultation_RHP";
		
		AdviceVO adviceVO = adviceService.updateAdviceConfirmForm(ad_no);

		model.addAttribute("adviceVO", adviceVO);
		
		return url;
	}

	/**
	 * 상담 확인
	 * @param ad_no, res
	 * @return void
	 * @throws IOException
	 */
	@RequestMapping(value = "/pro/updateAdviceConfirm", method = RequestMethod.POST)
	public void updateAdviceConfirm(int ad_no,HttpServletResponse res) throws IOException {
		adviceService.updateAdviceConfirm(ad_no);
		
		res.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = res.getWriter();
		writer.println("<script>");
		writer.println("window.close();");
		writer.println("opener.location.reload();");
		writer.println("</script>");
	}
	
	/**
	 * 상담 연기
	 * @param adviceVO, res
	 * @return void
	 * @throws IOException 
	 */
	@RequestMapping(value = "/pro/updateAdviceDelay", method = RequestMethod.POST)
	public void updateAdviceDelay(AdviceVO adviceVO,HttpServletResponse res) throws IOException {
		adviceService.updateAdviceDelay(adviceVO);
		
		res.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = res.getWriter();
		writer.println("<script>");
		writer.println("window.close();");
		writer.println("opener.location.reload();");
		writer.println("</script>");
	}

	/**
	 * 상담게시판
	 * @param model, session
	 * @return String
	 */
	@RequestMapping(value = { "/stu/adviceBoard", "/pro/adviceBoard" })
	public String adviceBoard(Model model,HttpSession session) {
		String url = "/common/adviceBoard";
		
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
				
		List<Advice_BoardVO> adviceBoardList = adviceService.getAdviceBoardList();
		
		model.addAttribute("auth", user.getAuthority());
		model.addAttribute("adviceBoardList", adviceBoardList);
		return url;
	}

	/**
	 * 상담 게시판 글 작성 폼
	 * @param session, model
	 * @return String
	 */
	@RequestMapping(value = "/stu/adviceBoardWriteForm")
	public String adviceBoardWriteForm(HttpSession session,Model model) {
		String url = "/stu/adviceBoardWrite";
		
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = user.getUse_id();
		
		model.addAttribute("stud_use_id", stud_use_id);
		return url;
	}

	/**
	 * 상담 게시판 글 작성
	 * @param adviceInsertAFVO, request
	 * @return String
	 * @throws IOException, IllegalStateException
	 */
	@RequestMapping(value = "/stu/adviceBoardWrite", method = RequestMethod.POST)
	public String adviceBoardWrite(ADBInsertVO adviceInsertAFVO,HttpServletRequest request) throws IllegalStateException, IOException {
		String url = "redirect:/stu/adviceBoard";
		int af_no=0;
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/common/adviceAF");
		
		MultipartFile multipartFile = adviceInsertAFVO.getAdb_file();
		if(!multipartFile.isEmpty()){
			String adb_after_name = System.currentTimeMillis()+multipartFile.getOriginalFilename();
			File file = new File(uploadPath,adb_after_name);
			multipartFile.transferTo(file);
			adviceInsertAFVO.setAdb_af_realname(multipartFile.getOriginalFilename());			
			adviceInsertAFVO.setAdb_af_aftername(adb_after_name);
			adviceInsertAFVO.setAdb_af_path(uploadPath);
			af_no = adviceService.insertAdviceBoardAF(adviceInsertAFVO);
		}
		
		adviceService.insertAdviceBoard(af_no,adviceInsertAFVO);
		
		return url;
	}
	
	/**
	 * 상담게시판 답변 작성
	 * @param adb_no, model, session, request
	 * @return String
	 */
	@RequestMapping(value = {"/stu/adviceBoardUpdateDetail","/pro/adviceBoardUpdateDetail"}, method = RequestMethod.GET)
	public String adviceBoardUpdateDetail(int adb_no,Model model,HttpSession session,HttpServletRequest request) {
		String url = "/common/adviceBoardUpdateDetail";
		Advice_BoardVO adviceBoardVO = adviceService.getAdviceBoard(adb_no);
		
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String loginUserId = user.getUse_id();
		if(loginUserId.equals(adviceBoardVO.getAdb_stud_use_id())){
			loginUserId="작성자";
		}
		
		if(adviceBoardVO.getAdb_af_no()!=0){
			Attachment_FileVO fileVO = adviceService.getAdviceBoardFile(adviceBoardVO.getAdb_af_no());		
			model.addAttribute("filename", fileVO.getAf_realname());
		}
		
		model.addAttribute("auth", user.getAuthority());
		model.addAttribute("loginUserId", loginUserId);
		model.addAttribute("loginUser", user);
		model.addAttribute("use_name", adviceBoardVO.getUse_name());
		model.addAttribute("adb_no", adviceBoardVO.getAdb_no());
		model.addAttribute("adb_pro_use_id", adviceBoardVO.getAdb_pro_use_id());
		model.addAttribute("adb_stud_use_id", adviceBoardVO.getAdb_stud_use_id());
		model.addAttribute("adb_af_no", adviceBoardVO.getAdb_af_no());
		model.addAttribute("adb_title", adviceBoardVO.getAdb_title());
		model.addAttribute("adb_content", adviceBoardVO.getAdb_content());
		model.addAttribute("adb_date", adviceBoardVO.getAdb_date());
		model.addAttribute("adb_commentcontent", adviceBoardVO.getAdb_commentcontent());
		model.addAttribute("adb_commentstat", adviceBoardVO.getAdb_commentstat());
		
		
		return url;
	}
	
	/**
	 * 상담게시판 파일 다운로드
	 * @param request, adb_af_no, response
	 * @return ModelAndView
	 * @throws IOException
	 */
	@RequestMapping(value = "/common/adviceBoardFile", method = RequestMethod.GET)
	public ModelAndView adviceBoardFile(HttpServletRequest request,int adb_af_no, HttpServletResponse response) throws IOException {
		
		Attachment_FileVO fileVO = adviceService.getAdviceBoardFile(adb_af_no);
		
		String path = request.getSession().getServletContext().getRealPath("resources/common/adviceAF");
		
		File file = new File(path,fileVO.getAf_aftername());
				
		return new ModelAndView("download", "downloadFile", file);
	}
	
	/**
	 * 상담게시판 수정 폼
	 * @param adb_no, model
	 * @return String
	 */
	@RequestMapping(value = "/stu/adviceBoardUpdateForm", method = RequestMethod.GET)
	public String adviceBoardUpdateForm(int adb_no,Model model) {
		String url = "/stu/adviceBoardUpdateForm";
		Advice_BoardVO adviceBoardVO = adviceService.getAdviceBoard(adb_no);
		
		model.addAttribute("adb_no", adviceBoardVO.getAdb_no());
		model.addAttribute("adb_pro_use_id", adviceBoardVO.getAdb_pro_use_id());
		model.addAttribute("adb_stud_use_id", adviceBoardVO.getAdb_stud_use_id());
		model.addAttribute("adb_af_no", adviceBoardVO.getAdb_af_no());
		model.addAttribute("adb_title", adviceBoardVO.getAdb_title());
		model.addAttribute("adb_content", adviceBoardVO.getAdb_content());
		model.addAttribute("adb_date", adviceBoardVO.getAdb_date());
		model.addAttribute("adb_commentcontent", adviceBoardVO.getAdb_commentcontent());
		model.addAttribute("adb_commentstat", adviceBoardVO.getAdb_commentstat());
			
		return url;
	}
	
	/**
	 * 상담게시판수정
	 * @param adb_no, adb_title, adb_stud_use_id, adb_content, adb_file, request
	 * @return String
	 * @throws IOException
	 */
	@RequestMapping(value = "/stu/adviceBoardUpdate", method = RequestMethod.POST)
	public String adviceBoardUpdate(int adb_no,String adb_title,String adb_stud_use_id,String adb_content,MultipartFile adb_file,HttpServletRequest request) throws IOException{
		String url = "redirect:/stu/adviceBoard";
		int flag = 0;
		
		Map<String,String> params = new HashMap<String,String>();
		params.put("adb_no", adb_no+"");
		params.put("adb_title", adb_title);
		params.put("adb_stud_use_id", adb_stud_use_id);
		params.put("adb_content", adb_content);
		
		
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/common/adviceAF");
		
		if(!adb_file.isEmpty()){
			String afterName = System.currentTimeMillis()+"";
			int adb_af_no = adviceService.getAdviceBoard(adb_no).getAdb_af_no();
			if(adb_af_no != 0 ){
				params.put("adb_af_no", adb_af_no+"");
			}else{
				params.put("adb_af_no", "nofile");
			}
			
			File file = new File(uploadPath,afterName+adb_file.getOriginalFilename());
			adb_file.transferTo(file);
			
			params.put("adb_af_realname", adb_file.getOriginalFilename());
			String adb_after_name = afterName+adb_file.getOriginalFilename();
			params.put("adb_af_aftername", adb_after_name);
			params.put("adb_af_path", uploadPath);
			
			flag=1;
		}
		

		adviceService.updateAdviceBoard(params,flag);
				
		return url;
	}
	
	/**
	 * 상담게시판 삭제
	 * @param adb_no
	 * @return String
	 */
	@RequestMapping(value = "/stu/adviceBoardDelete", method = RequestMethod.GET)
	public String adviceBoardDelete(int adb_no) {
		String url = "redirect:/stu/adviceBoard";
		
		adviceService.deleteAdviceBoard(adb_no);
		
		return url;
	}
	
	/**
	 * 상담신청수정
	 * @param session, adviceBoardVO
	 * @return String
	 */
	@RequestMapping(value = "/pro/adviceBoardReply", method = RequestMethod.POST)
	public String adviceREQUpdate(HttpSession session,Advice_BoardVO adviceBoardVO) {
		String url = "redirect:/pro/adviceBoard";
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String pro_use_id = user.getUse_id();
		adviceBoardVO.setAdb_pro_use_id(pro_use_id);
		adviceService.updateAdviceComment(adviceBoardVO);
		return url;
	}
	
	/**
	 * 화상상담(학생)
	 * @param model, session
	 * @return String
	 */
	@RequestMapping(value = "/stu/camAdvice", method = RequestMethod.GET)
	public String camAdviceStu(Model model,HttpSession session) {
		String url = "/stu/cam_advice";
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String loginUser = user.getAuthority();
		
		List<AdviceVO> adviceList = adviceService.getMyAdviceReqeustList(user.getUse_id());
		
		model.addAttribute("auth", loginUser);
		model.addAttribute("adviceList", adviceList);
		return url;
	}
	
	/**
	 * 화상상담(학생) ajax
	 * @param model, session
	 * @return String
	 */
	@RequestMapping(value = "/stu/camAdviceAjax", method = RequestMethod.GET)
	@ResponseBody
	public List<AdviceVO> camAdviceStuAjax(Model model,HttpSession session) {
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String loginUser = user.getAuthority();
		
		List<AdviceVO> adviceList = adviceService.getMyAdviceReqeustList(user.getUse_id());
		
		return adviceList;
	}
	
	/**
	 * 화상상담(교수)
	 * @param model, session
	 * @return String
	 */
	@RequestMapping(value = "/pro/camAdvice", method = RequestMethod.GET)
	public String camAdvicePro(Model model,HttpSession session) {
		String url = "/pro/cam_advice";
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String loginUser = user.getAuthority();
		
		List<AdviceVO> adviceList = adviceService.getMyAdviceResponseList(user.getUse_id());
		
		model.addAttribute("auth", loginUser);
		model.addAttribute("adviceList", adviceList);
		return url;
	}

	/**
	 * 상담상태 변환
	 * @param channelId, ad_no, flag
	 * @return void
	 */
	@RequestMapping(value = "/pro/sendChannelId", method = RequestMethod.GET)
	public void updateChannelId(String channelId,String ad_no,String flag) {
		if(flag.equals("open")){
			adviceService.updateChannelId(channelId,ad_no);
		}else if(flag.equals("close")){
			adviceService.updateChannelId(ad_no);
		}
		
	}
}
