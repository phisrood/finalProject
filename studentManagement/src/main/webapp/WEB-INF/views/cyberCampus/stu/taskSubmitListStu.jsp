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
    
        
    <script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function() {
		$('#datatable').DataTable();
	});
</script>
    
    <div class="row">
    	<!-- 과제 ( 학생 ) -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 100px; text-align: center;"><h2>과제</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
           <table id="datatable" class="table table-striped jambo_table bulk_action">
               	<thead>
               		<tr>
                   		<th>등록번호</th>
                   		<th>과제명</th>	
                   		<th>과제제출 시작일</th>
                   		<th>과제제출 종료일</th>
                   		<th>제출현황</th>
                 	</tr>
               	</thead>
               	<c:forEach items="${homeworkAllList_ViewVO}" var="homeworkAllList_ViewVO">
               	<tbody>
                 	<tr>
                 	  	<td>${homeworkAllList_ViewVO.hw_no}</td>
                   		<td>${homeworkAllList_ViewVO.hw_title}</td>
                   		<td>${homeworkAllList_ViewVO.hw_startdate}</td>
                   		<td>${homeworkAllList_ViewVO.hw_enddate}</td>
                   		<td>
                   			<button type="button" class="btn btn-default btn-xs">제출하기</button>
                   		</td>
                 	</tr>
               	</tbody>
               	</c:forEach>
           	</table>
           
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