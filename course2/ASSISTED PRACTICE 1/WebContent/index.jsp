<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, java.lang.*"%> 
<%@ page errorPage = "handle-error.jsp" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
<meta charset="UTF-8">
<title>JSP Implicit Objects</title>
</head>
<body>

<%
        String responseCheck = request.getParameter("office");
        if (responseCheck != null ) {
                 response.setStatus(response.SC_MOVED_TEMPORARILY);
                 response.setHeader("Location", "response-redirect.jsp?office=" + responseCheck);
        }
        
        String errorCheck = request.getParameter("error");
        if (errorCheck != null ) {
                 int x = 0;
                 if (x == 0)
                         throw new RuntimeException("Exception has been raised");
        }
%>
<%

   int serverPort =  request.getServerPort() ;
   out.println("protocol is  " + request.getProtocol());
   out.println("The Server is running on port " + String.valueOf(serverPort) + "<br>");
   out.println("Servlet Name is " + config.getServletName() + "<br>");
   out.println("Server Info:" + application.getServerInfo() + "<br>");
   
   String pageName = page.toString();
   out.println("The name of the page is " + pageName + "<br>");
   
   pageContext.setAttribute("userid", "John Doe");
   out.println("userId attribute from pageContext: " + pageContext.getAttribute("userid") + "<br>");    
%>
<a href="index.jsp?office=head_office">Show usage of response object</a><br>
<a href="index.jsp?error=1">Show usage of error  object</a><br>


<%
   if (response.containsHeader("Office"))
            out.println("Current location is " + response.getHeader("Office"));
 %>
 



 
</body>
</html>
