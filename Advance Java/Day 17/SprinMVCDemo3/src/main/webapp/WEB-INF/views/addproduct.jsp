<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  step 6 add encTtype entry in <form:form> tag and add type=File entry to select file
and go to productDaoImpl findAllProduct-->
<form:form
    modelAttribute="product"
    action="save"
    method="post"
    enctype="multipart/form-data">
  
   Product Id :  <form:input path="pid"/><br/>
    
   Product Name:
    <form:input path="pname"/>
      <form:errors path="pname"/><br/>
     Qty:
    <form:input path="qty"/>
     <form:errors path="qty"/><br/>
    
      Price:
    <form:input path="price"/> 
     <form:errors path="price"/><br/>
    
      MfgDate:
    <form:input path="mfgdate" type="date"/>

    <form:errors path="mfgdate"/><br/>
    
      cid:
    <form:input path="cid"/><br/>
    
    <!-- add this to accept the file  -->
    Image :
<input type="file" name="image"/>
<form:errors path="pimagefile"/>
<br><br>
    
       <button type="submit" value="Save">Save product</button>
</form:form>

</body>
</html>