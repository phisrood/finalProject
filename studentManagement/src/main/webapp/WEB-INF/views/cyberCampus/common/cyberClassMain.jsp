<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 사이버캠퍼스 메인
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *2016.09.03   박진성        사이버캠퍼스 화면 연결
 *    
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
    
    <div class="row">
    	<!-- 사이버 캠퍼스 메인 ( 학과 ) -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 300px; text-align: center;"><h2>${lectureInfo.lb_name } Cyber Campus</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
    		<div class="col-md-12 col-sm-12 col-xs-12" style="width: 100%;">
	        	<div class="x_panel">
	        		<div class="x_title" style="width: 100%;">
                    	<h2>공지 사항</h2>
                    	<div class="clearfix"></div>
                  	</div>
	                <table id="datatable" class="table table-striped jambo_table bulk_action">
	                   	<thead>
	                   		<tr>
	                       		<th>No</th>
	                       		<th>제목</th>
	                       		<th>파일</th>
	                       		<th>등록일</th>
	                       		<th>작성자</th>
	                     	</tr>
	                   	</thead>
	                   	<tbody>
	                   		<c:choose>
	                   			<c:when test="${empty noticeList }">
	                   				<tr>
	                   					<td colspan="5">공지사항이 없습니다.</td>
	                   				</tr>
	                   			</c:when>
	                   			<c:otherwise>
			                     	<c:forEach var="notice" items="${noticeList }" varStatus="status">
			                     		<tr>
			                     			<td>${status.count }</td>
			                     			<td>${notice.ln_title }</td>
			                     			<c:choose>
			                     				<c:when test="${notice.af_aftername == 'default'}">
					                     			<td>-</td>
			                     				</c:when>
			                     				<c:otherwise>
					                     			<td><a href="/cyberCampus/common/cyberNoticeFileDown?af_no=${cyber_LectureNoticeViewVO.af_no}">${notice.af_aftername }</a></td>
			                     				</c:otherwise>
			                     			</c:choose>
			                     			<td>${notice.ln_date }</td>
			                     			<td>${notice.use_name }</td>
			                     		</tr>
			                     	</c:forEach>
	                   			</c:otherwise>
	                   		</c:choose>
	                   	</tbody>
	               	</table>
	           	</div>
           	</div>
	 </div>