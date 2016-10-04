<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<title></title>
	<style>
			* {
				padding:0px;
				margin:0px;
				box-sizing:border-box;
			}

			html, body {
				width:100%;
				height:100%;
			}

			section {
				position:absolute;
				right:0px;
				top:100px;
				z-index:1;
			}

			.toolbar {
				position: fixed;
				top: 0;
				right: 0;
				background-color: #4fc3f7;
				line-height: 68px;
				border-top: 2px solid #4fc3f7;
				border-bottom: 2px solid #4fc3f7;
			}

			.menu-left {
			  float: right;
			  margin-right: 1.5em;
			}

			.sidebar {
				margin: 0;
				padding-top: 1em;
				color: white;
				background-color:#03A9F4;
			}

		</style>
		
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
자 기 소 개 서
</center>
	<form method="POST" commandName="self">
		<table border="1" cellspacing="0" cellpadding="0">
			<tr><td rowspan="2">지식<br>(Knowle-dge)</td>
				<td>지원분야에 필요한 직무능력을 습득하기 위해 받은 교육[학교/직업교육]에 대해 기술하시오.<br> 
					(분야, 교육 내용, 향상 노력, 성과 등)</td></tr>
			<tr><td>
			<c:if test="${self.content1 != null}"><textarea rows="20" cols="100" name="content1">${self.content1}</textarea></c:if>
			<c:if test="${self.content1 == null}"><textarea rows="20" cols="100" name="content1"></textarea></c:if>
			</td></tr>
		</table>
		<br>
		<table border="1" cellspacing="0" cellpadding="0">
			<tr><td rowspan="2">기술<br>(Skill)</td>
				<td>가장 자신 있는 기술(또는 흥미를 가지고 공부한 기술)에 대해 설명하고 프로젝트에 접목시켜<br>
				이룬 성과가 무엇인지 기술하시오.</td></tr>
			<tr><td>
			<c:if test="${self.content2 != null}"><textarea rows="20" cols="100" name="content2">${self.content2}</textarea></c:if>
			<c:if test="${self.content2 == null}"><textarea rows="20" cols="100" name="content2"></textarea></c:if></td></tr>
		</table>
		<br>
		<table border="1" cellspacing="0" cellpadding="0">
			<tr><td rowspan="2">태도<br>(Attitude)</td>
				<td>본인이 참여하여 수행한 프로젝트에서 어렵거나 힘들었던 문제의 상황을 설명하고 어떠한 과정을<br>
				거쳐 해결하였는지 구체적으로 설명하시오. (문제 원인 도출, 해결방안 탐색, 해결방안 적용 등)</td></tr>
			<tr><td>
			<c:if test="${self.content3 != null}"><textarea rows="20" cols="100" name="content3">${self.content3}</textarea></c:if>
			<c:if test="${self.content3 == null}"><textarea rows="20" cols="100" name="content3"></textarea></c:if></td></tr>
		</table>
		<br>
		<table border="1" cellspacing="0" cellpadding="0">
			<tr><td rowspan="2">목표<br>(Goal)</td>
				<td>입사 후 이루고 싶은 목표가 무엇인지 제시하고 그 목표를 이루기 위해<br>
				어떠한 노력을 할 것인지 기술하시오.</td></tr>
			<tr><td>
			<c:if test="${self.content3 != null}"><textarea rows="20" cols="100" name="content4">${self.content3}</textarea></c:if>
			<c:if test="${self.content3 == null}"><textarea rows="20" cols="100" name="content4"></textarea></c:if></td></tr>
		</table>
		<input type="submit" value="저장">
	</form>
	
		</div>
		
		<div class="toolbar">
				<input type="button" value="열기" onclick="showButton()" id="button">
		</div>
		
		<section class="sidebar">
			<nav>
				<input type="button" id="closeButton1" onclick="closeSidebar()" value="닫기">
	<center>
	자 기 소 개 서
	</center>
		<form method="POST" commandName="self">
			<table border="1" cellspacing="0" cellpadding="0">
				<tr><td rowspan="2">지식<br>(Knowle-dge)</td>
					<td>지원분야에 필요한 직무능력을 습득하기 위해 받은 교육[학교/직업교육]에 대해 기술하시오.<br> 
						(분야, 교육 내용, 향상 노력, 성과 등)</td></tr>
				<tr><td>${self.content1}</td></tr>
			</table>
			<br>
			<table border="1" cellspacing="0" cellpadding="0">
				<tr><td rowspan="2">기술<br>(Skill)</td>
					<td>가장 자신 있는 기술(또는 흥미를 가지고 공부한 기술)에 대해 설명하고 프로젝트에 접목시켜<br>
					이룬 성과가 무엇인지 기술하시오.</td></tr>
				<tr><td>${self.content2}</tr>
			</table>
			<br>
			<table border="1" cellspacing="0" cellpadding="0">
				<tr><td rowspan="2">태도<br>(Attitude)</td>
					<td>본인이 참여하여 수행한 프로젝트에서 어렵거나 힘들었던 문제의 상황을 설명하고 어떠한 과정을<br>
					거쳐 해결하였는지 구체적으로 설명하시오. (문제 원인 도출, 해결방안 탐색, 해결방안 적용 등)</td></tr>
				<tr><td>${self.content3}</tr>
			</table>
			<br>
			<table border="1" cellspacing="0" cellpadding="0">
				<tr><td rowspan="2">목표<br>(Goal)</td>
					<td>입사 후 이루고 싶은 목표가 무엇인지 제시하고 그 목표를 이루기 위해<br>
					어떠한 노력을 할 것인지 기술하시오.</td></tr>
				<tr><td>${self.content3}</td></tr>
			</table>
		</form>
		
			</nav>
		</section>
      
	</body>