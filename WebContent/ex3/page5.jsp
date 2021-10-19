<%@page import="ex3.vo.EmpVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		width: 500px;
		border-collapse: collapse;
		
	}
	table th, table td{
		border: 1px solid black;
		padding: 4px;
	}
</style>
</head>
<body>
	<div id="wrap">
		<header>
			<h1>사원들 목록</h1>
		</header>
		<article>
			<table>
				<caption>사원목록</caption>
				<colgroup>
					<col width="50px"/>
					<col width="150px"/>
					<col width="*"/>
					<col width="100px"/>
				</colgroup>
				<thead>
					<tr>
						<th>사번</th>
						<th>이름</th>
						<th>이메일</th>
						<th>직종</th>
					</tr>
				</thead>
				<tbody>
					<%
					// 컨트롤러에서 forward로 이동되어 왔을 것으므로
					// request에 저장된 정보들 중 "ar"이라는 이름으로
					// 저장된 정보를 얻어낸다.
					Object obj = request.getAttribute("ar");
					
					EmpVO[] ar = null;
					if(obj != null){
						ar = (EmpVO[])obj;
					
						for(EmpVO vo : ar){
					%>
						<tr>
							<td><%=vo.getEmployee_id() %></td>
							<td><%=vo.getFirst_name()%></td>
							<td><%=vo.getEmail()%></td>
							<td><%=vo.getDepartment_id()%></td>
						</tr>
					<%
						}// for문의 끝
					}//if문의 끝
					%>
				</tbody>
			</table>
		</article>
	</div>
</body>
</html>