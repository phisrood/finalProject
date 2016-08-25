package com.korea.dto;
/**
 * 첨부파일VO
 * 
 * @param
 * af_no : 파일번호<br>
 * af_realname : 원본이름<br>
 * af_aftername : 변경이름<br>
 * af_path : 경로
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Attachment_FileVO {
	private int af_no;
	private String af_realname;
	private String af_aftername;
	private String af_path;
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
