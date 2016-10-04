<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%--   <table width="600" border="0" cellspacing="0" cellpadding="0">
    <tr align="center">
      <td>
      <form name="sel_date_form" action="book_control.jsp" method="post">
          <input type="hidden" name="mode" value="change_info" />
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr align="center">
              <td width="80">
                <select name="year" class="input2" onChange="submit();">
                  <c:forEach var="i" begin="2007" end="2010">
		              <c:choose>
		                <c:when test="${i == year}">
		                  <c:set var="sel" value="selected" />
		                </c:when>
		                <c:otherwise>
		                  <c:set var="sel" value="" />
		                </c:otherwise>
		              </c:choose>                  
                    <option value="${i}" ${sel}>${i}</option>
                  </c:forEach>
                </select>
              </td>
              <td>년</td>
              <td width="40">
              	<select name="month" class="input2" onChange="submit();">
                  <c:forEach var="i" items="${month_list}">
		              <c:choose>
		                <c:when test="${i == month}">
		                  <c:set var="sel" value="selected" />
		                </c:when>
		                <c:otherwise>
		                  <c:set var="sel" value="" />
		                </c:otherwise>
		              </c:choose>                  
                    <option value="${i}" ${sel}>${i}</option>
                  </c:forEach>
                </select>
              </td>
              <td>월</td>
              <td width="40">
              	<select name="day" class="input2" onChange="submit();">
                  <c:forEach var="i"items="${day_list}">
		              <c:choose>
		                <c:when test="${i == day}">
		                  <c:set var="sel" value="selected" />
		                </c:when>
		                <c:otherwise>
		                  <c:set var="sel" value="" />
		                </c:otherwise>
		              </c:choose>                  
                    <option value="${i}" ${sel}>${i}</option>

                  </c:forEach>
                </select>
              </td>
            </tr>
          </table>
        </form></td>
      <td>일</td>
      <td width="217">&nbsp;</td>
      <td width="41">과목 :</td>
      <td width="133">
      	<form name="sel_book_form" action="book_control.jsp" method="post">
          <input type="hidden" name="mode" value="change_info" />
          <input type="hidden" name="year" value="${year}" />          
          <input type="hidden" name="month" value="${month}" />
          <input type="hidden" name="day" value="${day}" />
          <select name="book_id" class="input2" onChange="submit();">
            <c:forEach var="list" items="${book_list}">
              <c:choose>
                <c:when test="${bookid == list.book_id}">
                  <c:set var="sel" value="selected" />
                </c:when>
                <c:otherwise>
                  <c:set var="sel" value="" />
                </c:otherwise>
              </c:choose>
              <option value="${list.book_id}" ${sel}>${list.book_title}</option>
            </c:forEach>
          </select>
        </form></td>
    </tr>
  </table> --%>
  <br>
<form name="attendant_form" action="book_control.jsp" method="post">  
 <input type="hidden" name="mode" value="attendant" />
 <input type="hidden" name="year" value="${year}" />          
 <input type="hidden" name="month" value="${month}" />
 <input type="hidden" name="day" value="${day}" />
 <input type="hidden" name="book_id" value="${bookid}" />

  <table width="600" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td bgcolor="#7cbfde" height="1"></td>
    </tr>
    <tr>
      <td bgcolor="#f6f6f6"><table cellspacing="0" cellpadding="0" width="100%" height="30" border="0">
          <tr align="center">
            <td width="60">순번</td>
            <td width="100">학번</td>
            <td width="110">이름</td>
            <td width="200">출석체크</td>
            <td width="130">출석일자</td>
          </tr>
        </table></td>
    </tr>
    <tr>
      <td bgcolor="#7cbfde" height="1"></td>
    </tr>
    <c:forEach var="att_list" items="${attendance_list}" begin="0" varStatus="i">
      <tr>
        <td bgcolor="#f4f9fb"><table height="30" cellspacing="0" cellpadding="0" width="100%" border="0">
            <tr align="center" valign="middle">
              <td width="100">${stu_num}</td>
              <td width="110">${stu_name}</td>
              <td width="200"><c:choose>
                  <c:when test="${att_list.attendance == 1 || att_list.attendance == null}"> 출석
                    <input type="radio" name="attendant_${i.index}" value="1" checked>
                    지각
                    <input type="radio" name="attendant_${i.index}" value="2">
                    결석
                    <input type="radio" name="attendant_${i.index}" value="3">
                  </c:when>
                  <c:when test="${att_list.attendance == 2}"> 출석
                    <input type="radio" name="attendant_${i.index}" value="1">
                    지각
                    <input type="radio" name="attendant_${i.index}" value="2" checked>
                    결석
                    <input type="radio" name="attendant_${i.index}" value="3">
                  </c:when>
                  <c:when test="${att_list.attendance == 3}"> 출석
                    <input type="radio" name="attendant_${i.index}" value="1">
                    지각
                    <input type="radio" name="attendant_${i.index}" value="2">
                    결석
                    <input type="radio" name="attendant_${i.index}" value="3" checked>
                  </c:when>
                </c:choose>
              </td>
              <td width="130">${att_list.date}</td>
            </tr>
          </table></td>
      </tr>
      <input type="hidden" name="hakbun" value="${att_list.hakbun}" />
    </c:forEach>
    <tr>
      <td bgcolor="#7cbfde" height="1"></td>
    </tr>
  </table>
  <br>
  <table width="600" border="0">
    <tr>
      <td align="right"><input type="Submit" name="Submit" value="출석결정"></td>
    </tr>
  </table>
</form>
</body>
</html>

<!-- 출결테이블과 수강중인 강의 테이블,강의 테이블을 조인

출결은 
stu_num 학번
stu_name 학생이름
Attendance 출결
atd_date 날짜

수강중인 강의
stu_num 학번
Lecture_code 강의코드
term 학기

강의 
Lecture_code 강의코드
Lecture_name 강의명


 -->