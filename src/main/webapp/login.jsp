<%--
  Created by IntelliJ IDEA.
  User: Franklin
  Date: 2020/12/12
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<p align="center">
<form action="login" method="post">
    <fieldset>
        <legend>login</legend>
        昵称：
        <input type="text" name="name">
        <br>
        密码：
        <input type="password" name="pwd">
        <br>
        <INPUT TYPE="SUBMIT" value="登录">
        <input type="reset" value="重置"><!-- Press this to submit form -->
    </fieldset>
</form>

</body>
</html>
