<%@ page contentType="text/html; charset=UTF-8"  %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<script type="text/javascript">
		function fnPrint() {
			document.body.innerHTML = selectArea.innerHTML;
			window.print();
		};
	</script>
<head>
<title>Insert title here</title>
</head>
<body>
<div id="selectArea">
<h1 align="center">졸업증명서</h1>
<h6>제20190927-0001호</h6>
<br/>
<br/>
성명&nbsp;&nbsp;&nbsp;${command.ko_name }<br>
생년월일&nbsp;&nbsp;&nbsp;${command.birthday}<br>
학과&nbsp;&nbsp;&nbsp;${command.department}<br>
학번&nbsp;&nbsp;&nbsp;${command.stu_num}<br>
졸    업    일&nbsp;&nbsp;&nbsp;20160927<br>
학    위    명&nbsp;&nbsp;&nbsp;${command.major }<br>
학사학위&nbsp;&nbsp;&nbsp;학사<br>
<br/>
<br/>
<h2 align="center">위 사실을 증명합니다.</h2>
<br/>
<h4 align="center">2016년09월27일</h4>
<h1 align="center">00000대학교</h1>
</div>
<input type="button" value="출력" onClick="fnPrint()" />

</body>
</html>