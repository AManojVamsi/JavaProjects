<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flyway Airlines</title>
<style>
      table {
        border-collapse: separate;
        border-spacing:10px;
      }
  </style>
</head>
<body>
<%@include file="header.html"%>

</body>

<center>
<p1>Payment Successfull<p1>
<table>	
	<tr>
		<td><b>Name</td>
		<td><%out.println(request.getAttribute("name")); %></td>
	</tr>
	<tr>
		<td><b>Age</td>
		<td><%out.println(request.getAttribute("age")); %></td>
	</tr>
	<tr>
		<td><b>Mobile Number</td>
		<td><%out.println(request.getAttribute("mobile")); %></td>
	</tr>
	<tr>
		<td><b>Departure Date</td>
		<td><%out.println(request.getAttribute("date")); %></td>
	</tr>
	<tr>
		<td><b>Flight Name</td>
		<td><%out.println(request.getAttribute("flightname")); %></td>
	</tr>
	<tr>
		<td><b>Source</td>
		<td><%out.println(request.getAttribute("source")); %></td>
	</tr>
	<tr>
		<td><b>Destination</td>
		<td><%out.println(request.getAttribute("destination")); %></td>
	</tr>
	<tr>
		<td><b>Rate</td>
		<td><%out.println(request.getAttribute("rate")); %></td>
	</tr>


<!--  <tr>
	<td><b>Name :</b> <%out.println(request.getAttribute("name")); %></td>
	<td><b>Age : </b><%out.println(request.getAttribute("age")); %></td>
	<td><b>Mobile Number:</b><%out.println(request.getAttribute("mobile")); %></td>
	<td><b>Flight Name :</b> <%out.println(request.getAttribute("flightname")); %></td>
	<td><b>Source : </b><%out.println(request.getAttribute("source")); %></td>
	<td><b>Destination&nbsp&nbsp:</b><%out.println(request.getAttribute("destination")); %></td>
	<td><b>Rate :</b><%out.println(request.getAttribute("rate"));%></td>
	</tr>-->
</table>
</center>

</html>