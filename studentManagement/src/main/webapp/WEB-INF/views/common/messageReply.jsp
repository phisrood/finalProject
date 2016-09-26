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


<link href="/bootstrap/css/pnotify.css" rel="stylesheet">
<link href="/bootstrap/css/pnotify.buttons.css" rel="stylesheet">
<link href="/bootstrap/css/pnotify.nonblock.css" rel="stylesheet">
<link href="/bootstrap/css/prettify.min.css" rel="stylesheet">
<link href="/bootstrap/css/select2.min.css" rel="stylesheet">
<link href="/bootstrap/css/switchery.min.css" rel="stylesheet">
<link href="/bootstrap/css/starrr.css" rel="stylesheet">
<link href="/bootstrap/css/custom.min.css" rel="stylesheet">
<link href="/bootstrap/css/sweetalert.css" rel="stylesheet">
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/jquery.form.js"></script>
<script src="/bootstrap/js/sweetalert.min.js"></script>
<script src="/common/js/notice.js"></script>
<script src="/bootstrap/js/jquery.min.js"></script>
<script>
$(function(){
	$("#sendBtn").click(function(){
		var content = $("#mes_content").val();
		if(content.length > 1000){
			swal({
				title: "내용이 너무 깁니다.!",
				text: "쪽지의 내용은 최대 1000자로 제한되어있습니다.",
				type: "error",
				confirmButtonText: "닫기" 
			});
			return false;
		}
	});
});
function OntextCheck(obj)
{
    var str = new String(obj.value);
       var _byte = 0;
               if(str.length != 0)
               {
                      for (var i=0; i < str.length; i++) 
                      {
                              var str2 = str.charAt(i);
                              if(escape(str2).length > 4)
                              {
                                     _byte += 1;
                              }
                              else 
                              {
                                     _byte++;
                              }
                      }
               }
       document.getElementById("txtbyte").value = _byte;
}
</script>
	<div class="row">

	<!-- page content -->
	
	<div class="x_panel_big">
		<div class="x_panel" style="width:100%">
		
			<div class="x_title">
				<h2>
					<i class="fa fa-comment"></i> 답장하기
				</h2>
				<div class="clearfix"></div>
			</div>
			
			<div class="x_content">
					
					<div id="myTabContent" class="tab-content">
							
							<!-- 쪽지쓰기 -->
							<div class="x_panel" style="width:100%">
			                  <ul class="nav navbar-right panel_toolbox">                 
			                  </ul>
			                <div class="clearfix"></div>
			                <form action="messageReplySend" method="post">
			                	<div>
			                   	 	수 신 자 : <input type="text" readonly="readonly" required="required" style="width:78%;" value="${send }" name="mes_recive_use_id">
			                   	</div>
			                   	<br>
			                   	<div>
			                   		제 &nbsp;&nbsp;&nbsp;&nbsp;목 : <input type="text" required="required" placeholder="최대 30자" maxlength="30" style="width:78%;" name="mes_title">
			                   	</div>
			                   	<br>
			                   	 내 &nbsp;&nbsp;&nbsp;&nbsp;용 : <br>
			                   	 <textarea rows="10" cols="40" id="mes_content" onkeyUp="OntextCheck(this);" required="required" style="width:100%;" name="mes_content"></textarea>
		                  		<div style="text-align:right;">
		                  		<br>
				                    <input type="text" id="txtbyte" style="width:50px; border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px;" readonly>/1000byte
				                </div>
		                  		<div style="text-align:center;">
		                  		<br>
			                  		<input type="submit" class="btn btn-dark" value="보내기" id="sendBtn">
									<input type="button" class="btn btn-dark" value="닫기" onclick="notice_close();">
			                  	</div>
			                </form>
		                <div class="x_content">

		
		            	</div>
		            	
					</div>
				</div>
			</div>		
		</div>
	</div>
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