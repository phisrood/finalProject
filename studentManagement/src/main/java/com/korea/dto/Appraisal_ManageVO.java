package com.korea.dto;
/**
 * 문항관리 VO
 * 
 * @param
 * am_no : 문항번호<br>
 * am_content : 문항내용<br>
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Appraisal_ManageVO {
	
	private int am_no;
	private String am_content;
	
	public int getAm_no() {
		return am_no;
	}
	public void setAm_no(int am_no) {
		this.am_no = am_no;
	}
	public String getAm_content() {
		return am_content;
	}
	public void setAm_content(String am_content) {
		this.am_content = am_content;
	}
	
	
}
