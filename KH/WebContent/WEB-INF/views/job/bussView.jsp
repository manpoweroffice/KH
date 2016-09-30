<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
			bUseToolbar:false,
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
});
</script>
<title>게시판 보기</title>
</head>
<body>
<div id="detail">
<p>회사명 : ${bussVo.bussnm} &nbsp;  자격요건 : ${bussVo.cer}</p>
<p>관련직종 : ${bussVo.rel} &nbsp; 연봉 : ${bussVo.sal} &nbsp; 등록일 : <fmt:formatDate value="${bussVo.reg_date}" pattern="yyyy년 MM월 dd일"/> </p>
내용
<textarea name="content" id="content" rows="10" cols="100" style="width:766px; height:412px;"></textarea>
</div>
<div align="center">
<input type="button" value="수정" class="inputb" onclick="location.href='/KH/jun/job/bussUpdate.do?num=${bussVo.num}'">
<input type="button" value="삭제" class="inputb" onclick="location.href='/KH/jun/job/bussDelete.do?num=${bussVo.num}'">
<input type="button" value="목록" class="inputb" onclick="location.href='/KH/jun/job/business.do'">
</div>
</body>
</html>