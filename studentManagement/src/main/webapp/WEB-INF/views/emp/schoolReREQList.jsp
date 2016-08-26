<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


    
    <!-- 휴복학 신청 명단 -->
			
           
            <div class="row">
            
              <div class="x_panel_big">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>휴/복학신청명단</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>순번</th>
                          <th>성명</th>
                          <th>학년</th>
                          <th>학번</th>
                          <th>전화번호</th>
                          <th>학과</th>
                          <td>구분</td>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>1</td>
                          <td>이수정</td>
                          <td>4</td>
                          <td>20122750</td>
                          <td>010-1234-5678</td>
                          <td>정보통신공학과</td>
                          <td>일반휴학</td>
                        </tr>
                        <tr>
                          <td>2</td>
                          <td>한돈희</td>
                          <td>4</td>
                          <td>20121234</td>
                          <td>010-1234-5678</td>
                          <td>정보통신공학과</td>
                          <td>군휴학</td>
                        </tr>
                        <tr>
                          <td>3</td>
                          <td>김양문</td>
                          <td>4</td>
                          <td>20124567</td>
                          <td>010-1234-5678</td>
                          <td>정보통신공학과</td>
                          <td>군휴학</td>
                        </tr>
                        <tr>
                          <td>4</td>
                          <td>이건원</td>
                          <td>4</td>
                          <td>20124565</td>
                          <td>010-1234-5678</td>
                          <td>정보통신공학과</td>
                          <td>군휴학</td>
                        </tr>
                        <tr>
                          <td>5</td>
                          <td>박진성</td>
                          <td>4</td>
                          <td>20121569</td>
                          <td>010-1234-5678</td>
                          <td>정보통신공학과</td>
                          <td>군휴학</td>
                        </tr>
                        <tr>
                          <td>6</td>
                          <td>조현욱</td>
                          <td>4</td>
                          <td>20124550</td>
                          <td>010-1234-5678</td>
                          <td>정보통신공학과</td>
                          <td>군휴학</td>
                        </tr>
                       
                        
                      </tbody>
                    </table>
                  </div>
                </div>
                <!-- 학생누르면 해당학생 휴/복학 신청서 나타남 -->
                 <div class="x_panel">
                  <div class="x_title">
                    <h2>상세내역</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>이름</th>
                          <th>학년</th>
                          <th>학번</th>
                          <th>연락처</th>
                          <th>학과</th>
                          <th>신청구분</th>
                        </tr>
                      </thead>
                       <tbody>
                        <tr>
                          <td>1</td>
                          <td>이수정</td>
                          <td>4</td>
                          <td>20122750</td>
                          <td>010-1234-5678</td>
                          <td>정보통신공학과</td>
                          <td>일반휴학</td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>신청일자</th>
                          <th>휴/복학예정일자</th>
                          <th>휴학종료예정일</th>
                        </tr>
                      </thead>
                       <tbody>
                        <tr>
                          <td>2012/08/27</td>
                          <td>2013/03/02</td>
                          <td>2013/02/25</td>    
                        </tr>
                      </tbody>
                    </table>
                  </div>
                  
                   <div class="col-md-9 col-sm-9 col-xs-12">
			                      <label class="control-label col-md-3 col-sm-3 col-xs-12"><i class="fa fa-comment"></i>신청사유</label><br/>
			                      <textarea class="resizable_textarea form-control" placeholder="개인적인 이유야"></textarea><br/>
			                      <div style="text-align:right;">
									<button type="button" class="btn btn-dark" >승인</button>
									<button type="button" class="btn btn-dark">반려</button>
									</div>
			       </div>
                  
                  
                </div>
                
                
              </div>
      
              </div>
       
   