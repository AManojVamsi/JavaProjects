<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%-- This is JSP ccmments using JSP COmment tag--%>
	<%  
	String name=request.getParameter("uname");  
	out.print("welcome "+name);  
	%>  
	<br><br><br>
	
	Expression Tag:::: Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
	<%= "Welcome "+ request.getParameter("uname") %>  
	<br><br><br>
	
	Declaration Tag::: 
	<%! int data=50; 

	%>  
    <%= "Value of the variable is:"+ data %>  
    
    <!-- We are on this Page  -->
</body>
</html>