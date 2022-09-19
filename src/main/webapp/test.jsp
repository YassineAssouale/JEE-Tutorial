<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My servlet test</title>
</head>
<body>
	<h1>Sign in</h1>
	<form method="post" action="test">
		<label for="login">Login : </label>
		<input id="login" type="text" name="login" value="${login}" autofocus/><br><br>
		<label for="passord">Password : </label>
		<input id="password" type="password" name="password" value="${password}" /><br><br>
		<input type = "submit" value="Connection">
	</form>

</body>
</html>