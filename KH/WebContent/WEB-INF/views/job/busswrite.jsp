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
			bUseVerticalResizer:false,
			//모드 탭(Editor| HTML | TEXT) 사용 여부 (true: 사용/ false: 사용하지 않음)
			bUseModeChanger : false,
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
<title>Insert title here</title>
</head>
<body>
<form:form action="/KH/jun/job/busswrite.do" id="frm">
<p>회사명 : <input type="text" id="bussnm" name="bussnm" size=70></p>
<p>자격요건 : <input type="text" id="cer" name="cer" size="70"></p>
<p>관련직종 : <input type="text" id="rel" name="rel" size="50"></p> 
<p>연봉 : <input type="text" id="sal" name="sal"></p>
<p>내용</p>
<textarea name="content" id="content" rows="10" cols="100" style="width:766px; height:412px;"></textarea>
<input type="submit" id="saveBtn" value="글 쓰기"/>
</form:form>
</body>
</html>