package com.korea.dto;

/**
 * 상담게시판 VO
 * 
 * @param adb_no
 *            : 글번호 <br>
 *            adb_pro_use_id : 교수 아이디<br>
 *            adb_stud_use_id : 학생아이디<br>
 *            adb_af_no : 파일번호<br>
 *            adb_title : 제목<br>
 *            adb_content : 내용<br>
 *            adb_date : 작성일<br>
 *            adb_commentcontent : 답변내용<br>
 *            adb_commentstat : 답변여부
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 * 
 * 
 */
public class Advice_BoardVO {
	
	private int adb_no;
	private String adb_pro_use_id;
	private String adb_stud_use_id;
	private int adb_af_no;
	private String adb_title;
	private String adb_content;
	private String adb_date;
	private String adb_commentcontent;
	private String adb_commentstat;
	private String use_name;
	
	public String getUse_name() {
		return use_name;
	}

	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}

	public int getAdb_no() {
		return adb_no;
	}

	public void setAdb_no(int adb_no) {
		this.adb_no = adb_no;
	}

	public String getAdb_pro_use_id() {
		return adb_pro_use_id;
	}

	public void setAdb_pro_use_id(String adb_pro_use_id) {
		this.adb_pro_use_id = adb_pro_use_id;
	}

	public String getAdb_stud_use_id() {
		return adb_stud_use_id;
	}

	public void setAdb_stud_use_id(String adb_stud_use_id) {
		this.adb_stud_use_id = adb_stud_use_id;
	}

	public int getAdb_af_no() {
		return adb_af_no;
	}

	public void setAdb_af_no(int adb_af_no) {
		this.adb_af_no = adb_af_no;
	}

	public String getAdb_title() {
		return adb_title;
	}

	public void setAdb_title(String adb_title) {
		this.adb_title = adb_title;
	}

	public String getAdb_content() {
		return adb_content;
	}

	public void setAdb_content(String adb_content) {
		this.adb_content = adb_content;
	}

	public String getAdb_date() {
		return adb_date;
	}

	public void setAdb_date(String adb_date) {
		this.adb_date = adb_date;
	}

	public String getAdb_commentcontent() {
		return adb_commentcontent;
	}

	public void setAdb_commentcontent(String adb_commentcontent) {
		this.adb_commentcontent = adb_commentcontent;
	}

	public String getAdb_commentstat() {
		return adb_commentstat;
	}

	public void setAdb_commentstat(String adb_commentstat) {
		this.adb_commentstat = adb_commentstat;
	}

}
