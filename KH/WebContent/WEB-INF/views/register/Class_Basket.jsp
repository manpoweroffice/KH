<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String cp= request.getContextPath();
//request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<title>수강</title>
<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
<script>
$(function(){
	var url="/KH/jun/register/lectureList.do";
	$.ajax({
		 type:"post" //포스트 방식
		,url:url   //url주소
		,dataType:"json"
		,success:function(args){
			for(var idx=0; idx<args.data.length; idx++){
				$('#frm').append("<tr><td align='center' width='50'><input type='checkbox' name='lecture_code' value='"+args.data[idx].lecture_code+"'></td>"+
						"<td align='center' width='130'>"+args.data[idx].lecture_code+"</td>"+
						"<td align='center' width='200'>"+args.data[idx].lecture_name+"</td>"+
						"<td align='center' width='50'>"+args.data[idx].grade+"</td>"+
						"<td align='center' width='50'>"+args.data[idx].time+"</td>"+
						"<td align='center' width='100'>"+args.data[idx].prof_name+"</td>"+
						"<td align='center' width='400'>"+args.data[idx].lecture_time+"</td>"+
						"<td align='center' width='100'>"+args.data[idx].application+"</td>"+
						"<td align='center' width='100'>"+args.data[idx].appli_limit+"</td></tr>");
			}
		},error:function(e){alert(e.responseText);}
	});
	var url1="/KH/jun/register/reserveList.do";
	$.ajax({
		 type:"post" //포스트 방식
		,url:url1   //url주소
		,dataType:"json"
		,success:function(args){
			for(var idx=0; idx<args.data1.length; idx++){
				$('#frm2').append("<tr><td align='center' width='50'><input type='checkbox' name='lecture_code' value='"+args.data1[idx].lecture_code+"'></td>"+
						"<td align='center' width='130'>"+args.data1[idx].lecture_code+"</td>"+
						"<td align='center' width='200'>"+args.data1[idx].lecture_name+"</td>"+
						"<td align='center' width='50'>"+args.data1[idx].grade+"</td>"+
						"<td align='center' width='50'>"+args.data1[idx].time+"</td>"+
						"<td align='center' width='100'>"+args.data1[idx].prof_name+"</td>"+
						"<td align='center' width='400'>"+args.data1[idx].lecture_time+"</td>"+
						"<td align='center' width='100'>"+args.data1[idx].application+"</td>"+
						"<td align='center' width='100'>"+args.data1[idx].appli_limit+"</td></tr>");
			}
		},error:function(e){alert(e.responseText);}
	});
	$("#addBtn").click(function(){
		//폼 submit
		$("#form1").submit();
	});
	$("#delBtn").click(function(){
		//폼 submit
		$("#form2").submit();
	});
});

</script>
</head>
<body>

	<div style="width: 1200px; height: 500px; margin: auto;">
		<div style="width:1180px; float:left; text-align: right; position: relative;">미리담기</div>
		<form action="/KH/jun/register/class_basket.do" method="post" name="checkList" id="form1">
		<table border="1" width="1180px" cellpadding="0" cellspacing="0">
			<tr height="30"">
					<td align="center" width="50">체크</td>
 				<td align="center" width="130">강의코드</td>
 				<td align="center" width="200">강의명</td>
 				<td align="center" width="50">학점</td>
 				<td align="center" width="50">시간</td>
 				<td align="center" width="100">담담교수</td>
 				<td align="center" width="400">강의시간</td>
 				<td align="center" width="100">신청인원</td>
 				<td align="center" width="100">제한인원</td>
			</tr>
		</table>
	
		<div style="overflow: auto; width: 1200px; height: 305px;">
			<table border="1" id="frm" width="1180" cellpadding="0" cellspacing="0">

			</table>
		</div>
	
		<div style="width:1180px; float:left; text-align: right; position: relative;">
			<input type="submit" value="담기" id="addBtn">
		</div>
		</form>
		<form action="/KH/jun/register/delete.do" method="post" name="checkList" id="form2">
		<table border="1" width="1180" cellpadding="0" cellspacing="0"
			align="center">
			<tr height="30"">
						<td align="center" width="50">체크</td>
 				<td align="center" width="130">강의코드</td>
 				<td align="center" width="200">강의명</td>
 				<td align="center" width="50">학점</td>
 				<td align="center" width="50">시간</td>
 				<td align="center" width="100">담담교수</td>
 				<td align="center" width="400">강의시간</td>
 				<td align="center" width="100">신청인원</td>
 				<td align="center" width="100">제한인원</td>
			</tr>
		</table>
		<div style="overflow: auto; width: 1200px; height: 300px;" align="center">
					<table border="1" width="1180" id="frm2" cellpadding="0" cellspacing="0" align="center">
				
			</table>
		</div>

		<div style="width:1180px; float:left; text-align: right; position: relative;">
			<input type="submit" value="삭제" id="delBtn">
		</div>
		</form>
	</div>
	
</body>
</html>