package com.korea.dto;

/**
 * 온라인콘텐츠 시청현황 VO
 * 
 * @param cn_no
 *            : 공지사항시퀀스번호<br>
 *            cn_af_no : 업로드파일시퀀스번호<br>
 *            cn_sp_use_id : 작성자<br>
 *            cn_title : 공지사항제목<br>
 *            cn_content : 공지사항내용<br>
 * 
 * 
 * @version 이건원, 1.0, 2016.09.07, 초기 작성
 * @author 이건원
 *
 */
public class Online_Con_ViewVO {
	private int ws_oc_no;
	private String ws_stud_use_id;
	private int ws_oc_lec_no;
	private String ws_attendyn;
	private int ws_watchtime;

	public int getWs_watchtime() {
		return ws_watchtime;
	}

	public void setWs_watchtime(int ws_watchtime) {
		this.ws_watchtime = ws_watchtime;
	}

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

}
