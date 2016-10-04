<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

</head>
<body>

<form:form name="submitForm" method="POST" commandName="LoginCommand">
        <div align="center">
            <table>
                <tr>
                    <td>학 번</td>
                    <td><input type="text" name="stu_num" /></td>
               
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="pwd" /></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="로그인" /></td>
                </tr>
            </table>
            <div style="color: red">${error}</div>
        </div>
    </form:form>

</body>
</html>