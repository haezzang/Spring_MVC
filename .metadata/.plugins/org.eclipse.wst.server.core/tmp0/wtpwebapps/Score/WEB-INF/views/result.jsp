<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>결과</h1>

	<h2>이름 : ${dto.name}</h2>
	<h2>국어 : ${dto.kor}</h2>
	<h2>영어 : ${dto.eng}</h2>
	<h2>수학 : ${dto.math}</h2>
	<h2>총점 : ${dto.sum}</h2>
	<h2>평균 :${dto.avg}</h2>

</body>
</html>