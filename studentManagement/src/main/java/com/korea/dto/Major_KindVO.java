package com.korea.dto;
/**
 * 전공구분VO
 * 
 * @param
 * mk_no : 전공구분코드<br>
 * mk_name : 전공구분명
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Major_KindVO {

	private int mk_no;
	private String mk_name;
	public int getMk_no() {
		return mk_no;
	}
	public void setMk_no(int mk_no) {
		this.mk_no = mk_no;
	}
	public String getMk_name() {
		return mk_name;
	}
	public void setMk_name(String mk_name) {
		this.mk_name = mk_name;
	}
	
	
}
