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
<form  method="post" action="update">
  ID : <input type="text" name="userid" value="${list.userid}"/><br>
    PW : <input type="text" name="upw" value="${list.upw}" /><br>
      NAME : <input type="text" name="uname" value="${list.uname}" /><br>
        EMAIL : <input type="text" name="uemail" value="${list.uemail}" /><br>
        <button type="submit">수정</button>
</form>
</body>
</html>