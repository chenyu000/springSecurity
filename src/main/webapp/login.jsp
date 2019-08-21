<%@page language="java" contentType="text/html; UTF-8" isELIgnored="false" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>登陆页面</title>
</head>
<body>
    <table>
        <form action="${pageContext.request.contextPath}/userLogin" method="post">
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="username" placeholder="请输入用户名"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="text" name="password" placeholder="请输入密码"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="登录"></td>
            </tr>
        </form>
    </table>
</body>
</html>