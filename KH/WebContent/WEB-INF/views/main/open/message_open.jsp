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
				<td>보낸사람</td>
				<td>내 용</td>
				<td>전송일자</td>
			</tr>
			<tr>
				<td> ${message} </td>
				<td> ${message.send} </td>
				<td> ${message.content} </td>
				<td> ${message.m_date} </td>
			</tr>
		</table>
	</form>
</body>
</html>