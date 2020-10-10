<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
   
<!DOCTYPE html>  
<html>  
 <head>  
 <title>Display-Image</title>  
 </head>  
 <body>  
<h1>${filename}</h1>  
<img src="/images/${filename}"/>  
</body>  
</html>  