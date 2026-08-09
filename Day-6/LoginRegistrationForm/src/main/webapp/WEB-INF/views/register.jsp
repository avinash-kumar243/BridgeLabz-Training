<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
    <h2>User Registration</h2>
	
	<p style="color:red;">${error}</p>

    <form action="/register" method="post">
        Name : <input type="text" name="name">
        <br><br>

        Email : <input type="email" name="email">
        <br><br>

        Password : <input type="password" name="password">
        <br><br>

        <input type="submit" value="Register">
		Already Registered?

		<a href="/login">Login Here</a>
    </form>
</body>
</html>