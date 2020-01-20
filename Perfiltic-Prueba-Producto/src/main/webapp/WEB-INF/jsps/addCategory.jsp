<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Add Category</title>
</head>
<body>
<form action="addCategory" method="post">
<h2>ADD CATEGORY</h2>
<pre>
Category Name: <input type="text" name="name" />
Photo: <input type="text" name="photo" />
Category Father: <input type="text" name="category_father" />
<input type="submit" value="Create Category"/>
</pre>
</form>
</body>
</html>