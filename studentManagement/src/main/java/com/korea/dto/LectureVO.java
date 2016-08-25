package com.korea.dto;
/**
 * 강의VO
 * 
 * @param
 * lec_no : 강의등록번호<br>
 * lec_lb_no : 학수번호<br>
 * lec_ln_pro_use_id : 강의실<br>
 * lec_ci_no : 개설학기<br>
 * lec_makesemester : 강의연도<br>
 * lec_credit : 학점<br>
 * lec_placement : 분반<br>
 * lec_persons : 인원<br>
 * lec_first : 첫번째교시<br>
 * lec_second : 두번째교시<br>
 * lec_third : 세번째교시<br>
 * lec_fourth : 네번째교시
 * 
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class LectureVO {

	private int lec_no;
	private int lec_lb_no;
	private String lec_ln_pro_use_id;
	private int lec_ci_no;
	private int lec_makesemester;
	private String lec_makeyear;
	private int lec_credit;
	private int lec_placement;
	private int lec_persons;
	private int lec_first;
	private int lec_second;
	private int lec_third;
	private int lec_fourth;
	public int getLec_no() {
		return lec_no;
	}
	public void setLec_no(int lec_no) {
		this.lec_no = lec_no;
	}
	public int getLec_lb_no() {
		return lec_lb_no;
	}
	public void setLec_lb_no(int lec_lb_no) {
		this.lec_lb_no = lec_lb_no;
	}
	public String getLec_ln_pro_use_id() {
		return lec_ln_pro_use_id;
	}
	public void setLec_ln_pro_use_id(String lec_ln_pro_use_id) {
		this.lec_ln_pro_use_id = lec_ln_pro_use_id;
	}
	public int getLec_ci_no() {
		return lec_ci_no;
	}
	public void setLec_ci_no(int lec_ci_no) {
		this.lec_ci_no = lec_ci_no;
	}
	public int getLec_makesemester() {
		return lec_makesemester;
	}
	public void setLec_makesemester(int lec_makesemester) {
		this.lec_makesemester = lec_makesemester;
	}
	public String getLec_makeyear() {
		return lec_makeyear;
	}
	public void setLec_makeyear(String lec_makeyear) {
		this.lec_makeyear = lec_makeyear;
	}
	public int getLec_credit() {
		return lec_credit;
	}
	public void setLec_credit(int lec_credit) {
		this.lec_credit = lec_credit;
	}
	public int getLec_placement() {
		return lec_placement;
	}
	public void setLec_placement(int lec_placement) {
		this.lec_placement = lec_placement;
	}
	public int getLec_persons() {
		return lec_persons;
	}
	public void setLec_persons(int lec_persons) {
		this.lec_persons = lec_persons;
	}
	public int getLec_first() {
		return lec_first;
	}
	public void setLec_first(int lec_first) {
		this.lec_first = lec_first;
	}
	public int getLec_second() {
		return lec_second;
	}
	public void setLec_second(int lec_second) {
		this.lec_second = lec_second;
	}
	public int getLec_third() {
		return lec_third;
	}
	public void setLec_third(int lec_third) {
		this.lec_third = lec_third;
	}
	public int getLec_fourth() {
		return lec_fourth;
	}
	public void setLec_fourth(int lec_fourth) {
		this.lec_fourth = lec_fourth;
	}
	
	
}
