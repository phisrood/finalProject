<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<style>
#searchTable {
	width: 60%;
	height: 80px;
	color: #095c86;
	font-size: 15px;
}

#searchTable tr {
	margin-top: 10%;
}

#searchTable th {
	width: 10%;
}

#searchTable td {
	width: 50%;
}

#searchTable td input {
	margin-left: 3%;
}

#searchTable td button {
	margin-left: 30%;
}
</style>
<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	function classSyl(lec_no) {
		window.open("/stu/classSYL?lec_no=" + lec_no, "newWindow");
	}
	function reqClass(person, lec_no, lb_no, lb_credit) {
		if (person > 0) {
			$.ajax({
				url : "/crses/stu/insertCrsesREQ",
				method : "get",
				data : {
					"lec_no" : lec_no,
					"lb_no" : lb_no,
					"credit" : lb_credit
				},
				type : "text",
				success : function(data) {
					if (data == "lecDuplicate") {
						alert("이미 신청한 강의입니다.");
					} else if (data == "limit") {
						alert("학점이 초과되었습니다.");
					} else if (data == "timeDuplicate") {
						alert("시간표가 중복되었습니다.")
					} else {
						crsesListRefresh();
						crsesAllList();
					}
				},
				error : function() {
					alert("이미 신청한 강의입니다.");
				}
			})
		}else{
			alert("신청인원이 초과되었습니다.");
		}
	}
	function crsesListRefresh() {
		$
				.ajax({
					url : "/crses/stu/getCrsesREQList",
					method : "get",
					type : "json",
					success : function(data) {
						var htmlCode = "";
						//계산
						$.each(
										data,
										function(index, value) {
											max = value.lec_persons;
											min = value.lec_persons_count;
											htmlCode += "<tr>";
											htmlCode += "<td>" + value.lb_no
													+ "</td>";
											htmlCode += "<td>"
													+ value.lec_placement
													+ "</td>";
											htmlCode += "<td>" + value.lb_name
													+ "</td>";
											htmlCode += "<td>"
													+ value.classroom + "</td>";
											htmlCode += "<td>" + value.use_name
													+ "</td>";
											htmlCode += "<td>"
													+ value.lb_credit + "</td>";
											htmlCode += "<td>"
													+ value.lb_completekind
													+ "</td>";
											htmlCode += "<td><button class='reqDel btn btn-info btn-xs' onclick='reqDel("
													+ value.lec_no
													+ ");'>신청취소</button></td>";
											htmlCode += "<td><button class='sylBtn btn btn-info btn-xs' onclick='classSyl("
													+ value.lec_no
													+ ");'>강의계획서</button></td>";
											htmlCode += "</tr>";
										});
						$("#reqList").html(htmlCode);
					},
					error : function() {
						alert("신청리스트 에러");
					}
				});
	}
	function reqDel(lec_no) {
		$.ajax({
			url : "/crses/stu/delReqClass",
			method : "get",
			data : {
				"lec_no" : lec_no
			},
			success : function() {
				crsesListRefresh();
				crsesAllList();
			},
			error : function() {
				alert('신청취소 에러');
			}
		});
	}
	function crsesAllList() {
		var max = 0;
		var min = 0;
		//로딩시 리스트 출력

		$
				.ajax({
					url : "/crses/stu/crsesAllList",
					method : "get",
					type : "json",
					success : function(data) {
						var htmlCode = "";
						//계산
						$
								.each(
										data,
										function(index, value) {
											person = (value.lec_persons - value.lec_persons_count);
											htmlCode += "<tr>";
											htmlCode += "<td>" + value.lb_no
													+ "</td>";
											htmlCode += "<td>"
													+ value.lec_placement
													+ "</td>";
											htmlCode += "<td>" + value.lb_name
													+ "</td>";
											htmlCode += "<td>"
													+ value.classroom + "</td>";
											htmlCode += "<td>" + value.use_name
													+ "</td>";
											htmlCode += "<td>"
													+ value.lb_credit + "</td>";
											htmlCode += "<td>"
													+ value.lb_completekind
													+ "</td>";
											htmlCode += "<td>" + person
													+ "</td>";
											htmlCode += "<td><button class='reqBtn btn btn-info btn-dark' onclick='reqClass("
													+ person
													+ ","
													+ value.lec_no
													+ ","
													+ value.lb_no
													+ ","
													+ value.lb_credit
													+ ")'>신청</td>";
											htmlCode += "<td><button class='sylBtn btn btn-info btn-dark' onclick='classSyl("
													+ value.lec_no
													+ ");'>강의계획서</button></td>";
											htmlCode += "</tr>";
										});
						$("#resultList").html(htmlCode);
						$("#datatable").DataTable();
					},
					error : function() {
						alert("에러");
					}
				});
	}
	$(function() {
		crsesListRefresh();
		crsesAllList();
		
	});
</script>

<div class="row" style="width: 100%; height: 1200px;">

	
	<!-- page content 1 -->
		<h4>과목목록</h4>
	<div class="x_content" style="height: 45%; overflow: auto;">
		<table id="datatable"
			class="table table-striped jambo_table bulk_action">
			<thead>
				<tr>
					<th>학수번호</th>
					<th>분반</th>
					<th>과목명</th>
					<th>수업시간, 강의실</th>
					<th>교수명</th>
					<th>학점</th>
					<th>이수구분</th>
					<th>가능인원</th>
					<th>수강신청</th>
					<th>강의계획서보기</th>
				</tr>
			</thead>

			<tbody id="resultList">
				<!-- 수강리스트 -->

			</tbody>
		</table>
	</div>
	<!-- page content 2 -->
		<h4>수강신청목록</h4>
	<div class="x_content" style="height: 40%; overflow: auto;">

		<table id="datatable"
			class="table table-striped jambo_table bulk_action">
			<thead>
				<tr>
					<th>학수번호</th>
					<th>분반</th>
					<th>과목명</th>
					<th>수업시간,강의실</th>
					<th>교수명</th>
					<th>학점</th>
					<th>이수구분</th>
					<th>신청취소</th>
					<th>강의계획서보기</th>
				</tr>
			</thead>

			<tbody id="reqList">
				<!-- 신청내역 -->

			</tbody>
		</table>
	</div>

</div>
<!-- /page content -->
