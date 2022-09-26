<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<h1>상품등록하기</h1>

	<form method="post" action="file_uploads" enctype="multipart/form-data">
		<table>
			<tr>
				<td>상품이름</td>
				<td><input type="text" name="product_name"></td>
			</tr>
			<tr>
				<td>상품가격</td>
				<td><input type="text" name="product_price"></td>
			</tr>
			<tr>
				<td>상품설명</td>
				<td><input type="text" name="product_desc"></td>
			</tr>
			<tr>
				<td>상품이미지</td>
				<td><input type="file" name="product_img"></td>
			</tr>
			<tr>
				<td>
					<button type="submit">상품등록</button>
					<button type="submit">상품목록</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

