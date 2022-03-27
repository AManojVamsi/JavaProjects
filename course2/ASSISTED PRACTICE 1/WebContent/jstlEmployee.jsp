<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
table,th,td
{
border:1px solid black;
}
</style>

</head>
<body>
<%-- Using JSTL forEach and out to loop a list and display items in table --%>

<table>
<tbody>
	<tr><th>ID</th><th>Name</th><th>Role</th></tr>
	<c:forEach items="${requestScope.empList}" var="emp">
		<tr><td><c:out value="${emp.email}"></c:out></td>
		<td><c:out value="${emp.name}"></c:out></td>
		<td><c:out value="${emp.password}"></c:out></td></tr>
	</c:forEach>
</tbody>
</table>
<br><br>
<%-- simple c:if and c:out example with HTML escaping --%>
<c:if test="${requestScope.htmlTagData ne null }">
<c:out value="${requestScope.htmlTagData}" escapeXml="true"></c:out>
</c:if>
<br><br>
 
<%-- c:set example to set variable value --%>
<c:set var="id" value="5" scope="request"></c:set>
<c:out value="${requestScope.id }" ></c:out>
<br><br>

<%-- c:catch example --%>
<c:catch var ="exception">
   <% int x = 5/0;%>
</c:catch>

   <c:if test = "${exception ne null}">
   <p>Exception is : ${exception} <br>
   Exception Message: ${exception.message}</p>
   </c:if>
<br><br>

<%-- c:url example --%>
<a href="<c:url value="${requestScope.url}"></c:url>">Facebook</a>

<%--Action Tag --%>
Today's date is when we are using the action include tag
<jsp:include page="date.jsp" flush="true" />


</body>
</html>