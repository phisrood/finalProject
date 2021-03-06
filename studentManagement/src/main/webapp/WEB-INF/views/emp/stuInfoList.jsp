<%--==============================================================
 * 구성원 정보 관리 left 메뉴구성
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱      		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<script src="/emp/js/default.js"></script>
<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function(){		
		$.ajax({
			url: "/emp/stuInfo",
			method:"get",
			dataType:"json",
			success:function(obj){
				htmlCode = "";
				$.each(obj, function(index, value){
					index = parseInt(index)+1;
					htmlCode += "<tr>";
					htmlCode += "<td>"+index+"</td>";
					htmlCode += "<td>"+value.use_id+"</td>";
					htmlCode += "<td>"+value.use_name+"</td>";
					htmlCode += "<td>"+value.dep_name+"</td>";
					htmlCode += "<td>"+value.crc_cemester+"</td>";
					htmlCode += "<td>"+value.stud_gender+"</td>";
					htmlCode += "</tr>";
				});
				$("#stuTbody").html(htmlCode);
				$('#datatable').DataTable();
			},
			error:function(){
				alert("에러얌");		
			}
		});
			$('#datatable2').DataTable();
	});
	
	function deletePro(form) {
		var count = 0;
		for (var i = 0; i < form.pro_use_id.length; i++) {
			if (form.pro_use_id[i].checked == true) {
				count++;
			}
		}
		if (count == 0) {
			alert("항목을 선택해 주세요.");
		} else {
			form.action = "/emp/proInfoOnOff";
			form.method = "post";
			form.submit();
		}
	}
	
</script>


<!-- 구성원정보관리 -->

<div class="row">
	<!-- page content -->
		<div class="x_panel">
			<div class="x_title">
				<h2><i class="fa fa-user"></i> 구성원정보관리</h2>
				<ul class="nav navbar-right panel_toolbox"></ul>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
	<div class="" role="tabpanel" data-example-id="togglable-tabs">

					<ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
						<li role="presentation" class="active"><a
							href="#tab_content1" id="home-tab" role="tab" data-toggle="tab"
							aria-expanded="true">학생</a></li>
						<li role="presentation" class=""><a href="#tab_content2"
							role="tab" id="profile-tab" data-toggle="tab"
							aria-expanded="false">교수</a></li>
					</ul>

					<div id="myTabContent" class="tab-content">

						<!-- tab_content1 -->
						<div role="tabpanel" class="tab-pane fade active in"
							id="tab_content1" aria-labelledby="home-tab">
							
							<div class="x_content">
								<div id="paging">
								<table id="datatable"
									class="table table-striped jambo_table bulk_action">
									<thead>
										<tr>
											<th>NO</th>
											<th>학번</th>
											<th>이름</th>
											<th>소속학과</th>
											<th>이수학기</th>
											<th>성별</th>
										</tr>
									</thead>

									<tbody id="stuTbody" >
									   <!-- table content -->
									</tbody>
									
								</table>
								</div>
							</div>
							<div style="text-align: right;">
								<form name="insertStudent" enctype="multipart/form-data">
									<input type="file" class="btn btn-dark" name="studentList"
										id="fileup" />
									<button type="button" class="btn btn-dark"
										onclick="insertStu(this.form);">등록</button>
								</form>
							</div>
						</div>

						<!-- tab_content2 -->
						<div role="tabpanel" class="tab-pane fade" id="tab_content2"
							aria-labelledby="profile-tab">
							<form>
							<div class="x_content">
								<table id="datatable2"
									class="table table-striped jambo_table bulk_action">
									<thead>
										<tr>
											<th></th>
											<th>NO</th>
											<th>이름</th>
											<th>교번</th>
											<th>소속학과</th>
											<th>직책</th>
											<th>성별</th>
											<th>재직상태</th>
										</tr>
									</thead>
									

										<tbody>
									<c:forEach var="professor" items="${professorList}" varStatus="sta">
											<tr>
												<td><input type="checkbox" name="pro_use_id" value="${professor.pro_use_id}"/></td>
												<td>${sta.count}</td>
												<td><a href="/emp/proInfoDetail?pro_use_id=${professor.pro_use_id}">${professor.use_name}</a></td>
												<td>${professor.pro_use_id}</td>
												<td>${professor.dep_name}</td>
												<td>${professor.pro_position}</td>
												<td>${professor.pro_gender}</td>
												<td>
												<c:choose>
												<c:when test="${professor.enabled=='1'}">
												재직
												</c:when> 
												<c:otherwise>
												퇴직
												</c:otherwise> 
												</c:choose>
												</td>
											</tr>
									</c:forEach>
									</tbody>
								</table>
							
							</div>
							
							<div style="text-align: right;">
								<a href="/emp/proInfoInsertForm">
									<button type="button" class="btn btn-dark">등록</button>
								</a>
								<button type="button" class="btn btn-dark" onclick="deletePro(this.form);">삭제</button>
							</div>
							</form>
						</div>
					</div>
					<!-- x-content -->
				</div>
			</div>
		</div>
	<!-- /page content -->
</div>

