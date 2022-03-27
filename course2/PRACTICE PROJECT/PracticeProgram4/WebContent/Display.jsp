<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
</head>
<body>
<h1>Displaying the Product Details....</h1>
<hr>
<%= "Product Id : " + session.getAttribute("pid") %> <br> <br>

<%= "Product Name : " + session.getAttribute("pname") %>  <br> <br>

<%= "Product Price : " + session.getAttribute("pprice") %>
</hr>
</body>
</html>