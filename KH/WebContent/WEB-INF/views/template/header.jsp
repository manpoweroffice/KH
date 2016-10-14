<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<link href="../../css/bell.css" rel="stylesheet" media="screen">
<link href="../../css/template.css" rel="stylesheet" media="screen">
<script src="../../js/bootstrap.js"></script>
<script>
$(function(){  
  
	$(".topnav").hover(function() { //마우스를 topnav에 오버시
		$(this).parent().find(".subnav").slideDown('normal').show(); //subnav가 내려옴.
		$(this).parent().hover(function() {  
		}, function(){  
			$(this).parent().find(".subnav").slideUp('fast'); //subnav에서 마우스 벗어났을 시 원위치시킴  
		});  
	});

    });
    
window.setInterval("refreshDiv()");
function refreshDiv(){
	document.getElementById("num").innerHTML
	var url="/KH/song/header.do";
	var params="dumi="+new Date();
	$.ajax({
		type:"post" //포스트 방식
			,url:url	//url 주소
			,data:params
			,dataType:"json"
	    ,success : function(obj) {
	    	if(obj.data=='0'){
	    		$(".num").remove();
	    	}
			$(".num span").each(function(){	//id가 city인 option요소에 적용할 반복문
				$(".num span").remove();	//city option의 0번째 항목이 없을 때까지 0번째 항목을 지운다. (기존에 있는 것 모두 지운다.)
			});
	    		$(".num").append("<span class=\"badge badge-important\">"+obj.data+"</span>");
	    },
	    error : function(xhr, status, error) {
	        console.log(error);
	    }
	});
}
	
// a태그를 post방식으로 보낼때 사용.
function pop1(stu_num){ 
	var form = document.hearderForm;
	form.action="/KH/gil/main/main.do";
	form.method="post";
	form.stu_num.value=stu_num;
	form.submit();
}

function pop2(stu_num){ 
	var form = document.hearderForm;
	form.action="/KH/gil/logout/logout.do";
	form.method="post";
	form.stu_num.value=stu_num;
	form.submit();
}
function pop3(stu_num){ 
	var form = document.menuForm;
	window.open('', 'new', 'left=100,top=0,width=800,height=600');
	form.action="/KH/yeji/certificate/certificateForm_f.do";
	form.target="new";
	form.method="GET";
	form.stu_num.value=stu_num;
	form.submit();
}

</script>
<body>
<form name="hearderForm">
	<div>
	<input type="hidden" name="stu_num"/>
	<a href="#" onClick="pop1(${msg})">
		<img alt="rogo" src="../../image/rogo2.jpg" id="rogo">
	</a>
	</div> 

	<div class="belldiv">
	<a data-toggle="popover" data-placement="bottom" id="example">
			<img src="../../image/bell.jpg" id="bell"></a>
	</div>
	<div class="num" id="num"></div>
	<nav>
	    <div id="one">
			<c:choose>
				<c:when test="${msg.equals('admin')}">
					<ul>
					    <li>${msg}</li>
					    <li><a href="/KH/song/main/message.do">쪽지함</a></li>
					  	<li><a href="#" onClick="pop2(${msg})">로그아웃</a></li><!--
					 --><li><a href="#">사이트맵</a></li>
					</ul>
				</c:when>
				<c:otherwise>
					<ul>
					    <li>${msg}</li>
					    <li><a href="/KH/song/main/message.do">쪽지함</a></li>
						<li><a href="#" onClick="pop2(${msg})">로그아웃</a></li><!--
					 --><li><a href="#">사이트맵</a></li>
					</ul>
				</c:otherwise>
			</c:choose>
	    </div>
	</nav>
</form>
<form name="menuForm">
<input type="hidden" name="stu_num"/>
	<div id="wrap">
	<div id="header">
			<div class="nav"> 
				<c:choose>
				<c:when test="${msg.equals('admin')}">
					<li class="navi_set">  
						<div class="topnav">신상관리</div>
						<ul class="subnav">  
							<li><a href="/KH/yeji/profile/basicForm.do">신상정보</a></li>
							<li><a href="#" onClick="pop3(${msg})">학력정보</a></li>
						</ul>
					</li><!--
					 --><li class="navi_set"><div class="topnav">학사관리</div></li><!--
					 --><li class="navi_set"><div class="topnav">이력관리</div>
					 		<ul class="subnav">
					 			<li><a href="/KH/chan/career/license.do">자격증</a></li>
					 			<li><a href="/KH/chan/career/education.do">교육훈련</a></li>
					 			<li><a href="/KH/chan/career/award.do">수상내역</a></li>
					 			<li><a href="/KH/chan/career/activity.do">기타활동</a></li>
					 		</ul>
					 </li>
					 	<li class="navi_set"><div class="topnav">자기소개서관리</div>
					 		<ul class="subnav">
					 			<li><a href="/KH/song/self/introduction.do">자기소개서</a></li>
					 			<li><a href="#">컨설팅</a></li>
					 		</ul>
					 	</li>
						<li class="navi_set"><div class="topnav">취업정보</div>
							<ul class="subnav">
					 			<li><a href="#">취업공고</a></li>
					 			<li><a href="/KH/jun/job/business.do">기업목록</a></li>
					 		</ul>
						</li><!--
					 --><li class="navi_set"><div class="topnav">커뮤니티</div></li>
				</c:when>
				<c:otherwise>
					<li class="navi_set">  
						<div class="topnav">신상관리</div>
						<ul class="subnav">  
							<li><a href="/KH/yeji/profile/basicForm.do">신상정보</a></li>
							<li><a href="#" onClick="pop3(${msg})">학력정보</a></li>
						</ul>
					</li><!--
					 --><li class="navi_set"><div class="topnav">학사관리</div>
					 	<ul class="subnav">
					 		<li><a href="/KH/yeji/scholarship/.do">장학내역</a></li>
					 	</ul>
					 </li><!--
					 --><li class="navi_set"><div class="topnav">이력관리</div>
					 	<ul class="subnav">
					 			<li><a href="/KH/chan/career/license.do">자격증</a></li>
					 			<li><a href="/KH/chan/career/education.do">교육훈련</a></li>
					 			<li><a href="/KH/chan/career/award.do">수상내역</a></li>
					 			<li><a href="/KH/chan/career/activity.do">기타활동</a></li>
					 		</ul>
					 </li>
					 	<li class="navi_set"><div class="topnav">자기소개서관리</div>
					 		<ul class="subnav">
					 			<li><a href="/KH/song/self/introduction.do">자기소개서</a></li>
					 		</ul>
					 	</li>
						<li class="navi_set"><div class="topnav">취업정보</div>
							<ul class="subnav">
					 			<li><a href="#">취업공고</a></li>
					 			<li><a href="/KH/jun/job/business.do">기업목록</a></li>
					 		</ul>
						</li><!--
					 --><li class="navi_set"><div class="topnav">커뮤니티</div></li>
				</c:otherwise>
				</c:choose>
			</div>
	</div>
</div>
</form>
</body>