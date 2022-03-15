<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Success Page</title>
</head>
<style>
    h1{
        color: darkgreen;
        align: center;
    }
</style>
<body>
<h1>Welcome ${user.username}</h1>
<hr>
<h1>Email Id is: ${user.email}</h1>
<hr>
<h1>Password is: ${user.password}</h1>
</body>
</html>
