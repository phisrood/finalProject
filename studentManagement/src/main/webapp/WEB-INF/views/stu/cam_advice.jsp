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
<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Data tables -->
<link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">
<!-- 화상 부트스트랩 -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">

<script type="text/javascript">
	function serverCam() {
		window.open("https://192.168.0.2:8888/index", "화상",
				"width=800, height=700");
	}
	function clientCam() {
		window.open("https://192.168.0.2:8888/index", "화상",
				"width=800, height=700");
	}
	function chat() {
		window.open("http://192.168.0.2:8888", "채팅",
				"width=450, height=450");
	}
</script>

<style>
.local-video {
	width: 80px;
	height: 60px;
	z-index: 10;
	position: relative;
	top: -100px;
	right: 30px;
}

.remote-video {
	margin-top: 20px;
	margin-bottom: 20px;
	width: 320px;
	height: 240px;
}
</style>
<div class="row">
	<!-- 사이버 상담실 ( 화상 상담 ) -->
	<table id="datatable"
		class="table table-striped jambo_table bulk_action">
		<thead>
			<tr>
				<th>방법</th>
				<th>구분</th>
				<th>교수명</th>
				<th>일자</th>
				<th>시</th>
				<th>상태</th>
				<th>입장</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="adviceVO" items="${adviceList}">
			<tr>
				<td>${adviceVO.ad_way }</td>
				<td>${adviceVO.ad_purpose }</td>
				<td>${adviceVO.ad_pro_use_id }</td>
				<td>${adviceVO.ad_reqdate }</td>
				<td>${adviceVO.ad_time }</td>
				<td>${adviceVO.ad_stat }</td>
				<td>
					<c:choose>
					<c:when test="${adviceVO.ad_way eq '화상'}">
						<c:if test="${auth eq 'ROLE_PRO' }">
							<button type="button" class="btn btn-dark" onClick="serverCam();">입 장</button>
						</c:if>
						<c:if test="${auth eq 'ROLE_STU' }">
							<button type="button" class="btn btn-dark" onClick="clientCam();">입 장</button>
						</c:if>
					</c:when>
					<c:when test="${adviceVO.ad_way eq '채팅'}">
						<button type="button" class="btn btn-dark" onClick="chat();">입 장</button>
					</c:when>
					<c:when test="${adviceVO.ad_way eq '방문'}">
					
					</c:when>
					</c:choose>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div class="x_panel_big">
		<div class="x_title">
			<h2>&nbsp;&nbsp;</h2>
			<div class="clearfix"></div>
		</div>


		<div class="x_panel_big" style="float: left; width: 73%;">
			<div class="row">

				<div class="col-md-12">
					<h1 class="page-header">사이버 상담실</h1>
				</div>

				<div class="col-md-6" id="adviceRoom">
					
				</div>

				<div class="col-md-6"></div>

			</div>
		</div>

	</div>
	<div style="float: left; width: 2%;">
		<br>
	</div>
</div>

<!-- Datatables -->
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