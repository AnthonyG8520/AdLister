<%--
  Created by IntelliJ IDEA.
  User: anthonygonzales
  Date: 4/7/22
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Make An Account</h1>
<Form action="/register" method="POST">
    <label for="username">Username</label>
    <input id="username" type="text" name="username"> <br>

    <label for="email">Email</label>
    <input id="email" type="text" name="email"><br>

    <label for="password">Password</label>
    <input id="password" type="text" name="password"><br>
    <button type="submit">Register</button>
</Form>




</body>
</html>
