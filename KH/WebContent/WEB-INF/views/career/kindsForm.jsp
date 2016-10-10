<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<title>우편번호검색</title>
<link href="../style.css" rel="stylesheet" type="text/css">
<script> 
	function jobCheck() {
		if (document.jobForm.jobcode.value == "") {
			alert("취득하신 자격증을 입력하여 주세요.");
			document.jobForm.jobcode.focus();
			return;
		}
		
		document.jobForm.submit();
	}


	
	function deleteToken(){
		if('${param.check}'== 'y'){
			document.getElementById("simpletext").value = "자격증을 입력하세요";
		}

		
	}
	function sendKind(kinds){
		var kind = kinds;
		var id= '${parentId}';
		opener.setKinds1(kind,id);
		this.close();
		
	}
</script>
</head>
<body onload="deleteToken()">
	<center>
		<div class="title">
			<b><center>자격증 조회</center></b>
		</div>
		<form name="jobForm" method="post" action="kindsForm.do">
			<table>
				<tr>
					<td><br>입력 : <input name="jobcode" type="text"> <input
						type="button" value="검색" onclick="jobCheck();" class="button">
						<input type="hidden" name="check" value="n"></td>
				</tr>

				<%-- joblist::${jobList}  --%>

				<c:forEach var="jobList" items="${jobList}">

					<tr>
						<td><a href="javascript:sendKind('${jobList.kinds}')"onclick="sendKind(${jobList.kinds})">${jobList.kinds}</a></td>
					</tr>
				</c:forEach>
				<tr>
					<c:if test="${empty jobList}">
						<td style="text-align: center"  >
							<input type="text" id="simpletext" value="잘못된 자격증입니다" style="border:none;text-align: center" readonly="readonly">
						<td>
						
					</c:if>
				</tr>
				<tr>

					<td align="center" class="colorblack"><br> <a
						href="javascript:this.close();" class="button">닫기</a></td>
				</tr>

			</table>
			<input type="hidden" name="parentId" value="${param.parentId}">
		</form>
</body>
</html>

