<%@ page contentType="text/html; charset=UTF-8"  %>
<!DOCTYPE html>
<html>

<head>
</head>
<body>
<br/>
	<form action="upload.do" method="post" enctype="multipart/form-data">
		<br/>
		<input type="file" name="upload" />
		<br/>
		<input type="submit" value="저장"/>
		<input type="button" value="취소" onclick="window.close();">
	</form>

</body>
</html>