<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<title></title>
</head>
<body>
	<form method="POST">
		<table>
			<tr>
				<td>번호</td>
				<td>받은 사람</td>
				<td>제 목</td>
				<td>전송일자</td>
				<td>수신여부</td>
			</tr>
			<c:forEach var="messageList" items="${messageList}">
			<tr>
				<td> ${messageList} </td>
				<td> ${messageList.receive} </td>
				<td> ${messageList.subject} </td>
				<td> ${messageList.m_date} </td>
				<td> ${messageList.r_check} </td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>