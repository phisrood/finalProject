<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 상담신청내역(교수)
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *    
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>

	<!-- Data tables -->
    <link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">
    
    <div class="row">
    	<div class="x_panel_big">
    		<!-- 상담 신청 내역 -->
        		<div class="x_title">
                   	<h2 >상담 신청 내역</h2>
                   	<div class="clearfix"></div>
                </div>
                <div>
                	부득이한 경우 처리에서 날짜 연기를 할 수 있습니다.
                </div><br>
                <table id="datatable" class="table table-striped table-bordered">
                   	<thead>
                   		<tr>
                       		<th>방법</th>
                       		<th>구분</th>
                       		<th>학생명</th>
                       		<th>일자</th>
                       		<th>시</th>
                       		<th>상태</th>
                       		<th>회신일</th>
                     	</tr>
                   	</thead>
                   	<tbody>
                     	<tr>
                     	  	<td>화상</td>
                       		<td>취업</td>
                       		<td>이건원</td>
                       		<td>2016-08-14</td>
                       		<td>14</td>
                       		<td><button type="button" class="btn btn-default btn-xs">처 리</button></td>
                       		<td></td>
                     	</tr>
                     	<tr>
                       		<td>화상</td>
                       		<td>취업</td>
                       		<td>이건원</td>
                       		<td>2016-08-13</td>
                       		<td>13</td>
                       		<td>연기</td>
                       		<td>2018-08-18</td>
                     	</tr>
                     	<tr>
                       		<td>채팅</td>
                       		<td>취업</td>
                       		<td>이건원</td>
                       		<td>2016-08-10</td>
                       		<td>12</td>
                       		<td>대기</td>
                       		<td></td>
                     	</tr>
                     	<tr>
                       		<td>방문</td>
                       		<td>학적</td>
                       		<td>이건원</td>
                       		<td>2016-07-09</td>
                       		<td>9</td>
                       		<td>완료</td>
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