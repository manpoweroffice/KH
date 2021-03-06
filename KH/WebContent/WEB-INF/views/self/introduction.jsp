<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<title></title>
<link href="../../css/self.css" rel="stylesheet" media="screen">
		
		<script src="jquery-2.1.3.min.js"></script>
		<script>
		
		  $(function(){
			  $('.sidebar').hide();
		  });
		  function showButton(){
			 $('.sidebar').show();
		  }
		  function closeSidebar() {
			  $('.sidebar').hide();
		  }
		  
		</script>
		
	</head>
	<body>
	
	  <div class="wrapper">	
<center>
<p class="pagetitle">
자 기 소 개 서
</p>
</center>
	<form method="POST" commandName="self">
		<table border="1" cellspacing="0" cellpadding="0" class="table">
			<tr><td rowspan="2" class="inttitle" align="center">지식<br>(Knowle-dge)</td>
				<td class="title">지원분야에 필요한 직무능력을 습득하기 위해 받은 교육[학교/직업교육]에 대해 기술하시오.<br> 
					(분야, 교육 내용, 향상 노력, 성과 등)</td></tr>
			<tr><td class="content">
			<c:if test="${self.content1 != null}"><textarea rows="20" cols="100" name="content1">${self.content1}</textarea></c:if>
			<c:if test="${self.content1 == null}"><textarea rows="20" cols="100" name="content1"></textarea></c:if>
			</td></tr>
		</table>
		<br>
		<table border="1" cellspacing="0" cellpadding="0" class="table"> 
			<tr><td rowspan="2" class="inttitle" align="center">기술<br>(Skill)</td>
				<td class="title">가장 자신 있는 기술(또는 흥미를 가지고 공부한 기술)에 대해 설명하고 프로젝트에 접목시켜<br>
				이룬 성과가 무엇인지 기술하시오.</td></tr>
			<tr><td class="content">
			<c:if test="${self.content2 != null}"><textarea rows="20" cols="100" name="content2">${self.content2}</textarea></c:if>
			<c:if test="${self.content2 == null}"><textarea rows="20" cols="100" name="content2"></textarea></c:if></td></tr>
		</table>
		<br>
		<table border="1" cellspacing="0" cellpadding="0" class="table">
			<tr><td rowspan="2" class="inttitle" align="center">태도<br>(Attitude)</td>
				<td class="title">본인이 참여하여 수행한 프로젝트에서 어렵거나 힘들었던 문제의 상황을 설명하고 어떠한 과정을<br>
				거쳐 해결하였는지 구체적으로 설명하시오. (문제 원인 도출, 해결방안 탐색, 해결방안 적용 등)</td></tr>
			<tr><td class="content">
			<c:if test="${self.content3 != null}"><textarea rows="20" cols="100" name="content3">${self.content3}</textarea></c:if>
			<c:if test="${self.content3 == null}"><textarea rows="20" cols="100" name="content3"></textarea></c:if></td></tr>
		</table>
		<br>
		<table border="1" cellspacing="0" cellpadding="0" class="table">
			<tr><td rowspan="2" class="inttitle" align="center">목표<br>(Goal)</td>
				<td class="title">입사 후 이루고 싶은 목표가 무엇인지 제시하고 그 목표를 이루기 위해<br>
				어떠한 노력을 할 것인지 기술하시오.</td></tr>
			<tr><td class="content">
			<c:if test="${self.content3 != null}"><textarea rows="20" cols="100" name="content4">${self.content3}</textarea></c:if>
			<c:if test="${self.content3 == null}"><textarea rows="20" cols="100" name="content4"></textarea></c:if></td></tr>
		</table>
		<input type="submit" value="저장" class="button">
	</form>
	
		</div>
		
		<div class="toolbar">
				<input type="button" value="컨설팅 비교" onclick="showButton()" id="button" class="button">
		</div>
		
		<section class="sidebar">
			<nav>
				<input type="button" id="closeButton1" onclick="closeSidebar()" value="닫기" class="button">
	<center>
<p class="pagetitle">
자 기 소 개 서
</p>
	</center>
		<form method="POST" commandName="self">
			<table border="1" cellspacing="0" cellpadding="0" class="table">
				<tr><td rowspan="2" class="inttitle" align="center">지식<br>(Knowle-dge)</td>
					<td class="title">지원분야에 필요한 직무능력을 습득하기 위해 받은 교육[학교/직업교육]에 대해 기술하시오.<br> 
						(분야, 교육 내용, 향상 노력, 성과 등)</td></tr>
				<tr><td class="content">${self.content1}</td></tr>
			</table>
			<br>
			<table border="1" cellspacing="0" cellpadding="0" class="table">
				<tr><td rowspan="2" class="inttitle" align="center">기술<br>(Skill)</td>
					<td class="title">가장 자신 있는 기술(또는 흥미를 가지고 공부한 기술)에 대해 설명하고 프로젝트에 접목시켜<br>
					이룬 성과가 무엇인지 기술하시오.</td></tr>
				<tr><td class="content">${self.content2}</tr>
			</table>
			<br>
			<table border="1" cellspacing="0" cellpadding="0" class="table">
				<tr><td rowspan="2" class="inttitle" align="center">태도<br>(Attitude)</td>
					<td class="title">본인이 참여하여 수행한 프로젝트에서 어렵거나 힘들었던 문제의 상황을 설명하고 어떠한 과정을<br>
					거쳐 해결하였는지 구체적으로 설명하시오. (문제 원인 도출, 해결방안 탐색, 해결방안 적용 등)</td></tr>
				<tr><td class="content">${self.content3}</tr>
			</table>
			<br>
			<table border="1" cellspacing="0" cellpadding="0" class="table">
				<tr><td rowspan="2" class="inttitle" align="center">목표<br>(Goal)</td>
					<td class="title">입사 후 이루고 싶은 목표가 무엇인지 제시하고 그 목표를 이루기 위해<br>
					어떠한 노력을 할 것인지 기술하시오.</td></tr>
				<tr><td class="content">${self.content3}</td></tr>
			</table>
		</form>
		
			</nav>
		</section>
      
	</body>