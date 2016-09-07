package com.korea.classSYL.controller;
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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.html.CssAppliers;
import com.itextpdf.tool.xml.html.CssAppliersImpl;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import com.korea.classSYL.service.ClassSYLService;
import com.korea.dto.Class_SYLLBUSVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.UsersVO;

@Controller
public class ClassSYLController {
	@Autowired
	private ClassSYLService classSYLService;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//강의계획서 등록
	@RequestMapping(value="/pro/classSYLInsert", method=RequestMethod.GET)
	public String classSYLInsert(){
		String url="";
		
		return url;
	}
	/**
	 * 강의계획서 수정
	 * @param String
	 * @param Model
	 * @return String
	 * @throws 
	 */
	//강의계획서 수정
	@RequestMapping(value="/pro/updateSyl", method=RequestMethod.GET)
	public String classSYLUpdate(String lec_no,Model model){
		String url="/pro/classSYLUpdate";
		LectureViewVO lecture = classSYLService.getLectureInfo(lec_no);
		Class_SYLLBUSVO classSYL = classSYLService.getClassSYLInfo(lec_no);
		model.addAttribute("lecture", lecture);
		model.addAttribute("classSYL", classSYL);
		return url;
	}
	/**
	 * 강의계획서 저장
	 * @param String
	 * @param Model
	 * @return String
	 * @throws 
	 */
	//강의계획서 수정
	@RequestMapping(value="/pro/updateSylConfirm", method=RequestMethod.GET)
	public String classSYLUpdateConfirm(Class_SYLLBUSVO classSyl,Model model,HttpSession session){
		String url="redirect:/pro/classSYL?lec_no="+classSyl.getCs_lec_no();
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		classSyl.setCs_pro_use_id(user.getUse_id());
		Class_SYLLBUSVO classSYL2 = classSYLService.getClassSYLInfo(String.valueOf(classSyl.getCs_lec_no()));
		if(classSYL2==null){
			classSYLService.insertClassSYL(classSyl);
		}else{
			classSYLService.updateClassSYL(classSyl);
		}
		
		return url;
	}
	

	/**
	 * @throws DocumentException 
	 * @throws IOException 
	 * 강의계획서
	 * 
	 * @param String
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = {"/pro/classSYL","/stu/classSYL"}, method = RequestMethod.GET)
	public String getLecturePlan(String lec_no, Model model, HttpSession session) throws IOException, DocumentException {
		String url = "/common/classSYL";
		LectureViewVO lecture = classSYLService.getLectureInfo(lec_no);
		Class_SYLLBUSVO classSYL = classSYLService.getClassSYLInfo(lec_no);
		model.addAttribute("lecture", lecture);
		model.addAttribute("classSYL", classSYL);
		return url;
	}
	/**
	 * @throws DocumentException 
	 * @throws IOException 
	 * 강의계획서
	 * 
	 * @param String
	 * @return
	 * @throws
	 */
	@RequestMapping(value = {"/pro/classSYLtoPdf","/stu/classSYLtoPdf"}, method = RequestMethod.POST)
	public void getLecturePlantoPdf(String htmlTag,HttpServletResponse response) throws IOException, DocumentException {
		// Document 생성
		Document document = new Document(PageSize.A4, 50, 50, 50, 50); // 용지 및 여백 설정
		     
		// PdfWriter 생성
		//PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("d:/test.pdf")); // 바로 다운로드.
		PdfWriter writer = PdfWriter.getInstance(document, response.getOutputStream());
		writer.setInitialLeading(12.5f);
		 
		// 파일 다운로드 설정
		response.setContentType("application/pdf");
		String fileName = URLEncoder.encode("/common/pdf/lecturePlan.jsp", "UTF-8"); // 파일명이 한글일 땐 인코딩 필요
		response.setHeader("Content-Transper-Encoding", "binary");
		response.setHeader("Content-Disposition", "inline; filename=" + fileName + ".pdf");
		 
		// Document 오픈
		document.open();
		XMLWorkerHelper helper = XMLWorkerHelper.getInstance();
		     
		// CSS
		CSSResolver cssResolver = new StyleAttrCSSResolver();
		CssFile cssFile = helper.getCSS(new FileInputStream("C:/Users/pc05/git/finalProject/studentManagement/src/main/webapp/resources/common/css/default.css"));
		cssResolver.addCss(cssFile);
		     
		// HTML, 폰트 설정
		XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
		fontProvider.register("C:/Users/pc05/git/finalProject/studentManagement/src/main/webapp/resources/fonts/MALGUN.TTF", "MalgunGothic"); // MalgunGothic은 alias,
		CssAppliers cssAppliers = new CssAppliersImpl(fontProvider);
		 
		HtmlPipelineContext htmlContext = new HtmlPipelineContext(cssAppliers);
		htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
		 
		// Pipelines
		PdfWriterPipeline pdf = new PdfWriterPipeline(document, writer);
		HtmlPipeline html = new HtmlPipeline(htmlContext, pdf);
		CssResolverPipeline css = new CssResolverPipeline(cssResolver, html);
		 
		XMLWorker worker = new XMLWorker(css, true);
		
		XMLParser xmlParser = new XMLParser(worker, Charset.forName("UTF-8"));
		 
		// 폰트 설정에서 별칭으로 줬던 "MalgunGothic"을 html 안에 폰트로 지정한다.
		String htmlStr = htmlTag;
		StringReader strReader = new StringReader(htmlStr);
		xmlParser.parse(strReader);
		
		 
		document.close();
		writer.close();

	}
}
