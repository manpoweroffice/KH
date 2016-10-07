<%@ page contentType="text/html; charset=UTF-8"  %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.0.min.js" ></script>
<script>
function openpop(){
	window.open("/KH/yeji/profile/upload.do","upload","toolbar=no,location=no,status=no,menubar=no scrollbars=no,resizable=no,width=300,height=200");
}

$(document).ready(function(){
	var mil=$('.mil');
	if(${command.sex=='여'}){
		mil.attr('disabled',true);
	}
});

</script>

<style>
table{
width:500;
height:200;
}
th{
text-align: left;
font-size: 15;
}
td{
font-size: 12;
}
</style>
<head>
</head>  
<body>
<form name="basicForm" method="POST">
<table border="1" >
<tr>
<td rowspan="8">
<img src="${command.upload.path}" id="image" width="120px" height="160px">
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="업로드" onclick="openpop()">
</td>
</tr>
<tr>   
<th colspan="4" >신상정보</th>
<td >
<c:if test="${command.p_check=='Y' or command.p_check ==''}">
  <input type="radio"  name ="p_check" value="Y" checked>공개
  <input type="radio"  name ="p_check" value="N">비공개
</c:if>
<c:if test="${command.p_check=='N'}">
  <input type="radio"  name ="p_check" value="Y" >공개
  <input type="radio"  name ="p_check" value="N" checked>비공개
</c:if>
</td> 
</tr>
<tr>
<td>이름</td><td >${command.ko_name}</td>
<td>성별</td><td>${command.sex}</td>
</tr>
<tr>
<td >영어이름</td><td><input type="text" value="${command.en_name}" name="en_name"></td>
<td>생년원일</td><td>${command.birthday}</td>
</tr>
<tr>
<td >학번 </td><td>${command.stu_num}</td> 
<td>반</td><td>${command.stu_class}</td>
</tr>
<tr>
<td>학과 </td><td>${command.department}</td>
<td>전공</td><td>${command.major}</td>
</tr>
<tr>
<td>전화번호</td><td><input type="text" value="${command.phone }" name="phone"></td>
<td>휴대전화</td><td><input type="text" value="${command.h_phone }" name="h_phone"></td>
</tr>
<tr>
<td>주소</td><td colspan="3"><input type="text" size="50" value="${command.address}" name="address"  ></td>

</tr>
</table>
<br/>

<table border="2">
<tr>
<th colspan="10" >병역정보</th>
</tr>
<tr><td>병역여부</td>
<td><input type="text" class="mil" value="${command.mil_service }" name="mil_service" ></td>
<tr><td>최종계급</td>
<td><input type="text" class="mil" value="${command.last_rank }" name="last_rank" ></td>
<tr><td>복무기간</td>
<td><input type="text" class="mil" value="${command.tour_of_duty }" name="tour_of_duty" ></td>
<tr><td> 면제사유</td>
<td><input type="text" class="mil" value="${command.exemp }" name="exemp" ></td>
</table>

<br/>
<table border="2">
<tr>
<th colspan="10">취업정보</th>
</tr>
<tr><td>취업희망업종</td>
<td><input type="text" value="${command.h_tob }" name="h_tob"></td>
<tr><td>취업희망직업</td>
<td><input type="text" value="${command.h_job }" name="h_job"></td>
<tr><td>희망취업지역</td>
<td><input type="text" value="${command.h_location }" name="h_location"></td>
<tr><td>희망연봉</td>
<td><input type="text" value="${command.h_income }" name="h_income">만원</td>
</table> 
<br/>
<input type="submit" value="저장" >
</form>
</body>
</html>