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
    	<!-- 자유 게시글 등록 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>자유 ( 등록 )</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			<div class="x_panel_big">
				<table id="datatable" class="table table-striped table-bordered">
					<tr>
						<td>제 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목 &nbsp;: &nbsp;<input name="title" type="text"  size="167"></td>
					</tr>
					<tr>
						<td>
							작 &nbsp;성 &nbsp;자 &nbsp;: &nbsp;<input name="writer" type="text"  size="75">&nbsp;&nbsp;
							등 &nbsp;록 &nbsp;일 &nbsp;: &nbsp;<input name="registration_day" type="text"  size="75">
						</td>
					</tr>
					<tr>
						<td>
							<div style="float: left; width: 6%;">첨부 파일 &nbsp;: </div>
							<div style="float: left; width: 94%;"><input name="file" type="file"></div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="x_panel_big"><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></div>
						</td>
					</tr>
				</table>
			</div>
			<div style="float: left; width: 2%;"><br></div>
			<div style="float: left; width: 92%;">
				<button type="button" class="btn btn-default btn-sm">목 록</button>
			</div>
			<div style="float: right; width: 6%;">
				<button type="button" class="btn btn-default btn-sm">등 록</button>
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