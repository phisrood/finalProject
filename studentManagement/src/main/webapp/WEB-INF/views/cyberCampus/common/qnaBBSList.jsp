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
    	<!-- Q & A 게시판 ( 학과 ) -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>Q & A 게시판</h2></div>
			</div>
			<div style="float: left; width: 71%;"></div>
			<div style="float: right; width: 4%;">
				<button type="button" class="btn btn-default btn-xs">검 색</button>
			</div>
               <div style="float: right; width: 19%;">
				<input name="seach" type="text"  size="30">
			</div>
			<div style="float: right; width: 6%;">
				<select name="notice_select">
					<option value="제목">제목</option>
					<option value="작성자">작성자</option>
				</select>
			</div>
			<div style="float: left; width: 100%;"><br></div>
            <table id="datatable" class="table table-striped jambo_table bulk_action">
               	<thead>
               	
               		<tr>
                   		<th>No</th>
                   		<th>제목</th>
                   		<th>등록일</th>
                   		<th>작성자</th>
                 	</tr>
               	</thead>
               	<tbody>
               	<c:if test="${loginUser.authority eq 'ROLE_STU' }">
               	 <c:forEach items="${question_BoardListVO }" var="question_BoardListVO">
                 	<tr>
                 	  	<td>${question_BoardListVO.qb_no}</td>
                   		<td><a href="/cyberCampus/stu/qnaBBSDetail?qb_no=${question_BoardListVO.qb_no}">${question_BoardListVO.qb_title}</a></td>
                   		<td>${question_BoardListVO.qb_date}</td>
                   		<td>${question_BoardListVO.qb_stud_use_id}</td>
                 	</tr>
                 </c:forEach>
                 </c:if>
               	</tbody>
           	</table>
           	<div style="float: right; width: 5%;">
				<a href="/cyberCampus/stu/qnaBBSInsert"><button type="button" class="btn btn-default btn-sm">글쓰기</button></a>
			</div>
			<div style="float: right; width: 95%;"><br></div>
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