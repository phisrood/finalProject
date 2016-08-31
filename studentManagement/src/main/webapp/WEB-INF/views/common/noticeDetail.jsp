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

<script src="/common/js/notice.js"></script>
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
                    <form name="noticeDetailForm" class="form-horizontal form-label-left">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="text" class="form-control" name="cn_title" value="${noticeDetailVO.cn_title}" style="width:1000px;">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <textarea class="form-control" name="cn_content" style="width:1000px;height:500px;">${noticeDetailVO.cn_content}</textarea>
                        </div>
                      </div>
                 
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input type="file" class="form-control" name="cn_af_no" value="${noticeDetailVO.cn_af_no}" style="width:1000px;"
                          	<c:if test="${noticeDetailVO.cn_af_no == 0 }">첨부파일이 없습니다.</c:if>
                        			<c:if test="${noticeDetailVO.cn_af_no != 0 }">${noticeDetailVO.cn_af_no }</c:if> >
                        </div>
                      </div>
                      
                      
                      
                      <div style="text-align:right;">
		               <!--  <button type="button" class="btn btn-dark" onclick="updatePro('proUpdateForm');" >수정</button> -->
		                <button type="button" class="btn btn-dark">확인</button>
                      </div>   

                    </form>
                  </div>
                </div>
	

			<!-- /page content -->
		</div>
	