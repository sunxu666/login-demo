<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/3/3
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="/login" method="post">
        <input name="loginId" type="text" /><br/>
        <input name="loginPassword" type="password" /><br/>
        <input  type="submit" value="登录" />
    </form>
</body>
</html>
