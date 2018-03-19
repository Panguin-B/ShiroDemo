<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
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
<h1>主页</h1>

<%--
    根据角色显示不同按钮
    部门经理显示删除按钮
    教学主管显示查询按钮
--%>
<shiro:hasAnyRoles name="部门经理">
    <input type="button" value="删除">
</shiro:hasAnyRoles>

<shiro:hasAnyRoles name="教学主管">
    <input type="button" value="查询">
</shiro:hasAnyRoles>
</body>
</html>
