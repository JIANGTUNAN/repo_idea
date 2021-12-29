<%--
  Created by IntelliJ IDEA.
  User: macpro
  Date: 2021/12/16
  Time: 5:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="getParamByArgName" method="post">
        username:<input type="text" name="username"><br/>
        password:<input type="password" name="password"><br/>
        <input type="submit" value="noRequest">
    </form>
    <hr/>
    <form action="getParamByRequest" method="post">
        username:<input type="text" name="username"><br/>
        password:<input type="password" name="password"><br/>
        <input type="submit" value="byRequest">
    </form>
</body>
</html>
