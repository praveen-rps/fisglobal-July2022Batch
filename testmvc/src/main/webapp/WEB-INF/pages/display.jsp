<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p aling="center">Notes Data </p>
<table border=1>
    <c:forEach items="${notes}" var="row">
        <tr>
            <td>${row.pid}</td>
            <td>${row.author}</td>
            <td>${row.description}</td>
            <td>${row.title}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>