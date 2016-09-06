<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title></title>
</head>
<body >
<div id="tbl">
<table border='1' class='kor'>
	<tr>
		<th>개설년도/학기</th>
		<td>${lecture.lec_makeyear }/${lecture.lec_makesemester }학기</td>
		<th>개설학과</th>
		<td>${lecture.lb_department }</td>
	</tr>
	<tr>
		<th>학수번호</th>
		<td>${lecture.lec_lb_no }</td>
		<th>분반</th>
		<td>${lecture.lec_placement }</td>
	</tr>
	<tr>
		<th>교과목명</th>
		<td>${lecture.lb_name }</td>
		<th>이수구분</th>
		<td>${lecture.lb_completekind }</td>
	</tr>
	<tr>
		<th>학점</th>
		<td>${lecture.lb_credit }</td>
		<th>강의정원</th>
		<td>${lecture.lec_persons }</td>
	</tr>
	<tr>
		<th colspan="2">담당교수</th>
		<td colspan="2">${lecture.use_name }</td>
	</tr>
	<tr>
		<th colspan="4">
			강의계획서
		</th>
	</tr>
	<tr>
		<th colspan="4">
			강의설명
		</th>
	</tr>
	<tr>
		<th colspan="4">
			강의설명내용
		</th>
	</tr>
	<tr>
		<th colspan="4">
			진행방식
		</th>
	</tr>
	<tr>
		<th colspan="4">
			진행방식내용
		</th>
	</tr>
	<tr>
		<th>
			교재
		</th>
		<td colspan='3'>
			도서명,저자, 판사항,출판사
		</td>
	</tr>
	<tr>
		<th>중간고사</th>
		<td>30%</td>
		<th>기말고사</th>
		<td>30%</td>
	</tr>
	<tr>
		<th>과제</th>
		<td>20%</td>
		<th>출석</th>
		<td>20%</td>
	</tr>

</table>
</div>
<c:if test="${loginUser.authority eq 'ROLE_PRO' }">
<button onclick="updatePlan('${lecture.lec_no }');">강의계획서 변경</button>
</c:if>
<form name="pdfForm">
<input type=hidden id="htmlTag" name="htmlTag"/>
<button onclick="toPdf()">pdf로 보기</button>	
</form>

<script type="text/javascript">
	function toPdf(){
		$("#htmlTag").val($("#tbl").html());
		document.pdfForm.method="post";
		document.pdfForm.action="/pro/classSYLtoPdf";
		document.pdfForm.target="_blank";
		document.pdfForm.submit(); 
	}
	
</script>
</body>

</html>