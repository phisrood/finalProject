package com.korea.dto;

/**
 * 학생정보+신청강의 VIEW
 * 
 * @param use_name
 *           
 * 	사용자이름 use_name;
	학생아이디 stud_use_id;
	학과명 dep_name;
	전공구분 mk_name;
	학점 lb_credit;
	강의명 lb_name;
	강의등록번호 lec_no;
	학수번호 lec_lb_no;
 * 
 * 
 * 
 *
 * 
 * 
 * @version 박진성, 1.0, 2016.09.05, 초기 작성
 * 
 * 
 * 
 * @author 박진성
 *
 */

public class Student_InquiryList_ViewVO {

	
	private String use_name;
	private String stud_use_id;
	private String dep_name;
	private String mk_name;
	private String lb_credit;
	private String lb_name;
	private int lec_no;
	private String lec_lb_no;
	
	
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public String getStud_use_id() {
		return stud_use_id;
	}
	public void setStud_use_id(String stud_use_id) {
		this.stud_use_id = stud_use_id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getMk_name() {
		return mk_name;
	}
	public void setMk_name(String mk_name) {
		this.mk_name = mk_name;
	}
	public String getLb_credit() {
		return lb_credit;
	}
	public void setLb_credit(String lb_credit) {
		this.lb_credit = lb_credit;
	}
	public String getLb_name() {
		return lb_name;
	}
	public void setLb_name(String lb_name) {
		this.lb_name = lb_name;
	}
	public int getLec_no() {
		return lec_no;
	}
	public void setLec_no(int lec_no) {
		this.lec_no = lec_no;
	}
	public String getLec_lb_no() {
		return lec_lb_no;
	}
	public void setLec_lb_no(String lec_lb_no) {
		this.lec_lb_no = lec_lb_no;
	}


}
