<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 사이버캠퍼스 출석관리
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
    	<!-- 출석 관리 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>출석 관리</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
            <table id="datatable" class="table table-striped table-bordered">
               	<thead>
               		<tr>
                   		<th>순번</th>
                   		<th>이름</th>
                   		<th>학과</th>
                   		<th>학번</th>
                   		<th>출석</th>
                 	</tr>
               	</thead>
               	<tbody>
                 	<tr>
                 	  	<td>1</td>
                   		<td>김양문</td>
                   		<td>문헌 정보 학과</td>
                   		<td>20100001</td>
                   		<td>
                    		<select name="attendance">
								<option value="미출석">미출석</option>
								<option value="출석">출석</option>
							</select>
						</td>
                 	</tr>
                 	<tr>
                   		<td>2</td>
                   		<td>김현석</td>
                   		<td>멀티미디어 공학과</td>
                   		<td>20100002</td>
                   		<td>
                    		<select name="attendance">
								<option value="미출석">미출석</option>
								<option value="출석">출석</option>
							</select>
						</td>
                 	</tr>
                 	<tr>
                   		<td>3</td>
                   		<td>박진성</td>
                   		<td>컴퓨터 공학과</td>
                   		<td>2010003</td>
                   		<td>
                    		<select name="attendance">
								<option value="미출석">미출석</option>
								<option value="출석">출석</option>
							</select>
						</td>
                 	</tr>
                 	<tr>
                   		<td>4</td>
                   		<td>이건원</td>
                   		<td>멀티미디어 공학과</td>
                   		<td>2010004</td>
                   		<td>
                    		<select name="attendance">
								<option value="미출석">미출석</option>
								<option value="출석">출석</option>
							</select>
						</td>
                 	</tr>
                 	<tr>
                   		<td>5</td>
                   		<td>이수정</td>
                   		<td>정보 통신 공학과</td>
                   		<td>2010005</td>
                   		<td>
                    		<select name="attendance">
								<option value="미출석">미출석</option>
								<option value="출석">출석</option>
							</select>
						</td>
                 	</tr>
                 	<tr>
                   		<td><br></td>
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
                 	</tr>
                 	<tr>
                   		<td><br></td>
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
                 	</tr>
                 	<tr>
                   		<td><br></td>
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