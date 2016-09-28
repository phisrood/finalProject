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

	
    
    <script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function() {
		$('#datatable').DataTable();
	});
</script>

		
    <div class="row">
    	<!-- 공지 사항 ( 학과 ) -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>공지 사항</h2></div>
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
               		<c:forEach items="${cyber_LectureNoticeViewVO}" var="cyber_LectureNoticeViewVO">
               	<tbody>
               
                 	<tr>
                 	  	<td>${cyber_LectureNoticeViewVO.ln_no }</td>
                   		<td><a href="/cyberCampus/stu/cyberNoticeDetail?ln_no=${cyber_LectureNoticeViewVO.ln_no }">${cyber_LectureNoticeViewVO.ln_title }.</a></td>
                   		<td>${cyber_LectureNoticeViewVO.ln_date}</td>
                   		<td>${cyber_LectureNoticeViewVO.use_name}</td>
                 	</tr>
          			
               	</tbody>
               	</c:forEach>
           	</table>
           	
           	<div style="float: right; width: 5%;">  
           	<c:if test="${auth eq 'ROLE_PRO' }">
			<a href="/cyberCampus/pro/cyberNoticeInsert"><button type="button" class="btn btn-dark">글쓰기</button></a>
			</c:if>
			</div>
			<div style="float: right; width: 95%;"><br></div>
    </div>
 


