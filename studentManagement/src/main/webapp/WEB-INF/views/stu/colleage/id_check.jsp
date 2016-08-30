<%--==============================================================
 * 개인 정보 관리 id 확인 left 메뉴구성
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
<%@page import="com.korea.indivInfoManage.dao.IndivInfoManageDAO"%>
<%@ page contentType = "text/plain; charset=euc-kr" %>
<%@ page import = "java.util.List" %>
<%
String id = request.getParameter("id");
IndivInfoManageDAO dao;
int re = dao.checkId(id);
%>
<%=re%>

