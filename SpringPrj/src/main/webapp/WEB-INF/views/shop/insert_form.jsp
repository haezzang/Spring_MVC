<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<h1>��ǰ����ϱ�</h1>

	<form method="post" action="file_uploads" enctype="multipart/form-data">
		<table>
			<tr>
				<td>��ǰ�̸�</td>
				<td><input type="text" name="product_name"></td>
			</tr>
			<tr>
				<td>��ǰ����</td>
				<td><input type="text" name="product_price"></td>
			</tr>
			<tr>
				<td>��ǰ����</td>
				<td><input type="text" name="product_desc"></td>
			</tr>
			<tr>
				<td>��ǰ�̹���</td>
				<td><input type="file" name="product_img"></td>
			</tr>
			<tr>
				<td>
					<button type="submit">��ǰ���</button>
					<button type="submit">��ǰ���</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

