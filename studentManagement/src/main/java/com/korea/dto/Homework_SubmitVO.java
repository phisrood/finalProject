package com.korea.dto;
/**
 * 과제제출VO
 * 
 * @param
 * hs_no : 과제번호<br>
 * hs_hw_no : 글번호<br>
 * hs_stud_use_id : 아이디<br>
 * hs_af_no : 파일번호
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Homework_SubmitVO {

	private int hs_no;
	private int hs_hw_no;
	private String hs_stud_use_id;
	private int hs_af_no;
	
	public int getHs_no() {
		return hs_no;
	}
	public void setHs_no(int hs_no) {
		this.hs_no = hs_no;
	}
	public int getHs_hw_no() {
		return hs_hw_no;
	}
	public void setHs_hw_no(int hs_hw_no) {
		this.hs_hw_no = hs_hw_no;
	}
	public String getHs_stud_use_id() {
		return hs_stud_use_id;
	}
	public void setHs_stud_use_id(String hs_stud_use_id) {
		this.hs_stud_use_id = hs_stud_use_id;
	}
	public int getHs_af_no() {
		return hs_af_no;
	}
	public void setHs_af_no(int hs_af_no) {
		this.hs_af_no = hs_af_no;
	}
	
}
