<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 공지사항 리스트
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *    2016.08.30.  	이수정      		최초생성
 *    2016.09.1.  	이수정      		공지사항전체리스트
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>

	<!-- Data tables -->
    <link href="/bootstrap/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/scroller.bootstrap.min.css" rel="stylesheet">
    
    
			
           
            <div class="row">
            <!-- 공지사항 -->
              <div class="x_panel_big">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>공지사항</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th style="width:7%;">NO</th>
                          <th style="width:50%;">제목</th>
                          <th style="width:20%;">첨부파일</th>
                          <th style="width:15%;">작성일</th>
                          <th style="width:8%;"><c:choose>
				                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
				                       		작성자
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
				                       		작성자
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
				                       	
				                    	</c:when>
				                    </c:choose></th>
                        </tr>
                      </thead>


                      <tbody>
                        <c:choose>
                      	<c:when test="${empty noticeAllList}">
                      		<tr>
								<td colspan='5'>
									공지사항이 없습니다.
								</td>                      		
                      		</tr>
                      	</c:when>
                      	<c:otherwise>
                        	<c:forEach var="noticeAllList" items="${noticeAllList }" varStatus="status">
                        		<tr height="30" onMouseMove="setPreviewBox(event);"  onClick="">
                        			<td>${status.count }</td>
                        			<td>
                        			<c:choose>
				                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
				                       		<a href="/stu/noticeDetail?cn_no=${noticeAllList.cn_no}">${noticeAllList.cn_title }</a>
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
				                       		<a href="/pro/noticeDetail?cn_no=${noticeAllList.cn_no}">${noticeAllList.cn_title }</a>
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
				                       		<a href="/emp/noticeDetail?cn_no=${noticeAllList.cn_no}">${noticeAllList.cn_title }</a>
				                    	</c:when>
				                    </c:choose>
                        			</td>
                        			<td>
                        			<c:choose>
				                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
				                       		<c:if test="${noticeAllList.cn_af_no == 0 }">-</c:if>
                        					<c:if test="${noticeAllList.cn_af_no != 0 }"><a href="/stu/noticeFileDown?af_aftername=${noticeAllList.af_aftername}"> ${noticeAllList.af_realname } </a></c:if>
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
				                       		<c:if test="${noticeAllList.cn_af_no == 0 }">-</c:if>
                        					<c:if test="${noticeAllList.cn_af_no != 0 }"><a href="/pro/noticeFileDown?af_aftername=${noticeAllList.af_aftername}"> ${noticeAllList.af_realname } </a></c:if>
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
				                       		<c:if test="${noticeAllList.cn_af_no == 0 }">-</c:if>
                        					<c:if test="${noticeAllList.cn_af_no != 0 }"><a href="/emp/noticeFileDown?af_aftername=${noticeAllList.af_aftername}"> ${noticeAllList.af_realname } </a></c:if>
				                    	</c:when>
				                    </c:choose>
				                    </td>
                        			
                        			<td>${noticeAllList.cn_date }</td>
                        			
                        			<td>
                        			<c:choose>
				                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
				                       		${noticeAllList.cn_sp_use_id }
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
				                       		${noticeAllList.cn_sp_use_id }
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
				                    	</c:when>
				                    </c:choose>
                        			</td>
                        		</tr>
                        	</c:forEach>
                        </c:otherwise>
                     </c:choose>
                      </tbody>
                    </table>
                  </div>
                  	<div style="text-align: right;">
                  		<c:choose>
	                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
	                    	</c:when>
	                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
	                    	</c:when>
	                    	<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
	                       		<a href="/emp/noticeInsertForm">
									<button type="button" class="btn btn-dark">등록</button>
								</a>
	                    	</c:when>
	                    </c:choose>
						
					</div>
                </div>
              </div>
       
              
              </div>
       
    <!-- 추가 -->
    <script src="/common/js/notice.js"></script>
    <!-- 부트스트랩 js -->
    <script src="/bootstrap/js/jquery.dataTables.min.js"></script>
    <script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
    <script src="/bootstrap/js/dataTables.buttons.min.js"></script>
    <script src="/bootstrap/js/buttons.bootstrap.min.js"></script>
    <script src="/bootstrap/js/buttons.flash.min.js"></script>
    <script src="/bootstrap/js/buttons.html5.min.js"></script>
    <script src="/bootstrap/js/buttons.print.min.js"></script>
    <script src="/bootstrap/js/dataTables.fixedHeader.min.js"></script>
    <script src="/bootstrap/js/dataTables.keyTable.min.js"></script>
    <script src="/bootstrap/js/dataTables.responsive.min.js"></script>
    <script src="/bootstrap/js/responsive.bootstrap.js"></script>
    <script src="/bootstrap/js/datatables.scroller.min.js"></script>
    <script src="/bootstrap/js/jszip.min.js"></script>
    <script src="/bootstrap/js/pdfmake.min.js"></script>
    <script src="/bootstrap/js/vfs_fonts.js"></script>