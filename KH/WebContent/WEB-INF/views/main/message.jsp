<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<title></title>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<link href="../../css/message.css" rel="stylesheet" media="screen">
<script>
	function pop(m_num){ 
		var form = document.popForm;
		window.open('', 'new', 'left=100,top=0,width=690,height=434');
		form.action="message.do";
		form.target="new";
		form.method="post";
		form.m_num.value=m_num;
		form.submit();
	}
	
	function message(){ 
		var form = document.messageForm;
		window.open('', 'new', 'left=100,top=0,width=500,height=500');
		form.action="message_insert.do";
		form.target="new";
		form.method="GET";
		form.submit();
	}
	
	function del(){
		$('.checkbox:checked').each(function(){
			var id = $(this).attr("id");
			$('#'+id).remove();
			var url="/KH/song/main/message_del.do";
			var params="m_num="+id;
			$.ajax({
				type:"post" //포스트 방식
					,url:url	//url 주소
					,data:params
					,dataType:"json"
			    ,success : function(obj) {
			    	$('.del').html();
			    },
			    error : function(xhr, status, error) {
			        console.log(error);
			    }
			});
		});
	}
</script>
</head>
<body>
	<form name="messageForm">
		<input type="button" value="쪽지쓰기" onClick="message()" class="button">
	</form>
	<form name="popForm" class="del">
		<table>
			<tr>
				<td>선택</td>
				<td>보낸사람</td>
				<td>제 목</td>
				<td>전송일자</td>
			</tr>
			<input type="hidden" name="m_num"/>
			<input type="button" value="삭 제" class="button" onclick="del()">
			<c:forEach var="messageList" items="${messageList}">
			<tr id="${messageList.m_num}">
				<td><input type="checkbox" name="checkbox" value="${messageList.m_num}" class="checkbox" id="${messageList.m_num}"></td>
				<td> ${messageList.send} </td>
				<td><a href="#" onClick="pop(${messageList.m_num})">${messageList.subject}</a></td>
				<%-- <td><a href="#" onClick="window.open('message.do', 'new', 'left=100,top=0,width=690,height=434');">${messageList.subject}</a></td>
				 --%><td> ${messageList.m_date} </td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>