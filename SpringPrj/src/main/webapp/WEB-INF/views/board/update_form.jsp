<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


<form  method="post" action="update_board">
  제목 <input type="text" name="title"  value="${list. title}" /><br>
  글쓴이 <input type="text" name="writer"  value="${list.writer}" /><br>
  비밀번호 <input type="password" name="password"  value="${list.password}" /><br>
  이메일 <input type="text" name="email" value="${list.email}" /><br>
  내용 : <textarea rows="5" cols="20" name="content">${list.content}</textarea><br>

  <button type="submit">수정완료</button>
  
</form>
</body>
</html>