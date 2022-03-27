<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Usage of useBean tag<br>
<jsp:useBean id="productBean" class="advanced.java.program.ProductBean" scope="session"></jsp:useBean>
        <jsp:setProperty property="productId" name="productBean" value="18791"/>
        <jsp:setProperty property="productName" name="productBean" value="Optical Wireless Mouse"/>
        <jsp:setProperty property="price" name="productBean" value="600.00"/>

<a href="showbean.jsp">Access bean properties from another page</a><br>
<a href="forward.jsp">Use Forward action to go to Google</a><br>

<hr>

<jsp:text>
        <![CDATA[This is my content.<br/>This will show within a text action tag exactly as it has been entered]]>
</jsp:text>

</body>

</html>