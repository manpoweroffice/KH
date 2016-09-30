<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../resources/naverEditor/js/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.0/jquery.js"></script>
<script type="text/javascript">
//네이버에디터
var oEditors=[];
$(function(){ 
	nhn.husky.EZCreator.createInIFrame({
		oAppRef:oEditors,
		elPlaceHolder:"content",
		sSkinURI:"../resources/naverEditor/SmartEditor2Skin.html",
		htParams:{
			bUseToolbar:true,
			bUseVerticalResizer:false,
			bUseModeChanger:false,
			fOnBeforeUpload :function(){}
		},
		fOnAppLoad :function(){
			//기존 저장된 내용의 text내용을 에디터상에 뿌려주고자 할때 사용
			oEditors.getById["content"].exec("PASTE_HTML",['${bussVo.content}']);
		},
		fCreator:"creatSEditor2"
	});
	$("#updateBtn").click(function(){
		//id가 content인 textarea에 에디터에서 대입
		oEditors.getById["content"].exec("UPDATE_CONTENTS_FIELD",[]);
		//폼 submit
		$("#frm").submit();
	})
})

</script>
<title>Insert title here</title>
</head>
<body>
<form:form action="/KH/jun/job/bussUpdate.do" id="frm">
<input type="hidden" id="num" name="num" value="${bussVo.num}">
<p>회사명 : <input type="text" id="bussnm" name="bussnm" value="${bussVo.bussnm}" size=30> &nbsp; 자격요건 : <input type="text" id="cer" name="cer" size="30" value="${bussVo.cer}"></p>
<p>관련직종 : <input type="text" id="rel" name="rel" size="30" value="${bussVo.rel}" > &nbsp; 연봉 : <input type="text" id="sal" name="sal" size="30" value="${bussVo.sal}"></p> 
<p></p>
<p>내용</p>
<textarea name="content" id="content" rows="10" cols="100" style="width:766px; height:412px;"></textarea>
<div align="right">
<input type="submit" id="updateBtn" value="수정"/>
<input type="button" value="취소" onclick="location.href='/KH/jun/job/bussView.do?num=${bussVo.num}'">
<input type="button" value="목록" onclick="location.href='/KH/jun/job/business.do'">
</div>
</form:form>
</body>
</html>