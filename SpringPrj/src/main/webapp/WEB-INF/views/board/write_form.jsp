<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


<form  method="post" action="insert">
  ���� <input type="text" name="title"/><br>
  �۾��� <input type="text" name="writer"/><br>
  ��й�ȣ <input type="password" name="password"/><br>
  �̸��� <input type="text" name="email"/><br>
  ���� : <textarea rows="5" cols="20" name="content"></textarea><br>

  <button type="submit">�۾���</button>
  
</form>
</body>
</html>