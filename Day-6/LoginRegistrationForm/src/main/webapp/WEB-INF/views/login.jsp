<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h2>User Login</h2>
	
	<p style="color:red;">${error}</p>
	<p style="color:green;">${success}	</p>
	
	<form action="/login" method="post">
	    Email : <input type="email" name="email">
	    <br><br>
	
	    Password : <input type="password" name="password">
	    <br><br>
	
	    <input type="submit" value="Login">	
		New User?
	
		<a href="/register">Register Here</a>
	</form>
</body>
</html>