package com.korea.dto;
/**
 * 자유게시판VO
 * 
 * @param
 * fb_no : 글번호<br>
 * fb_use_id : 작성자<br>
 * fb_lec_no : 강의번호<br>
 * fb_af_no : 파일번호<br>
 * fb_title : 제목<br>
 * fb_content : 내용<br>
 * fb_date : 작성일
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Free_BoardVO {

	private int fb_no;
	private String fb_use_id;
	private int fb_lec_no;
	private int fb_af_no;
	private String fb_title;
	private String fb_content;
	private String fb_date;
	public int getFb_no() {
		return fb_no;
	}
	public void setFb_no(int fb_no) {
		this.fb_no = fb_no;
	}
	public String getFb_use_id() {
		return fb_use_id;
	}
	public void setFb_use_id(String fb_use_id) {
		this.fb_use_id = fb_use_id;
	}
	public int getFb_lec_no() {
		return fb_lec_no;
	}
	public void setFb_lec_no(int fb_lec_no) {
		this.fb_lec_no = fb_lec_no;
	}
	public int getFb_af_no() {
		return fb_af_no;
	}
	public void setFb_af_no(int fb_af_no) {
		this.fb_af_no = fb_af_no;
	}
	public String getFb_title() {
		return fb_title;
	}
	public void setFb_title(String fb_title) {
		this.fb_title = fb_title;
	}
	public String getFb_content() {
		return fb_content;
	}
	public void setFb_content(String fb_content) {
		this.fb_content = fb_content;
	}
	public String getFb_date() {
		return fb_date;
	}
	public void setFb_date(String fb_date) {
		this.fb_date = fb_date;
	}
	
}
