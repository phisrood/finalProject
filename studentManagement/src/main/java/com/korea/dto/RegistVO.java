package com.korea.dto;
/**
 * 학생등록정보VO
 * 
 * @param
 * reg_no : 등록번호<br>
 * reg_stud_use_id : 아이디<br>
 * reg_stat : 등록상태<br>
 * reg_paystat : 등록금납부상태<br>
 * reg_paysum : 등록금납부금액<br>
 * reg_sum : 등록금액<br>
 * reg_date : 납부일
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class RegistVO {

	private int reg_no;
	private String reg_stud_use_id;
	private String reg_stat;
	private String reg_paystat;
	private int reg_paysum;
	private int reg_sum;
	private String reg_date;
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public String getReg_stud_use_id() {
		return reg_stud_use_id;
	}
	public void setReg_stud_use_id(String reg_stud_use_id) {
		this.reg_stud_use_id = reg_stud_use_id;
	}
	public String getReg_stat() {
		return reg_stat;
	}
	public void setReg_stat(String reg_stat) {
		this.reg_stat = reg_stat;
	}
	public String getReg_paystat() {
		return reg_paystat;
	}
	public void setReg_paystat(String reg_paystat) {
		this.reg_paystat = reg_paystat;
	}
	public int getReg_paysum() {
		return reg_paysum;
	}
	public void setReg_paysum(int reg_paysum) {
		this.reg_paysum = reg_paysum;
	}
	public int getReg_sum() {
		return reg_sum;
	}
	public void setReg_sum(int reg_sum) {
		this.reg_sum = reg_sum;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
			
	
}
