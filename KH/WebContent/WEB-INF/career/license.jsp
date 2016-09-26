<%@ page contentType="text/html; charset=UTF-8" %>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<html>
	<head>
		<%-- <title><spring:message code="login.form.title"/></title>
		<!--  디스패처에 등록된  message<value> 에 값을 넣어 사용할수 있게한다 --> --%>
	</head>
	<body>
	<form:form commandName="login">
	<!-- f12눌러서 보면 spring 커스텀 태그는 보이지 않는다 / 써도되고 안써도 굳이 상관은 없다.
	다만 쓰는이유는 spring 장점중 하나는 폼에 입력한 값을 커맨드 객체에 맞춰 저장한다 ppt p187 1번째줄 참고 -->
	<form:errors />
	<!-- 필드명 지정 안되있으면 글로벌 에러를 가져온다
	글로벌 에러 생성법은 reject메서드 사용하면 전반적인 에러 내용이 출력된다  -->
	<p>
		<label for="loginType"><spring:message code="login.form.type" /></label>
		<form:select path="loginType" items="${loginTypes}" />
	</p>
	<p>
		<label for="id"><spring:message code="login.form.id" /></label>
		<form:input id="id" path="id"/>
		<!-- input 타입이고 텍스트 형식 -->
		<form:errors path="id" />
	</p>
	<p>
		<label for="password"><spring:message code="login.form.password" /></label>
		<form:password id="password" path="password"/>
		<form:errors path="password" />
	</p>
	<p>
		<input type="submit" value="<spring:message code="login.form.submit" />">
	</p>
	</form:form>
	</body>
	</html>

	