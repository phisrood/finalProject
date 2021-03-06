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
<!-- 부트스트랩 css -->
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="/bootstrap/css/font-awesome.min.css" rel="stylesheet">
<link href="/bootstrap/css/nprogress.css" rel="stylesheet">
<link href="/bootstrap/css/green.css" rel="stylesheet">
<link href="/bootstrap/css/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet">
<link href="/bootstrap/css/jqvmap.min.css" rel="stylesheet" />
<link href="/bootstrap/css/custom.min.css" rel="stylesheet">
<link href="/common/css/default.css" rel="stylesheet">

<script src="/stu/js/default.js"></script>
<script src="/common/js/notice.js"></script>
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
	
	<div class="row">

	<!-- page content -->
	<div class="x_panel">
                  <div class="x_title">
                    <h2>졸업증명서</h2>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                   	<div class="button-location">	
                   		<form name="pdfForm">
                   		<input type=hidden id="htmlTag" name="htmlTag"/>			
						<button class="btn btn-danger" onclick="toCerPdf()">PDF출력</button>					
                   		</form>
					</div>

<div id="cer-tbl" >

<table  id="cer-table" class="kor">
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" >졸 업 증 명 서</th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-content" ><span class="cer-span">성&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;명 : ${Student_InfoViewVO.use_name }</span></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-content" ><span class="cer-span">생&nbsp;년&nbsp;월&nbsp;일 : ${Student_InfoViewVO.stud_birth }</span></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-content" ><span class="cer-span">소&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;속 :${Student_InfoViewVO.dep_name }</span></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-content" ><span class="cer-span">졸&nbsp;업&nbsp;년&nbsp;월&nbsp;일 : </span></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-sub" >위의 사실을 증명함</th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-title" ></th>	
	</tr>
	<tr class="cer-tr">
		<th colspan="4" class="cer-sub cer-day" >${Current_date}</th>	
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
			<!-- /page content -->
</div>
<script type="text/javascript">
	$("#htmlTag").val($("#cer-tbl").html());
</script>
	