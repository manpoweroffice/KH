<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
p {
	font-size: 10pt;
	margin: 0px;
}
</style>
<title>수강</title>
</head> 
<body>
	<div style="width: 1200px; height: 500px; margin: auto;">
		<div style="text-align: right; position: relative;">미리담기</div>
		<div style="text-align: right; position: relative;">검색창이 들어올 자리</div>
		<table border="1" width="1200" cellpadding="0" cellspacing="0"
			align="center">
			<tr height="30"">
				<td align="center" width="50"><p>체크</p></td>
				<td align="center" width="100"><p>강의코드</p></td>
				<td align="center" width="200"><p>강의명</p></td>
				<td align="center" width="50"><p>학점</p></td>
				<td align="center" width="50"><p>시간</p></td>
				<td align="center" width="100"><p>담담교수</p></td>
				<td align="center" width="450"><p>강의시간</p></td>
				<td align="center" width="100"><p>신청인원</p></td>
				<td align="center" width="100"><p>제한인원</p></td>
			</tr>

			<c:if test="${param.check != 1}">
				<tr height="30"">
					<td colspan="9">
				</tr>
			</c:if>

			<c:forEach var="lecture" items="${lecList}">
				<tr height="30">
					<td align="center" width="100">${lecture. }</td>
					<td align="center" width="100">${lecture. }</td>
					<td align="center" width="200">${lecture. }</td>
					<td align="center" width="50">${lecture. }</td>
					<td align="center" width="50">${lecture. }</td>
					<td align="center" width="100">${lecture. }</td>
					<td align="center" width="500">${lecture. }</td>
					<td align="center" width="50">${lecture. }</td>
					<td align="center" width="50">${lecture. }</td>
				</tr>
			</c:forEach>
		</table>
		<div style="text-align: right; position: relative;">신청학점 :::::
			담기</div>
		<table border="1" width="1200" cellpadding="0" cellspacing="0"
			align="center">
			<tr height="30"">
				<td align="center" width="50"><p>체크</p></td>
				<td align="center" width="100"><p>강의코드</p></td>
				<td align="center" width="200"><p>강의명</p></td>
				<td align="center" width="50"><p>학점</p></td>
				<td align="center" width="50"><p>시간</p></td>
				<td align="center" width="100"><p>담담교수</p></td>
				<td align="center" width="450"><p>강의시간</p></td>
				<td align="center" width="100"><p>신청인원</p></td>
				<td align="center" width="100"><p>제한인원</p></td>
			</tr>
			
			<c:if test="${param.check != 1}">
				<tr height="30"">
					<td colspan="9">
				</tr>
			</c:if>

			<c:forEach var="serchLec" items="${serchLec}">
				<tr height="30">
					<td align="center" width="100">${serchLec. }</td>
					<td align="center" width="100">${serchLec. }</td>
					<td align="center" width="200">${serchLec. }</td>
					<td align="center" width="50">${serchLec. }</td>
					<td align="center" width="50">${serchLec. }</td>
					<td align="center" width="100">${serchLec. }</td>
					<td align="center" width="500">${serchLec. }</td>
					<td align="center" width="50">${serchLec. }</td>
					<td align="center" width="50">${serchLec. }</td>
				</tr>
			</c:forEach>
		</table>
		<div style="text-align: right; position: relative;">취소</div>
	</div>
</body>
</html>