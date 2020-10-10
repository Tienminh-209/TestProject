<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Your resevation is confirmed successfully.</p>
First name:${reservation.firstName}
<br></br>
Last name:${reservation.lastName}
<br></br>
Gender:${reservation.gender}
<br></br>
Meals:
<ul>
    <c:forEach var="meal" items="${reservation.food }">
    <li> ${meal}</li>
    </c:forEach>
</ul>
<br></br>
Leaving Form:${reservation.cityFrom}
<br></br>
Going to Form:${reservation.cityTo}
</body>
</html>