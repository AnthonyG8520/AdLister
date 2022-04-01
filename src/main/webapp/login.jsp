<%--
  Created by IntelliJ IDEA.
  User: anthonygonzales
  Date: 3/31/22
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
    <body>
        <%@ include file = "partials/navbar.jsp" %>

        <h4>Colors</h4>
        <ul>
            <c:forEach items="${param.colors.split(',')}" var = "color">
                <li>${color}</li>
            </c:forEach>
        </ul>

        <form method="POST">

            <label for="username">Username</label>
            <input id="username" name="username" type="text">
            <br>

            <label for="password">Password</label>
            <input id="password" name="password" type="password">
            <br>

            <textarea name="colors" id="" cols="30" rows="10"></textarea>
            <br>

            <input type="submit">
        </form>


        <c:if test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
            <c:redirect url = "profile.jsp"/>
        </c:if>

    </body>
</html>
