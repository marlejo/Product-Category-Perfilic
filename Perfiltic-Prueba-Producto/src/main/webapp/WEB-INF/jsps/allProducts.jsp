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
<title>All Products</title>
</head>
<body>
<h2>All Products</h2>
<table>
<tr>
<th>Name</th>
<th>Description</th>
<th>Weight</th>
<th>Price Cop</th>
<th>Price USD</th>
<th>Photo</th>
</tr>

<c:forEach items="${products}" var="product">
<tr>
<td>${product.name}</td>
<td>${product.description}</td>
<td>${product.weight}</td>
<td>${product.price_cop}</td>
<td></td>
<td>${product.photo}</td>
<td><a href="getProduct?id=${product.id}">Select</a></td>

</tr>
</c:forEach>
</table>
<td><a href="productReg">Add Product</a></td>

</body>
</html>