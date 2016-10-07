<%@ page contentType="text/html; charset=UTF-8"  %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<jsp:useBean id="today" class="java.util.Date" />
<fmt:formatDate value="${today}" var="year" pattern="yyyy"/>
<fmt:formatDate value="${today}" var="Month" pattern="M"/>
<fmt:formatDate value="${today}" var="date" pattern="d"/>
<html>
	<script type="text/javascript">
		function fnPrint() {
			document.body.innerHTML = document.getElementById('selectArea').innerHTML;
			window.print();
		};
	</script>
<style type="text/css">
#selectArea{
background-image:url("../../image/certificateg.jpg");
background-repeat:no-repeat;
background-size:auto;
padding-top:120px;
padding-left:40px;
width:622px;
height:908px;
}
</style>
<body id="selectArea">
	
		<table width=80% border="0" cellspacing="0" cellpadding="0">
			<br/>
			<br/>
			<tr>
				<td align="left">제20190927-0001호</td>
			</tr>
		</table>
			<br>
			<table border="0" cellspacing="0" cellpadding="10" align="center">
				<tr>
					<td>이     름 :</td>
						
					<td>${command.ko_name }</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				<tr>
				<tr>
					<td>생년월일 :</td>
						
					<td>${command.birthday}</td>
				<tr>
				<tr>
					<td>학      과 :</td>
					<td>${command.department}</td>
				<tr>
				<tr>
					<td>학      번 :</td>
					<td>${command.stu_num}</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					
				<tr>
				<tr>
					<td>졸    업    일 :</td>
					<td>${command.gradu_date }</td>
				<tr>
					<td>학    위    명 :</td>
					<td>${command.major}</td>
				<tr>
					<td>학사학위 :</td>	<td>학사</td>
				</tr>
			</table>
			<br>
			<br>
			<br>
		<br>
		<br>
		<br>
		<br>
		<br><br>
		<br>
		<br>
		<div align="center">
			<label>${year}년 ${Month}월 ${date}일</label> <br>
		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		
</body>
	<input type="button" value="출력" onClick="fnPrint()"/>
</html>