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
    	<!-- 인터넷 강의 등록 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>강의 등록</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			<div class="x_panel_big">
				<br>
				<form method="post" action="/pro/onlineConReg" enctype="multipart/form-data">
				<table id="datatable" class="table table-striped table-bordered">
					<tr>
						<td>
							강의 제목 &nbsp;: &nbsp;
							<input name="oc_content" type="text" size="165">
						</td>
					</tr>
					<tr>
						<td>
							학습 시작 기간 &nbsp;: &nbsp;
							<input name="oc_startdate" type="text" size="165" OnClick="Calendar(this, 'top','no');">
						</td>
					</tr>
					<tr>
						<td>
							학습 마감 기간 &nbsp;: &nbsp;
							<input name="oc_enddate" type="text" size="165" OnClick="Calendar(this, 'down','no');">
						</td>
					</tr>
					<tr>
						<td>
							<div style="float: left; width: 7%;">첨부 파일 &nbsp;: </div>
							<div style="float: left; width: 93%;">
							<input type="file" name="file" accept="video/*"></div>
						</td>
					</tr>
					<tr>
						<td>
							출석 인정 시간 &nbsp;: &nbsp;
							<input name="oc_time" type="text" size="161">
						</td>
					</tr>
				</table>
				<div style="float: left; width: 1%;"><br></div>
				<div style="float: left; width: 89%;">
					<button type="button" class="btn btn-default btn-sm">목 록</button>
				</div>
				<div style="float: right; width: 5%;">
					<button type="button" class="btn btn-default btn-sm">수 정</button>
				</div>
				<div style="float: right; width: 5%;">
					<input type="submit" class="btn btn-default btn-sm" value="등록"/>
				</div>
				</form>
			</div>
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