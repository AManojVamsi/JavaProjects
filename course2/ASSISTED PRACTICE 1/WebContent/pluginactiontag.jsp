<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:plugin type="bean" code="Color.class" codebase="advanced.java.program.Color">
  <jsp:params>
 	<jsp:param name="id" value="5" />
    <jsp:param name="nameofcolour:" value="red" />
  </jsp:params>
</jsp:plugin>
</body>
</html>
