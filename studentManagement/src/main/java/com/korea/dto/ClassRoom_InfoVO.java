package com.korea.dto;
/**
 * 강의실정보VO
 * 
 * @param
 * ci_no : 강의실번호<br>
 * ci_roomname : 건물이름<br>
 * ci_roomnumber : 호수
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class ClassRoom_InfoVO {

	private int ci_no;
	private String ci_roomname;
	private String ci_roomnumber;
	public int getCi_no() {
		return ci_no;
	}
	public void setCi_no(int ci_no) {
		this.ci_no = ci_no;
	}
	public String getCi_roomname() {
		return ci_roomname;
	}
	public void setCi_roomname(String ci_roomname) {
		this.ci_roomname = ci_roomname;
	}
	public String getCi_roomnumber() {
		return ci_roomnumber;
	}
	public void setCi_roomnumber(String ci_roomnumber) {
		this.ci_roomnumber = ci_roomnumber;
	}
	
	
}
