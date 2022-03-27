<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FlyAway</title>
</head>
<body>
<%@include  file="header.html" %>
<center>
<p1>Update Password</p1>
<table>
	
	<form action="updatepassword" method="post">
	<tr>
		<td>
		 	<label for="username">UserName</label>
   		 	<input type="text" placeholder="User Name" name="username" required>
		</td>
		<td></td>
		<td>
		<label for="password">New Password</b></label>
   	 	 <input type="password" placeholder="destination" name="password" required>
		</td>
	</tr>
	<tr>
	<tr></tr><tr></tr><tr></tr>
		<td>
		 <button type="submit">Update Password</button>
		</td>
	</tr>
	  </form>
</table>

    
    
 </center>
</body>
</html>

