<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자격증등록</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js" type="text/javascript" language="javascript"></script>
    
<script type="text/javascript">

//봉사활동
$(document).ready(function(){
	
	$('.del_button').click(function(){
	
$('.chkBox:checked').each(function() { 
	var id= $(this).attr("id");
	$("#"+id).remove();
});
	});

})

//사회활동
$(document).ready(function(){
	
	$('.del_button2').click(function(){
	
$('.chkBox1:checked').each(function() { 
	var id= $(this).attr("id");
	$("#"+id).remove();
});
	});

})

function setKinds1(kinds){
	var kind = kinds;
	document.getElementById("kinds1").value=kinds
	
}
var count = 2;

//봉사활동
function addrow() {
	
	
	ta = document.getElementById('ta');
	
	row = ta.insertRow(ta.rows.length);
	row.setAttribute("id",count);
	cell1 = row.insertCell(0);
	cell2 = row.insertCell(1);
	cell3 = row.insertCell(2);
	cell4 = row.insertCell(3);
	cell5 = row.insertCell(4);
	cell1.innerHTML = '<input type="checkbox" class="chkBox" id="'+count+'"> <input type="text" id="kinds'+count+'" required="required" placeholder="과목">'; 
	cell2.innerHTML = '<input type="text" name="publisher" required="required" placeholder="기관">';
	cell3.innerHTML = '<input type="text" name="dates" required="required" placeholder="내용">';
	cell4.innerHTML = '<input type="text" name="uploadfile" required="required" placeholder="기간">';
	cell5.innerHTML = '<input type="text" name="uploadfile" required="required" placeholder="내용">';
	count++;
}


//사회활동
function addrow2() {
	
	
	ta = document.getElementById('ta1');
	
	row = ta.insertRow(ta.rows.length);
	row.setAttribute("id",count);
	cell1 = row.insertCell(0);
	cell2 = row.insertCell(1);
	cell3 = row.insertCell(2);
	cell4 = row.insertCell(3);
	cell1.innerHTML = '<input type="checkbox" class="chkBox1" id="'+count+'"> <input type="text" id="kinds'+count+'" required="required" placeholder="과목">'; 
	cell2.innerHTML = '<input type="text" name="publisher" required="required" placeholder="기관">';
	cell3.innerHTML = '<input type="text" name="dates" required="required" placeholder="차">';
	cell4.innerHTML = '<input type="text" name="uploadfile" required="required" placeholder="차차">';
	count++;
}

 
//자격증검색
function licenseCheck(){
	url="kindsForm.do?check=y";	
    window.open(url,"post","left=100,top=100,width=800,height=800,toolbar=no,directories=no,status=yes,scrollbars=yes,menubar=no,fullscreen=no,resizable=no");
}


</script>

<style type="text/css">
#ta{

text-align:center;
}
div{
position: relative;}
div #right{
	position:absolute;
	right: 0px;
}    
</style>

<style type="text/css">
#ta1{

text-align:center;
}
div{
position: relative;}
div #right{
	position:absolute;
	right: 0px;
}    
</style>

</head>
<body>
<div style="width: 1200px; height: 500px; margin: auto;">
<!-- <div style="text-align: left; position: relative;"> -->
<!-- <div style="text-align: ; position: relative;">검색창이 들어올 자리</div> -->
<div style="text-align: right; position: relative;">봉사활동</div>
<form action="award.do" enctype="multipart/form-data" method="post">
		 <table id="ta" border="1" width="1200" cellpadding="0" cellspacing="0" align="center"> 
			<tr height="40">
				<td align="center" width="300"><p>종류</p></td>
				<td align="center" width="400"><p>장소</p></td>
				<td align="center" width="200"><p>기간</p></td>
				<td align="center" width="500"><p>지역</p></td>
				<td align="center" width="200"><p>시간</p></td>
			</tr>
		
			
			<tr height="20" id="1" >
				<td align="center" width="300"><p><input type="checkbox" class="chkBox"id ="1"> <input type="text" id="kinds1" required="required" placeholder="과목"></td>
				<td align="center" width="400"><p><input type="text" name="publisher" required="required" placeholder="기관"></p></td>
				<td align="center" width="200"><p><input type="text" name="dates" required="required" placeholder="내용"></p></td>
				<td align="center" width="500"><p><input type="text" name="uploadfile" required="required" placeholder="기간"></p></td>	
				<td align="center" width="200"><p><input type="text" name="dates" required="required" placeholder="내용"></p></td>
			</tr>
			</table>
			
<div> 
<span id="left">
 <input type="button" value="추가" Onclick="addrow()" style="cursor:hand ">
 <input type="button" value="삭제" class="del_button" style="cursor:hand">		
 </span>
 <span id="right">
 <input type="button" value="수정" style="cursor:hand">	
 <input type="submit" value="등록" style="cursor:hand" >
 <input type="reset" value="취소" style="cursor:hand">	
 </span>
</div>
</form>
</div>

<div style="width: 1200px; height: 500px; margin: auto;">
<!-- <div style="text-align: left; position: relative;"> -->
<!-- <div style="text-align: ; position: relative;">검색창이 들어올 자리</div> -->
<div style="text-align: right; position: relative;">사회활동</div>
<form action="award.do" enctype="multipart/form-data" method="post">
		 <table id="ta1" border="1" width="1200" cellpadding="0" cellspacing="0" align="center"> 
			<tr height="40">
				<td align="center" width="50"><p>회사명</p></td>
				<td align="center" width="100"><p>근무기간</p></td>
				<td align="center" width="200"><p>업무내용</p></td>
				<td align="center" width="50"><p>직급</p></td>
			</tr>
		
			
			<tr height="20" id="1" >
				<td align="center" width="500"><p><input type="checkbox" class="chkBox"id ="1"> <input type="text" id="kinds1" required="required" placeholder="과목"></td>
				<td align="center" width="500"><p><input type="text" name="publisher" required="required" placeholder="기관"></p></td>
				<td align="center" width="300"><p><input type="text" name="dates" required="required" placeholder="내용"></p></td>
				<td align="center" width="50"><p><input type="text" name="uploadfile" required="required" placeholder="기간"></p></td>	
			</tr>
			</table>
			
<div> 
<span id="left">
 <input type="button" value="추가" Onclick="addrow2()" style="cursor:hand ">
 <input type="button" value="삭제" class="del_button2" style="cursor:hand">		
 </span>
 <span id="right">
 <input type="button" value="수정" style="cursor:hand">	
 <input type="submit" value="등록" style="cursor:hand" >
 <input type="reset" value="취소" style="cursor:hand">	
 </span>
</div>
</form>
</div>

</body>
</html> 









