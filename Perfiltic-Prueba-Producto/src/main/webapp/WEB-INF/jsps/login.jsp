<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>  
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<h2>Login</h2>
<form action="login" method="post">
<pre>
Email: <input type="text" name="email"/>
Password: <input type="password" name="password"/>
<input type="submit" value="login"/>
${msg }
</pre>
</form>
</body>
</html>