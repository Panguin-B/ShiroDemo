<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/3/19
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/submitLogin">
    用户名：<input type="text" name="userName">
    <br><br>
    密码：<input type="password" name="password">
    <br><br>

    <input type="submit" value="登录">
    <input type="reset" value="重置">

</form>
</body>
</html>
