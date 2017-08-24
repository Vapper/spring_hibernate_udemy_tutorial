<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="">Home</a>
	<h2>User profile page</h2>
	<p>First Name: ${user.firstName}</p>
	<p>Last Name: ${user.lastName}</p>
	<p>ID: ${user.id}</p>
	<p>Email: ${user.email}</p>
	<p>Mobile number: ${user.mobileNumber}</p>
	<p>Age: ${user.age}</p>
	<p>Account Type: ${user.type}</p>
	<p>Preferred language: ${user.language}</p>
	<p>Gender: ${user.gender}</p>
	<p>Extentions: (
		<c:forEach items="${user.extentions}" var="extention">${extention};</c:forEach>
	)
	</p>
	<ul>
			<c:forEach items="${user.extentions}" var="extention">
				<li>${extention}</li>
			</c:forEach>
	</ul>
	<p>IBAN ${user.iban}</p>
	
</body>
</html>