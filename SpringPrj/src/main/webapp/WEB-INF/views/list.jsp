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
<h1>���</h1>


<form  method="post" action="update">
<table border="1px">

<tr>
<td>ID</td>
<td>��й�ȣ </td>
<td>�̸�</td>
<td>�̸���</td>
<td>����</td>
<td>����</td>
</tr>

<c:forEach var="value" items="${list}">
<tr>
<td>${value.userid}</td>
<td>${value.upw} </td>
<td>${value.uname}</td>
<td>${value.uemail}</td>
<td> <a href="update?userid=${value.userid}">����</td>
<td> <a href="delete?userid=${value.userid}">����</td>
</c:forEach>
</tr>


</table>
</form>
</body>
</html>