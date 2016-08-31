<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 공통메인
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    2016-08-31 한돈희       사용자 분기
 	  2016-08-31 한돈희	  미리보기기능
 *    
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>

	<!-- Data tables -->
    <link href="/bootstrap/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/scroller.bootstrap.min.css" rel="stylesheet">
    
    
    <script src="/common/js/notice.js"></script>
	<script> 
		//------- 미리보기 관련 div 처리----------- 
		function setPreviewBox(e) { 
		var e = e || window.event; 
		    document.getElementById('preview').style.left =	e.clientX + document.body.scrollLeft + 20 + 'px';  // 마우스 
		    document.getElementById('preview').style.top = e.clientY + document.body.scrollTop + 'px';  // 포인트에 위치 
		} 
		  
		function showPreview(content) { 
		    var text = ""; 
		        text = '<table cellpadding="5" bgcolor="#ffffff" style="font-size:10pt;color:#005F8B;filter:alpha(opacity=90); border-width:1; border-color:#3291BD; border-style:solid; background-color:white;">'; 
		        text += "<tr style='text-align:center;'><td><strong>미리보기<strong><br>" + content + "</td></tr></table>"; 
		        document.getElementById('preview').innerHTML = text; 
		        document.getElementById('preview').style.visibility = 'visible';  
		} 
		  
		function hidePreview() { 
		    document.getElementById('preview').innerHTML = ''; 
		    document.getElementById('preview').style.visibility = 'hidden'; 
		} 
		
	</script>
            <div class="row">
            <!-- 공지사항 -->
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>공지사항</h2>
                    <ul class="nav navbar-right panel_toolbox">
                    <c:choose>
                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
                       		<li><a href="/stu/noticeAllList">더보기+</a></li>
                    	</c:when>
                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
                       		<li><a href="/pro/noticeAllList">더보기+</a></li>
                    	</c:when>
                    	<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
                       		<li><a href="/emp/noticeAllList">더보기+</a></li>
                    	</c:when>
                    </c:choose>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>제목</th>
                          <th>첨부파일</th>
                          <th>작성일</th>
                        </tr>
                      </thead>


                      <tbody>
                        <c:choose>
                      	<c:when test="${empty noticeNewList}">
                      		<tr>
								<td colspan='5'>
									공지사항이 없습니다.
								</td>                      		
                      		</tr>
                      	</c:when>
                      	<c:otherwise>
                        	<c:forEach var="noticeNewList" items="${noticeNewList }" varStatus="status">
                        		<tr height="30" onMouseMove="setPreviewBox(event);" onMouseOver="showPreview('${noticeNewList.cn_content}'); return true;" onMouseOut="hidePreview(); return true;" onClick="">
                        			<td>${status.count }</td>
                        			<td>
                        			<c:choose>
				                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
				                       		<a href="/stu/noticeDetail?cn_no=${noticeNewList.cn_no}">${noticeNewList.cn_title }</a>
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
				                       		<a href="/pro/noticeDetail?cn_no=${noticeNewList.cn_no}">${noticeNewList.cn_title }</a>
				                    	</c:when>
				                    	<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
				                       		<a href="/emp/noticeDetail?cn_no=${noticeNewList.cn_no}">${noticeNewList.cn_title }</a>
				                    	</c:when>
				                    </c:choose></td>
                        			<c:if test="${noticeNewList.cn_af_no == 0 }"><td>첨부파일이 없습니다.</td></c:if>
                        			<c:if test="${noticeNewList.cn_af_no != 0 }"><td>${noticeNewList.cn_af_no }</td></c:if>
                        			<td>${noticeNewList.cn_date }</td>
                        		</tr>
                        	</c:forEach>
                        </c:otherwise>
                     </c:choose>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
              
              <!-- 쪽지함 -->
                <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>쪽지함</h2>
                    <ul class="nav navbar-right panel_toolbox">
                     <c:choose>
                    	<c:when test="${loginUser.authority eq 'ROLE_STU' }">
                       		<li><a href="/stu/messageAllList">더보기+</a></li>
                    	</c:when>
                    	<c:when test="${loginUser.authority eq 'ROLE_PRO' }">
                       		<li><a href="/pro/messageAllList">더보기+</a></li>
                    	</c:when>
                    	<c:when test="${loginUser.authority eq 'ROLE_EMP' }">
                       		<li><a href="/emp/messageAllList">더보기+</a></li>
                    	</c:when>
                    </c:choose>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                   
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>수신</th>
                          <th>발신</th>
                          <th>제목</th>
                          <th>수신일</th>
                        </tr>
                      </thead>


                      <tbody>
                      <c:choose>
                      	<c:when test="${empty messageNewList}">
                      		<tr>
								<td colspan='4'>
									읽지않은 메시지가 없습니다.
								</td>                      		
                      		</tr>
                      	</c:when>
                      	<c:otherwise>
                        	<c:forEach var="messageNewList" items="${messageNewList }" varStatus="status">
                        		<tr height="30" onMouseMove="setPreviewBox(event);" onMouseOver="showPreview('${messageNewList.mes_content}'); return true;" onMouseOut="hidePreview(); return true;" onClick="">
                        			<td>${status.count }</td>
                        			<td>
                        			<c:if test="${messageNewList.mes_readyn == 'n' }">
                        			읽지않음
                        			</c:if>
                        			</td>
                        			<td>${messageNewList.mes_send_use_id }</td>
                        			<td><a href="#">${messageNewList.mes_title }</a></td>
                        			<td>${messageNewList.mes_date }</td>
                        		</tr>
                        	</c:forEach>
                        </c:otherwise>
                     </c:choose>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
              	<div id='preview' STYLE="BORDER-RIGHT: 1px; BORDER-TOP: 1px; Z-INDEX: 1; VISIBILITY: hidden; BORDER-LEFT: 1px; BORDER-BOTTOM: 1px; POSITION: absolute;"></div> 
              </div>
       
     	    <!-- 부트스트랩js -->
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
    <script src="/bootstrap/js/dataTables.scroller.min.js"></script>
    <script src="/bootstrap/js/jszip.min.js"></script>
    <script src="/bootstrap/js/vfs_fonts.js"></script>     
