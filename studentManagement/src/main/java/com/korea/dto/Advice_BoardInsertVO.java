package com.korea.dto;

import org.springframework.web.multipart.MultipartFile;

/**
 * 상담게시판 VO
 * 
 * @param adb_stud_use_id
 *            : 학생아이디<br>
 *            adb_title : 제목<br>
 *            adb_content : 내용<br>
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 * 
 * 
 */
public class Advice_BoardInsertVO {
	private String adb_stud_use_id;
	private String adb_title;
	private String adb_content;
	private int adb_af_no;
	private MultipartFile adb_file;
	private String adb_realName;
	private String adb_afterName;
	private String adb_path;

	public int getAdb_af_no() {
		return adb_af_no;
	}

	public void setAdb_af_no(int adb_af_no) {
		this.adb_af_no = adb_af_no;
	}

	public MultipartFile getAdb_file() {
		return adb_file;
	}

	public void setAdb_file(MultipartFile adb_file) {
		this.adb_file = adb_file;
	}

	public String getAdb_realName() {
		return adb_realName;
	}

	public void setAdb_realName(String adb_realName) {
		this.adb_realName = adb_realName;
	}

	public String getAdb_afterName() {
		return adb_afterName;
	}

	public void setAdb_afterName(String adb_afterName) {
		this.adb_afterName = adb_afterName;
	}

	public String getAdb_path() {
		return adb_path;
	}

	public void setAdb_path(String adb_path) {
		this.adb_path = adb_path;
	}

	public String getAdb_stud_use_id() {
		return adb_stud_use_id;
	}

	public void setAdb_stud_use_id(String adb_stud_use_id) {
		this.adb_stud_use_id = adb_stud_use_id;
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

}
