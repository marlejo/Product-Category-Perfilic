<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>  
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<form action="registerUser" method="post">
<pre>
<h2>User Registration</h2>
First Name: <input type="text" name="first_name"/>
Last Name: <input type="text" name="last_Name"/>
Email: <input type="text" name="email"/>
Password: <input type="password" name="password"/>
Confirm Password: <input type="password" name="confirmPassword"/>
<input type="submit" value="register"/>
</pre>
</form>
</body>
</html>