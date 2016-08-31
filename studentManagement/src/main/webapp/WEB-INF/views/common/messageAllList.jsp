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
 *    -------      -------     -------------------
 *    
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>


<!-- PNotify -->
<link href="/stu/css/pnotify.css" rel="stylesheet">
<link href="/stu/css/pnotify.buttons.css" rel="stylesheet">
<link href="/stu/css/pnotify.nonblock.css" rel="stylesheet">

<!-- bootstrap-wysiwyg -->
<link href="/stu/css/prettify.min.css" rel="stylesheet">
<!-- Select2 -->
<link href="/stu/css/select2.min.css" rel="stylesheet">
<!-- Switchery -->
<link href="/stu/css/switchery.min.css" rel="stylesheet">
<!-- starrr -->
<link href="/stu/css/starrr.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="/stu/css/custom.min.css" rel="stylesheet">
<script src="/common/js/notice.js"></script>
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function(){
		$('#reciveTable').DataTable();
		$('#sendTable').DataTable();
	});
</script>

<!-- 쪽지함 -->



	<div class="row">

	<!-- page content -->
	
	<div class="x_panel_big">
		<div class="x_panel">
		
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
										</tr>
									</thead>

									<tbody>
										<c:forEach var="messageAllList" items="${messageAllList }">
											<c:if test="${id eq messageAllList.mes_recive_use_id }">
												<tr>
													<td></td>
													<td>${messageAllList.mes_send_use_id }</td>
													<td>${messageAllList.mes_title }</td>
													<td>${messageAllList.mes_date }</td>
												</tr>
											</c:if>
										</c:forEach>
										<c:if test="${empty messageAllList}">
											<tr>
												<td colspan='4'><strong>받은쪽지가 없습니다.</strong></td>
											</tr>
										</c:if>
									</tbody>
								</table>
								
			                    <div class="col-md-9 col-sm-9 col-xs-12">
			                      <label class="control-label col-md-3 col-sm-3 col-xs-12"><i class="fa fa-comment"></i>받은쪽지내용</label><br/>
			                      <textarea class="resizable_textarea form-control" placeholder="쪽지라느으으으으ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅇ으ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ응"></textarea><br/>
			                    </div>
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
												<tr>
													<td></td>
													<td>${messageAllList.mes_recive_use_id }</td>
													<td>${messageAllList.mes_title }</td>
													<td>${messageAllList.mes_date }</td>
												</tr>
											</c:if>
										</c:forEach>
										<c:if test="${empty messageAllList}">
											<tr>
												<td colspan='4'><strong>보낸쪽지가 없습니다.</strong></td>
											</tr>
										</c:if>
								</tbody>
							</table>
								<div class="col-md-9 col-sm-9 col-xs-12">
			                      <label class="control-label col-md-3 col-sm-3 col-xs-12"><i class="fa fa-comment"></i>보낸쪽지내용</label><br/>
			                      <textarea class="resizable_textarea form-control" placeholder="쪽지라느으으으으ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅇ으ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ응"></textarea><br/>
			                    </div>
									<div style="text-align:right;">
										<button type="button" class="btn btn-dark">삭제</button>
				                    
				                    </div>
							  </div>
							</div>
						
						<!-- tab_content3 -->
						<div role="tabpanel" class="tab-pane fade" id="tab_content3"
							aria-labelledby="profile-tab">
							
							<!-- 쪽지쓰기 -->
							<div class="x_panel">
			                
			                  <h2>쪽지쓰기</h2>
			                  <ul class="nav navbar-right panel_toolbox">	                    
			                  </ul>
			                <div class="clearfix"></div>
			                <form class="form-horizontal form-label-left">
			                  <div class="form-group">
			                    <label class="control-label col-md-3" for="first-name">수신자 </label>
			                    <div class="col-md-7">
			                      <input type="text" id="first-name2" required="required" class="form-control col-md-7 col-xs-12">
			                    </div>
			                     <button type="button" class="btn btn-dark" onclick="javascript:OpenWindow('/common/messageUserSearchForm','600','500')" style="text-decoration:none">검색</button>
			                  </div>
			                  <div class="form-group">
			                    <label class="control-label col-md-3" for="last-name">제목 </label>
			                    <div class="col-md-7">
			                      <input type="text" id="last-name2" name="last-name" required="required" class="form-control col-md-7 col-xs-12">
			                    </div>
			                  </div>
			                </form>
		                	
		                <div class="x_content">
		                  <div id="alerts"></div>
		                  
		                  
		                  <div class="btn-toolbar editor" data-role="editor-toolbar" data-target="#editor">
		                    <div class="btn-group">
		                      <a class="btn dropdown-toggle" data-toggle="dropdown" title="Font"><i class="fa fa-font"></i><b class="caret"></b></a>
		                      <ul class="dropdown-menu">
		                      </ul>
		                    </div>
		
		                    <div class="btn-group">
		                      <a class="btn dropdown-toggle" data-toggle="dropdown" title="Font Size"><i class="fa fa-text-height"></i>&nbsp;<b class="caret"></b></a>
		                      <ul class="dropdown-menu">
		                        <li>
		                          <a data-edit="fontSize 5">
		                            <p style="font-size:17px;">Huge</p>
		                          </a>
		                        </li>
		                        <li>
		                          <a data-edit="fontSize 3">
		                            <p style="font-size:14px;">Normal</p>
		                          </a>
		                        </li>
		                        <li>
		                          <a data-edit="fontSize 1">
		                            <p style="font-size:11px;">Small</p>
		                          </a>
		                        </li>
		                      </ul>
		                    </div>
		
		                    <div class="btn-group">
		                      <a class="btn" data-edit="bold" title="Bold (Ctrl/Cmd+B)"><i class="fa fa-bold"></i></a>
		                      <a class="btn" data-edit="italic" title="Italic (Ctrl/Cmd+I)"><i class="fa fa-italic"></i></a>
		                      <a class="btn" data-edit="strikethrough" title="Strikethrough"><i class="fa fa-strikethrough"></i></a>
		                      <a class="btn" data-edit="underline" title="Underline (Ctrl/Cmd+U)"><i class="fa fa-underline"></i></a>
		                    </div>
		
		                    <div class="btn-group">
		                      <a class="btn" data-edit="insertunorderedlist" title="Bullet list"><i class="fa fa-list-ul"></i></a>
		                      <a class="btn" data-edit="insertorderedlist" title="Number list"><i class="fa fa-list-ol"></i></a>
		                      <a class="btn" data-edit="outdent" title="Reduce indent (Shift+Tab)"><i class="fa fa-dedent"></i></a>
		                      <a class="btn" data-edit="indent" title="Indent (Tab)"><i class="fa fa-indent"></i></a>
		                    </div>
		
		                    <div class="btn-group">
		                      <a class="btn" data-edit="justifyleft" title="Align Left (Ctrl/Cmd+L)"><i class="fa fa-align-left"></i></a>
		                      <a class="btn" data-edit="justifycenter" title="Center (Ctrl/Cmd+E)"><i class="fa fa-align-center"></i></a>
		                      <a class="btn" data-edit="justifyright" title="Align Right (Ctrl/Cmd+R)"><i class="fa fa-align-right"></i></a>
		                      <a class="btn" data-edit="justifyfull" title="Justify (Ctrl/Cmd+J)"><i class="fa fa-align-justify"></i></a>
		                    </div>
		
		                    <div class="btn-group">
		                      <a class="btn dropdown-toggle" data-toggle="dropdown" title="Hyperlink"><i class="fa fa-link"></i></a>
		                      <div class="dropdown-menu input-append">
		                        <input class="span2" placeholder="URL" type="text" data-edit="createLink" />
		                        <button class="btn" type="button">Add</button>
		                      </div>
		                      <a class="btn" data-edit="unlink" title="Remove Hyperlink"><i class="fa fa-cut"></i></a>
		                    </div>
		
		                    <div class="btn-group">
		                      <a class="btn" title="Insert picture (or just drag & drop)" id="pictureBtn"><i class="fa fa-picture-o"></i></a>
		                      <input type="file" data-role="magic-overlay" data-target="#pictureBtn" data-edit="insertImage" />
		                    </div>
		
		                    <div class="btn-group">
		                      <a class="btn" data-edit="undo" title="Undo (Ctrl/Cmd+Z)"><i class="fa fa-undo"></i></a>
		                      <a class="btn" data-edit="redo" title="Redo (Ctrl/Cmd+Y)"><i class="fa fa-repeat"></i></a>
		                    </div>
		                  </div>
		
		                  <div id="editor" class="editor-wrapper"></div>
		                  <br/>
		                  <div style="text-align:right;">
		                  <button type="button" class="btn btn-dark">보내기</button>
		                  </div>
		
		                </div>
		                </div>     
		            	</div>
		            	
					</div>
				</div>
				<!-- x-content -->
			</div>		
		</div>
	</div>
					<!-- /page content -->
	</div>
			
			<div id="custom_notifications" class="custom-notifications dsp_none">
				<ul class="list-unstyled notifications clearfix"
					data-tabbed_notifications="notif-group">
				</ul>
				<div class="clearfix"></div>
				<div id="notif-group" class="tabbed_notifications"></div>
			</div>

			<script src="/bootstrap/js/fastclick.js"></script>
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
			<script src="/bootstrap/js/custom.min.js"></script>