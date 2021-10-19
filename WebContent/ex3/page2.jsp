<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// request로 저장된 now라는 이름으로 된 정보를 빼오자
	Object obj = request.getAttribute("now");
	
	String date = null;	
	
	if(obj != null)
		date = (String)obj;
		
%>
<h1><%=date%></h1>
</body>
</html>