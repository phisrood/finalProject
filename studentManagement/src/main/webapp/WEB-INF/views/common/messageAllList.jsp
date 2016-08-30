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
					
					<!-- tab_content1 -->
						<div role="tabpanel" class="tab-pane fade active in"
							id="tab_content1" aria-labelledby="home-tab">
							<div class="x_content">
							<div style="text-align:right;">
                    
		                          <select style="width:100px; height:30px;">
		                            <option>전체</option>
		                            <option>발신자</option>
		                            <option>내용</option>
		                            <option>수신일</option>
		                          </select>
		                     <input type="text" style="width:200px; height:30px;">
			                <button type="button" class="btn btn-dark">검색</button>
                      
                    		 </div>   
				              
								<table id="datatable"
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
										<tr>
											<td><input type="checkbox" id="check-all" class=iCheck-helper></td>
											<td>수덩이</td>
											<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
											<td>2016/08/13</td>
										</tr>
										<tr>
											<td><input type="checkbox" id="check-all"></td>
											<td>수덩이</td>
											<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
											<td>2016/08/13</td>
										</tr>
										<tr>
											<td><input type="checkbox" id="check-all"></td>
											<td>수덩이</td>
											<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
											<td>2016/08/13</td>
										</tr>
										<tr>
											<td><input type="checkbox" id="check-all"></td>
											<td>수덩이</td>
											<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
											<td>2016/08/13</td>
										</tr>
										<tr>
											<td><input type="checkbox" id="check-all"></td>
											<td>수덩이</td>
											<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
											<td>2016/08/13</td>
										</tr>
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
							
							<!-- tab_content2 -->
						<div role="tabpanel" class="tab-pane fade" 
									id="tab_content2" aria-labelledby="profile-tab">
							<div class="x_content">
							 <div style="text-align:right;">
                    
		                          <select style="width:100px; height:30px;">
		                            <option>전체</option>
		                            <option>수신자</option>
		                            <option>내용</option>
		                            <option>수신일</option>
		                          </select>
		                     <input type="text" style="width:200px; height:30px;">
			                <button type="button" class="btn btn-dark">검색</button>
                      
                    		 </div>   
				              
							<table id="datatable" class="table table-striped jambo_table bulk_action">
								<thead>
									<tr>
										<th>삭제</th>
										<th>수신자</th>
										<th>제목</th>
										<th>수신일</th>
									</tr>
								</thead>


								<tbody>
									<tr>
										<td><input type="checkbox" id="check-all"></td>
										<td>수덩이</td>
										<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
										<td>2016/08/13</td>
									</tr>
									<tr>
										<td><input type="checkbox" id="check-all"></td>
										<td>수덩이</td>
										<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
										<td>2016/08/13</td>
									</tr>
									<tr>
										<td><input type="checkbox" id="check-all"></td>
										<td>수덩이</td>
										<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
										<td>2016/08/13</td>
									</tr>
									<tr>
										<td><input type="checkbox" id="check-all"></td>
										<td>수덩이</td>
										<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
										<td>2016/08/13</td>
									</tr>
									<tr>
										<td><input type="checkbox" id="check-all"></td>
										<td>수덩이</td>
										<td>쪽~~~~~~~~~지~~~~~~~~~~~~왔다</td>
										<td>2016/08/13</td>
									</tr>
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

			<!-- jQuery -->
			<script src="/stu/js/jquery.min.js"></script>
			<!-- Bootstrap -->
			<script src="/stu/js/bootstrap.min.js"></script>
			<!-- FastClick -->
			<script src="/stu/js/fastclick.js"></script>
			<!-- NProgress -->
			<script src="/stu/js/nprogress.js"></script>
			<!-- iCheck -->
			<script src="/stu/js/icheck.min.js"></script>
			<!-- bootstrap-progressbar -->
			<script src="/stu/js/bootstrap-progressbar.min.js"></script>
			<!-- PNotify -->
			<script src="/stu/js/pnotify.js"></script>
			<script src="/stu/js/pnotify.buttons.js"></script>
			<script src="/stu/js/pnotify.nonblock.js"></script>
			
			<!-- bootstrap-wysiwyg -->
		    <script src="/stu/js/bootstrap-wysiwyg.min.js"></script>
		    <script src="/stu/js/jquery.hotkeys.js"></script>
		    <script src="/stu/js/prettify.js"></script>
		    <!-- jQuery Tags Input -->
		    <script src="/stu/js/jquery.tagsinput.js"></script>
		    <!-- Switchery -->
		    <script src="/stu/js/switchery.min.js"></script>
		    <!-- Select2 -->
		    <script src="/stu/js/select2.full.min.js"></script>
		    <!-- Parsley -->
		    <script src="/stu/js/parsley.min.js"></script>
		    <!-- Autosize -->
		    <script src="/stu/js/autosize.min.js"></script>
		    <!-- jQuery autocomplete -->
		    <script src="/stu/js/jquery.autocomplete.min.js"></script>
		    <!-- starrr -->
		    <script src="/stu/js/starrr.js"></script>
			

			<!-- Custom Theme Scripts -->
			<script src="/stu/js/custom.min.js"></script>