<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 상담 게시판
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
    		<!-- 상담 게시판 -->
        		<div class="x_title">
                   	<h2 >상담 게시판</h2>
                   	<div class="clearfix"></div>
                </div><br>
                <div style="float: left; width: 72%;">
                	&nbsp;&nbsp;&nbsp;- 상담 내역은 본인과 담당 교수만 열람이 가능합니다.
                </div>
               <div class="x_content">
				<div style="text-align:right;">
                    
		                          <select style="width:100px; height:30px;">
		                            <option>전체</option>
		                            <option>제목</option>
		                            <option>작성일</option>
		                          </select>
		                     <input type="text" style="width:200px; height:30px;">
			                <button type="button" class="btn btn-dark">검색</button>
			                <button type="button" class="btn btn-dark">작 성</button>
                      
                </div>  
                
                <table id="datatable" class="table table-striped jambo_table bulk_action">
                   	<thead>
                   		<tr>
                       		<th>글번호</th>
                       		<th>구분</th>
                       		<th>제목</th>
                       		<th>학생명</th>
                       		<th>작성일</th>
                       		<th>답변 상태</th>
                     	</tr>
                   	</thead>
                   	<tbody>
                     	<tr>
                     	  	<td>2</td>
                       		<td>학적</td>
                       		<td><a href="javascript:OpenWindow('UI-CS-011.jsp','600','500')" style="text-decoration:none">
                       		궁금합니다 2</a></td>
                       		<td>이건원</td>
                       		<td>2016-08-09</td>
                       		<td>답변 대기</td>
                     	</tr>
                     	<tr>
                       		<td>1</td>
                       		<td>장학</td>
                       		<td>궁금합니다</td>
                       		<td>김양문</td>
                       		<td>2016-08-08</td>
                       		<td>답변 완료</td>
                     	</tr>
                     	<tr>
                       		<td><br></td>
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
                     	</tr>
                     	<tr>
                       		<td><br></td>
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
                     	</tr>
                     	<tr>
                       		<td><br></td>
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
                     	</tr>
                     	<tr>
                       		<td><br></td>
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
                     	</tr>
                     	<tr>
                       		<td><br></td>
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
                     	</tr>
                   	</tbody>
               	</table>
               	<div align="center"><a href="" style="text-decoration:none">
               		이전 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 다음
                </a></div><br>
    	</div>
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