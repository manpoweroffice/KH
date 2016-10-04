<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>자격증등록</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js" type="text/javascript" language="javascript"></script>
<script type="text/javascript">


function addrow() {
	ta = document.getElementById('ta');
	row = ta.insertRow(ta.rows.length);
	cell1 = row.insertCell(0);
	cell2 = row.insertCell(1);
	cell3 = row.insertCell(2);
	cell1.innerHTML = '<input type="text" name="kinds" required="required" placeholder="종류"><input type="button" value="검색" onClick="zipCheck()" style="cursor:hand">'; 
	cell2.innerHTML = '<input type="text" name="publisher" required="required" placeholder="발행처">';
	cell3.innerHTML = '<input type="text" name="dates" required="required" placeholder="취득일(ex:16.01.01)">';
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
/* table, td {
  border: 1px solid red
} */
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
	<form:form action="license.do">

		<div style="width: 1000px; height: 500px; margin: auto;">
		<div style="text-align: left; position: relative;">
		</div>
		<!-- <div style="text-align: ; position: relative;">검색창이 들어올 자리</div> -->
		 <table id="ta" border="1" width="1000" cellpadding="0" cellspacing="0" align="center"> 
			<tr height="30">
				<td align="center" width="500"><p>자격증종류</p></td>
				<td align="center" width="500"><p>자격증발행처</p></td>
				<td align="center" width="300"><p>취득일시</p></td>
			
			</tr>
			<tr>
				<td align="center" width="500"><p><input type="text" name="kinds" required="required" placeholder="종류"><input type="button" value="검색" onClick="zipCheck()" style="cursor:hand">
				 
				<td align="center" width="500"><p><input type="text" name="publisher" required="required" placeholder="발행처"></p></td>
				<td align="center" width="300"><p><input type="text" name="dates" required="required" placeholder="취득일(ex:16.01.01)"></p></td>
				<!-- <td align="center" width="50"><p><input type="file" name="uploadfile" required="required"></p></td> -->
				
			</tr>

			<!-- <tr>
		    <td colspan="3" bgcolor="#FFFFFF" height="25" align="center">
		    <input  type="button" value="추가" Onclick="addrow()" style="cursor:hand">
			<input  type="button" value="삭제" Onclick="delRow()" style="cursor:hand">
         	</td>
         	</tr> -->
         
           <!--  	<tr>
         	  <td colspan="3" bgcolor="#FFFFFF" height="25" align="center">
		    <input  type="button" value="추가" Onclick="addrow()" style="cursor:hand">
			<input  type="button" value="삭제" Onclick="delRow()" style="cursor:hand">
			</td> -->
       <!--   	<td colspan="3" align="center">  
         	<input  type="button" value="추가" Onclick="addrow()" style="cursor:hand">
			<input  type="button" value="삭제" Onclick="delRow()" style="cursor:hand">
			</td>
			</tr>
			
			<td colspan="3" align="right"> 
         	<input type="submit" value="등록" style="cursor:hand">
		 	<input type="reset" value="취소" style="cursor:hand">
		 	</td> -->
		 
		 

		<!-- <table>
			 <tr>
			 <th>이름</th>
			 <td><input type="text" name="name" required="required" placeholder="이름"></td>
			 </tr>
			 <tr>
			 <th>비밀번호</th>
			 <td><input type="password" name="pwd" required="required" placeholder="비밀번호"></td>
			 </tr>
			 <tr>
			 <th>파일</th>
			 <td><input type="file" name="uploadfile" required="required"></td>
			 </tr>
			 <tr>
			 <th>제목</th>
			 <td><input type="text" name="title" required="required" placeholder="제목"></td>
		     </tr>
			 <tr>
			 <th>내용</th>
			 <td><textarea rows="20" cols="40" name="content" required="required" placeholder="내용"></textarea></td>
			 </tr>
			 <tr>
		     <td colspan="2">
		     <input type="submit" value="작성">
		     <input type="reset" value="취소">
		     </td>
			 </tr>
			</table>  -->
		<!-- </fieldset> -->
		
<!-- 		 <tr>
    <td colspan="4" align="center" bgcolor="#FFFFFF">
      <table width="100%" border="0" cellpadding="0" cellspacing="0">
        <tr>
         <td colspan="4" bgcolor="#FFFFFF" height="25" align="center">
         <input name="addButton" type="button" style="cursor:hand" onClick="insRow()" value="추가">
         <font color="#FF0000">*</font>추가버튼을 클릭해 보세요.</td>
        </tr>
        <tr>
         <td height="25">
           <table id="addTable" width="400" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF" border="0">
            <tr>
              <td><input type="text" name="addText" style="width:350px; height:20px;"></td>
              <td align="left"></td>
            </tr>
          </table></td>
        </tr>
       </table>
      </td>
   </tr>
 </table>
 <table width="400" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="10">
      </td>
    </tr>
    <tr>
      <td align="center">
      <input type="button" name="button" value="확인" onClick="frmCheck();">
      </td>
    </tr> 
 -->

 </table>

<div> 
<span id="left">
 <input type="button" value="추가" Onclick="addrow()" style="cursor:hand ">
 <input type="button" value="삭제" Onclick="delRow()" style="cursor:hand">		
 </span>
 <span id="right">
   <input type="submit" value="등록" style="cursor:hand">
 <input type="reset" value="취소" style="cursor:hand">	
 </span>
</div>
 



 </div>
</form:form>
</body>
</html>