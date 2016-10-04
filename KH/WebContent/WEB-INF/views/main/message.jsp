<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<title></title>
<script>
	function pop(m_num){
		var form = document.popForm;
		window.open('', 'new', 'left=100,top=0,width=690,height=434');
		form.action="message.do";
		form.target="new";
		form.method="post";
		form.m_num.value=m_num;
		form.submit();
	}
</script>
</head>
<body>
	<form name="popForm">
		<table>
			<tr>
				<td>번호</td>
				<td>보낸사람</td>
				<td>제 목</td>
				<td>전송일자</td>
			</tr>
			<input type="hidden" name="m_num"/>
			<c:forEach var="messageList" items="${messageList}">
			<tr>
				<td> ${messageList.m_num} </td>
				<td> ${messageList.send} </td>
				<td><a href="#" onClick="pop(${messageList.m_num})">${messageList.subject}</a></td>
				<%-- <td><a href="#" onClick="window.open('message.do', 'new', 'left=100,top=0,width=690,height=434');">${messageList.subject}</a></td>
				 --%><td> ${messageList.m_date} </td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>