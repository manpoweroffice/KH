<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title>KH인트라넷</title>

<style>
	.layoutTable{
		width: 1100px;
	}
</style>
</head>
<body class="no">
	<table class="layoutTable">
		<tr id="header">
			<td colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr height="750px">
			<td width="300px"><tiles:insertAttribute name="side" /></td>
			<td width="800px"><tiles:insertAttribute name="main" /></td>
		</tr>
		<tr>
			<td><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table>
</html>