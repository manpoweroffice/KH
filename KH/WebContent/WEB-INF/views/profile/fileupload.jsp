<%@ page contentType="text/html; charset=UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h2>파일업로드</h2>
<form action="./upload" method="post" enctype="multipart/form-data">
		<input type="file" name="imageFile"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>