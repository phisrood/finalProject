<%--==============================================================
 * 학적 변동 현황 left 메뉴구성
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱      		최초생성
 *	  2016.09.02.  	박진성,조현욱      	1차 수정(조회성공)
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

<!-- Data tables -->
    <link href="/bootstrap/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/scroller.bootstrap.min.css" rel="stylesheet">
    
    
			
           
            <div class="row">
            <!-- 학적변동현황:학생 -->
              <div class="x_panel_big">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>학적변동현황</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>년도</th>
                          <th>학기</th>
                          <th>변동일자</th>
                          <th>학적상태</th>
                          <th>학적변동</th>
                          <th>변동사유</th>
                          <th>복학예정일자</th>
                          <th>취소구분</th>
                        </tr>
                      </thead>
		
  				
                     
		
                      <tbody>
                      
                  
                      		
                      		     
                       	<c:choose>
                      	     <c:when test="${empty Colleage_Register_ChangeVO}">
	                        		<td colspan="8" align="center">학적변동 자료가 없습니다.</td>
                        	</c:when>
                     
                      	
                      	<c:otherwise>
                      	
                      	<c:forEach items="${Colleage_Register_ChangeVO}" var="Colleage_Register_ChangeVO">
                        <tr>                                                         
                          <td>${Colleage_Register_ChangeVO.crc_year}</td>
                          <td>${Colleage_Register_ChangeVO.crc_cemester}</td>
                          <td>${Colleage_Register_ChangeVO.crc_changedate}</td>
                          <td>${Colleage_Register_ChangeVO.crc_colleagestatus}</td>
                          <td>${Colleage_Register_ChangeVO.crc_colleagechangestatus}</td>
                          <td>${Colleage_Register_ChangeVO.crc_changereason}</td>
                          <td>${Colleage_Register_ChangeVO.crc_returnappointdate}</td>
                          <td>${Colleage_Register_ChangeVO.crc_cancelyn}</td>
                        </tr>
                        
                       </c:forEach>
                        </c:otherwise>
                        
                         	</c:choose>	
                 	
                        
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
       
              
              </div>
       
          
    <!-- Datatables -->
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

</body>
</html>