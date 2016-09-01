<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 쪽지함
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    2016-08-31 한돈희 리스트 출력
 *    
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>


<!-- <link href="/bootstrap/css/pnotify.css" rel="stylesheet">
<link href="/bootstrap/css/pnotify.buttons.css" rel="stylesheet">
<link href="/bootstrap/css/pnotify.nonblock.css" rel="stylesheet">
<link href="/bootstrap/css/prettify.min.css" rel="stylesheet">
<link href="/bootstrap/css/select2.min.css" rel="stylesheet">
<link href="/bootstrap/css/switchery.min.css" rel="stylesheet">
<link href="/bootstrap/css/starrr.css" rel="stylesheet">
<link href="/bootstrap/css/custom.min.css" rel="stylesheet"> -->

<script src="/common/js/notice.js"></script>
<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function(){
		$('#reciveTable').DataTable();
		$('#sendTable').DataTable();
		
		$(".messageSendDetail").click(function(){
			var message_no = $(this).attr("id");
			
			$.ajax({
				url:"/common/messageSendInfo",
				method:"get",
				type:"json",
				data:{"message_no": message_no},
				success:function(data){
					var from = "From.";
					var send = data.mes_send_use_id;
					var title = data.mes_title;
					var content = data.mes_content;
					var date = data.mes_date;
					var delyn = data.mes_delyn;
					var sendBtn = "<br><br><button class='btn btn-dark' id='replyBtn' onclick="+"javascript:OpenWindow('/common/messageReplyForm?send="+send+"','400','500')"+">답장</button>&nbsp";
					sendBtn += "<button class='btn btn-dark' onclick=location.href='/common/messageSendDelete?message_no="+message_no+"&&delyn="+delyn+"'>삭제</button>";
					
					$("#messageSend").html(from+send);
					$("#messageTitle").html(title);
					$("#messageContent").html(content);
					$("#messageDate").html(date);
					$("#messageButton").html(sendBtn);
					$("#"+message_no+"readyn").html("");
					
					
				}
			});
		}); 
		
		$(".messageReciveDetail").click(function(){
			var message_no = $(this).attr("id");
			
			$.ajax({
				url:"/common/messageReciveInfo",
				method:"get",
				type:"json",
				data:{"message_no": message_no},
				success:function(data){
					var to = "TO.";
					var send = data.mes_recive_use_id;
					var title = data.mes_title;
					var content = data.mes_content;
					var date = data.mes_date;
					var delyn = data.mes_delyn;
					var reciveBtn = "<button class='btn btn-dark' onclick=location.href='/common/messageReciveDelete?message_no="+message_no+"&&delyn="+delyn+"'>삭제</button>";
					
					$("#messageSend").html(to+send);
					$("#messageTitle").html(title);
					$("#messageContent").html(content);
					$("#messageDate").html(date);
					$("#messageButton").html(reciveBtn);
				}
			});
		}); 
		
		$("#profile-tab2").click(function(){
			$("#messageDe").html("");
 			$("#home-tab, #profile-tab").click(function(){
				location.reload();
			});
		});
		

		
	});
</script>

