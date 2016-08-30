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
    
    <div class="row">
    	<!-- 상담 신청 내역 처리 화면 ( 확인 ) -->
       		<div class="x_title">
                <h2>&nbsp;&nbsp;상담 신청 내역 처리</h2>
               	<div class="clearfix"></div>
            </div><br>
            <div style="float: right; width: 80%;">
	          	<select name="processing_select">
	          		<option value="확인">확인</option>
					<option value="연기">연기</option>
				</select>
			</div>
			<div style="float: right; width: 20%;"></div><br><br>
			<div style="float: right; width: 80%;">학생명 : 김양문</div>
			<div style="float: right; width: 20%;"></div><br><br>
			<div style="float: right; width: 50%;">상담 방법 : 화상</div>
			<div style="float: right; width: 30%;">상담 내용 : 취업</div>
			<div style="float: right; width: 20%;"></div><br><br>
			<div style="float: right; width: 80%;">일자 선택 2016-08-08</div>
			<div style="float: right; width: 20%;"></div><br><br>
	        <div style="float: right; width: 50%;">
				<button type="button" class="btn btn-default btn-xs">확 인</button>
			</div>
	        <div style="float: right; width: 30%;">
	          	시간 선택 14 시
			</div>
			<div style="float: right; width: 20%;"></div>
    </div>
        
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