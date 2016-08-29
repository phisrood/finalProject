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

  

        <!-- page content -->
   

            <div class="clearfix"></div>

            <div class="row">
              <!-- bar chart -->
             
                <div class="x_panel">
                  <div class="x_title">
                    <h2>수업평가통계</h2>
                    
                    <div class="clearfix"></div>
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">년도</label>
                    
                      <select class="form-control">
                        <option>2016</option>
                        <option>2015</option>
                        <option>2014</option>
                        <option>2013</option>
                        <option>2012</option>
                      </select>
                   
                   
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">학기</label>
                    
                      <select class="form-control">
                        <option>1학기</option>
                        <option>2학기</option>
                      </select>
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">교과목</label>
                    
                      <select class="form-control">
                        <option>1학기</option>
                        <option>2학기</option>
                      </select>
                  </div>
                  <div class="x_content">
                    <div id="graph_bar" style="width:100%; height:280px;"></div>
                  </div>
                </div>
              </div>
              <!-- /bar charts -->


       
            </div>
         
      
        <!-- /page content -->

     
    <script src="/bootstrap/js/raphael.min.js"></script>
    <script src="/bootstrap/js/morris.min.js"></script>

    <!-- morris.js -->
    <script>
      $(document).ready(function() {
        Morris.Bar({
          element: 'graph_bar',
          data: [
            {device: '1번 문항', geekbench: 380},
            {device: '2번 문항', geekbench: 655},
            {device: '3번 문항', geekbench: 275},
            {device: '4번 문항', geekbench: 1571},
            {device: '5번 문항', geekbench: 655},
            {device: '6번 문항', geekbench: 2154},
            {device: '7번 문항', geekbench: 1144},
            {device: '8번 문항', geekbench: 2371},
            {device: '9번 문항', geekbench: 1371},
            {device: '10번 문항', geekbench: 1471}
          ],
          xkey: 'device',
          ykeys: ['geekbench'],
          labels: ['Geekbench'],
          barRatio: 5.0,
          barColors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
          xLabelAngle: 35,
          hideHover: 'auto',
          resize: true
        });

      

        $MENU_TOGGLE.on('click', function() {
          $(window).resize();
        });
      });
    </script>
   
