package com.korea.dto;
/**
 * 강의목록VO
 * 
 * @param
 * lb_no : 학수번호<br>
 * lb_name : 강의명<br>
 * lb_department : 개설학과<br>
 * lb_completekind : 이수구분<br>
 * lb_approvalyn : 승인여부<br>
 * lb_revokeyn : 폐지여부
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Lecture_BreakeDownVO {
	
	private String lb_no;
	private String lb_name;
	private String lb_department;
	private String lb_completekind;
	private String lb_approvalyn;
	private String lb_revokeyn;
	private String lb_credit;
	private String lb_dep_no;
	
	public String getLb_dep_no() {
		return lb_dep_no;
	}
	public void setLb_dep_no(String lb_dep_no) {
		this.lb_dep_no = lb_dep_no;
	}
	public String getLb_credit() {
		return lb_credit;
	}
	public void setLb_credit(String lb_credit) {
		this.lb_credit = lb_credit;
	}
	public String getLb_no() {
		return lb_no;
	}
	public void setLb_no(String lb_no) {
		this.lb_no = lb_no;
	}
	public String getLb_name() {
		return lb_name;
	}
	public void setLb_name(String lb_name) {
		this.lb_name = lb_name;
	}
	public String getLb_department() {
		return lb_department;
	}
	public void setLb_department(String lb_department) {
		this.lb_department = lb_department;
	}
	public String getLb_completekind() {
		return lb_completekind;
	}
	public void setLb_completekind(String lb_completekind) {
		this.lb_completekind = lb_completekind;
	}
	public String getLb_approvalyn() {
		return lb_approvalyn;
	}
	public void setLb_approvalyn(String lb_approvalyn) {
		this.lb_approvalyn = lb_approvalyn;
	}
	public String getLb_revokeyn() {
		return lb_revokeyn;
	}
	public void setLb_revokeyn(String lb_revokeyn) {
		this.lb_revokeyn = lb_revokeyn;
	}
	
}
