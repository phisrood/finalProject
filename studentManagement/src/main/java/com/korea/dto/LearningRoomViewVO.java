package com.korea.dto;
/**
 * 학습자료실VO
 * 
 * @param
 * lr_no : 글번호<br>
 * lr_lec_no : 강의등록번호<br> 
 * lr_pro_use_id : 작성자<br>
 * lr_af_no : 파일번호<br>
 * lr_title : 제목<br>
 * lr_content : 내용<br>
 * lr_date : 작성일
 * 
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class LearningRoomViewVO {
	private int lr_no;
	private int lr_lec_no;
	private String lr_pro_use_id;
	private int lr_af_no;
	private String lr_title;
	private String lr_content;
	private String lr_date;
	private int af_no;
	private String af_realname;
	private String af_aftername;
	private String af_path;
	
	
	public int getLr_no() {
		return lr_no;
	}
	public void setLr_no(int lr_no) {
		this.lr_no = lr_no;
	}
	public int getLr_lec_no() {
		return lr_lec_no;
	}
	public void setLr_lec_no(int lr_lec_no) {
		this.lr_lec_no = lr_lec_no;
	}
	public String getLr_pro_use_id() {
		return lr_pro_use_id;
	}
	public void setLr_pro_use_id(String lr_pro_use_id) {
		this.lr_pro_use_id = lr_pro_use_id;
	}
	public int getLr_af_no() {
		return lr_af_no;
	}
	public void setLr_af_no(int lr_af_no) {
		this.lr_af_no = lr_af_no;
	}
	public String getLr_title() {
		return lr_title;
	}
	public void setLr_title(String lr_title) {
		this.lr_title = lr_title;
	}
	public String getLr_content() {
		return lr_content;
	}
	public void setLr_content(String lr_content) {
		this.lr_content = lr_content;
	}
	public String getLr_date() {
		return lr_date;
	}
	public void setLr_date(String lr_date) {
		this.lr_date = lr_date;
	}
	public int getAf_no() {
		return af_no;
	}
	public void setAf_no(int af_no) {
		this.af_no = af_no;
	}
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
	
	
	
	
	
}
