<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 증명서
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
                    <h2>성적증명서</h2>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                   	<div class="button-location">	
                   		<form name="pdfForm">
                   		<input type=hidden id="htmlTag" name="htmlTag"/>			
						<button class="btn btn-danger" onclick="toPdf()">PDF출력</button>					
                   		</form>
					</div>
					

<div id="cer-tbl">
<div style="border: 1px solid black; float: left; padding: 10px; width: 33%;">
첫번째 영역
</div>
<div style="border: 1px solid black; float: left; padding: 10px; width: 33%;">
두번째 영역
</div>
<div style="border: 1px solid black; float: left; padding: 10px; width: 33%;">
세번째 영역
<table>
	<tr class="cer-tr">
		<th colspan="4" class="cer-no" ><h4>&nbsp;제  2016-12345호</h4></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ><h3>위의 사실을 증명함</h3></th>	
	</tr>
	
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ><h3>2016년 09월 09일</h3></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-ingam" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
		
</table>
</div>
</div>

   </div>
 </div>
			<!-- /page content -->
</div>
<script type="text/javascript">
	$("#htmlTag").val($("#cer-tbl").html());
</script>
	