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
<td>번호</td>
<td>제목</td>
<td>글쓴이</td>
<td>조회수</td>
<td>날짜</td>
</tr>

<c:forEach var="value" items="${list}">
<tr>
<td>${value.idx}</td> 
<td>${value.title} </td>
<td>${value.writer}</td>
<td>${value.hit}</td>
<td>${value.regDate}</td>
<td> <a href="update_board?idx=${value.idx}">수정</td>
<td> <a href="delete_board?idx=${value.idx}">삭제</td>
</c:forEach>
</tr>

</body>
</html>