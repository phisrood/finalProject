package com.korea.dto;
/**
 * 강의실사용시간VO
 * 
 * @param
 * cu_ci_no : 강의실번호<br>
 * cu_tt_no : 시간표번호<br>
 * cu_lec_no : 강의번호
 * 
 * @version 김양문, 1.0, 2016.09.02, 초기 작성
 * @author 김양문
 *
 */
public class ClassRoom_UsetimeVO {

	private String cu_ci_no;
	private String cu_tt_no;
	private String cu_lec_no;
	
	public String getCu_ci_no() {
		return cu_ci_no;
	}
	public void setCu_ci_no(String cu_ci_no) {
		this.cu_ci_no = cu_ci_no;
	}
	public String getCu_tt_no() {
		return cu_tt_no;
	}
	public void setCu_tt_no(String cu_tt_no) {
		this.cu_tt_no = cu_tt_no;
	}
	public String getCu_lec_no() {
		return cu_lec_no;
	}
	public void setCu_lec_no(String cu_lec_no) {
		this.cu_lec_no = cu_lec_no;
	}
	
	
	
}
