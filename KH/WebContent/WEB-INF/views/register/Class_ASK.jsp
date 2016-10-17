<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<script>
function lecture(){
	$("#frm").submit();
}
</script>
</head>
<body>

<div style="width: 1150px; height: 500px; margin: auto;">
		<div style="width:1130px; float:left; text-align: right; position: relative;">미리담기</div>
		<form action="/KH/jun/register/class_ask.do" method="post">
		<table border="1" width="1130px" cellpadding="0" cellspacing="0">
			<tr height="30"">
				<td align="center" width="130">강의코드</td>
				<td align="center" width="200">강의명</td>
				<td align="center" width="50">학점</td>
				<td align="center" width="50">시간</td>
				<td align="center" width="100">담담교수</td>
				<td align="center" width="420">강의시간</td>
				<td align="center" width="100">신청인원</td>
				<td align="center" width="100">제한인원</td>
			</tr>
		</table>
		<div style="overflow: auto; width: 1200px; height: 305px;">
			<table id="frm" border="1" width="1180" cellpadding="0" cellspacing="0">
			<c:forEach var="lecture" items="${lectlist}">
				<tr>
					<td><input type="hidden" name="${lecture.lecture_code}" value="${lecture.lecture_code}">
					<input type="hidden" name="stu_num" value="${stu_num}">
					<input type="hidden" name="stu_name" value="${stu_name}">
					${lecture.lecture_code}</td>
					<td><input type="hidden" name="${lecture.lecture_name}" value="${lecture.lecture_name}">${lecture.lecture_name}</td>
					<td>${lecture.grade}</td>
					<td>${lecture.time}</td>
					<td>${lecture.prof_name}</td>
					<td>${lecture.lecture_time}</td>
					<td>${lecture.application}</td>
					<td>${lecture.appli_limit}</td>
				</tr>
			</c:forEach>
			</table>
		</div>

		<div style="width:1180px; float:left; text-align: right; position: relative;">
			<input type="submit" value="수강신청" onclick="lecture()">
		</div>
		</form>

</body>
</html>