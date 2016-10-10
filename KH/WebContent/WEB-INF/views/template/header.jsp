<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<link href="../../image/bell.css" rel="stylesheet" media="screen">
<script src="../../image/bootstrap.js"></script>
<style>
*{font-size: 13px;}
div, ul, li{margin:0px; padding:0px;}
ul, li{list-style:none;}

#wrap {
	position: relative;
	top:-50;
	left:700;
}

.nav {
	height:35px;
	list-style: none;
	width:800px;
	margin:auto;
	color:#000;
}

.topnav{
	text-align:center;
	width:100px;
	height:15px;
	cursor:pointer;
	font-weight:bold;
}
.topnav li:HOVER{
	background: #000;
}

.navi_set{
	float: left;
	padding:10px;
	position: relative;
}

.subnav{
	position: absolute;
	left: 0; top: 35px;
	display: none;
}

/* li속성 */
.subnav li{
	padding:10px;
	width:100px;
	text-align:center;
	cursor:pointer;
	background: #fff;
}

/* 마우스 오버 시 라인 색변경*/
.subnav li:hover{
	background:#6799FF;
}

/* 클릭 후 적용 */
.subnav>li>a{
	color:#000;
	text-decoration: none;
}

</style>
<script>
$(function(){  
  
	$(".topnav").hover(function() { //마우스를 topnav에 오버시
		$(this).parent().find(".subnav").slideDown('normal').show(); //subnav가 내려옴.
		$(this).parent().hover(function() {  
		}, function(){  
			$(this).parent().find(".subnav").slideUp('fast'); //subnav에서 마우스 벗어났을 시 원위치시킴  
		});  
	});
	
    	var url="/KH/song/header.do";
    	var params="dumi="+new Date();
        $.ajax({
    		type:"post" //포스트 방식
    			,url:url	//url 주소
    			,data:params
    			,dataType:"json"
            ,success : function(obj) {
    			$("#num").append("<span class=\"badge badge-important\">"+idx+"</span>");
            },
            error : function(xhr, status, error) {
                console.log(error);
            }
        }); 
    });

</script>
<body>
	<div>
	<a href="#">
		<img alt="rogo" src="../../image/rogo2.jpg" id="rogo">
	</a>
	</div>
	<div class="belldiv">
	<a data-toggle="popover" data-placement="bottom" id="example">
			<img src="../../image/bell.jpg" id="bell"></a>
	</div>
	<div class="num"></div>
	<nav>
	    <div id="one">
			<c:choose>
				<c:when test="${msg.equals('admin')}">
					<ul>
					    <li>${msg}</li>
					    <li><b><a href="/KH/song/main/message.do">쪽지함</a></b>
					  	<li><a href="#">로그아웃</a></li><!--
					 --><li><a href="#">사이트맵</a></li>
					</ul>
				</c:when>
				<c:otherwise>
					<ul>
					    <li>${msg}</li>
					    <li><b><a href="/KH/song/main/message.do">쪽지함</a></b>
						<li><a href="#">로그아웃</a></li><!--
					 --><li><a href="#">사이트맵</a></li>
					</ul>
				</c:otherwise>
			</c:choose>
	    </div>
	</nav>
	<div id="wrap">
	<div id="header">
			<div class="nav"> 
				<c:choose>
				<c:when test="${msg.equals('admin')}">
					<li class="navi_set">  
						<div class="topnav">신상관리</div>
						<ul class="subnav">  
							<li><a href="/KH/yeji/profile/basicForm.do">신상정보</a></li>
							<li><a href"#">학력정보</a></li>
						</ul>
					</li><!--
					 --><li class="navi_set"><div class="topnav">학사관리</div></li><!--
					 --><li class="navi_set"><div class="topnav">이력관리</div></li>
					 	<li class="navi_set"><div class="topnav">자기소개서관리</div></li>
						<li class="navi_set"><div class="topnav">취업정보</div></li><!--
					 --><li class="navi_set"><div class="topnav">커뮤니티</div></li>
				</c:when>
				<c:otherwise>
					<li class="navi_set">  
						<div class="topnav">신상관리</div>
						<ul class="subnav">  
							<li><a href="/KH/yeji/profile/basicForm.do">신상정보</a></li>
							<li><a href"#">학력정보</a></li>
						</ul>
					</li><!--
					 --><li class="navi_set"><div class="topnav">학사관리</div></li><!--
					 --><li class="navi_set"><div class="topnav">이력관리</div></li>
					 	<li class="navi_set"><div class="topnav">자기소개서관리</div></li>
						<li class="navi_set"><div class="topnav">취업정보</div></li><!--
					 --><li class="navi_set"><div class="topnav">커뮤니티</div></li>
				</c:otherwise>
				</c:choose>
			</div>
	</div>
</div>
</body>