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
                   		<td><a href="/cyberCampus/pro/taskSubmitListDetail?hw_no=${homeworkAllList_ViewVO.hw_no}">${homeworkAllList_ViewVO.hw_title}</a></td>
                   		<td>${homeworkAllList_ViewVO.hw_startdate}</td>
                   		<td>${homeworkAllList_ViewVO.hw_enddate}</td>
                   		<td>
                   			<button type="button" class='btn btn-info btn-xs'>제출현황 보기</button>
                   		</td>
                 	</tr>
               	</tbody>
               	</c:forEach>
           	</table>
           	
     
			<div style="float: right; width: 5%;">
					<a href="/cyberCampus/pro/taskSubmitListMove"><button type="button" class="btn btn-default btn-sm">과제등록</button></a>
			</div>
    </div>