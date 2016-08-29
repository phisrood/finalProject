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
    	<!-- 학습 자료실 게시물 상세 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 250px; text-align: center;"><h2>학습 자료실 ( 상세 )</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			<div class="x_panel_big">
				<table id="datatable" class="table table-striped table-bordered">
					<tr>
						<td>
							제 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목 &nbsp;: &nbsp;
							<input name="title" type="text" size="167" value="중간 고사 강의실 질문">
						</td>
					</tr>
					<tr>
						<td>
							작 &nbsp;성 &nbsp;자 &nbsp;: &nbsp;
							<input name="writer" type="text" size="75" value="한돈희">&nbsp;&nbsp;등 &nbsp;록 &nbsp;일 &nbsp;: &nbsp;<input name="registration_day" type="text" size="75" value="2016-08-09 09:00:00">
						</td>
					</tr>
					<tr>
						<td>
							<div style="float: left; width: 6%;">첨부 파일 &nbsp;: </div>
							<div style="float: left; width: 94%;"><a href="" style="text-decoration:none">첨부 파일이 없습니다.</a></div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="x_panel_big">중간 고사 강의실이 090511이 맞나여?<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></div>
							<div align="center" style="float: left; width: 6%;"><br><br>
                        		<input type="text" id="" required="required" size="5" value="한돈희"  disabled="disabled" style="text-align: center;">
                    		</div>
							<div class="x_panel_big" style="float: left; width: 90%;"><br><br><br><br><br></div>
							<div style="float: right; width: 4%;">
								<button type="button" class="btn btn-default btn-sm"><br><br>등 록<br><br><br></button>
							</div>
						</td>
					</tr>
				</table>
			</div>
			<div style="float: left; width: 2%;"><br></div>
			<div style="float: left; width: 87%;">
				<button type="button" class="btn btn-default btn-sm">목 록</button>
			</div>
			<div style="float: right; width: 6%;">
				<button type="button" class="btn btn-default btn-sm">삭 제</button>
			</div>
			<div style="float: right; width: 5%;">
				<button type="button" class="btn btn-default btn-sm">수 정</button>
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