package com.korea.message.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {

	//쪽지함 리스트 출력 최신 20~30개만 (안읽은쪽지만)
	@RequestMapping(value="/stu/messageNewList", method=RequestMethod.GET)
	public String messageNewList(){
		String url="";
		
		return url;
	}
	
	//쪽지함 리스트 더보기 출력 제이쿼리구현
	@RequestMapping(value={"/stu/messageAllList","/pro/messageAllList","/emp/messageAllList"}, method=RequestMethod.GET)
	public String messageAllList(){
		String url="/common/messageAllList";
		
		return url;
	}
	
	//쪽지조회
	@RequestMapping(value="/stu/messageInfo", method=RequestMethod.GET)
	public String messageInfo(){
		String url="";
		
		return url;
	}
	
	//수신사용자검색
	@RequestMapping(value="/common/messageUserSearch", method=RequestMethod.GET)
	public String messageUserSearch(){
		String url="";
		
		return url;
	}
	
	//쪽지발신
	@RequestMapping(value="/common/messageSend", method=RequestMethod.GET)
	public String messageSend(){
		String url="";
		
		return url;
	}
	
	//쪽지삭제
	@RequestMapping(value="/common/messageDelete", method=RequestMethod.GET)
	public String messageDelete(){
		String url="";
		
		return url;
	}
}
