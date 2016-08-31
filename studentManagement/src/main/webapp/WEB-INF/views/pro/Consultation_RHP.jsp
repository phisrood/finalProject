<%--==============================================================
 * 사이버 캠퍼스 자유 게시판 left 메뉴구성
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱      		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

	<!-- Data tables -->
    <link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">
  	 
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script>
		$(function() {
			$("#selectBox").change(function() {
				var str = $("#selectBox option:selected").val();
				alert(str);
			}).change();
		});
	</script>
	
<div class="row">
    	<!-- 상담 신청 내역 처리 화면 ( 연기 ) -->
       		<div class="x_title">
                <h2>&nbsp;&nbsp;상담 신청 내역 처리</h2>
               	<div class="clearfix"></div>
            </div><br>
            
            <div style="float: right; width: 80%;">
	          	<select name="ad_stat" id="selectBox">
					<option value="확인">확인</option>
					<option value="연기">연기</option>
				</select>
			</div>
			
			<c:set var="adviceVO" value="${adviceVO}"/>
			<div style="float: right; width: 20%;"></div><br><br>
			<div style="float: right; width: 80%;">학생명 : ${adviceVO.ad_stud_use_id }</div>
			<div style="float: right; width: 20%;"></div><br><br>
			<div style="float: right; width: 50%;">상담 방법 : ${adviceVO.ad_way }</div>
			<div style="float: right; width: 30%;">상담 내용 : ${adviceVO.ad_purpose }</div>
			<div style="float: right; width: 20%;"></div><br><br>
			<div style="float: right; width: 30%;">날짜 : ${adviceVO.ad_reqdate }</div>
			<div style="float: right; width: 30%;">시간 : ${adviceVO.ad_time }</div>
			<div style="float: right; width: 20%;"></div><br><br>
	        <div style="float: right; width: 50%;"></div>
			<div style="float: right; width: 20%;">
			</div>
			<br />	
				
    <form method="post" action="/pro/updateAdviceConfirm">
    		<input type="hidden" name="ad_no" value="${adviceVO.ad_no }"/>
			<input type="submit" class="btn btn-default btn-xs" value="처리"/>	
	</form>
	
    </div>
    	<!-- <div style="float: right; width: 80%;">일자 선택 <input type="text" OnClick="Calendar(this, 'down','no');"></div> -->
	   <!--      <div style="float: right; width: 30%;">시간 선택 
	          	<select name="time_select">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
				</select> 시
			</div> -->
        
    <!-- Datatables -->
    <script src="/stu/js/click_cal.js"></script>
    <script src="/stu/js/jquery.dataTables.min.js"></script>
    <script src="/stu/js/dataTables.bootstrap.min.js"></script>
    <script src="/stu/js/dataTables.buttons.min.js"></script>
    <script src="/stu/js/buttons.bootstrap.min.js"></script>
    <script src="/stu/js/buttons.flash.min.js"></script>
    <script src="/stu/js/buttons.html5.min.js"></script>
    <script src="/stu/js/buttons.print.min.js"></script>
    <script src="/stu/js/dataTables.fixedHeader.min.js"></script>
    <script src="/stu/js/dataTables.keyTable.min.js"></script>
    <script src="/stu/js/dataTables.responsive.min.js"></script>
    <script src="/stu/js/responsive.bootstrap.js"></script>
    <script src="/stu/js/datatables.scroller.min.js"></script>
    <script src="/stu/js/jszip.min.js"></script>
    <script src="/stu/js/pdfmake.min.js"></script>
    <script src="/stu/js/vfs_fonts.js"></script>