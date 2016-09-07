package com.korea.advice.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.korea.advice.service.AdviceService;
import com.korea.dto.AdviceVO;
import com.korea.dto.Advice_BoardInsertVO;
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
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 받은 상담 신청 조회(교수)
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
	 * 학생이 보낸 상담 신청 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 보낸 상담 신청 조회(학생)
	@RequestMapping(value = "/stu/adviceRequestList")
	public String adviceRequestList(Model model, HttpSession session) {
		String url = "/stu/adviceRequestList";

		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = user.getUse_id();

		List<AdviceVO> adviceReqList = adviceService.getAdviceRequestList(stud_use_id);
		List<ProfessorVO> professorList = adviceService.getProfessorList(stud_use_id);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		model.addAttribute("adviceReqList", adviceReqList);
		model.addAttribute("professorList", professorList);

		return url;
	}

	/**
	 * 상담신청
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담신청
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
	 * 상담답변
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 답변
	@RequestMapping(value = "/stu/adviceReply", method = RequestMethod.GET)
	public String adviceReply() {
		String url = "";

		return url;
	}

	/**
	 * 상담가능일자 입력
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 가능일자 입력
	@RequestMapping(value = "/stu/adviceCancel", method = RequestMethod.POST)
	public String adviceDate(String[] ad_no) {
		String url = "redirect:/stu/adviceRequestList";
		
			for (int i = 0; i < ad_no.length; i++) {
				adviceService.updateAdviceCancel(Integer.parseInt(ad_no[i]));
			}

		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 신청 삭제
	@RequestMapping(value = "/pro/updateAdviceConfirmForm", method = RequestMethod.GET)
	public String updateAdviceConfirmForm(int ad_no, Model model) {
		String url = "/pro/Consultation_RHP";
		AdviceVO adviceVO = adviceService.updateAdviceConfirmForm(ad_no);
		model.addAttribute("adviceVO", adviceVO);
		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return0
	 * @throws
	 */
	// 상담 신청 삭제
	@RequestMapping(value = "/pro/updateAdviceConfirm", method = RequestMethod.POST)
	public String updateAdviceConfirm(int ad_no) {
		String url = "redirect:/pro/adviceResponsList";
		adviceService.updateAdviceConfirm(ad_no);
		return url;
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 신청 삭제
	@RequestMapping(value = "/pro/updateAdviceDelay", method = RequestMethod.POST)
	public String updateAdviceDelay(AdviceVO adviceVO) {
		String url = "redirect:/pro/adviceResponsList";
		adviceService.updateAdviceDelay(adviceVO);
		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판
	@RequestMapping(value = { "/stu/adviceBoard", "/pro/adviceBoard" })
	public String adviceBoard(Model model) {
		String url = "/common/adviceBoard";
		List<Advice_BoardVO> adviceBoardList = adviceService.getAdviceBoardList();
		model.addAttribute("adviceBoardList", adviceBoardList);
		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 글 작성
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
	 * @throws IOException 
	 * @throws IllegalStateException 
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 글 작성
	@RequestMapping(value = "/stu/adviceBoardWrite", method = RequestMethod.POST)
	public String adviceBoardWrite(Advice_BoardInsertVO adviceInsertVO,HttpServletRequest request) throws IllegalStateException, IOException {
		String url = "redirect:/stu/adviceBoard";
		int af_no=0;
		
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/common/adviceAF");
		MultipartFile multipartFile = adviceInsertVO.getAdb_file();
		if(!multipartFile.isEmpty()){
			String adb_after_name = System.currentTimeMillis()+multipartFile.getOriginalFilename();
			File file = new File(uploadPath,adb_after_name);
			multipartFile.transferTo(file);
			adviceInsertVO.setAdb_realName(multipartFile.getOriginalFilename());			adviceInsertVO.setAdb_afterName(adb_after_name);
			adviceInsertVO.setAdb_path(uploadPath);
			af_no=adviceService.insertAdviceBoardAF(adviceInsertVO);
			adviceInsertVO.setAdb_af_no(af_no);
		}
		adviceService.insertAdviceBoard(adviceInsertVO,af_no);
		
		return url;
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 답변 작성
	@RequestMapping(value = "/common/adviceBoardUpdateDetail", method = RequestMethod.GET)
	public String adviceBoardUpdateDetail(int adb_no,Model model,HttpSession session,HttpServletRequest request) {
		String url = "/common/adviceBoardUpdateDetail";
		Advice_BoardVO adviceBoardVO = adviceService.getAdviceBoard(adb_no);
		
		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String loginUser = user.getUse_id();
		if(loginUser.equals(adviceBoardVO.getAdb_stud_use_id())){
			loginUser="작성자";
		}
		
		if(adviceBoardVO.getAdb_af_no()!=0){
			Attachment_FileVO fileVO = adviceService.getAdviceBoardFile(adviceBoardVO.getAdb_af_no());		
			model.addAttribute("filename", fileVO.getAf_realname());
		}
		
		model.addAttribute("auth", user.getAuthority());
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("adb_no", adviceBoardVO.getAdb_no());
		model.addAttribute("adb_pro_use_id", adviceBoardVO.getAdb_pro_use_id());
		model.addAttribute("adb_stud_use_id", adviceBoardVO.getAdb_stud_use_id());
		model.addAttribute("adb_af_no", adviceBoardVO.getAdb_af_no());
		model.addAttribute("adb_title", adviceBoardVO.getAdb_title());
		model.addAttribute("adb_content", adviceBoardVO.getAdb_content());
		model.addAttribute("adb_date", adviceBoardVO.getAdb_date());
		model.addAttribute("adb_commentcontent", adviceBoardVO.getAdb_commentcontent());
		model.addAttribute("adb_commentstat", adviceBoardVO.getAdb_commentstat());
		
		
		//model.addAttribute("adviceBoardVO", adviceBoardVO);
		return url;
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 답변 작성
	@RequestMapping(value = "/common/adviceBoardFile", method = RequestMethod.GET)
	public ModelAndView adviceBoardFile(HttpServletRequest request,int adb_af_no, HttpServletResponse response) throws IOException {
		
		Attachment_FileVO fileVO = adviceService.getAdviceBoardFile(adb_af_no);
		
		String path = request.getSession().getServletContext().getRealPath("resources/common/adviceAF");
		
		File file = new File(path,fileVO.getAf_aftername());
		
		if(file == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
		
		return new ModelAndView("download", "downloadFile", file);
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 답변 작성
	@RequestMapping(value = "/stu/adviceBoardUpdateForm", method = RequestMethod.GET)
	public String adviceBoardUpdateForm(int adb_no,Model model) {
		String url = "/common/adviceBoardUpdateForm";
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
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 답변 작성
	@RequestMapping(value = "/stu/adviceBoardUpdate", method = RequestMethod.POST)
	public String adviceBoardUpdate(int adb_no,String adb_title,String adb_content,MultipartFile adb_file,HttpServletRequest request) throws IOException{
		String url = "redirect:/stu/adviceBoard";
		
		Map<String,String> params = new HashMap<String,String>();
		params.put("adb_no", adb_no+"");
		params.put("adb_title", adb_title);
		params.put("adb_content", adb_content);
		
		
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/common/adviceAF");
		if(!adb_file.isEmpty()){
			int adb_af_no = adviceService.getAdviceBoard(adb_no).getAdb_af_no();
			
			File file = new File(uploadPath,System.currentTimeMillis()+adb_file.getOriginalFilename());
			adb_file.transferTo(file);
			Map<String,String> paramsFile = new HashMap<String,String>();
			paramsFile.put("adb_realname", adb_file.getOriginalFilename());
			String adb_after_name = System.currentTimeMillis()+adb_file.getOriginalFilename();
			paramsFile.put("adb_aftername", adb_after_name);
			paramsFile.put("adb_path", uploadPath);
			paramsFile.put("adb_af_no", adb_af_no+"");
			adviceService.updateAdviceBoardFile(paramsFile);
		}
		

		adviceService.updateAdviceBoard(params);
				
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 답변 작성
	@RequestMapping(value = "/stu/adviceBoardDelete", method = RequestMethod.GET)
	public String adviceBoardDelete(int adb_no) {
		String url = "redirect:/stu/adviceBoard";
		
		adviceService.deleteAdviceBoard(adb_no);
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 답변 작성
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

	// //////////////////////////////화상상담추가//////////////////////////////

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
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
	
	// //////////////////////////////화상상담추가//////////////////////////////

		/**
		 * 교수가 받은 상담신청조회
		 * 
		 * @param
		 * @return
		 * @throws
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
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/stu/chatAdvice", method = RequestMethod.GET)
	public String chatAdvice() {
		String url = "/stu/chat_advice";
		
		return url;
	}
}
