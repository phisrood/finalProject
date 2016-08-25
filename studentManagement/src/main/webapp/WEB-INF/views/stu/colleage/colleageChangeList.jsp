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
                    
                    <table id="datatable" class="table table-striped table-bordered">
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
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>2012/03/02</td>
                          <td>재학</td>
                          <td>재학</td>
                          <td>입학</td>
                          <td></td>
                          <td>없음</td>
                        </tr>
                        <tr>
                          <td>2013</td>
                          <td>1</td>
                          <td>2012/03/02</td>
                          <td>재학</td>
                          <td>휴학</td>
                          <td>일반휴학</td>
                          <td>2013/08/31</td>
                          <td>없음</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>2012/03/02</td>
                          <td>재학</td>
                          <td>재학</td>
                          <td>입학</td>
                          <td></td>
                          <td>없음</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>2012/03/02</td>
                          <td>재학</td>
                          <td>재학</td>
                          <td>입학</td>
                          <td></td>
                          <td>없음</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>2012/03/02</td>
                          <td>재학</td>
                          <td>재학</td>
                          <td>입학</td>
                          <td></td>
                          <td>없음</td>
                        </tr>
                        
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