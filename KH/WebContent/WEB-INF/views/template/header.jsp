<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<script>
	$(function(){
		$("ul.menu li").hover(function(){
			$(">ul:not(:animated)",this).slideDown("fast");
		},
		function(){
			$(">ul",this).slideUp("fast");
		});
	});
</script>
<style>
	#rogo{
		width : 400;
	}
	#one {
		font-size : 12px;
		padding: 0;
		margin: 0 auto;
		position: absolute;
		right: 20px;
		top: 1px;
	}

	#one>ul {
		list-style: none;
		padding: 10px 0;
	}

	#one>ul>li {
		display: inline;
		text-transform: uppercase;
		padding: 0 10px;
		color: #000000;
	}
	
	#one>ul>li>a {
		text-decoration: none;
		color: #000000;
	}
	
	#two {
		padding: 0;
		margin: 0 auto;
		position: absolute;
		right: 20px;
		top: 70px;
	}

	#two>ul {
		list-style: none;
	}

	#two>ul>li {
		border: 1px solid;
		display: inline;
		text-transform: uppercase;
		padding: 5 0;
		color: #000000;
	}
	#two>ul>li>a {
		padding: 5 40;
		text-decoration: none;
		color: #000000;
	}
	#two>ul>li>a:hover{
		padding: 5 40;
		background-color: #000000;
		color:#FFFFFF;
	}
	ul.sub {
		display: none;
		background: #FFFFFF;
		border: 2px solid;
	}

	ul.sub li {
		float: none;
	}
	
</style>
<body>
	<a href="#">
		<img alt="rogo" src="../image/rogo2.jpg" id="rogo">
	</a>
	<nav>
	    <div id="one">
			<c:choose>
				<c:when test="${memId.equals('admin')}">
					<ul>
					    <li>${memId}</li>
					  	<li><a href="#">로그아웃</a></li><!--
					 --><li><a href="#">사이트맵</a></li>
					</ul>
				</c:when>
				<c:otherwise>
					<ul>
					    <li>${memId}</li>
						<li><a href="#">로그아웃</a></li><!--
					 --><li><a href="#">사이트맵</a></li>
					</ul>
				</c:otherwise>
			</c:choose>
	    </div>
	</nav>
	<nav> 
	    <div id="two">
			<c:choose>
				<c:when test="${memId.equals('admin')}">
					<ul>
					  	<li><a href="#">신상관리</a>
					  		<ul class="sub">
								<li><b><a href="#">신상정보</a></b></li>
								<li><b><a href="#">학력정보</a></b></li>
							</ul>
						</li><!--
					 --><li><a href="#">학사관리</a></li><!--
					 --><li><a href="#">이력관리</a></li><!--
					 --><li><a href="#">자기소개서관리</a></li><!--
					 --><li><a href="#">취업정보</a></li><!--
					 --><li><a href="#">커뮤니티</a></li>
					</ul>
				</c:when>
				<c:otherwise>
					<ul>
					  	<li><a href="#">신상관리</a></li><!--
					 --><li><a href="#">학사관리</a></li><!--
					 --><li><a href="#">이력관리</a></li><!--
					 --><li><a href="#">자기소개서관리</a></li><!--
					 --><li><a href="#">취업정보</a></li><!--
					 --><li><a href="#">커뮤니티</a></li>
					</ul>
				</c:otherwise>
			</c:choose>
	    </div>
	 </nav>   
</body>