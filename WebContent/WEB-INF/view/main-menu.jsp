<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
	<img src="${pageContext.request.contextPath}/resources/images/logo.png">
	<p><a href="form">Test Form 1</a></p>
	<p><a href="parent/form">Test Form 2 (parent)</a></p>
	<p><a href="addUser">Register</a></p>
	<p><a href="showUser">My Profile</a></p>
	<p>Current user: ${user.fullName}</p>
</body>
</html>