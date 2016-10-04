<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<table id="buss_table">
		<tr>
			<td width="50" height="30" align="center">번호</td>
			<td width="100"height="30" align="center">회사명</td>
			<td width="100" height="30" align="center">자격요건</td>
			<td width="100" height="30" align="center">관련직종</td>
			<td width="100" height="30" align="center">연봉</td>
			<td width="200" height="30" align="center">등록일</td>
		</tr>
		<c:forEach var="article" items="${bussList}">
		     
		     <tr>
		     	<td align="center">${number}</td>
		     	<td align="center"><a href="/KH/jun/job/bussView.do?num=${article.num}&pageNum=${pageNum}">${article.bussnm}</td>
		     	<td align="center">${article.cer}</td>
		     	<td align="center">${article.rel}</td>
		     	<td align="center">${article.sal}</td>
		     	<td align="center"><fmt:formatDate value="${article.reg_date}" pattern="yyyy년 MM월 dd일"/></td>
		    
		     </tr>
		    <c:set var="number" value="${number-1}"/> 
		</c:forEach>
		<c:if test="${count==0}">
		<tr>
		   <td>글이 없습니다.</td>
		</tr>
		</c:if>
	</table>
	<form action="/job/business.do" name="search" method="get">
	<table class="search">
		<tr>
			<td>
				<select name="keyField">
					<option value="all">전체</option>
					<option value="bussnm">회사명</option>
					<option value="cer">자격요건</option>
					<option value="rel">관련직종</option>
				</select>
			</td>
			<td>
				<input type="text" size="16" name="keyWord">
			</td>
			<td>
				<input type="submit" value="찾기">
			</td>
		</tr>
	</table>
	</form>
	
	<!-- 페이징 공간 -->
	<table>
	<c:if test="${count>0}">
	<tr>
		<td align="center">${pagingHtml}</td>
	</tr>
	</c:if>
	<tr>
	<td align="center"><input type="button" value="글쓰기" onclick="document.location.href='busswrite.do'"></td>
	</tr>
	</table>
</body>
</html>