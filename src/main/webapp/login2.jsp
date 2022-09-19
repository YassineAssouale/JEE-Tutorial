<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<link rel='stylesheet' type='text/css' href='styles.css' />
<title>Fonctionnement d'une JSP</title>
</head>
<body>
	<h1>Veuillez vous authentifier</h1>

	<form method="post" action="loginServlet">
		<label for='txtLogin'>Login : </label>
		<input id='txtLogin' name='login2' type='text' value='${login}' autofocus /><br/><br/>
		<label for='txtPassword'>Password : </label>
		<input id='txtPassword' name='password2' type='password' value='${password}' /><br/><br/>
		<input name='btnConnect' type='submit' /><br/>
	
	</form>
</body>
</html>