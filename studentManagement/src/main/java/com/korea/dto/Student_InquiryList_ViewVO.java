package com.korea.dto;

/**
 * 학생정보+신청강의 VIEW
 * 
 * @param use_name
 * 
 * 
 *            use_name 교수이름 pro_use_id 교수아이디 stud_use_id 학생아이디 dep_name 학과명
 *            mk_name 전공구분 lb_credit 학점 lb_name 강의명 lec_no 강의등록번호 lec_lb_no 학수번호
 *            cb_lec_no 학생수강내역 강의등록번호 tt_time 시간표 lec_makesemester 개설학기
 *            lec_makeyear 강의년도
 * 
 * @version 박진성, 1.0, 2016.09.05, 초기 작성 박진성, 1.0, 2016.09.06, 1차 수정
 * 
 * 
 * @author 박진성
 *
 */

public class Student_InquiryList_ViewVO {

	private String lb_department;
	private String lb_no;
	private String lec_makesemester;
	private String lec_makeyear;
	private String lb_name;
	private String lb_completekind;
	private String lb_credit;
	private String use_name;
	private String lec_no;
	private String stud_use_id;
	private String classroom;
	
	
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getStud_use_id() {
		return stud_use_id;
	}
	public void setStud_use_id(String stud_use_id) {
		this.stud_use_id = stud_use_id;
	}
	public String getLb_department() {
		return lb_department;
	}
	public void setLb_department(String lb_department) {
		this.lb_department = lb_department;
	}
	public String getLb_no() {
		return lb_no;
	}
	public void setLb_no(String lb_no) {
		this.lb_no = lb_no;
	}
	public String getLec_makesemester() {
		return lec_makesemester;
	}
	public void setLec_makesemester(String lec_makesemester) {
		this.lec_makesemester = lec_makesemester;
	}
	public String getLec_makeyear() {
		return lec_makeyear;
	}
	public void setLec_makeyear(String lec_makeyear) {
		this.lec_makeyear = lec_makeyear;
	}
	public String getLb_name() {
		return lb_name;
	}
	public void setLb_name(String lb_name) {
		this.lb_name = lb_name;
	}
	public String getLb_completekind() {
		return lb_completekind;
	}
	public void setLb_completekind(String lb_completekind) {
		this.lb_completekind = lb_completekind;
	}
	public String getLb_credit() {
		return lb_credit;
	}
	public void setLb_credit(String lb_credit) {
		this.lb_credit = lb_credit;
	}
	
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public String getLec_no() {
		return lec_no;
	}
	public void setLec_no(String lec_no) {
		this.lec_no = lec_no;
	}

}
