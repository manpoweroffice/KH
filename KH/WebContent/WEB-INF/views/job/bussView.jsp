<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>게시판 보기</title>
</head>
<body>
<div id="detail">
<p>회사명 : ${bussVo.bussnm} &nbsp;  자격요건 : ${bussVo.cer}</p>
<p>관련직종 : ${bussVo.rel} &nbsp; 연봉 : ${bussVo.sal} &nbsp; 등록일 : <fmt:formatDate value="${bussVo.reg_date}" pattern="yyyy년 MM월 dd일"/> </p>
내용
<div style="width:766px; height:412px; border:1px solid;">${bussVo.content}</div>
</div>
</body>
</html>