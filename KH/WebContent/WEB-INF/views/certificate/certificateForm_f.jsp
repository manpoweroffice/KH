<%@ page contentType="text/html; charset=UTF-8"  %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
	<script type="text/javascript">
		function fnPrint() {
			document.body.innerHTML = selectArea.innerHTML;
			window.print();
		};
	</script>
<style type="text/css">
#certificate{
background-image:url("../../image/certificatef.jpg");
background-repeat:no-repeat;
background-size:auto;
padding-top:120px;
padding-left:40px;
width:622px;
height:908px;
}
</style>

<body id="certificate">
<div id="selectArea">
<h6>제20190927-0001호</h6>
<br/>
<br/>
성명&nbsp;&nbsp;&nbsp;${command.ko_name }<br>
생년월일&nbsp;&nbsp;&nbsp;${command.birthday}<br>
학과&nbsp;&nbsp;&nbsp;${command.department}<br>
학번&nbsp;&nbsp;&nbsp;${command.stu_num}<br>
${command.college_state }
${command.gradu_date }
<br/>
<br/>
<br/>
<h4>2016년09월27일</h4>
</div>
</body>

<input type="button" value="출력" onClick="fnPrint()" />
</html>