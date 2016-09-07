package com.korea.dto;
/**
 * 승인VO
 * 
 * @param
 * sb_no : 순번<br>
 * sb_dep_no : 학과번호<br>
 * sb_stud_use_id : 아이디<br>
 * sb_requestdate : 신청일자<br>
 * sb_majordepartment : 소속학과<br>
 * sb_majordepartmentsubmityn : 소속학과승인여부<br>
 * sb_requestdepartmentyn : 신청학과승인여부
 * 
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class SubmitVO {

	private int sb_no;
	private int sb_dep_no;
	private String sb_stud_use_id;
	private String sb_requestdate;
	private String sb_majordepartment;
	private String sb_majordepartmentsubmityn;
	private String sb_requestdepartmentyn;
	private int sb_major_dep_no;
	
	
	public int getSb_major_dep_no() {
		return sb_major_dep_no;
	}
	public void setSb_major_dep_no(int sb_major_dep_no) {
		this.sb_major_dep_no = sb_major_dep_no;
	}
	public int getSb_no() {
		return sb_no;
	}
	public void setSb_no(int sb_no) {
		this.sb_no = sb_no;
	}
	public int getSb_dep_no() {
		return sb_dep_no;
	}
	public void setSb_dep_no(int sb_dep_no) {
		this.sb_dep_no = sb_dep_no;
	}
	public String getSb_stud_use_id() {
		return sb_stud_use_id;
	}
	public void setSb_stud_use_id(String sb_stud_use_id) {
		this.sb_stud_use_id = sb_stud_use_id;
	}
	public String getSb_requestdate() {
		return sb_requestdate;
	}
	public void setSb_requestdate(String sb_requestdate) {
		this.sb_requestdate = sb_requestdate;
	}
	public String getSb_majordepartment() {
		return sb_majordepartment;
	}
	public void setSb_majordepartment(String sb_majordepartment) {
		this.sb_majordepartment = sb_majordepartment;
	}
	public String getSb_majordepartmentsubmityn() {
		return sb_majordepartmentsubmityn;
	}
	public void setSb_majordepartmentsubmityn(String sb_majordepartmentsubmityn) {
		this.sb_majordepartmentsubmityn = sb_majordepartmentsubmityn;
	}
	public String getSb_requestdepartmentyn() {
		return sb_requestdepartmentyn;
	}
	public void setSb_requestdepartmentyn(String sb_requestdepartmentyn) {
		this.sb_requestdepartmentyn = sb_requestdepartmentyn;
	}
	
}
