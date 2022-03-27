<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="header.html"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<center>
		<p1>Admin Panel</p1>
		<br>
		<p>Welcome <%out.println(request.getAttribute("username")); %>
		<br> <br> <a href="changepassword.jsp" style="text-decoration:none">Change password</a>
		 <br><br> 
		 <a href="addroute.jsp" style="text-decoration:none">Add Route</a> 
		 <br> <br> 
		 <a href="addflight.jsp" style="text-decoration:none">Add Flight</a>
	</center>
</body>

</html>