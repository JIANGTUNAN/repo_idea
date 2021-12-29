<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
requestScope : [message:${requestScope.message}, --uname:${requestScope.users[0].uname}]<br/>
sessionScope : [message:${sessionScope.message}, --uname:${sessionScope.users[0].uname}]<br/>
applicationScope : [message:${applicationScope.message}, --uname:${applicationScope.users[0].uname}]<br/>
requestParam : [message:${param.message}, --uname:${param.users[0].uname}]<br/>
</body>
</html>
