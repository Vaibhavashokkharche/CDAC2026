<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
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
</html> --%>

<%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>

<html>
<body>

<h2>Update Product</h2>

<form:form
    action="${pageContext.request.contextPath}/product/update"
    method="post"
    modelAttribute="product"
    >

    <table>

        <tr>
            <td>Product Id</td>
            <td>
                <form:input path="pid" readonly="true"/>
            </td>
        </tr>

        <tr>
            <td>Product Name</td>
            <td>
                <form:input path="pname"/>
                <form:errors path="pname"/>
            </td>
        </tr>

        <tr>
            <td>Quantity</td>
            <td>
                <form:input path="qty"/>
                <form:errors path="qty"/>
            </td>
        </tr>

        <tr>
            <td>Price</td>
            <td>
                <form:input path="price"/>
                <form:errors path="price"/>
            </td>
        </tr>

        

        

        <tr>
            <td colspan="2">
                <input type="submit" value="Update Product">
            </td>
        </tr>

    </table>

</form:form>

</body>
</html>