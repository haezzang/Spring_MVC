<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>hi Spring MVC~</h1>


<form method="post" action="score_res">
   이름 : <input type="text" name="name"/><br>
   국어 : <input type="number" name="kor"/><br>
   영어 : <input type="number" name="eng"/><br>
   수학 : <input type="number" name="math"/><br>
   <button type="submit">입력완료</button>
   
</form>
</body>
</html>