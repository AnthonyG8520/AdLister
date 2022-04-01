<%--
  Created by IntelliJ IDEA.
  User: anthonygonzales
  Date: 4/1/22
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
    <form method="POST" action="/pizza">
        <select name="crust">
                <option value="Thin">Thin</option>
                <option value="Stuffed">Stuffed</option>
                <option value="none">None</option>
        </select>
        <select name="sauce">
            <option value="light">Light</option>
            <option value="normal">Normal</option>
            <option value="extra">Extra</option>
        </select>
        <select name="size">
            <option value="small">small</option>
            <option value="medium">medium</option>
            <option value="large">large</option>
        </select>

        <br>

        pepperoni <input type="checkbox" name="quiz_question_1" value="pepperoni"><br>
        ham <input type="checkbox" name="quiz_question_1" value="ham"><br>
        bacon <input type="checkbox" name="quiz_question_1" value="bacon"><br>
        moe cheese <input type="checkbox" name="quiz_question_1" value="moe cheese"><br>

        <input type="submit">
    </form>



    </body>
</html>
