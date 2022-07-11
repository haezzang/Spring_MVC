<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>업로드하라우</h1>
	<form method="post" action="file_uploads" enctype="multipart/form-data" >
		파일업로드 <input type="file" name="file" >
		<button type="submit">전송~</button>
	</form>
</body>
</html>