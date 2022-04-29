<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mark
  Date: 29.04.2022
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show employee</title>
</head>
<body>
<h2>Personal Information</h2>
<br>
Your name: ${employee.name} <br>
Your surname: ${employee.surname} <br>
Your salary: ${employee.salary} <br>
Your department: ${employee.department} <br>
Your employment: ${employee.employment} <br>
Your language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
</body>
</html>
