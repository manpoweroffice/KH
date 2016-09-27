<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자격증등록</title>
</head>
<body>
	<form action="license.do" method="post" enctype="multipart/form-data">
	<!-- <fieldset> -->
		<div style="width: 1200px; height: 500px; margin: auto;">
		<div style="text-align: left; position: relative;">
		<select name="kind">
						<option value="회원정보">구분선택</option>
						<option value="예약">예약</option>
						<option value="취소">취소</option>
						<option value="환불">환불</option>
						<option value="기타">기타</option>
		</select>
		</div>
		<!-- <div style="text-align: ; position: relative;">검색창이 들어올 자리</div> -->
		<table border="1" width="1200" cellpadding="0" cellspacing="0"
			align="center">
			<tr height="30"">
				<td align="center" width="100"><p>발행구분</p></td>
				<td align="center" width="200"><p>자격증종류</p></td>
				<td align="center" width="150"><p>자격증발행처</p></td>
				<td align="center" width="50"><p>취득일시</p></td>
				<td align="center" width="50"><p>증빙자료</p></td>
				<td align="center" width="100"><p>상태</p></td>
			</tr>
			<table>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" required="required" placeholder="이름"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pwd" required="required" placeholder="비밀번호"></td>
				</tr>
				<tr>
					<th>파일</th>
					<td><input type="file" name="uploadfile" required="required"></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" required="required" placeholder="제목"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea rows="20" cols="40" name="content" required="required" placeholder="내용"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="작성">
						<input type="reset" value="취소">
					</td>
				</tr>
			</table>
		<!-- </fieldset> -->
	</form>
</body>
</html>