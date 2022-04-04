<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: anthonygonzales
  Date: 4/4/22
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>Ads</h1>
<c:forEach var = "ad" items="${ads}">
    <h1>${ad.title}</h1>
    <p>Description: ${ad.description}</p>
</c:forEach>

</body>
</html>
