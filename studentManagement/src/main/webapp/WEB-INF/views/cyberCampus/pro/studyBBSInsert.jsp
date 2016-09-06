<%--==============================================================
 * 사이버 캠퍼스 자유 게시판 left 메뉴구성
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
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


 <script>
function insertStudyBBS(insertStudyBBSForm) {
	if(document.insertStudyBBSForm.lr_title.value==""){
		alert('제목을 입력해주세요');
		document.insertStudyBBSForm.lr_title.focus();
	}else if(document.insertStudyBBSForm.lr_content.value==""){
		alert('내용을 입력해주세요');
		document.insertStudyBBSForm.lr_content.focus();
	}else{
		document.insertStudyBBSForm.method="post";
		document.insertStudyBBSForm.action="/cyberCampus/pro/studyBBSInsert";
		document.insertStudyBBSForm.submit();
		
	}  
}
</script>   
    <div class="row">
    	<!-- 학습 자료실 게시물 등록 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 250px; text-align: center;"><h2>학습 자료실 ( 등록 )</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			<div class="x_panel_big">
				<form name="insertStudyBBSForm" action="cyberCampus/common/studyBBSList" method="post" enctype="multipart/form-data" class="form-horizontal form-label-left" >

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="lr_title" style="width:1000px;">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <textarea class="form-control" name="lr_content" style="width:1000px;height:500px;"></textarea>
                        </div>
                      </div>
                 
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="file" id="studyBBSFileUp" class="btn btn-dark" name="file" >
                        </div>
                      </div>
                      
                      
                      
                      <div style="text-align:right;">
                  
		                <button type="button" class="btn btn-dark" onclick="insertStudyBBS('insertStudyBBSForm');">확인</button>
		                <button type="button" class="btn btn-dark" onclick="javascript:history.go(-1);">취소</button>
                      </div>   

                    </form>
			</div>
			
    </div>
   