<%@page import="com.demo.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.demo.model.Category"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Choose the Categories</h1>
<form action="display" Method="Post">
<select name="catid">

<%
List<Category> clist = (List<Category>)request.getAttribute("clist");
for(Category c:clist){
	%>

<option value=<%=c.getCid() %>><%=c.getCname()%></option>
	
	
<% }%>	

</select>

<button type="submit" name="btn" value="add">Add Product</button>
<button type="submit" name="btn" value="show" id="show">Show Product</button>
</form>
</body>
</html>