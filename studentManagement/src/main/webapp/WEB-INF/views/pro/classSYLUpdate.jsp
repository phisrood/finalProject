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
<form name="updateSyl">
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
		<td colspan="4">
			<textarea rows="10" cols="200" style="resize:none;" name="cs_content">${classSYL.cs_content }</textarea> 
		</td>
	</tr>
	<tr>
		<th colspan="4">
			진행방식
		</th>
	</tr>
	<tr>
		<td colspan="4">
			<textarea rows="10" cols="200" style="resize:none;" name="cs_progress">${classSYL.cs_progress }</textarea> 
		</td>
	</tr>
	<tr>
		<th>
			교재
		</th>
		<td colspan='3'>
			서명:<input type="text" name="cs_bookname" value="${classSYL.cs_bookname }"/>
			판사항:<input type="text" name="cs_bookversion" value="${classSYL.cs_bookversion }"/><br/>
			저자:<input type="text" name="cs_writer" value="${classSYL.cs_writer }"/><br/>
			출판사:<input type="text" name="cs_publisher" value="${classSYL.cs_publisher }"/>
		</td>
	</tr>
	<tr>
		<th>중간고사</th>
		<td><input type="text" name="cs_midterm" value="${classSYL.cs_midterm }"/></td>
		<th>기말고사</th>
		<td><input type="text" name="cs_final" value="${classSYL.cs_final }"/></td>
	</tr>
	<tr>
		<th>과제</th>
		<td><input type="text" name="cs_homework" value="${classSYL.cs_homework }"/></td>
		<th>출석</th>
		<td><input type="text" name="cs_attent" value="${classSYL.cs_attent }"/></td>
	</tr>
	
</table>
</div>
<input type="hidden" name="cs_lec_no" value="${lecture.lec_no }">
<button onclick="updateSYLConfirm();">강의계획서 저장</button>
<button onclick="javascript:history.go(-1)">취소</button>	
</form>
<script>
	function updateSYLConfirm(){
		document.updateSyl.method="get";
		document.updateSyl.action="/pro/updateSylConfirm?cs_lec_no=";
		document.updateSyl.submit();
	}
</script>
</body>

</html>