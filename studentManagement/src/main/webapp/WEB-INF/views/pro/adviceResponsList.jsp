<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function() {
		var table =$('#datatable').DataTable();
		table.order( [ 0, 'desc' ] ).draw();
	});
</script>
<script>
 function confirm(ad_no){
	 var url = "/pro/updateAdviceConfirmForm?ad_no="+ad_no;
	 
	 userwidth = (screen.width/2);
	 userheight = (screen.height/2);
	 
	 wLeft = window.screenLeft ? window.screenLeft : window.screenX;
	 wTop = window.screenTop ? window.screenTop : window.screenY;
	
	 var left = wLeft + (window.innerWidth / 2) - (userwidth / 2);
	 var top = wTop + (window.innerHeight / 2) - (userheight / 2);
	
	 window.open(url,'처리','width=' + userwidth + ', height=' + userheight + ', top=' + top + ', left=' + left +'');  
 }
</script>

<div class="row">  
	<div class="x_panel_big">  
		<!-- 상담 신청 내역 -->
		<div class="x_title">
			<h2><i class="fa fa-list"></i> 상담 신청 내역</h2>
			<div class="clearfix"></div>
		</div>
		<div>부득이한 경우 처리에서 날짜 연기를 할 수 있습니다.</div>
		<br>
		<table id="datatable" class="table table-striped jambo_table bulk_action">
			<thead>
				<tr>
					<th>상담번호</th>
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
				<c:forEach var="adviceRes" items="${adviceResList}">
					<tr>
						<td>${adviceRes.ad_no }</td>
						<td>${adviceRes.ad_way }</td>
						<td>${adviceRes.ad_purpose }</td>
						<td>${adviceRes.use_name }</td>
						<td>
						<%-- <fmt:formatDate value="${adviceRes.ad_reqdate }" type="date" pattern="yyyy/MM/dd (E)"/> --%>
						${adviceRes.ad_reqdate }</td>    
						<td>${adviceRes.ad_time } 시</td>  
						<c:choose>
							<c:when test="${adviceRes.ad_stat eq '미처리'}">
						       <td><input type="button" id="click" class="btn btn-dark btn-xs" value="처리" onclick="confirm(${adviceRes.ad_no })"/></td>
							</c:when>
							<c:otherwise>
						       	<td>${adviceRes.ad_stat }</td>
						    </c:otherwise>
						</c:choose>
						<td>${adviceRes.ad_return }</td>  	
					</tr>  
				</c:forEach>
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
