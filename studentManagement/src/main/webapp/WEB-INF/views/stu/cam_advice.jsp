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
   		<!-- 사이버 상담실 ( 화상 상담 ) -->
           	<table id="datatable" class="table table-striped table-bordered">
               	<thead>
               		<tr>
                   		<th>방법</th>
                   		<th>구분</th>
                   		<th>학생명</th>
                   		<th>일자</th>
                   		<th>시</th>
                   		<th>상태</th>
                   		<th>입장</th>
                 	</tr>
               	</thead>
               	<tbody>
                 	<tr>
                 	  	<td>화상</td>
                   		<td>취업</td>
                   		<td>이건원</td>
                   		<td>2016-08-10</td>
                   		<td>12</td>
                   		<td>대기</td>
                   		<td>
                   			<button type="button" class="btn btn-default btn-xs">입 장</button>
                   		</td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
               	</tbody>
           	</table>
            <div class="x_panel_big">
            	<div class="x_title">
                	<h2>&nbsp;&nbsp;사이버 상담실</h2>
               		<div class="clearfix"></div>
            	</div>
            	<div class="x_panel_big" style="float: left; width: 73%;">
            		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
            	</div>
            	<div style="float: left; width: 2%;">
            		<br>
            	</div>
            	<div style="float: left; width: 25%;">
            		<div class="x_panel_big">
            			단순 메모<br>
            			저장 x<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
            		</div>
            		<div class="x_panel_big">
            			<br><br><br><br><br><br><br><br><br><br><br><br>
            		</div>
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