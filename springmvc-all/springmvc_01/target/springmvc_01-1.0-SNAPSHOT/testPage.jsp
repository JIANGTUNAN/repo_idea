
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="testRest/10" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="DELETE请求">
    </form>
    <br/>

    <form action="testRest/10" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="PUT请求">
    </form>
    <br/>

    <form action="testRest/10" method="post">
        <input type="submit" value="POST请求">
    </form>
    <br/>

    <form action="testRest/10" method="get">
        <input type="submit" value="GET请求">
    </form>
</body>
</html>
