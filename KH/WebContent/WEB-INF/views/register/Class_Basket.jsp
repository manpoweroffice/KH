<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String cp= request.getContextPath();
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<title>수강</title>
<script src="https://code.jquery.com/jquery-3.1.0.min.js"/>
<script>
$(function(){
	var url="<%=cp%>/jun/Class_Basket.do";
	var params= "dumi"+new Date();
	
	$.ajax({
		type:"post",
		url:url,
		data:params,
		dataType:"json",
		success:function(args){
			
		},error:function(e){alert(e.responseText);}
	});
});
</script>
</head>
<body>
	<div style="width: 1200px; height: 500px; margin: auto;">
		<div style="width:1180px; float:left; text-align: right; position: relative;">미리담기</div>
		<form action="" method="post" name="search">
			<div style="width:1180px; float:left; text-align: right; position: relative;">
				<input type="text" name="serchKey" size="10">
				<input type="submit" value="검색">
			</div>
		</form>
		<from action="/KH/jun/register/classbasket.do" method="post" name="checkList">
		<table border="1" width="1180px" cellpadding="0" cellspacing="0">
			<tr height="30"">
				<td align="center" width="50">체크</td>
				<td align="center" width="130">강의코드</td>
				<td align="center" width="200">강의명</td>
				<td align="center" width="50">학점</td>
				<td align="center" width="50">시간</td>
				<td align="center" width="100">담담교수</td>
				<td align="center" width="400">강의시간</td>
				<td align="center" width="100">신청인원</td>
				<td align="center" width="100">제한인원</td>
			</tr>
		</table>
		<div style="overflow: auto; width: 1200px; height: 305px;">
			<table border="1" width="1180" cellpadding="0" cellspacing="0">
				<c:forEach var="search" items="${searchList}">
					<tr height="30">
						<td align="center" width="50"><input type="checkbox"
							name="lecture_code" value="${search.lecture_code}"></td>
						<td align="center" width="130">${search.lecture_code}</td>
						<td align="center" width="200">${search.lecture_name}</td>
						<td align="center" width="50">${search.grade}</td>
						<td align="center" width="50">${search.time}</td>
						<td align="center" width="100">${search.prof_name}</td>
						<td align="center" width="400">${search.lecture_time}</td>
						<td align="center" width="100">${search.application}</td>
						<td align="center" width="100">${search.appli_limit}</td>
					</tr>
				</c:forEach>
			</table>
		</div>

		<div style="width:1180px; float:left; text-align: right; position: relative;">
			<input type="submit" value="담기">
		</div>
		</from>
		<from>
		<table border="1" width="1180" cellpadding="0" cellspacing="0"
			align="center">
			<tr height="30"">
				<td align="center" width="50">체크</td>
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
		<div style="overflow: auto; width: 1180px; height: 300px;">
			<%-- 			<table border="1" width="1200" cellpadding="0" cellspacing="0" align="center">
				<c:forEach var="search" items="${searchList}">
					<tr height="30">
						<td align="center" width="50"><input type="checkbox" value="${search.lecture_code }"></td>
						<td align="center" width="130">${search.lecture_code }</td>
						<td align="center" width="200">${search.lecture_name }</td>
						<td align="center" width="50">${search.grade }</td>
						<td align="center" width="50">${search.time }</td>
						<td align="center" width="100">${search.prof_name }</td>
						<td align="center" width="420">${search.lecture_time }</td>
						<td align="center" width="100">${search.application }</td>
						<td align="center" width="100">${search.appli_limit }</td>
					</tr>
				</c:forEach>
			</table> --%>
		</div>

		<div style="width:1180px; float:left; text-align: right; position: relative;">
			<input type="submit" value="취소">
		</div>
		</from>
	</div>
</body>
</html>