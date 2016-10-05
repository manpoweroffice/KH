<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="//code.jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="../resources/naverEditor/js/HuskyEZCreator.js" charset="utf-8"></script>
<script>
$(function(){
	//전역변수
	var obj=[];
	//스마트 에디터 프레임 생성
	nhn.husky.EZCreator.createInIFrame({
		oAppRef:obj,
		elPlaceHolder:"content",
		sSkinURI :"../resources/naverEditor/SmartEditor2Skin.html",
		htParams:{
			//툴바 사용 여부 (true: 사용/ false: 사용하지 않음)
			bUseToolbar : true,
			//입력창 크기 조절바 사용 여부 (true: 사용/ false: 사용하지 않음)
			bUseVerticalResizer:true,
			//모드 탭(Editor| HTML | TEXT) 사용 여부 (true: 사용/ false: 사용하지 않음)
			bUseModeChanger : true,
		}
	});
	$("#saveBtn").click(function(){
		//id가 content인 textarea에 에디터에서 대입
		obj.getById["content"].exec("UPDATE_CONTENTS_FIELD",[]);
		//폼 submit
		$("#frm").submit();
	})
})
</script>
<style>
p {
	font-size: 10pt;
	margin: 0px;
}
</style>
<title>수강</title>
</head> 
<body>
	<div style="width: 1200px; height: 500px; margin: auto;">
		<div style="text-align: right; position: relative;">봉사활동</div>
		<table border="1" width="1200" cellpadding="0" cellspacing="0"
			align="center">
			<tr height="30"">
				<td align="center" width="50"><p>종류</p></td>
				<td align="center" width="100"><p>장소</p></td>
				<td align="center" width="200"><p>기간</p></td>
				<td align="center" width="50"><p>지역</p></td>
				<td align="center" width="50"><p>시간</p></td>
				
			</tr>

			
				<tr height="30"">
					<td colspan="5">
				</tr>
		

			
				<tr height="30">
					<td align="center" width="100"></td>
					<td align="center" width="100"></td>
					<td align="center" width="200"></td>
					<td align="center" width="50"></td>
					<td align="center" width="50"></td>
			
				</tr>
		
		</table>
		<div style="text-align: right; position: relative;">사회경험</div>
		<table border="1" width="1200" cellpadding="0" cellspacing="0"
			align="center">
			<tr height="30"">
				<td align="center" width="50"><p>회사명</p></td>
				<td align="center" width="100"><p>근무기간</p></td>
				<td align="center" width="200"><p>업무내용</p></td>
				<td align="center" width="50"><p>직급</p></td>
				
			</tr>
			
			
				<tr height="30"">
					<td colspan="4">
				</tr>
			

		
				<tr height="30">
					<td align="center" width="100"></td>
					<td align="center" width="100"></td>
					<td align="center" width="200"></td>
					<td align="center" width="50"></td>
					
				</tr>
		
		</table>
	
<form:form action="" id="frm">
<p>회사명 : <input type="text" id="bussnm" name="bussnm" size=70></p>
<p>자격요건 : <input type="text" id="cer" name="cer" size="70"></p>
<p>연봉 : <input type="text" id="sal" name="sal"></p>
<p>내용</p>
<textarea name="content" id="content" rows="10" cols="100" style="width:766px; height:412px;"></textarea>
<input type="submit" id="saveBtn" value="글 쓰기"/>
</form:form>
</html>