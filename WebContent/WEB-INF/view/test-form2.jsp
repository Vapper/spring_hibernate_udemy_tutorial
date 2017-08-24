<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Form</title>
</head>
<body>
	<h3>Test Form 2</h3>
	<a href="">Go home</a>
	<form action="output" method="get">
		<label>Regular text</label>
		<input type="text" name="textField1"/>
		<button type="submit">Send</button>
	</form>
	<form action="outputWithModel" method="get">
		<label>Text to lower case</label>
		<input type="text" name="textField2"/>
		<button type="submit">Send</button>
	</form>
</body>
</html>