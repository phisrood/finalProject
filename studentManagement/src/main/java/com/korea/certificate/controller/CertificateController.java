package com.korea.certificate.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
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
import com.korea.certificate.service.CertificateService;
import com.korea.dto.Student_InfoViewVO;
import com.korea.dto.TimeTableViewVO;
import com.korea.dto.UsersVO;
/**
 * @Class Name : AdviceController.java
 * @Description : 학사일정관리 서비스 클래스
 * @Modification Information
 * @author 이영만
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Controller
public class CertificateController {
	@Autowired
	private CertificateService certificateService;
	
	
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//세션으로 학생정보 가져오기
	@RequestMapping(value="/stu/stuInfo", method=RequestMethod.GET)
	public String stuInfo(){
		String url = "";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//재학증명서 조회
	@RequestMapping(value="/stu/attendCertificateInfo", method=RequestMethod.GET)
	public String attendCertificateInfo(HttpSession session, Model model){
		String url="/stu/attendCertificate";
		
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String use_id = user.getUse_id();
		Student_InfoViewVO student_InfoViewVO =  certificateService.getStuAttendInfo(use_id);
		String birth = student_InfoViewVO.getStud_birth();
		birth = birth.substring(0, 2)+"년 "+birth.substring(2, 4)+"월 "+birth.substring(4, 6)+"일";
		student_InfoViewVO.setStud_birth(birth);
		Calendar c = Calendar.getInstance(); //객체 생성 및 현재 일시분초...셋팅
		String date = new String();
		date = String.valueOf(c.get(Calendar.YEAR)) + "년 ";
		date += String.valueOf(c.get(Calendar.MONTH)+1) + "월 ";
		date += String.valueOf(c.get(Calendar.DATE)) + "일";
		model.addAttribute("Student_InfoViewVO", student_InfoViewVO);
		model.addAttribute("Current_date", date);
		return url;
	}
	//졸업증명서 조회
	@RequestMapping(value="/stu/graduteCertificateInfo", method=RequestMethod.GET)
	public String graduteCertificateInfo(HttpSession session, Model model){
		String url="/stu/graduteCertificate";
		
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String use_id = user.getUse_id();
		Student_InfoViewVO student_InfoViewVO =  certificateService.getStuAttendInfo(use_id);
		String birth = student_InfoViewVO.getStud_birth();
		birth = birth.substring(0, 2)+"년 "+birth.substring(2, 4)+"월 "+birth.substring(4, 6)+"일";
		student_InfoViewVO.setStud_birth(birth);
		Calendar c = Calendar.getInstance(); //객체 생성 및 현재 일시분초...셋팅
		String date = new String();
		date = String.valueOf(c.get(Calendar.YEAR)) + "년 ";
		date += String.valueOf(c.get(Calendar.MONTH)+1) + "월 ";
		date += String.valueOf(c.get(Calendar.DATE)) + "일";
		model.addAttribute("Student_InfoViewVO", student_InfoViewVO);
		model.addAttribute("Current_date", date);
		return url;
	}
	/**
	 * 증명서 PDF출력
	 * @param
	 * @return 
	 * @throws 
	 */
	//성적증명서 PDF출력
	@RequestMapping(value="/stu/gradeCertificatePDF", method=RequestMethod.POST)
	public void gradeCertificateInfoPDF(String htmlTag,HttpServletResponse response,HttpServletRequest request) throws IOException, DocumentException {
		// Document 생성
		Document document = new Document(PageSize.A4.rotate(), 30, 30, 30, 30); // 용지 및 여백 설정
		
		System.out.println(htmlTag + "*********************!!!!@*@*@*@*@*");
		
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

		//img
		Image ingam =Image.getInstance(request.getServletContext().getRealPath("/resources/common/images/ingam3.jpg"));
		ingam.setAbsolutePosition(5f, 10f);
		ingam.scaleAbsolute(160, 20);
		document.add(ingam);
		
		// CSS
		CSSResolver cssResolver = new StyleAttrCSSResolver();
		String cssPath = request.getServletContext().getRealPath("/resources/common/css/default.css");
		CssFile cssFile = XMLWorkerHelper.getCSS(new FileInputStream(cssPath));
		cssResolver.addCss(cssFile);
		     
		// HTML, 폰트 설정
		XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
		String fontPath = request.getServletContext().getRealPath("/resources/fonts");
		fontProvider.register(fontPath+"/MALGUN.TTF", "MalgunGothic"); // MalgunGothic은 alias,
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
	//재학, 졸업증명서 PDF출력
	@RequestMapping(value="/stu/attendCertificatePDF", method=RequestMethod.POST)
	public void attendCertificateInfoPDF(String htmlTag,HttpServletResponse response,HttpServletRequest request) throws IOException, DocumentException {
		// Document 생성
		Document document = new Document(PageSize.A4, 50, 50, 50, 50); // 용지 및 여백 설정
		
		System.out.println(htmlTag + "*********************!!!!@*@*@*@*@*");
		
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
		
		//img
		Image ingam =Image.getInstance(request.getServletContext().getRealPath("/resources/common/images/ingam3.jpg"));
		ingam.setAbsolutePosition(50f, 100f);
		ingam.scaleAbsolute(500, 50);
		document.add(ingam);
		
		// CSS
		CSSResolver cssResolver = new StyleAttrCSSResolver();
		String cssPath = request.getServletContext().getRealPath("/resources/common/css/default.css");
		CssFile cssFile = XMLWorkerHelper.getCSS(new FileInputStream(cssPath));
		cssResolver.addCss(cssFile);
		
		// HTML, 폰트 설정
		XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
		String fontPath = request.getServletContext().getRealPath("/resources/fonts");
		fontProvider.register(fontPath+"/MALGUN.TTF", "MalgunGothic"); // MalgunGothic은 alias,
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
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//성적증명서 조회
	@RequestMapping(value="/stu/gradeCertificateInfo", method=RequestMethod.GET)
	public String gradeCertificateInfo(){
		String url="/stu/gradeCertificate";
		
		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//졸업증명서 출력
	@RequestMapping(value="/stu/graduteCertificateInfoPDF", method=RequestMethod.GET)
	public String graduteCertificateInfoPDF(){
		String url="";
		
		return url;
	}
}
