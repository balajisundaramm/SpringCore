<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Home</title>
</head>
<body>
<div class="container">
<h4>Enter Product Details</h4>
  <form action="getDetails" method="get">
    <div class="form-group">
      <label for="id">Product Id: Ex:(abc123)</label>
      <input type="text" class="form-control" id="id"  name="productId" required>
    </div>
    <div class="form-group">
      <label for="name">Product Name:</label>
      <input type="text" class="form-control" id="name"  name="productName" required>
    </div>
     <div class="form-group">
      <label for="price">Product Price:</label>
      <input type="number" class="form-control" min="0"  id="price"  name="productPrice" required>
    </div>
    <button type="submit" class="btn btn-info">Submit</button>
  </form>
</div>
</body>
</html>