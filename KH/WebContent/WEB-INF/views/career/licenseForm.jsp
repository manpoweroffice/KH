<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자격증등록</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js" type="text/javascript" language="javascript"></script>
<script type="text/javascript">


function addrow() {
	ta = document.getElementById('ta');
	row = ta.insertRow(ta.rows.length);
	cell1 = row.insertCell(0);
	cell2 = row.insertCell(1);
	cell3 = row.insertCell(2);
	cell4 = row.insertCell(3);
	cell1.innerHTML = '<input type="checkbox"><input type="text" name="kinds" required="required" placeholder="종류"><input type="button" value="검색" onClick="zipCheck()" style="cursor:hand">'; 
	cell2.innerHTML = '<input type="text" name="publisher" required="required" placeholder="발행처">';
	cell3.innerHTML = '<input type="text" name="dates" required="required" placeholder="취득일(ex:16.01.01)">';
	cell4.innerHTML = '<input type="file" name="uploadfile" value="uploadfile">';
}

function delRow() {
	ta = document.getElementById('ta');
	if (ta.rows.length < 2)
		return;
	ta.deleteRow(ta.rows.length - 1);
}

//자격증검사
function zipCheck(){
	url="Zipcheck.do?check=y";
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

</head>
<body>
<div style="width: 1000px; height: 500px; margin: auto;">
<!-- <div style="text-align: left; position: relative;"> -->
<!-- <div style="text-align: ; position: relative;">검색창이 들어올 자리</div> -->
<form action="license.do" enctype="multipart/form-data" method="post">
		 <table id="ta" border="1" width="1000" cellpadding="0" cellspacing="0" align="center"> 
			<tr height="40">
				<td align="center" width="500"><p>자격증종류</p></td>
				<td align="center" width="500"><p>자격증발행처</p></td>
				<td align="center" width="300"><p>취득일시</p></td>
				<td align="center" width="300"><p>증빙자료</p></td>
			</tr>
			<!-- <tr height="20">
				<td align="center" width="500">
				<td align="center" width="500">
				<td align="center" width="300">
				<td align="center" width="300">
			</tr>  -->
			
			<tr height="20">
				<td align="center" width="500"><p><input type="checkbox"><input type="text" name="kinds" required="required" placeholder="종류"><input type="button" value="검색" onClick="zipCheck()" style="cursor:hand"></p></td>
				<td align="center" width="500"><p><input type="text" name="publisher" required="required" placeholder="발행처"></p></td>
				<td align="center" width="300"><p><input type="text" name="dates" required="required" placeholder="취득일(ex:16.01.01)"></p></td>
				<td align="center" width="50"><p><input type="file" name="uploadfile" value="uploadfile"></p></td>	
			</tr>
			</table>
			
<div> 
<span id="left">
 <input type="button" value="추가" Onclick="addrow()" style="cursor:hand ">
 <input type="button" value="삭제" Onclick="delRow()" style="cursor:hand">		
 </span>
 <span id="right">
 <input type="submit" value="등록" style="cursor:hand" >
 <input type="reset" value="취소" style="cursor:hand">	
 </span>
</div>
</form>
</div>
</body>
</html>