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
public class Colleage_CalendarVO {

	private int cc_no;
	private String cc_title;
	private String cc_content;
	private String cc_start_date;
	private String cc_end_date;
	public int getCc_no() {
		return cc_no;
	}
	public void setCc_no(int cc_no) {
		this.cc_no = cc_no;
	}
	public String getCc_title() {
		return cc_title;
	}
	public void setCc_title(String cc_title) {
		this.cc_title = cc_title;
	}
	public String getCc_content() {
		return cc_content;
	}
	public void setCc_content(String cc_content) {
		this.cc_content = cc_content;
	}
	public String getCc_start_date() {
		return cc_start_date;
	}
	public void setCc_start_date(String cc_start_date) {
		this.cc_start_date = cc_start_date;
	}
	public String getCc_end_date() {
		return cc_end_date;
	}
	public void setCc_end_date(String cc_end_date) {
		this.cc_end_date = cc_end_date;
	}
	
	
}
