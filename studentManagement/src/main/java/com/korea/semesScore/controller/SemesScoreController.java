package com.korea.semesScore.controller;
/**
 * @Class Name : SemesScoreController.java
 * @Description : 학기 성적 반영 / 입력
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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SemesScoreController {
	/**
	 * 학기 성적 반영 ( 학기 끝나면 현재 학기 성적 -> 전체 성적 서비스 구현 )
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/semesScore", method=RequestMethod.GET)
	public String semesScore(){
		String url="";
		
		return url;
	}
	/**
	 * 성적 입력
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/pro/scoreInput", method=RequestMethod.GET)
	public String scoreInput(){
		String url="/pro/scoreInput";
		
		return url;
	}
	
}
