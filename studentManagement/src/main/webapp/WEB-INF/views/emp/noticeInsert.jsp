<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 공지사항 상세보기
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

<script type="text/javascript" src="/common/js/ckeditor/js/ckeditor.js"></script>
<script>
 window.onload=function()
 {
  CKEDITOR.replace('cn_content');
 }
 
</script> 
<script>
function insertNotice(insertNoticeForm) {
	if(document.insertNoticeForm.cn_title.value==""){
		alert('제목을 입력해주세요');
		document.insertNoticeForm.cn_title.focus();
	}else{
		document.insertNoticeForm.method="post";
		document.insertNoticeForm.action="/emp/noticeInsert";
		document.insertNoticeForm.submit();
		
	}  
}
</script>
<!-- 공지상세보기 -->
	
	<div class="row">

	<!-- page content -->
	<div class="x_panel">
                  <div class="x_title">
                    <h2>공지사항</h2>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form name="insertNoticeForm" action="/common/noticeAllList" method="post" enctype="multipart/form-data" class="form-horizontal form-label-left" >

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="cn_title" style="width:1000px;">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <textarea class="form-control" name="cn_content" style="width:1000px;height:500px;"></textarea>
                        </div>
                      </div>
                 
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="file" id="noticeFileUp" class="btn btn-dark" name="file" >
                        </div>
                      </div>
                      
                      
                      
                      <div style="text-align:right;">
                  
		               <!--  <button type="button" class="btn btn-dark" onclick="updatePro('proUpdateForm');" >수정</button> -->
		                <button type="button" class="btn btn-dark" onclick="insertNotice('insertNoticeForm');">확인</button>
		                <button type="button" class="btn btn-dark" onclick="javascript:history.go(-1);">취소</button>
                      </div>   

                    </form>
                  </div>
                </div>
	

			<!-- /page content -->
		</div>
	