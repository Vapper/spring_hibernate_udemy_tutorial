<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Form output</title>
</head>
<body>
	<a href="">Home</a>
	<h1>Here is what you wrote</h1>
	<p> ${param.textField1} </p>
	<p> ${message} </p>
</body>
</html>