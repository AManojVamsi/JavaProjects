<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- fn:contains -->
-------------------fn:contains--------------------
<c:set var="String" value="Welcome to javatpoint"/>  
<c:if test="${fn:contains(String, 'javatpoint')}">  
   <p>Found javatpoint string<p>  
</c:if>   
<c:if test="${fn:contains(String, 'JAVATPOINT')}">  
   <p>Found JAVATPOINT string<p>  
</c:if>  
<br>

<!--fn:containsIgnoreCase  -->
-----------------fn:containsIgnoreCase------------
<c:set var="String" value="Welcome to javatpoint"/>  
<c:if test="${fn:containsIgnoreCase(String, 'javatpoint')}">  
   <p>Found javatpoint string<p>  
</c:if>  
<c:if test="${fn:containsIgnoreCase(String, 'JAVATPOINT')}">  
   <p>Found JAVATPOINT string<p>  
</c:if>
<br>

<!-- fn:endsWith -->
----------------------fn:endsWith-----------------------------
<c:set var="String" value="Welcome to JSP programming"/>  
<c:if test="${fn:endsWith(String, 'programming')}">  
   <p>String ends with programming<p>  
</c:if>  
<c:if test="${fn:endsWith(String, 'JSP')}">  
   <p>String ends with JSP<p>  
</c:if>
<br>

<!-- fn:escapeXml -->
----------------------fn:escapeXml---------------------------
<c:set var="string1" value="It is first String."/>  
<c:set var="string2" value="It is <xyz>second String.</xyz>"/>  
<p>With escapeXml() Function:</p>  
<p>string-1 : ${fn:escapeXml(string1)}</p>  
<p>string-2 : ${fn:escapeXml(string2)}</p>  
<p>Without escapeXml() Function:</p>  
<p>string-1 : ${string1}</p>  
<p>string-2 : ${string2}</p> 
<br>

<!-- fn:indexOf --> 
------------------------fn:indexOf--------------------------
<c:set var="string1" value="It is first String."/>  
<c:set var="string2" value="It is <xyz>second String.</xyz>"/>  
<p>Index-1 : ${fn:indexOf(string1, "first")}</p>  
<p>Index-2 : ${fn:indexOf(string2, "second")}</p> 
<br>

<!-- fn:length -->
----------------------fn:length----------------------------
<c:set var="str1" value="Welcome to JSP        programming         "/>  
<p>String-1 Length is : ${fn:length(str1)}</p>  
<c:set var="str2" value="${fn:trim(str1)}" />  
<p>String-2 Length is : ${fn:length(str2)}</p>  
<p>Final value of string is : ${str2}</p>  
<br>

<!-- fn:startsWith -->
-------------------------fn:startsWith--------------------
<c:set var="msg" value="The Example of JSTL fn:startsWith() Function"/>  
The string starts with "The": ${fn:startsWith(msg, 'The')}  
<br>The string starts with "Example": ${fn:startsWith(msg, 'Example')}  
<br>

<!-- fn:split & fn:join --> 
-----------------fn:split & fn:join----------------------
<c:set var="str1" value="Welcome-to-JSP-Programming."/>  
<c:set var="str2" value="${fn:split(str1, '-')}" />  
<c:set var="str3" value="${fn:join(str2, ' ')}" />  
<p>String-3 : ${str3}</p>  
<c:set var="str4" value="${fn:split(str3, ' ')}" />  
<c:set var="str5" value="${fn:join(str4, '-')}" />  
<p>String-5 : ${str5}</p>
<br>

<!-- fn:toLowerCase -->
-----------------fn:toLowerCase-------------------------
<c:set var="string" value="Welcome to JSP Programming"/>  
${fn:toLowerCase("HELLO,")}  
${fn:toLowerCase(string)}  
<br>

<!--fn:toUpperCase -->
-------------------fn:toUpperCase----------------------
<c:set var="site" value="javatpoint.com"/>  
<c:set var="author" value="Sonoo Jaiswal"/>  
Hi, This is ${fn:toUpperCase(site)} developed by ${fn:toUpperCase(author)}.
<br>

<!-- fn:substring -->
----------------fn:substring---------------------------
<c:set var="string" value="This is the first string."/>  
${fn:substring(string, 5, 17)}  
<br>

<!-- fn:substringAfter -->
--------------------fn:substringAfter-----------------
<c:set var="string" value="Nakul Jain"/>  
${fn:substringAfter(string, "Nakul")}  
<br>

<!-- fn:substringBefore -->
-------------------fn:substringBefore----------------
<c:set var="string" value="Hi, This is JAVATPOINT.COM developed by SONOO JAISWAL."/>  
${fn:substringBefore(string, "developed")} 
<br>

<!-- fn:length -->
--------------------fn:length------------------------
<c:set var="str1" value="This is first string"/>  
<c:set var="str2" value="Hello"/>  
Length of the String-1 is: ${fn:length(str1)}<br>  
Length of the String-2 is: ${fn:length(str2)}  
<br>

<!-- fn:replace -->
----------------------fn:replace---------------------
<c:set var="author" value="Ramesh Kumar"/>  
<c:set var="string" value="pqr xyz abc PQR"/>  
${fn:replace(author, "Ramesh", "Suresh")} 
<br> 
${fn:replace(string, "pqr", "hello")}  



</body>
</html>