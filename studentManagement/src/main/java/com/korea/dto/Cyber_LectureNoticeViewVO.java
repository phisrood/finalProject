package com.korea.dto;

public class Cyber_LectureNoticeViewVO {

	
	
	
	private String use_name;  //유저이름
	private String ln_no; //글번호
	private String ln_pro_use_id; //교수아이디
	private String af_no; //첨부파일번호
	private String ln_lec_no; //강의번호
	private String ln_title;  //제목
	private String ln_content; //내용
	private String ln_date; //작성일
	private String af_aftername; //파일이름
	private String af_path; //파일경로
	private String af_realname;
	
	
	public String getAf_realname() {
		return af_realname;
	}
	public void setAf_realname(String af_realname) {
		this.af_realname = af_realname;
	}
	public String getAf_aftername() {
		return af_aftername;
	}
	public void setAf_aftername(String af_aftername) {
		this.af_aftername = af_aftername;
	}
	public String getAf_path() {
		return af_path;
	}
	public void setAf_path(String af_path) {
		this.af_path = af_path;
	}

	
	
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public String getLn_no() {
		return ln_no;
	}
	public void setLn_no(String ln_no) {
		this.ln_no = ln_no;
	}
	public String getLn_pro_use_id() {
		return ln_pro_use_id;
	}
	public void setLn_pro_use_id(String ln_pro_use_id) {
		this.ln_pro_use_id = ln_pro_use_id;
	}
	public String getAf_no() {
		return af_no;
	}
	public void setAf_no(String af_no) {
		this.af_no = af_no;
	}
	public String getLn_lec_no() {
		return ln_lec_no;
	}
	public void setLn_lec_no(String ln_lec_no) {
		this.ln_lec_no = ln_lec_no;
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
