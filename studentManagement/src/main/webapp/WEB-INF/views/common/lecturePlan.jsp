<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
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
		<td>2016/2학기</td>
		<th>개설학과</th>
		<td>컴퓨터공학과</td>
	</tr>
	<tr>
		<th>학수번호</th>
		<td>10120</td>
		<th>분반</th>
		<td>01</td>
	</tr>
	<tr>
		<th>교과목명</th>
		<td>jsp</td>
		<th>이수구분</th>
		<td>전공</td>
	</tr>
	<tr>
		<th>학점</th>
		<td>3</td>
		<th>강의정원</th>
		<td>30</td>
	</tr>
	<tr>
		<th colspan="2">담당교수</th>
		<td colspan="2">이수정</td>
	</tr>
	<tr>
		<td colspan="4">
			수업계획내용
		</td>
	</tr>
</table>
</div>
<form name="pdfForm">
<input type=hidden id="htmlTag" name="htmlTag"/>
<button onclick="toPdf()">pdf로 보기</button>	
</form>
<script type="text/javascript">
	function toPdf(){
		$("#htmlTag").val($("#tbl").html());
		document.pdfForm.method="post";
		document.pdfForm.action="/pro/lecturePlantoPdf";
		document.pdfForm.target="_blank";
		document.pdfForm.submit(); 
	}
</script>
</body>

</html>