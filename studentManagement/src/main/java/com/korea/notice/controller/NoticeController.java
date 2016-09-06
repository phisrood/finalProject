package com.korea.notice.controller;
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
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Colleage_NoticeVO;
import com.korea.dto.NoticeViewVO;
import com.korea.dto.UsersVO;
import com.korea.notice.service.NoticeService;

@Controller
public class NoticeController implements ApplicationContextAware {
	
	@Autowired
	private NoticeService noticeManagerService;
	
	//파일다운로드
	private WebApplicationContext context= null;

	/**
	 * 공지사항 전체리스트
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value={"/stu/noticeAllList","/pro/noticeAllList","/emp/noticeAllList"}, method=RequestMethod.GET)
	public String noticeAllList(Model model){
		String url="/common/noticeAllList";
		
		List<NoticeViewVO> noticeAllList = noticeManagerService.getNoticeAllList();
		
		model.addAttribute("noticeAllList", noticeAllList);
		
		return url;
	}
	/**
	 * 공지사항 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 상세보기
	@RequestMapping(value={"/stu/noticeDetail","/pro/noticeDetail","/emp/noticeDetail"}, method=RequestMethod.GET)
	public String noticeDetail(int cn_no,Model model){
		
		String url="/common/noticeDetail";
	
		NoticeViewVO noticeDetailViewVO = noticeManagerService.getNoticeDetailInfo(cn_no);
		
		model.addAttribute("noticeDetailViewVO", noticeDetailViewVO);
		return url;
	}
	/**
	 * 공지사항 등록Form이동
	 * @param
	 * @return String
	 * @throws 
	 */
	@RequestMapping(value="/emp/noticeInsertForm")
	public String noticeInsertForm(){
		String url="/emp/noticeInsert";
		
		return url;
	}
	/**
	 * 공지사항 등록
	 * @param
	 * @return String
	 * @throws 
	 */
	@RequestMapping(value="/emp/noticeInsert",  method=RequestMethod.POST )
	public String noticeInsert(Colleage_NoticeVO colleage_NoticeVO, 
			Model model, HttpServletRequest request, HttpSession session,
			@RequestParam(value="file", defaultValue = "")MultipartFile multipartFile)
										throws IOException{
		String url="redirect:/emp/noticeAllList";
		
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/emp/noticeAF");
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		String id=usersVO.getUse_id();
		colleage_NoticeVO.setCn_sp_use_id(id);
		
		Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
		if(!multipartFile.isEmpty()){
			File noticeFile= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(noticeFile);	
			attachment_FileVO.setAf_aftername(noticeFile.getName());
			attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachment_FileVO.setAf_path(uploadPath);
		}
		
		noticeManagerService.insertNotice(colleage_NoticeVO,attachment_FileVO);
		
		return url;
	}
	
	/**
	 * 공지사항 첨부파일다운로드
	 * @param
	 * @return String
	 * @throws 
	 */
	@RequestMapping(value="/common/noticeFileDown")
	public ModelAndView download(@RequestParam(value="af_aftername") String af_aftername, HttpServletResponse response) throws IOException {
		File downloadFile = getFile(af_aftername);
		if(downloadFile == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
		return new ModelAndView("download","downloadFile", downloadFile);
	}
	
	private File getFile(String fileId) {
		String baseDir = context.getServletContext().getRealPath("resources/emp/noticeAF");
		//if(fileId.equals("1"))
			return new File(baseDir,fileId);
		//return null;
	}
	
	
	//공지사항 수정 폼이동
	@RequestMapping(value="/emp/noticeUpdateForm", method=RequestMethod.GET)
	public String updateNoticeForm(@RequestParam(value="notice_no")String notice_no, Model model){
		String url="emp/noticeUpdate";
		NoticeViewVO noticeVO= noticeManagerService.getNoticeDetailInfo(Integer.parseInt(notice_no));
		
		model.addAttribute("noticeDetailViewVO", noticeVO);
		
		return url;
	}
	
	
	
	/**
	 * 공지사항 수정
	 * @param
	 * @return  String
	 * @throws 
	 */
	//공지사항 수정
	@RequestMapping(value="/emp/noticeUpdate", method=RequestMethod.POST)
	public String updateNotice(Colleage_NoticeVO colleage_NoticeVO, Attachment_FileVO attachment_FileVO, HttpServletRequest request, HttpSession session,
			@RequestParam(value="file", defaultValue = "")MultipartFile multipartFile) throws IOException{
		String url="redirect:/emp/noticeAllList";
		
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/emp/noticeAF");
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		String id=usersVO.getUse_id();
		colleage_NoticeVO.setCn_sp_use_id(id);
		
		if(!multipartFile.isEmpty()){
			File noticeFile= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(noticeFile);	
			attachment_FileVO.setAf_aftername(noticeFile.getName());
			attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachment_FileVO.setAf_path(uploadPath);
		}
		
		
		noticeManagerService.updateNotice(colleage_NoticeVO,attachment_FileVO);
		
		return url;
	}
	
	/**
	 * 공지사항 삭제
	 * @param
	 * @return String
	 * @throws 
	 */
	//공지사항 삭제
	@RequestMapping(value="/emp/noticeDelete", method=RequestMethod.GET)
	public String noticeDelete(Colleage_NoticeVO colleage_NoticeVO){
		String url="redirect:/emp/noticeAllList";
		
		noticeManagerService.deleteNotice(colleage_NoticeVO);
	
		
		
		return url;
	}
	

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context=(WebApplicationContext)applicationContext;
	}
	
	
}
