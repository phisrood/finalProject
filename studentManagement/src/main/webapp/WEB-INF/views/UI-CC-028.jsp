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
    	<!-- 과제 수정 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>과제 수정</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			<div class="x_panel_big">
				<div style="float: left; width: 100%;"><br></div>
				<div style="float: left; width: 100%;">
					과 &nbsp;제 &nbsp;명 &nbsp;: &nbsp;<input name="title" type="text" size="169">
				</div>
				<div style="float: left; width: 100%;"><br></div>
				<div style="float: left; width: 100%;">
					제출 기한 &nbsp;: &nbsp;<input name="title" type="text" size="169">
				</div>
				<div style="float: left; width: 100%;"><br></div>
				<div style="float: left; width: 100%;">
					<div style="float: left; width: 6%;">첨부 파일 &nbsp;: &nbsp;</div>
					<div style="float: left; width: 94%;"><a href="" style="text-decoration:none">첨부 파일이 없습니다.</a></div>
				</div>
				<div style="float: left; width: 100%;"><br></div>
				<div style="float: left; width: 100%;">
					과제 내용 &nbsp;: &nbsp;
				</div>
				<div style="float: left; width: 100%;"><br></div>
				<div>
					<div class="x_panel_big"><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></div>
				</div>
				<div style="float: left; width: 96%;"><br></div>
				<div style="float: right; width: 4%;">
					<button type="button" class="btn btn-default btn-sm">수 정</button>
				</div>
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