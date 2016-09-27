<%--==============================================================
 * 최초 학생 사진 등록
 * @author 박진성
 * @since  2016.09.02.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *	  2016.09.02.  	박진성                최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>



<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<script src="/common/js/student.js"></script>
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript">



function FileType() {
	
	alert('선택한 파일은'+event.srcElement.value + '입니다.');
	if(!event.srcElement.value.match(/(.jpg|.jepg|.gif|.png)/)){
		
		alert('확장자가 잘못되었습니다. (ex: gif, jpg, jepg, png)');
		
		location.reload();
		
		
	}
	
	

	
}


</script>



<meta charset="UTF-8">
<title></title>
</head>
<body>


	<center><label  class="btn btn-dark" ><h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	사진등록하기&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3></label>
	
	<form class="form-inline" action="/stu/indivInfoImageUpdateInsert" method="POST" enctype="multipart/form-data">
		<label  class="btn btn-dark" >현재파일 <input type="file" name="f" onchange="FileType()">
		<input type="submit"  class="btn btn-dark" value="변경" >
		<input type="button" class="btn btn-dark" value="닫기" onclick="parent.close();">
		</label>
	</form>
	
	
	</center>

</body>
</html>