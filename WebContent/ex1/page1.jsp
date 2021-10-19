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
	// 요청객체(request)에 "msg"리는 이름으로 저장된 객체를 얻어낸다. 
	//-세션은 사용자가 나갈때까지의 정보들을 기억하고 있지만 forward를 이용하면 사용자에게 응답하기 전 까지 정보들을 가지고 있기 때문에 서버에 적재해 두고 싶지 않기 때문에 request에 저장해둔다.
	Object obj = request.getAttribute("msg");

	String msg = null;
	
	if(obj != null)
		msg = (String)obj;
%>
	<h1><%=msg%></h1>
</body>
</html>