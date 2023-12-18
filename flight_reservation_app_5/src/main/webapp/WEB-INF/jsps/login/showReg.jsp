<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h2>Create New Account</h2>
	<form action="saveReg" method="post">
		<pre>
			First Name : <input type="text" name="firstName" />
			Last Name : <input type="text" name="lastName" />
			EmailId : <input type="email" name="email" />
			Password : <input type="password" name="password" />
			<input type="submit" value="save" />
		</pre>
	</form>
		<a href="showLoginPage">Click Here to Login</a>
</body>
</html>