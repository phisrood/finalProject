package com.korea.dto;
/**
 * 학과VO
 * 
 * @param
 * dep_no : 학과번호 <br>
 * dep_name : 학과명<br>
 * dep_majneedcredit : 주전공졸업요건<br>
 * dep_minneedcredit : 부전공졸업요건<br>
 * dep_mulcredit : 다전공졸업요건<br>
 * dep_revokeyn : 폐지여부<br>
 * dep_phone : 전화번호
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class DepartmentVO {

	private int dep_no;
	private String dep_name;
	private int dep_majneedcredit;
	private int dep_minneedcredit;
	private int dep_mulcredit;
	private String dep_revokeyn;
	private String dep_phone;
	public int getDep_no() {
		return dep_no;
	}
	public void setDep_no(int dep_no) {
		this.dep_no = dep_no;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public int getDep_majneedcredit() {
		return dep_majneedcredit;
	}
	public void setDep_majneedcredit(int dep_majneedcredit) {
		this.dep_majneedcredit = dep_majneedcredit;
	}
	public int getDep_minneedcredit() {
		return dep_minneedcredit;
	}
	public void setDep_minneedcredit(int dep_minneedcredit) {
		this.dep_minneedcredit = dep_minneedcredit;
	}
	public int getDep_mulcredit() {
		return dep_mulcredit;
	}
	public void setDep_mulcredit(int dep_mulcredit) {
		this.dep_mulcredit = dep_mulcredit;
	}
	public String getDep_revokeyn() {
		return dep_revokeyn;
	}
	public void setDep_revokeyn(String dep_revokeyn) {
		this.dep_revokeyn = dep_revokeyn;
	}
	public String getDep_phone() {
		return dep_phone;
	}
	public void setDep_phone(String dep_phone) {
		this.dep_phone = dep_phone;
	}
	
}
