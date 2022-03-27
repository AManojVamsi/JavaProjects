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
<style>
      table {
        border-collapse: separate;
        border-spacing:10px;
      }
 </style>
<p1>Book Flight</p1>
<br><br>
<table>
<tr>
	<td><b>Flight Name :</b> <%out.println(request.getAttribute("flightname")); %></td>
	<td><b>Source : </b><%out.println(request.getAttribute("source")); %></td>
	<td><b>Destination&nbsp&nbsp:</b><%out.println(request.getAttribute("destination")); %></td>
	<td><b>Rate :</b><%out.println(request.getAttribute("rate"));%></td>
	<td><b>Date :</b><%out.println(request.getAttribute("date"));%></td>
	</tr>
</table>
<table>



	<form action="payment" method="post">
	<tr>
		<td>
		 	<label for="source">Name</label>
   		 	<input type="text" placeholder="Name" name="name" required>
		</td><td></td>
		<td>
		<label for="age">Age</b></label>
   	 	 <input type="number" placeholder="Age" name="age" required>
		</td><td></td>
		<td>
		<label for="mobile">Mobile Number</b></label>
   	 	 <input type="number" placeholder="Mobile Number" name="mobile" required>
		</td>
		<td>
		<input type="hidden"  name="flightid" value="<%=request.getAttribute("flightid")%>" />
		<input type="hidden"  name="flightname" value="<%=request.getAttribute("flightname")%>" />
		<input type="hidden"   name="source" value="<%=request.getAttribute("source")%>" />
		<input type="hidden"   name="destination" value="<%=request.getAttribute("destination")%>" />
		<input type="hidden"   name="rate" value="<%=request.getAttribute("rate")%>" />
		<input type="hidden"   name="date" value="<%=request.getAttribute("date")%>" />
		</td>
		
	</tr>
	<tr>
	<tr></tr><tr></tr><tr></tr>
		<td>
		 <button type="submit">Click here to Pay <%out.println(request.getAttribute("rate")); %></button>
		</td>
	</tr>
	  </form>
</table>
</center>

</body>
</html>

