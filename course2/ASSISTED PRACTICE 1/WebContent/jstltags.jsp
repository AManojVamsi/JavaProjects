<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- set and out -->
----------Set and Out Attribute------
<c:set var="Income" scope="session" value="${4000*4}"/>  
<c:out value="${Income}"/> 
<br><br>


<!-- remove -->
----------Remove Attribute------
<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Before Remove Value is: <c:out value="${income}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p>  
<br><br>


<!-- catch -->
----------catch Attribute------
<c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>  
<c:if test = "${catchtheException != null}">  
   <p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p>  
</c:if>  


<br><br>
<!-- If condition -->
----------If Attribute------
<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>  


<br><br>
<!-- Choose, When, Otherwise Attribute -->
----------Choose, When, Otherwise Attribute------
<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  



<br><br>
<!-- foreach -->
----------forEach Attribute------
<c:forEach var="j" begin="1" end="10" step="2">  
   Item <c:out value="${j}"/><p>  
</c:forEach> 



</body>
</html>