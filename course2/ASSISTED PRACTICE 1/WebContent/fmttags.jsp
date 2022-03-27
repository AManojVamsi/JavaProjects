<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- fmt:parseNumber tag -->
---------fmt:parseNumber tag-----------
<h3>The fmt:parseNumber tag Example is:</h3>  
<c:set var="Amount" value="786.970" />  
    <fmt:parseNumber var="j" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  
    <fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
<br><br>    
    
    
    
<!-- fmt:formatNumber tag -->
----------fmt:formatNumber tag -------
<h3>Formatting of Number:</h3>  
<c:set var="Amount" value="9850.14115" />  
<p> Formatted Number-1:  
<fmt:formatNumber value="${Amount}" type="currency" /></p>  
<p>Formatted Number-2:  
<fmt:formatNumber type="number" groupingUsed="true" value="${Amount}" /></p>  
<p>Formatted Number-3:  
<fmt:formatNumber type="number" maxIntegerDigits="3" value="${Amount}" /></p>  
<p>Formatted Number-4:  
<fmt:formatNumber type="number" maxFractionDigits="6" value="${Amount}" /></p>  
<p>Formatted Number-5:  
<fmt:formatNumber type="percent" maxIntegerDigits="4" value="${Amount}" /></p>  
<p>Formatted Number-6:  
<fmt:formatNumber type="number" pattern="###.###$" value="${Amount}" /></p>  
<br>



<!-- fmt:bundle Tag -->
-----------fmt:bundle Tag with java class Simple.java------------
<fmt:bundle basename="advanced.java.program.Simple" prefix="colour.">  
   <fmt:message key="Violet"/><br/>  
   <fmt:message key="Indigo"/><br/>  
  <fmt:message key="Blue"/><br/>  
</fmt:bundle>  
<br>



<!-- fmt:formatDate Tag -->
---------------fmt:formatDate---------------
<h2>Different Formats of the Date</h2>  
<c:set var="Date" value="<%=new java.util.Date()%>" />  
<p>  
Formatted Time :  
<fmt:formatDate type="time" value="${Date}" />  
</p>  
<p>  
Formatted Date :  
<fmt:formatDate type="date" value="${Date}" />  
</p>  
<p>  
Formatted Date and Time :  
<fmt:formatDate type="both" value="${Date}" />  
</p>  
<p>  
Formatted Date and Time in short style :  
<fmt:formatDate type="both" dateStyle="short" timeStyle="short"  
value="${Date}" />  
</p>  
<p>  
Formatted Date and Time in medium style :  
<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"  
value="${Date}" />  
</p>  
<p>  
Formatted Date and Time in long style :  
<fmt:formatDate type="both" dateStyle="long" timeStyle="long"  
value="${Date}" />  
</p>  
<br><br>  
  
  
  
  
<!-- fmt:timeZone Tag -->
-----------fmt:timeZone Tag--------------
<c:set var="str" value="<%=new java.util.Date()%>" />  
    <table border="2" width="100%">  
      <tr>  
        <td width="100%" colspan="2" bgcolor="#FF7F50">  
          <p align="center">  
            <b>  
              <font color="#000000" size="6">Formatting:  
              <fmt:formatDate value="${str}" type="both"  
              timeStyle="long" dateStyle="long" />  
              </font>  
            </b>  
          </p>  
        </td>  
      </tr>  
  
      <c:forEach var="zone"  
      items="<%=java.util.TimeZone.getAvailableIDs()%>">  
        <tr>  
          <td width="50%"  bgcolor="#C0C0C0">  
            <c:out value="${zone}" />  
          </td>  
          <td width="50%" bgcolor="#FFEBCD">  
            <fmt:timeZone value="${zone}">  
              <fmt:formatDate value="${str}" timeZone="${zn}"  
              type="both"/>  
            </fmt:timeZone>  
          </td>  
        </tr>  
      </c:forEach>  
    </table>  
</body>
</html>