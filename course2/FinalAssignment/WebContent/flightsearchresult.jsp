<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FlyAway</title>
<style>
      table {
        border-collapse: separate;
        border-spacing:30px;
      }
 </style>
</head>
<body>
	<%@include file="header.html"%>
	<center>
		<p1>Search Result</p1>

		<table>

			<TR>
				<TH>FLIGHT NAME</TH>
				<TH>SOURCE</TH>
				<TH>DESTINATION</TH>
				<TH>RATE</TH>

			</TR>
			<%
			String source = request.getParameter("source");
			String destination = request.getParameter("destination");
			ResultSet resultSet = (ResultSet) request.getAttribute("flightdetails");
			while (resultSet.next()) {
			%>
			<TR>
				<form method="POST" action="bookflight">
					<%
					String name = resultSet.getString("name");
					String rate = resultSet.getString("rate");
					String flightId = resultSet.getString("flight_id");
					%>
					<input type="hidden"  id="flightid" name="flightid" value=<%=flightId%> />
					<TD><%=name%> <input type="hidden"  id="flightname" name="flightname" value="<%=name%>" /></td>
					<TD><%=source%> <input type="hidden" id="source" name="source" value="<%=source%>" /> </TD>
					<TD><%=destination%> <input type="hidden" id="destination" name="destination" value="<%=destination%>" /></TD>
					<TD><%=rate%> <input type="hidden" id="rate" name="rate" value=<%=rate%> /> </td>
					<input type="hidden"  name="date" value=<%=request.getParameter("date")%> /> </td>
					<td> <button type="submit">Book Flight</button>
				</form>
			</TR>
			<%
			}
			%>
		</table>

	</center>

</body>


</html>