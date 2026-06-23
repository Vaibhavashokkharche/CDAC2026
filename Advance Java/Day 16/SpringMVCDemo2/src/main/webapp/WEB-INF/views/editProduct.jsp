<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <form:form
    modelAttribute="product"
    action="updateproduct"
    method="post"> -->
    <form action="/SpringMVCDemo2/product/updateproduct"
    method="post">
  
   Product Id :  <input type="text" name="pid" value="${product.pid }" readonly/><br/>
   Product Name: <input type="text" name="pname" value="${product.pname}"> <br/>
    Product qty: <input type="text" name="qty" value="${product.qty}"> <br/>
     Product price: <input type="text" name="price" value="${product.price}"> <br/>
      Product mfgdate: <input type="date" name="mfgdate" value="${product.mfgdate}"> <br/>
       Product Cid: <input type="text" name="cid" value="${product.cid}"> <br/>
    
       <button type="submit" value="Save">Update product</button>
</form>
</body>
</html>