<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- x:choose / x:when / x:otherwise / x:parse -->
---------x:choose / x:when / x:otherwise / x:parse ---------- <br>
<h3>Books Information:</h3>  
  
<c:set var="xmltext">  
<books>  
<book>  
  <name>Three mistakes of my life</name>  
  <author>Chetan Bhagat</author>  
  <price>200</price>  
</book>  
<book>  
  <name>Tomorrow land</name>  
  <author>Brad Bird</author>  
  <price>700</price>  
</book>  
</books>  
</c:set>  
  
<x:parse xml="${xmltext}" var="output"/>  
<x:choose>  
   <x:when select="$output//book/author = 'Chetan bhagat'">  
      Book is written by Chetan bhagat  
   </x:when>  
   <x:when select="$output//book/author = 'Brad Bird'">  
      Book is written by Brad Bird  
   </x:when>  
   <x:otherwise>  
      The author is unknown...  
   </x:otherwise>  
</x:choose>

<br><br><br>
<!-- x:out tag--> 
----------------x:out tag ----------------- <br>
<b>Name of the book is</b>:  
<x:out select="$output/books/book[1]/name" /><br>  
<b>Price of the book is</b>:  
<x:out select="$output/books/book[1]/price" /> 

<br><br><br>
<!-- x:if tag--> 
----------------x:if tag ----------------- <br>
<x:if select="$output/books/book/price < 700">  
   book prices are very low.  
</x:if> 

</body>
</html>