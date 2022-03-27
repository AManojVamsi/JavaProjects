<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.airlinebooking.flyaway.dao.RouteDoa"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FlyAway</title>
<style>
      table {
        border-collapse: separate;
        border-spacing:15px;
      }
 </style>
</head>
<body>
<%@include  file="header.html" %>
<center>
<p1>Add Flight</p1>
<table>
	<form action="addflight" method="post">
	<tr>
		<td>
		 	<label for="name">Flight Name</label>
   		 	<input type="text" placeholder="Flight Name" name="name" required>
		</td>
		<td></td>
		<td>
						<label for="source">Source</b></label><select name="source">
								<%ResultSet resultSet= RouteDoa.getSource();
							 while(resultSet.next()){ %>
								<option><%= resultSet.getString(1)%></option>
								<% } %>
						</select>
						</td>
						<td>
					<label for="source">Destination</b></label><select name="destination">
						<%ResultSet resultSetDestination= RouteDoa.getDestination();
						 while(resultSetDestination.next()){ %>
						<option>
							<%= resultSetDestination.getString(1)%>
						</option>
						<% } %> 
					</select>
					</td>
					<td>
		<label for="rate">Rate</b></label>
   	 	 <input type="text" placeholder="Rate" name="rate" required>
		</td>
	</tr>
	<tr>
	<tr></tr>
		<td>
			 <button type="submit">Add Flight</button>
		</td>
	</tr>
	  </form>
</table>
</center>

    
    
 
</body>
</html>

