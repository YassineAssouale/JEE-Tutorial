<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<link rel='stylesheet' type='text/css' href='styles.css' />
<title>Welcome to My Application</title>
</head>
<body>
	<h1>Welcome to My Application</h1>

	<p>Welcome M. ${login}</p>
	<p>Is M. ${login} connected ? Answer = ${isConnected}</p>
</body>
</html>