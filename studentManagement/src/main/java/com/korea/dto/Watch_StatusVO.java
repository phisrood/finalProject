package com.korea.dto;
/**
 * 시청현황VO
 * 
 * @param
 * ws_oc_no : 콘텐츠번호
 * ws_stud_use_id : 아이디
 * ws_oc_lec_no : 강의등록번호
 * ws_attendyn : 출석인정여부
 * ws_watchtime : 시청시간
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Watch_StatusVO {

	private int ws_oc_no;
	private String ws_stud_use_id;
	private int ws_oc_lec_no;
	private String ws_attendyn;
	private int ws_watchtime;
	public int getWs_oc_no() {
		return ws_oc_no;
	}
	public void setWs_oc_no(int ws_oc_no) {
		this.ws_oc_no = ws_oc_no;
	}
	public String getWs_stud_use_id() {
		return ws_stud_use_id;
	}
	public void setWs_stud_use_id(String ws_stud_use_id) {
		this.ws_stud_use_id = ws_stud_use_id;
	}
	public int getWs_oc_lec_no() {
		return ws_oc_lec_no;
	}
	public void setWs_oc_lec_no(int ws_oc_lec_no) {
		this.ws_oc_lec_no = ws_oc_lec_no;
	}
	public String getWs_attendyn() {
		return ws_attendyn;
	}
	public void setWs_attendyn(String ws_attendyn) {
		this.ws_attendyn = ws_attendyn;
	}
	public int getWs_watchtime() {
		return ws_watchtime;
	}
	public void setWs_watchtime(int ws_watchtime) {
		this.ws_watchtime = ws_watchtime;
	}
	
}
