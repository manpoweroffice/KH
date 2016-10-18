<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script>
  $.datepicker.setDefaults({
    dateFormat: 'yy-mm-dd',
    prevText: '이전 달',
    nextText: '다음 달',
    monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
    monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
    dayNames: ['일', '월', '화', '수', '목', '금', '토'],
    dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
    dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
    showMonthAfterYear: true,
    yearSuffix: '년'
  });

  $(function() {
    $("#start, #end").datepicker();
    dateFormat: 'yy-mm-dd'
  });
</script>
</head>
<body>
<script>

</script>
<form:form action="/KH/jun/job/dtlschedule.do">
<table>
<tr><td>
회사명 : <input type="text" name="title" value="${schedule.title}">
</td></tr>
<tr><td>
공고 내용 </td>
</tr>
<tr>
<td>
<textarea name="content" cols="70" rows="30">${schedule.content}</textarea>
</td></tr>
<tr>
<td>모집날짜 <input type="text" id="start"name="startevent" value="${schedule.startevent}"> ~ <input type="text" id="end"name="endevent" value="${schedule.endevent}"></td>
</tr>
</table>
<div align="center">
<input type="submit" value="수정">
<input type="button" value="삭제" onclick="location.href='/KH/jun/job/deleteSchedule.do?title=${schedule.title}'">
<input type="button" value="닫기" onclick="window.close()">
</div>
</form:form>
</body>
</html>