<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h2>Login Here</h2>
	<form action="verifyLogin" method="post">
		<pre>
			Email Id : <input type="email" name="emailId"/>
			Password : <input type="password" name="password"/>
			<input type="submit" value="Login"/>
		</pre>
	</form>
	<a href="showReg">Click Here to Create New Account</a>
	${error}
</body>
</html>