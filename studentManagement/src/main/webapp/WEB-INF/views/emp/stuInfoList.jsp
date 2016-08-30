<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script src="/emp/js/default.js"></script>

<!-- 구성원정보관리 -->

<div class="row">

	<!-- page content -->

	<div class="x_panel_big">
		<div class="x_panel">

			<div class="x_title">
				<h2>구성원정보관리</h2>
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
							<div style="text-align: right;">

								<select style="width: 100px; height: 30px;">
									<option>전체</option>
									<option>학번</option>
									<option>이름</option>
									<option>소속학과</option>
								</select> <input type="text" style="width: 200px; height: 30px;">
								<button type="button" class="btn btn-dark">검색</button>

							</div>
							<div class="x_content">

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
											<th>학적상태</th>
										</tr>
									</thead>

									<tbody>
										<c:forEach var="stu" items="${studentList}" varStatus="sta">
											<tr>
												<td>${sta.count }</td>												
												<td>${stu.use_id }</td>												
												<td>${stu.use_name }</td>												
												<td>${stu.dep_name }</td>																							
												<td>${stu.crc_cemester }</td>												
												<td>${stu.stud_gender }</td>												
												<td>${stu.crc_colleagestatus }</td>												
											</tr>
										</c:forEach>
									</tbody>
								</table>



							</div>
							<div style="text-align: right;">
								<form name="insertStudent" enctype="multipart/form-data">
									<input type="file" class="btn btn-dark" name="studentList"
										id="fileup" />
									<button type="button" class="btn btn-dark"
										onclick="insertStu(this.form);">등록</button>
								</form>
								<button type="button" class="btn btn-dark">수정</button>
								<button type="button" class="btn btn-dark">삭제</button>
							</div>
						</div>

						<!-- tab_content2 -->
						<div role="tabpanel" class="tab-pane fade" id="tab_content2"
							aria-labelledby="profile-tab">

							<div style="text-align: right;">

								<select style="width: 100px; height: 30px;">
									<option>전체</option>
									<option>이름</option>
									<option>소속학과</option>
								</select> <input type="text" style="width: 200px; height: 30px;">
								<button type="button" class="btn btn-dark">검색</button>

							</div>
							<div class="x_content">


								<table id="datatable"
									class="table table-striped jambo_table bulk_action">
									<thead>
										<tr>
											<th>NO</th>
											<th>이름</th>
											<th>소속학과</th>
											<th>직책</th>
											<th>성별</th>
										</tr>
									</thead>


									<tbody>
										<tr>
											<td>1</td>
											<td>원장님</td>
											<td>정보통신공학과</td>
											<td>학과장</td>
											<td>남자</td>
										</tr>
										<tr>
											<td>2</td>
											<td>김형민</td>
											<td>정보통신공학과</td>
											<td>흥부자</td>
											<td>남자</td>
										</tr>
										<tr>
											<td>1</td>
											<td>이영만</td>
											<td>정보통신공학과</td>
											<td>만년막내</td>
											<td>남자</td>
										</tr>

									</tbody>
								</table>

							</div>
							<div style="text-align: right;">
								<button type="button" class="btn btn-dark">
									<a href="/emp/proInfoInsertForm">등록</a>
								</button>
								<button type="button" class="btn btn-dark">수정</button>
								<button type="button" class="btn btn-dark">삭제</button>
							</div>
						</div>

					</div>
					<!-- x-content -->
				</div>
			</div>
		</div>
	</div>
	<!-- /page content -->
</div>


