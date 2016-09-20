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

	
    
    <div class="row">
    	<!-- 학습 자료실 게시판 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>학습 자료실</h2></div>
			</div>
			<div style="float: left; width: 71%;"></div>
			
			<div style="float: left; width: 100%;"><br></div>
            <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th style="width:7%;">NO</th>
                          <th style="width:50%;">제목</th>
                          <th style="width:20%;">첨부파일</th>
                          <th style="width:15%;">작성일</th>
                          <th style="width:8%;">작성자</th>
                         
                        </tr>
                      </thead>


                      <tbody>
                        <c:choose>
                      	<c:when test="${empty studyBBSList}">
                      		<tr>
								<td colspan='5'>
									학습자료가 없습니다.
								</td>                      		
                      		</tr>
                      	</c:when>
                      	<c:otherwise>
                        	<c:forEach var="studyBBSList" items="${studyBBSList }" varStatus="status">
                        		<tr height="30" >
                        			<td>${status.count }</td>
                        			<td>
                        			<c:choose>
				                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
				                       		<a href="/cyberCampus/stu/studyBBSDetail?lr_no=${studyBBSList.lr_no}">${studyBBSList.lr_title }</a>
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
				                       		<a href="/cyberCampus/pro/studyBBSDetail?lr_no=${studyBBSList.lr_no}">${studyBBSList.lr_title }</a>
				                    	</c:when>
				                    </c:choose>
                        			</td>
                        			<td>
				                       		<c:if test="${studyBBSList.lr_af_no == 0 }">-</c:if>
                        					<c:if test="${studyBBSList.lr_af_no != 0 }"><a href="/cyberCampus/common/studyBBSFileDown?af_aftername=${studyBBSList.af_aftername}"> ${studyBBSList.af_realname } </a></c:if>
				                    </td>
                        			
                        			<td>${studyBBSList.lr_date }</td>
                        			
                        			<td>
                        			<c:choose>
				                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
				                       		${studyBBSList.lr_pro_use_id }
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
				                       		${studyBBSList.lr_pro_use_id }
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
	                    		<a href="/cyberCampus/pro/studyBBSInsertForm">
									<button type="button" class="btn btn-dark">등록</button>
								</a>
	                    	</c:when>
	                    	<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
	                    	</c:when>
	                    </c:choose>
						
					</div>
			<div style="float: right; width: 95%;"><br></div>
    </div>
