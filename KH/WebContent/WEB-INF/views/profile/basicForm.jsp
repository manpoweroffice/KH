<%@ page contentType="text/html; charset=UTF-8"  %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
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
<title>Insert title here</title>
</head>  
<body>

<table border="1" cellpadding="0" cellspacing="0">
<tr>
<td rowspan="7">
<img src="" width="120px" height="160px">
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="파일선택" onclick="window.open('/profile/fileupload.do')">
</td>
</tr>
<tr>   
<th colspan="4" >신상정보</th>
</tr>
<tr>
<td>이름</td><td >${command.ko_name}</td>
<td >영어이름</td><td >${command.en_name} </td>
</tr>
<tr>
<td >학번 </td><td>${command.stu_num}</td> 
<td>생년원일</td><td>${command.birthday}</td>
</tr>
<tr>
<td>학과 </td><td>${command.department}</td>
<td>전공</td><td>${command.major}</td>
</tr>
<tr>
<td>전화번호</td><td>${command.phone }</td>
<td>휴대전화</td><td>${command.h_phone}</td>
</tr>
<tr>
<td>주소</td><td >${command.address } </td>
<td> 공개여부</td>
<td >
<input type="radio" name="check" value="공개">공개 
<input type="radio" name="check" value="비공개">비공개
</td>
</tr>
</table>
<br/>
<table border="2">
<tr>
<th colspan="10" >병역정보</th>
</tr>
<tr><td>병역여부</td><td>${command.mil_service }</td></tr>
<tr><td>최종계급</td><td>${command.last_rank }</td></tr>
<tr><td>복무기간</td><td>${command.tour_of_duty }</td></tr>
<tr><td> 면제사유</td><td>${command.exemp }</td></tr>
</table>
<br/>
<table border="2">
<tr>
<th colspan="10">취업정보</th>
</tr>
<tr><td>취업희망업종</td><td>${command.h_tob }</td></tr>
<tr><td>취업희망직업</td><td>${command.h_job }</td></tr>
<tr><td>희망취업지역</td><td>${command.h_location }</td></tr>
<tr><td>희망연봉</td><td>${command.h_income }만원</td></tr>
</table>
<br/>

<input type="button" name="modify" value="수정">
<input type="button" name="save" value="저장">

<form action="" method="" enctype="multipart/form-data">

</form>
</body>
</html>