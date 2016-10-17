<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<script src="../../js/bootstrap.js"></script>
<link href="../../css/login.css" rel="stylesheet" media="screen">
<link href="../../css/bootstrap.css" rel="stylesheet" media="screen">
<script>
	$(function(){
		$('.carousel').carousel()
	});
</script>
</head>
<body>
<center>
<div id="myCarousel" class="carousel slide">
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>
    <!-- 회전광고판 항목 -->
    
  <div class="carousel-inner">
    <div class="item active"><img alt="대학교전경" src="../../image/ox2.jpg" class="login"></div>
    <div class="item"><img alt="대학교" src="../../image/ox3.jpg" class="login"></div>
    <div class="item"><img alt="대학교도서관" src="../../image/ox1.jpg" class="login"></div>
  </div>
</div>
</center>
<form:form name="submitForm" method="POST" commandName="LoginCommand">
<img alt="로고" src="../../image/rogo2.jpg" class="index">
<br><br>
        <div align="center">
            <table>
                <tr>
                    <td>학&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번&nbsp;&nbsp;</td>
                    <td><input type="text" name="stu_num" /></td>
               
                </tr>
                <tr>
                    <td>비밀번호&nbsp;&nbsp;</td>
                    <td><input type="password" name="pwd" /></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="로그인" class="button"/></td>
                </tr>
            </table>
            <div style="color: red">${error}</div>
        </div>
    </form:form>

</body>
</html>