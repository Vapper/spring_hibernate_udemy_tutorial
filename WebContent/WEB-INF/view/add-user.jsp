<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New User</title>

</head>
<body>

	<a href="">Back</a>
	<br>
	<br>
	
	<form:form action="showUser" modelAttribute="newUser">
		First name: <form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error" />
		<br>
		
		Last name (*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br>
		
		Email: <form:input path="email"/>
		<form:errors path="email" cssClass="error"/>
		<br>
		
		Mobile Number: <form:input path="mobileNumber"/>
		<form:errors path="mobileNumber" cssClass="error" />
		<br>
		
		Age: <form:input path="age"/>
		<form:errors path="age" cssClass="error" />
		<br>
		
		Male <form:radiobutton path="gender" value="m"/>
		Female <form:radiobutton path="gender" value="f"/>
		<br>
		
		<form:select path="type">
			<form:options items="${accountTypes}"></form:options>
		</form:select>
		<br>
		
		<form:checkboxes items="${extentionsList}" path="extentions" />
		<br>
		
		<form:radiobuttons items="${prefLangOptions}" path="language"/>
		<br>
		
		IBAN: <form:input path="iban"/>
		<form:errors path="iban" cssClass="error"/>
		<br>
		
		<input type="submit" value="Add User"/>
	</form:form>
</body>
</html>