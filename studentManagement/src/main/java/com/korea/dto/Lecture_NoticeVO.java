package com.korea.dto;
/**
 * 강의공지사항VO
 * 
 * @param
 * ln_no : 공지사항번호<br>
 * ln_lec_no : 강의등록번호<br>
 * ln_pro_use_id : 작성자<br>
 * ln_af_no : 파일번호<br>
 * ln_title : 제목<br>
 * ln_content : 내용<br>
 * ln_date : 작성일
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Lecture_NoticeVO {

	private int ln_no;
	private int ln_lec_no;
	private String ln_pro_use_id;
	private int ln_af_no;
	private String ln_title;
	private String ln_content;
	private String ln_date;
	public int getLn_no() {
		return ln_no;
	}
	public void setLn_no(int ln_no) {
		this.ln_no = ln_no;
	}
	public int getLn_lec_no() {
		return ln_lec_no;
	}
	public void setLn_lec_no(int ln_lec_no) {
		this.ln_lec_no = ln_lec_no;
	}
	public String getLn_pro_use_id() {
		return ln_pro_use_id;
	}
	public void setLn_pro_use_id(String ln_pro_use_id) {
		this.ln_pro_use_id = ln_pro_use_id;
	}
	public int getLn_af_no() {
		return ln_af_no;
	}
	public void setLn_af_no(int ln_af_no) {
		this.ln_af_no = ln_af_no;
	}
	public String getLn_title() {
		return ln_title;
	}
	public void setLn_title(String ln_title) {
		this.ln_title = ln_title;
	}
	public String getLn_content() {
		return ln_content;
	}
	public void setLn_content(String ln_content) {
		this.ln_content = ln_content;
	}
	public String getLn_date() {
		return ln_date;
	}
	public void setLn_date(String ln_date) {
		this.ln_date = ln_date;
	}
	
	
}
