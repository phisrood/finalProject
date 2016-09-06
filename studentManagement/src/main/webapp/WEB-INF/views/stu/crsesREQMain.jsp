<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

         <div class="row" style="width: 100%; height: 900px;">  

            <!-- page content 1 -->
            <div class="x_content" style="height: 45%;">
               
                  <legend align="left">수강신청가능 목록 리스트</legend>
                  

                  <table id="datatable" class="table table-striped jambo_table bulk_action">
                     <thead>
                        <tr>
                           <th>과목명</th>
                           <th>학수번호</th>
                           <th>수업시간</th>
                           <th>강의실</th>
                           <th>교수명</th>
                           <th>수강점수</th>
                           <th>학점</th>
                           <th>이수구분</th>
                           <th>수강신청</th>
                           <th>강의계획서보기</th>
                        </tr>
                     </thead>

                     <tbody>
                        <tr>
                           <td>JAVA</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3.0</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="신청"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                        <tr>
                           <td>SPRING</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3.0</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="신청"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                     
                     </tbody>
                  </table>
               </div>
            <!-- page content 2 -->
            <div class="x_content" style="height: 45%;">
               
                  <legend align="left">수강신청가능 목록 리스트</legend>
                  

                  <table id="datatable" class="table table-striped jambo_table bulk_action">
                     <thead>
                        <tr>
                           <th>과목명</th>
                           <th>학수번호</th>
                           <th>수업시간</th>
                           <th>강의실</th>
                           <th>교수명</th>
                           <th>수강점수</th>
                           <th>학점</th>
                           <th>이수구분</th>
                           <th>수강신청</th>
                           <th>강의계획서보기</th>
                        </tr>
                     </thead>

                     <tbody>
                        <tr>
                           <td>JAVA</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3.0</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="신청"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                        <tr>
                           <td>SPRING</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3.0</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="신청"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                     
                     </tbody>
                  </table>
               </div>
               
         </div>
      <!-- /page content -->
