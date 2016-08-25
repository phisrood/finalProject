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
            <!-- 공지사항 -->
              <div class="x_panel_big">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>공지사항</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped table-bordered">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>제목</th>
                          <th>첨부파일</th>
                          <th>작성일</th>
                          <th>작성자</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>1</td>
                          <td><a href="javascript:OpenWindow('/common/noticeDetail','400','330')" style="text-decoration:none">공지입니다</a></td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>공지입니다</td>
                          <td>fileUpload</td>
                          <td>2016/08/13</td>
                          <td>뚜뚜</td>
                        </tr>
                      </tbody>
                    </table>
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