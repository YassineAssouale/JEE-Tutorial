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

	<form method="post" action="login">
		<label for='txtLogin'>Login : </label>
		<input id='txtLogin' name='txtLogin' type='text' value='<%= session.getAttribute("login") %>' autofocus /><br/>
		<label for='txtPassword'>Login : </label>
		<input id='txtPassword' name='txtPassword' type='password' value='<%= session.getAttribute("password") %>' /><br/>
		<input name='btnConnect' type='submit' /><br/>
	
	</form>
</body>
</html>