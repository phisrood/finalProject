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
    	<!-- 과제 ( 학과 ) -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 49%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 100px; text-align: center;"><h2>과제</h2></div>
			</div>
			<div style="float: right; width: 1%;"><br></div>
			<div style="float: right; width: 49%; text-align: center;">
				<div style="float: right; width: 80px; text-align: right;">
					<button type="button" class="btn btn-default btn-sm">과제 등록</button>
				</div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
            <table id="datatable" class="table table-striped table-bordered">
               	<thead>
               		<tr>
                   		<th>No</th>
                   		<th>과제명</th>
                   		<th>기한</th>
                   		<th>과제 수정</th>
                 	</tr>
               	</thead>
               	<tbody>
                 	<tr>
                 	  	<td>4</td>
                   		<td>4 번 과제</td>
                   		<td>2016-08-08 ~ 2016-08-15</td>
                   		<td>
                   			<button type="button" class="btn btn-default btn-xs">수정</button>
                   		</td>
                 	</tr>
                 	<tr>
                   		<td>3</td>
                   		<td>3 번 과제</td>
                   		<td>2016-07-08 ~ 2016-07-15</td>
                   		<td>
                   			<button type="button" class="btn btn-default btn-xs">수정</button>
                   		</td>
                 	</tr>
                 	<tr>
                   		<td>2</td>
                   		<td>2 번 과제</td>
                   		<td>2016-06-08 ~ 2016-06-15</td>
                   		<td>
                   			<button type="button" class="btn btn-default btn-xs">수정</button>
                   		</td>
                 	</tr>
                 	<tr>
                   		<td>1</td>
                   		<td>1 번 과제</td>
                   		<td>2016-05-08 ~ 2016-05-15</td>
                   		<td>
                   			<button type="button" class="btn btn-default btn-xs">수정</button>
                   		</td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
                   		<td></td>
                   		<td></td>
                   		<td></td>
                 	</tr>
               	</tbody>
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