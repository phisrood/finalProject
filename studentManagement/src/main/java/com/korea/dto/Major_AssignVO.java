package com.korea.dto;
/**
 * 전공배정VO
 * 
 * @param
 * ma_stud_use_id : 아이디<br>
 * ma_dep_no : 학과번호<br>
 * ma_mk_no : 전공구분코드<br>
 * ma_credit : 이수학점
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Major_AssignVO {

	private String ma_stud_use_id;
	private int ma_dep_no;
	private int ma_mk_no;
	private int ma_credit;
	public String getMa_stud_use_id() {
		return ma_stud_use_id;
	}
	public void setMa_stud_use_id(String ma_stud_use_id) {
		this.ma_stud_use_id = ma_stud_use_id;
	}
	public int getMa_dep_no() {
		return ma_dep_no;
	}
	public void setMa_dep_no(int ma_dep_no) {
		this.ma_dep_no = ma_dep_no;
	}
	public int getMa_mk_no() {
		return ma_mk_no;
	}
	public void setMa_mk_no(int ma_mk_no) {
		this.ma_mk_no = ma_mk_no;
	}
	public int getMa_credit() {
		return ma_credit;
	}
	public void setMa_credit(int ma_credit) {
		this.ma_credit = ma_credit;
	}
	
}
