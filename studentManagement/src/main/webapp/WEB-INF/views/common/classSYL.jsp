<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title></title>
</head>
<body >
<div class="row">
		<div class="x_panel_big">
			<div class="x_panel" id="lecture_panel">

				<div class="x_title">
					<h2>강의계획서</h2>
					<div class="clearfix"></div>
				</div>
		<div class="button-location">
			<form name="pdfForm">
			<input type=hidden id="htmlTag" name="htmlTag"/>
			<button class="btn btn-danger" onclick="toPdf()">PDF출력</button>	
			</form>
		</div>
<div id="tbl">
<table  style="border-collapse: collapse;width:100%;" id="classSYL" class='kor table table-striped table-bordered dataTable no-footer' >
	<tr>
		<th class="lecture-border table-th" >이수구분</th>
		<td class="lecture-border" >${lecture.lb_completekind }</td>
		<th class="lecture-border table-th" >학점</th>
		<td class="lecture-border" >${lecture.lb_credit }</td>
		<th class="lecture-border table-th" >강의정원</th>
		<td class="lecture-border" >${lecture.lec_persons }</td>
	</tr>
	<tr>
		<th class="lecture-border table-th" >개설년도/학기</th>
		<td class="lecture-border " >${lecture.lec_makeyear }/${lecture.lec_makesemester }학기</td>
		<th class="lecture-border table-th" >개설학과</th>
		<td class="lecture-border" >${lecture.lb_department }</td>
		<th class="lecture-border table-th" >담당교수</th>
		<td class="lecture-border" >${lecture.use_name }</td>
	</tr>
	<tr>
		<th class="lecture-border table-th" >교과목명</th>
		<td class="lecture-border" >${lecture.lb_name }</td>
		<th class="lecture-border table-th" >학수번호</th>
		<td class="lecture-border" >${lecture.lec_lb_no }</td>
		<th class="lecture-border table-th" >분반</th>
		<td class="lecture-border" >${lecture.lec_placement }</td>
	</tr>
	<tr>
		<th class="lecture-border table-th"  colspan="3">
			강의시간
		</th>
		<th class="lecture-border table-th"  colspan="3">
			강의교재
		</th>
	</tr>
	<tr>
		<td colspan="3"   class="lectureContent lecture-border">
		<ul style="list-style: none;">
			<c:forEach items="${lectureTime }" var="time">
				<li>${time.tt_time }</li>
			</c:forEach>
			</ul>
		</td>
		<td colspan="3"   class="lectureContent lecture-border">
			서명:<p>${classSYL.cs_bookname },${classSYL.cs_bookversion }</p>
			저자:<p>${classSYL.cs_writer }</p>
			출판사:${classSYL.cs_publisher }
		</td>
	</tr>
	
	<tr>
		<th class="lecture-border table-th"  colspan="6">
			강의설명
		</th>
	</tr>
	<tr>
		<td colspan="6"   class="lectureContent lecture-border">
			${classSYL.cs_content }
		</td>
	</tr>
	<tr>
		<th colspan="6"    class="lecture-border table-th">
			진행방식
		</th>
	</tr>
	<tr>
		<td colspan="6"  class="lectureContent lecture-border">
			${classSYL.cs_progress }
		</td>
	</tr>
	<tr>
		<th class="lecture-border table-th"  >중간고사</th>
		<td colspan="2" class="lecture-border" >${classSYL.cs_midterm }</td>
		<th class="lecture-border table-th" >기말고사</th>
		<td colspan="2" class="lecture-border" >${classSYL.cs_final }</td>
	</tr>
	<tr>
		<th class="lecture-border table-th" >과제</th>
		<td colspan="2" class="lecture-border" >${classSYL.cs_homework }</td>
		<th class="lecture-border table-th" >출석</th>
		<td colspan="2" class="lecture-border" >${classSYL.cs_attent }</td>
	</tr>
</table>
</div>
</div>
</div>
</div>
<div class="button-location">
<c:if test="${loginUser.authority eq 'ROLE_PRO' }">
<button class="btn btn-dark" onclick="updateSyl('${lecture.lec_no }');">강의계획서 변경</button>
</c:if>
<a href="/pro/lectureList"><button class="btn btn-dark">뒤로</button></a>
</div>
<script type="text/javascript">
	$("#htmlTag").val($("#tbl").html());
</script>
</body>

</html>
