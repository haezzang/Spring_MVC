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
  제목 <input type="text" name="title"/><br>
  글쓴이 <input type="text" name="writer"/><br>
  비밀번호 <input type="password" name="password"/><br>
  이메일 <input type="text" name="email"/><br>
  내용 : <textarea rows="5" cols="20" name="content"></textarea><br>

  <button type="submit">글쓰기</button>
  
</form>
</body>
</html>