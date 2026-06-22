<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Select the product</h1>
<h1>Category Id :  ${param.cid}</h1>
       <form action="addtocart">
		       <c:forEach var="p" items="${plist}">
		            <input type="checkbox" name="prod" value="${p.pid}:${p.pname}:${p.price}">
		            <label>${p.pname} ------> ${p.price }</label>
		       </c:forEach>
		       <button type="submit" name="btn" id="addcart" value="addcart">Add To Cart</button>
		       <button type="submit" name="btn" id="showcart" value="showcart">Show Cart</button>
       </form>







</body>
</html>