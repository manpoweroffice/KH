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
<center>
<table border="1" cellpadding="0" cellspacing="0">
<tr>
<td rowspan="7">
<img src="pic.PNG" width="120px" height="160px">
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="파일선택" onclick="">
</td>
</tr>
<tr>
<th colspan="4" >신상정보</th>
</tr>
<tr>
<td>이름</td><td >강민경</td>
<td >영어이름</td><td >minkyeong </td>
</tr>
<tr>
<td >학번 </td><td>12345678 </td> 
<td>생년원일</td><td> 123456</td>
</tr>
<tr>
<td>학과 </td><td>컴퓨터정보</td>
<td>전공</td><td>컴퓨터공학부 </td>
</tr>
<tr>
<td>전화번호</td><td>010 </td>
<td>휴대전화</td><td>0102589631 </td>
</tr>
<tr>
<td>주소</td><td >서울시강남구테헤란로 </td>
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
<tr><td>병역여부</td><td>필</td></tr>
<tr><td>최종계급</td><td>병장</td></tr>
<tr><td>복무기간</td><td>15.03.10~16.12.09</td></tr>
<tr><td> 면제사유</td><td>해당사항없음</td></tr>
</table>
<br/>
<table border="2">
<tr>
<th colspan="10">취업정보</th>
</tr>
<tr><td>취업희망업종</td><td>개발</td></tr>
<tr><td>취업희망직업</td><td>웹개발</td></tr>
<tr><td>희망취업지역</td><td>강남구</td></tr>
<tr><td>희망연봉</td><td>3000만원</td></tr>
</table>
<br/>

<input type="button" name="modify" value="수정">
<input type="button" name="save" value="저장">
</center>
<form action="" method="" enctype="multipart/form-data">

</form>
</body>
</html>