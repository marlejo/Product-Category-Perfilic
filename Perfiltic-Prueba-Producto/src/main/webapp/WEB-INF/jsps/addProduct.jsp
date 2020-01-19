<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>  
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="addProduct" method="post">
<h2>ADD PRODUCT</h2>
<pre>
Product Name: <input type="text" name="name" />
Description: <input type="text" name="description" />
Weight: <input type="text" name="weight" />
Price: <input type="number" name="price_cop" />
Photo: <input type="text" name="photo" />
<input type="submit" value="Create Product"/>
</pre>
</form>

</body>
</html>