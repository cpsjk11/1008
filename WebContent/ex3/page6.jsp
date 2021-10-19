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
	String str = request.getParameter("search");
	
	
%>

	<div>
		<form action="Controller3" method="post">
			<select id="search" name="search">
				<option value="0">사번</option>
				<option value="1">이름</option>
				<option value="2">직종</option>
			</select>
			<input type="text" id="s_text" name="text"/>
			<input type="hidden"  name="type" value="res"/>
			<button type="submit">검색</button>
		</form>
	</div>
	<script>
		
	</script>
</body>
</html>