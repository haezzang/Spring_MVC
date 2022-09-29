<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<table border="1px">

		<tr>
			<td>상품이름</td>
			<td>${list.productName}</td>
		</tr>
		
		<tr>
			<td>상품이미지</td>
			<td><img src="img/${list.productUrl}"></td>
		</tr>
		
		<tr>
			<td>상품가격</td>
			<td>${list.productPrice}</td>
		</tr>
		

	</table>
</body>
</html>