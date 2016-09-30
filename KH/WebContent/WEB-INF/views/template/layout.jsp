<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title>KH인트라넷</title>
<style>
	.layoutTable{
		width: 1600px;
	}
</style>
</head>
<body class="no">
	<table class="layoutTable">
		<tr>
			<td colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr>
			<td width="400px"><tiles:insertAttribute name="side" /></td>
			<td width="1200px"><tiles:insertAttribute name="main" /></td>
		</tr>
		<tr>
			<td><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table>
</html>