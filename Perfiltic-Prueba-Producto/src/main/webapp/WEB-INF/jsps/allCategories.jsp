<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>  
<meta charset="ISO-8859-1">
<title>All Categories</title>
</head>
<body>
<h2>All Categories</h2>
<table>
<tr>
<th>Name</th>
<th>Photo</th>
<th>Category Father</th>
</tr>

<c:forEach items="${categories}" var="category">
<tr>
<td>${category.name}</td>
<td>${category.photo}</td>
<td>${category.category_father.id}</td>
<td><a href="getCategory?categoryId=${category.id}">Select</a></td>

</tr>
</c:forEach>
</table>
<td><a href="categoryReg">Add Category</a></td>

</body>
</html>