<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>



<form  method="post">
<table border="1px">

<tr>
<td>��ȣ</td>
<td>����</td>
<td>�۾���</td>
<td>��ȸ��</td>
<td>��¥</td>
</tr>

<c:forEach var="value" items="${list}">
<tr>
<td>${value.idx}</td> 
<td>${value.title} </td>
<td>${value.writer}</td>
<td>${value.hit}</td>
<td>${value.regDate}</td>
<td> <a href="update_board?idx=${value.idx}">����</td>
<td> <a href="delete_board?idx=${value.idx}">����</td>
</c:forEach>
</tr>

</body>
</html>