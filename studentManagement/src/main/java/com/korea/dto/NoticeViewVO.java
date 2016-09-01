package com.korea.dto;
/**
 * 강의VO
 * 
 * @param
 * cn_no : 공지사항시퀀스번호<br>
 * cn_af_no : 업로드파일시퀀스번호<br>
 * cn_sp_use_id : 작성자<br>
 * cn_title : 공지사항제목<br>
 * cn_content : 공지사항내용<br>
 * cn_date : 작성일<br>
 * af_realname : 원본파일이름<br>
 * af_aftername : 저장할이름<br>
 * af_path : 파일경로<br>
 * 
 * 
 * @version 이수정, 1.0, 2016.09.01, 초기 작성
 * @author 이수정
 *
 */
public class NoticeViewVO {
	
	private int cn_no;
	private int cn_af_no;
	private String cn_sp_use_id;
	private String cn_title;
	private String cn_content;
	private String cn_date;
	private String af_realname;
	private String af_aftername;
	private String af_path;
	
	
	public int getCn_no() {
		return cn_no;
	}
	public void setCn_no(int cn_no) {
		this.cn_no = cn_no;
	}
	public int getCn_af_no() {
		return cn_af_no;
	}
	public void setCn_af_no(int cn_af_no) {
		this.cn_af_no = cn_af_no;
	}
	public String getCn_sp_use_id() {
		return cn_sp_use_id;
	}
	public void setCn_sp_use_id(String cn_sp_use_id) {
		this.cn_sp_use_id = cn_sp_use_id;
	}
	public String getCn_title() {
		return cn_title;
	}
	public void setCn_title(String cn_title) {
		this.cn_title = cn_title;
	}
	public String getCn_content() {
		return cn_content;
	}
	public void setCn_content(String cn_content) {
		this.cn_content = cn_content;
	}
	public String getCn_date() {
		return cn_date;
	}
	public void setCn_date(String cn_date) {
		this.cn_date = cn_date;
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
