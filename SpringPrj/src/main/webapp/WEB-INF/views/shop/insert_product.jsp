<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

<title>product add form</title>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(function(){
   $("#addBtn").click(function(){
      var productName=$("#productName").val();
      var productPrice=$("#productPrice").val();
      var productDesc=$("#productDesc").val();
      var productImage=$("#productImage").val();

      if(productName==""){
         alert("input name");
         productName.focus();
      }
      else if(productPrice==""){
         alert("input productPrice");
         productPrice.focus();
      }
      else if(productDesc==""){
         alert("input productDesc");
         productDesc.focus();
      }
      document.myForm.action="product/insert";
      document.myForm.submit();
   });

   $("#listBtn").click(function(){
      location.href="list";
   });
})
</script>
</head>
<body>
   <h1>상품 등록</h1>
   <form id="myForm" name="myForm"
      enctype="multipart/form-data" method="post" action="product/insert">
      <table>
         <tr>
            <td>상품이름</td>
            <td><input type="text" id="productName" name="productName" /></td>
         </tr>
         <tr>
            <td>상품가격</td>
            <td><input type="number" id="productPrice" name="productPrice" /></td>
         </tr>
         <tr>
            <td>상품설명</td>
            <td><textarea name="productDesc" id="productDesc" rows="5" cols="60"></textarea></td>
         </tr>
         <tr>
            <td>상품이미지</td>
            <td><input type="file" id="productImage" name="productImage"></td>
         </tr>
         <tr>
            <td colspan="2" align="center">
            <input type="button" value="상품 등록" id="addBtn"> 
            <input type="button" value="상품 등록" id="listBtn">
            </td>
         </tr>
      </table>
   </form>
</body>
</html>