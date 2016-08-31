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

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script src="/common/js/notice.js"></script>
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function(){
		$.ajax({
			url:"/common/messageUserSearch",
			method:"get",
			type:"json",
			success:function(data){
				var htmlCode="";
				$.each(data, function(index, value){
					htmlCode+="<tr id="+value.use_id+" class='searchTr'>";
					htmlCode+="<td>"+value.use_id+"</td>";
					htmlCode+="<td>"+value.use_name+"</td>";
					htmlCode+="<td>"+value.dep_name+"</td>";
					htmlCode+="</tr>"
				});
				$("#searchTbody").html(htmlCode);
				$('#searchTable').DataTable();
			}
			
		});
		
		$("#result").on("click", "tr", function(){
			var id = $(this).attr("id");
			
			$("#first-name2", opener.document).val(id);
			window.close();
			
		});
	});
</script>
<style>
html, body { 
	overflow : hidden;
}
h2 {
	display : inline;
}
#searchTable .searchTr:hover{
	background-color: #CECEF6;
}
</style>
</head>
<body>
	<div style="float: left; width: 85%;">
		&nbsp;<h2>수신자 검색</h2>
	</div>
	<div style="float: right; width: 11%; padding: 7px;">
		<input type="button" value="닫기" onclick="notice_close();">
	</div><br><br>
	<hr>
    <div>
		<div style="width:100%;" id="result">
			<table id="searchTable" border="1" style="width:100%;">
				<thead>
					<tr>
						<th>학번</th>
						<th>이름</th>
						<th>학과</th>
					</tr>
				</thead>
				<tbody id="searchTbody">
					
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>