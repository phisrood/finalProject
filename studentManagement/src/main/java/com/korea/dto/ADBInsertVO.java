package com.korea.dto;

import org.springframework.web.multipart.MultipartFile;

public class ADBInsertVO {
	private String adb_title;
	private String adb_stud_use_id;
	private String adb_content;
	private MultipartFile adb_file;
	private int adb_af_no;
	private String adb_af_realname;
	private String adb_af_aftername;
	private String adb_af_path;

	public String getAdb_title() {
		return adb_title;
	}

	public void setAdb_title(String adb_title) {
		this.adb_title = adb_title;
	}

	public String getAdb_stud_use_id() {
		return adb_stud_use_id;
	}

	public void setAdb_stud_use_id(String adb_stud_use_id) {
		this.adb_stud_use_id = adb_stud_use_id;
	}

	public String getAdb_content() {
		return adb_content;
	}

	public void setAdb_content(String adb_content) {
		this.adb_content = adb_content;
	}

	public MultipartFile getAdb_file() {
		return adb_file;
	}

	public void setAdb_file(MultipartFile adb_file) {
		this.adb_file = adb_file;
	}

	public int getAdb_af_no() {
		return adb_af_no;
	}

	public void setAdb_af_no(int adb_af_no) {
		this.adb_af_no = adb_af_no;
	}

	public String getAdb_af_realname() {
		return adb_af_realname;
	}

	public void setAdb_af_realname(String adb_af_realname) {
		this.adb_af_realname = adb_af_realname;
	}

	public String getAdb_af_aftername() {
		return adb_af_aftername;
	}

	public void setAdb_af_aftername(String adb_af_aftername) {
		this.adb_af_aftername = adb_af_aftername;
	}

	public String getAdb_af_path() {
		return adb_af_path;
	}

	public void setAdb_af_path(String adb_af_path) {
		this.adb_af_path = adb_af_path;
	}
}