<!-- 쪽지함 --> 



	<div class="row">

	<!-- page content -->
	
	<div class="x_panel_big">
		<div class="x_panel" style="width:60%">
		
			<div class="x_title">
				<h2>
					<i class="fa fa-comment"></i> 쪽지함
				</h2>
				<ul class="nav navbar-right panel_toolbox"></ul>
				<div class="clearfix"></div>
			</div>
			
			<div class="x_content">


				<div class="" role="tabpanel" data-example-id="togglable-tabs">
				
					<ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
						<li role="presentation" class="active"><a
							href="#tab_content1" id="home-tab" role="tab"
							data-toggle="tab" aria-expanded="true">받은쪽지함</a></li>
						<li role="presentation" class=""><a href="#tab_content2"
							role="tab" id="profile-tab" data-toggle="tab"
							aria-expanded="false">보낸쪽지함</a></li>
						<li role="presentation" class=""><a href="#tab_content3"
							role="tab" id="profile-tab2" data-toggle="tab"
							aria-expanded="false">쪽지쓰기</a></li>
					</ul>
					
					<div id="myTabContent" class="tab-content">
					
					<!-- 받은쪽지함 -->
						<div role="tabpanel" class="tab-pane fade active in"
							id="tab_content1" aria-labelledby="home-tab">
							<div class="x_content">
				              
								<table id="reciveTable"
									class="table table-striped jambo_table bulk_action">
									<thead>
										<tr>
											<th>삭제</th>
											<th>발신자</th>
											<th>제목</th>
											<th>수신일</th>
											<th>수신여부</th>
										</tr>
									</thead>

									<tbody>
										<c:forEach var="messageAllList" items="${messageAllList }">
											<c:if test="${id eq messageAllList.mes_recive_use_id }">
												<c:if test="${messageAllList.mes_delyn == '1' || messageAllList.mes_delyn == '3' }">
													<tr class="messageSendDetail" id="${messageAllList.mes_no }">
														<td><input type="checkbox"></td>
														<td>${messageAllList.mes_send_use_id }</td>
														<td>${messageAllList.mes_title }</td>
														<td>${messageAllList.mes_date }</td>
														<c:if test="${messageAllList.mes_readyn == 'n' }">
															<td><span style="color:red;" id="${messageAllList.mes_no }readyn">새로운쪽지</span></td>
														</c:if>
														<c:if test="${messageAllList.mes_readyn == 'y' }">
															<td><span id="${messageAllList.mes_no }readyn"></span></td>
														</c:if>
													</tr>
												</c:if>
											</c:if>
										</c:forEach>
									</tbody>
								</table>
									<div style="text-align:right;">
										<button type="button" class="btn btn-dark">삭제</button>
			                    	</div>
								
							</div>
							</div>
							
							<!-- 보낸쪽지함 -->
						<div role="tabpanel" class="tab-pane fade" 
									id="tab_content2" aria-labelledby="profile-tab">
							<div class="x_content">
				              
							<table id="sendTable" class="table table-striped jambo_table bulk_action">
								<thead>
									<tr>
										<th>삭제</th>
										<th>수신자</th>
										<th>제목</th>
										<th>수신일</th>
									</tr>
								</thead>


								<tbody>
										<c:forEach var="messageAllList" items="${messageAllList }">
											<c:if test="${id eq messageAllList.mes_send_use_id }">
												<c:if test="${messageAllList.mes_delyn == '1' || messageAllList.mes_delyn == '2' }">
													<tr class="messageReciveDetail" id="${messageAllList.mes_no }">
														<td><input type="checkbox"></td>
														<td>${messageAllList.mes_recive_use_id }</td>
														<td>${messageAllList.mes_title }</td>
														<td>${messageAllList.mes_date }</td>
													</tr>
												</c:if>
											</c:if>
										</c:forEach>
								</tbody>
							</table>
									<div style="text-align:right;">
										<button type="button" class="btn btn-dark">삭제</button>
				                    
				                    </div>
							  </div>
							</div>
						
						<!-- tab_content3 -->
						<div role="tabpanel" class="tab-pane fade" id="tab_content3"
							aria-labelledby="profile-tab">
							
							<!-- 쪽지쓰기 -->
							<div class="x_panel" style="width:100%">
			                
			                  <h2>쪽지쓰기</h2>
			                  <ul class="nav navbar-right panel_toolbox">	                    
			                  </ul>
			                <div class="clearfix"></div>
			                <form class="form-horizontal form-label-left" action="messageSend" method="post">
			                  <div class="form-group">
			                    <label class="control-label col-md-3" for="first-name">수신자 </label>
			                    <div class="col-md-7">
			                      <input type="text" id="mes_recive_use_id" name="mes_recive_use_id" required="required" class="col-md-7 col-xs-12" style="width:80%;" readonly="readonly">
			                    </div>
			                     <button type="button" class="btn btn-dark" onclick="javascript:OpenWindow('/common/messageUserSearchForm','600','500')" style="text-decoration:none">검색</button>
			                  </div>
			                  <div class="form-group">
			                    <label class="control-label col-md-3" for="last-name">제목 </label>
			                    <div class="col-md-7">
			                      <input type="text" name="mes_title" required="required" class="col-md-7 col-xs-12" style="width:80%;">
			                    </div>
			                  </div>
			                  <div class="form-group">
			                    <label class="control-label col-md-3" for="last-name">내용 </label>
			                    <div class="col-md-7">
			                      <textarea rows="30" cols="30" name="mes_content" required="required" class="col-md-7 col-xs-12" style="width:80%; height:300px;"></textarea>
			                    </div>
			                  </div>
			                  <br/>
		                  		<div style="text-align:center; margin-left:13%">
			                  		<input type="submit" class="btn btn-dark" value="보내기">
			                  	</div>
			                </form>
		                	
		                <div class="x_content">

		
		                </div>
		                </div>     
		            	</div>
		            	
					</div>
				</div>
				<!-- x-content -->
			</div>		
		</div>
			<div class="x_panel" style="float: right; width:40%; height:100%;" id="messageDe">
				<div class="x_title">
					<h2>
						<span id="messageSend">쪽지상세</span>
					</h2>
					<ul class="nav navbar-right panel_toolbox"></ul>
				<div class="clearfix"></div>
				<div class="x_content">
						<br>
						<br>
						<br>
				     <label>제목   :</label>&nbsp;&nbsp;&nbsp;
				     <span style="color: gray;" id="messageTitle"></span><br><br><br>
				     <label>수신일 :</label>&nbsp;&nbsp;&nbsp;
				     <span style="color: gray;" id="messageDate"></span><br><br><br>
				     
				     <label>내용 : </label>
				     <div id="messageContent" style="border: 1px solid black; padding: 10px 10px 10px 10px;">
				     </div>
				     <div style="text-align:right;" id="messageButton">
				     	
	                 </div>
								
								
				</div>
			</div>
			
			</div>
	</div>
					<!-- /page content -->
	</div>
			


			<!-- <script src="/bootstrap/js/fastclick.js"></script>
			<script src="/bootstrap/js/nprogress.js"></script>
			<script src="/bootstrap/js/icheck.min.js"></script>
			<script src="/bootstrap/js/bootstrap-progressbar.min.js"></script>
			<script src="/bootstrap/js/pnotify.js"></script>
			<script src="/bootstrap/js/pnotify.buttons.js"></script>
			<script src="/bootstrap/js/pnotify.nonblock.js"></script>
		    <script src="/bootstrap/js/bootstrap-wysiwyg.min.js"></script>
		    <script src="/bootstrap/js/jquery.hotkeys.js"></script>
		    <script src="/bootstrap/js/prettify.js"></script>
		    <script src="/bootstrap/js/jquery.tagsinput.js"></script>
		    <script src="/bootstrap/js/switchery.min.js"></script>
		    <script src="/bootstrap/js/select2.full.min.js"></script>
		    <script src="/bootstrap/js/parsley.min.js"></script>
		    <script src="/bootstrap/js/autosize.min.js"></script>
		    <script src="/bootstrap/js/jquery.autocomplete.min.js"></script>
		    <script src="/bootstrap/js/starrr.js"></script>
			<script src="/bootstrap/js/custom.min.js"></script> -->