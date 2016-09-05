package com.korea.dto;
/**
 * 학사일정VO
 * 
 * @param
 * cc_no : 일정번호<br>
 * cc_title : 제목<br>
 * cc_content : 내용<br>
 * cc_start_date : 시작일<br>
 * cc_end_date : 종료일
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class CalendarVO {

	private int id;
	private String title;
	private String content;
	private String start;
	private String end;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	
	
	
	
	
}
