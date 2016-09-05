<%--==============================================================
 * 수강생 조회 리스트
 * @author 박진성
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.09.03.  	박진성      		최초생성
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
    	<!-- 온라인 콘텐츠 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 100px; text-align: center;"><h2>수강생 리스트</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
	     	<div class="x_panel_big">
	     		<div class="x_title">
                   	<h2>수강생 조회</h2>
                   	<div class="clearfix"></div>
                </div>
                <table id="datatable" class="table table-striped jambo_table bulk_action">
                   	<thead>
                   		<tr>
                   			<th>순번</th>
                       		<th>과목명</th>
                       		<th>학수번호</th>
                       		<th>수업시간</th>
                       		<th>교수명</th>          
                       		<th>출석현황보기</th>
                     	</tr>
                   	</thead>
                   	<tbody>
                     	<tr>
                       		<td>자바</td>
                       		<td>00001</td>
                       		<td>월/금 1~2</td>
                       		<td>정보관 303호</td>
                       		<td>이영만</td>
                       		<td>30</td>
                       		<td>3</td>
                       		<td>전필</td>
                       		<td><a href="javascript:OpenWindow('UI-CC-021.jsp','800','450')" style="text-decoration:none">
                       			보기</a>
                       		</td>
                     	</tr>	
                   	</tbody>
               	</table>
	     	</div>
    </div>
    <!-- Datatables -->
    <script>
		function OpenWindow(url,intWidth,intHeight) { 
		      window.open(url, "_blank", "width="+intWidth+",height="+intHeight+",resizable=1,scrollbars=1") ; 
		} 
	</script>
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