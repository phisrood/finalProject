package com.korea.dto;
/**
 * 공지사항VO
 * 
 * @param
 * cn_no : 글번호<br>
 * cn_af_no : 파일번호<br>
 * cn_sp_use_id : 작성자<br>
 * cn_title : 제목<br>
 * cn_content : 내용<br>
 * cn_date : 작성일
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Colleage_NoticeVO {

	private int cn_no;
	private int cn_af_no;
	private String cn_sp_use_id;
	private String cn_title;
	private String cn_content;
	private String cn_date;
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
	
	
}

