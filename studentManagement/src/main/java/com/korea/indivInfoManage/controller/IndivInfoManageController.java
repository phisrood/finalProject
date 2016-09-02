package com.korea.indivInfoManage.controller;
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
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.korea.dto.Colleage_Register_ChangeVO;
import com.korea.dto.StudentVO;
import com.korea.dto.Student_InfoViewVO;
import com.korea.dto.UsersVO;
import com.korea.indivInfoManage.service.IndivInfoManageService;

@Controller
public class IndivInfoManageController {

	@Autowired
	IndivInfoManageService indivInfoManageService;
	
	
	private String uploadPath = null;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/indivInfo", method=RequestMethod.GET)
	public String indivInfo(HttpSession session, Model model, HttpServletRequest request){
		String url = "/stu/colleage/indivInfo";
	
	
	
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/stu/images");
		
		//세션 아이디 받아오기
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		
		
		//받아온 아이디로 검색결과 출력
		Student_InfoViewVO studentVO =  indivInfoManageService.getIndivInfo(stud_use_id);
		model.addAttribute("studentVO",studentVO);
	
		return url;
	}
	/**
	 * 개인 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/indivUpdate", method=RequestMethod.POST)
	public String indivUpdate(HttpSession session, Model model, StudentVO studentVO, 
							@RequestParam(value="after_use_pwd1", defaultValue="")String password){
		String url = "/stu/colleage/indivInfo";
		
		
		
		
		//세션 아이디 받아오기
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		
		HashMap<String , String> params = new HashMap<String , String>();
		params.put("stud_use_id",stud_use_id);
		params.put("password",password);
		
		//받아온 아이디로 개인정보수정
		indivInfoManageService.updateIndiv(studentVO);
		
		
		//받아온 아이디로 비밀번호수정
		indivInfoManageService.updateIndiv(params);

		//받아온 아이디로 검색결과 출력
		Student_InfoViewVO studentViewVO =  indivInfoManageService.getIndivInfo(stud_use_id);
		model.addAttribute("studentVO",studentViewVO);
		

		
		
		return url;
	}
	
	/**
	 * 학생사진파일 변경하기위한 새로우창 URL 연결 ( 학생 )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/colleage/indivInfoImage", method=RequestMethod.GET)
	public String ImageUpdate(){
		String url = "/stu/colleage/indivInfoImage";
		return url;
	}
	
	
	@RequestMapping(value="/colleage/indivInfoImageInsert", method=RequestMethod.GET)
	public String ImageInsert(){
		String url = "/stu/colleage/indivInfoImageInsert";
		return url;
	}


	//사진파일 등록(insert)
	@RequestMapping(value="/stu/indivInfoImageUpdateInsert", method=RequestMethod.POST)
	public String ImageUpdateInsert(
			   @RequestParam("f") MultipartFile multipartFile,
			   @RequestParam("title") String title, 
			   Model model,
			   HttpServletRequest request,
			   HttpServletResponse response,
			   HttpSession session,
			   StudentVO studentVO) throws IOException{
	
		
		String url = "/stu/colleage/indivInfoImageInsert";
		
		
		uploadPath="C:\\Users\\pc20\\git\\finalProject\\studentManagement\\src\\main\\webapp\\resources\\stu\\images";
		
		if (!multipartFile.isEmpty()) {
		
		
		// 실제 저장
		    System.out.println(("-------------파일 업로드 시작 -------------"));
		    System.out.println(("ContentType : "+multipartFile.getContentType()));
            System.out.println(("name : "+multipartFile.getName()));
            System.out.println(("filename : "+multipartFile.getOriginalFilename()));
            System.out.println(("size : "+multipartFile.getSize()));
            System.out.println(("filerute : "+uploadPath));
            System.out.println(("-------------파일 업로드 종료 --------------\n"));
            
            File file = new File(uploadPath, multipartFile.getOriginalFilename());
            multipartFile.transferTo(file); // 실제저장.
            model.addAttribute("title", title);
            model.addAttribute("fileName", multipartFile.getOriginalFilename());
            model.addAttribute("uploadPath", file.getAbsolutePath());
		
		
            String realName = multipartFile.getOriginalFilename();
            String afPath = uploadPath+"\\"+multipartFile.getOriginalFilename();
            
            
        
            HashMap<String, String> insertMap = new HashMap<String , String>();
            insertMap.put("realName",realName);
            insertMap.put("afPath", afPath);
            
            
            //최초 학생 사진등록
            indivInfoManageService.insertImage(insertMap);
            
            //등록한 af_no을 가져온 뒤 학생 stu_af_no 업데이트 해준다.
            
            
            int afNo = indivInfoManageService.selectafno();
            
            
          //세션 아이디 받아오기
    		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
    		String stud_use_id = loginUser.getUse_id();
    		
    		HashMap<String , String> para = new HashMap<String , String>();
    		para.put("stud_use_id",stud_use_id);
    		para.put("afNo",afNo+"");
    		
            indivInfoManageService.updateafno(para);
           
            
            
            
            
            
            
            
            
            
            
            return url;
            
		
		}
		return url;
		
		
	}
	/**
	 * 학생사진파일 변경 ( 학생 )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/indivInfoImageUpdate", method=RequestMethod.POST)
	public String ImageUpdateAfter(@RequestParam("f") MultipartFile multipartFile,
								   @RequestParam("title") String title, 
								   Model model,
								   HttpServletRequest request,
								   HttpServletResponse response,
								   HttpSession session,
								   StudentVO studentVO) throws IOException{
		String url = "/stu/colleage/indivInfoImage";
		response.setCharacterEncoding("EUC-KR");
		PrintWriter writer = response.getWriter();
	
		uploadPath="C:\\Users\\pc20\\git\\finalProject\\studentManagement\\src\\main\\webapp\\resources\\stu\\images";
		
			if (!multipartFile.isEmpty()) {
			
			
			// 실제 저장
			    System.out.println(("-------------파일 업로드 시작 -------------"));
			    System.out.println(("ContentType : "+multipartFile.getContentType()));
	            System.out.println(("name : "+multipartFile.getName()));
	            System.out.println(("filename : "+multipartFile.getOriginalFilename()));
	            System.out.println(("size : "+multipartFile.getSize()));
	            System.out.println(("filerute : "+uploadPath));
	            System.out.println(("-------------파일 업로드 종료 --------------\n"));
	            
	            File file = new File(uploadPath, multipartFile.getOriginalFilename());
	            multipartFile.transferTo(file); // 실제저장.
	            model.addAttribute("title", title);
	            model.addAttribute("fileName", multipartFile.getOriginalFilename());
	            model.addAttribute("uploadPath", file.getAbsolutePath());
	        
	            
	            
	            
	            
	            UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
	    		String stud_use_id = loginUser.getUse_id();
	    
	    		Student_InfoViewVO studentViewVO =  indivInfoManageService.getIndivInfo(stud_use_id);
	           
	            //DB 찾기
	            
	            
	             String stuAfNo = studentViewVO.getStud_af_no()+"";
	            //String stuid = studentVO.getStud_use_id();
	             String realName = multipartFile.getOriginalFilename();
	             String afPath = uploadPath+"\\"+multipartFile.getOriginalFilename();
	            
	            
	             System.out.println(afPath);
	            
	             // DB에 파일정보 저장
	            HashMap<String, String> map = new HashMap<String , String>();
	            map.put("realName",realName);
	            map.put("stuAfNo",stuAfNo);
	            map.put("afPath", afPath);
	            indivInfoManageService.updateImage(map);
	            
	            
	    		
	            
	            
	      
	            writer.println("<script type='text/javascript'>");
	            writer.println("alert('정상적으로 등록되었습니다.');");
	            writer.println("history.back();");
	            writer.println("</script>");
	            writer.flush();   
	            
	            return url;
		}
		
		   //실패시
		   writer.println("<script type='text/javascript'>");
           writer.println("alert('등록의 실패하였습니다. 다시 시도해 주세요.');");
           writer.println("history.go(0);");
           writer.println("</script>");
           writer.flush();  
           
           return url;
          
	}
	
	
	
	
	
	/**
	 * 학적 변동 현황 ( 학생 )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeList(HttpSession session, Model model ){
		String url = "/stu/colleage/colleageChangeList";
		
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		
		
		List<Colleage_Register_ChangeVO> Colleage_Register_ChangeVO = indivInfoManageService.getColleageChangeList(stud_use_id);
		
		System.out.println(Colleage_Register_ChangeVO);
		model.addAttribute("Colleage_Register_ChangeVO",Colleage_Register_ChangeVO);
		
		
		
		
		
		return url;
	}
	/**
	 * 학적 변동 현황 ( 학과 )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/pro/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeListByPro(){
		String url = "/pro/colleageChangeList";
		
		return url;
	}
	/**
	 * 학적 변동 현황 ( 행정 )
	 * @param
	 * @return 
	 * @throws 
	 */
	
	
	@RequestMapping(value="/emp/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeListByEmp(){
		String url = "/emp/colleageChangeList";
		
		return url;
	}
	
	

}
