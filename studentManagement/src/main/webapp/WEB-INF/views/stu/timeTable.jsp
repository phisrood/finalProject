<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 공지사항 상세보기
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

 <link href="resources/common/css/default.css" rel="stylesheet">
<!-- 시간표 -->
	
	<div class="row">

	<!-- page content -->
	<div class="x_panel">
                  <div class="x_title">
                    <h2>시간표</h2>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                   	<div class="button-location">				
						<button class="btn btn-danger" onclick="toPdf()">PDF출력</button>					
					</div>

<table  id="time-table" class='table table-striped table-bordered dataTable no-footer' >
	<tr class="time-tr time-day">
		<th class="lecture-border table-th " ></th>
		<th class="lecture-border table-th " ><h2>월</h2></th>
		<th class="lecture-border table-th " ><h2>화</h2></th>
		<th class="lecture-border table-th " ><h2>수</h2></th>
		<th class="lecture-border table-th " ><h2>목</h2></th>
		<th class="lecture-border table-th " ><h2>금</h2></th>
		
	</tr>
	<tr class="time-tr">
		<th class="lecture-border table-th time-th" >09:00~10:00</th>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
	</tr>
	<tr class="time-tr">
		<th class="lecture-border table-th time-th" >10:00~11:00</th>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
	</tr>
	<tr class="time-tr">
		<th class="lecture-border table-th time-th" >11:00~12:00</th>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
	</tr>
	<tr class="time-tr">
		<th class="lecture-border table-th time-th" >12:00~13:00</th>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
	</tr>
	
	<tr class="time-tr">
		<th class="lecture-border table-th time-th" >13:00~14:00</th>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
	</tr>
	<tr class="time-tr">
		<th class="lecture-border table-th time-th" >14:00~15:00</th>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
	</tr>
	<tr class="time-tr">
		<th class="lecture-border table-th time-th" >16:00~17:00</th>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
	</tr>
	<tr class="time-tr">
		<th class="lecture-border table-th time-th" >17:00~18:00</th>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
	</tr>
	<tr class="time-tr">
		<th class="lecture-border table-th time-th" >18:00~19:00</th>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
		<td class="lecture-border " >과목,분반,교수</td>
	</tr>
	
</table>

   </div>
 </div>
	

			<!-- /page content -->
		</div>
	