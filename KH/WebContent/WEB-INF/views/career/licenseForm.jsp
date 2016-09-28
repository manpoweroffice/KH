<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>자격증등록</title>
<script language="javascript">

var oTbl;
//Row 추가
function insRow() {
  oTbl = document.getElementById("addTable");
  var oRow = oTbl.insertRow();
  oRow.onmouseover=function(){oTbl.clickedRowIndex=this.rowIndex}; //clickedRowIndex - 클릭한 Row의 위치를 확인;
  var oCell = oRow.insertCell();

  //삽입될 Form Tag
  var frmTag = "<input type=text name=addText style=width:350px; height:20px;> ";
  frmTag += "<input type=button value='삭제' onClick='removeRow()' style='cursor:hand'>";
  oCell.innerHTML = frmTag;
}
//Row 삭제
function removeRow() {
  oTbl.deleteRow(oTbl.clickedRowIndex);
}

function frmCheck()
{
  var frm = document.form;
  
  for( var i = 0; i <= frm.elements.length - 1; i++ ){
     if( frm.elements[i].name == "addText" )
     {
         if( !frm.elements[i].value ){
             alert("텍스트박스에 값을 입력하세요!");
                 frm.elements[i].focus();
	 return;
          }
      }
   }
 }

</script>
</head>
<body>
	<form action="license.do" method="post" enctype="multipart/form-data">
	<!-- <fieldset> -->
		<div style="width: 1200px; height: 500px; margin: auto;">
		<div style="text-align: left; position: relative;">
		</div>
		<!-- <div style="text-align: ; position: relative;">검색창이 들어올 자리</div> -->
		 <table id="addTable" border="1" width="200" cellpadding="0" cellspacing="0" align="center"> 
			<tr height="30">
				<td align="center" width="200"><p>자격증종류</p></td>
				<td align="center" width="150"><p>자격증발행처</p></td>
				<td align="center" width="50"><p>취득일시</p></td>
				<!-- <td align="center" width="50"><p>증빙자료</p></td> -->
			</tr>
			<tr>
				<td align="center" width="200"><p><input type="text" name="kinds" required="required" placeholder="종류"></p></td>
				<td align="center" width="150"><p><input type="text" name="publisher" required="required" placeholder="발행처"></p></td>
				<td align="center" width="50"><p><input type="text" name="dates" required="required" placeholder="취득일(ex:16.01.01)"></p></td>
				<!-- <td align="center" width="50"><p><input type="file" name="uploadfile" required="required"></p></td> -->
				
			</tr>
			
			<tr>
		    <td colspan="4" bgcolor="#FFFFFF" height="25" align="center">
            <input name="addButton" type="button" style="cursor:hand" onClick="insRow()" value="추가">
         	</td>
         	</tr>
         
         	  
          <!--  <table id="addTable" width="400" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF" border="0">
            <tr>
            <td><input type="text" name="addText" style="width:350px; height:20px;"></td>
              <td align="left"></td> 
         	</td> -->
         	
         	<tr>
         	<td colspan="5" align="right">  
         	<input type="submit" value="등록">
		 	<input type="reset" value="취소">
		 	</td>
		 	</tr>
		 	
		<!-- <td colspan="5" align="right">
			 <input type="submit" value="등록">
		     <input type="reset" value="취소">
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
</form>
</body>
</html>