package com.korea.dto;
/**
 * 부서코드VO
 * 
 * @param
 * div_no : 부서번호<br>
 * div_name : 부서명
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class DivisionVO {

	private int div_no;
	private String div_name;
	public int getDiv_no() {
		return div_no;
	}
	public void setDiv_no(int div_no) {
		this.div_no = div_no;
	}
	public String getDiv_name() {
		return div_name;
	}
	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	
	
}
