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
	<h2><%= new Date() %></h2>

	<% for(int i = 1; i <= 6 ; i++) { %>
	<h<%= i %>>Titre de niveau <%= i %> </h<%= i %>>
	<% }%>
	
	
	<% 
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		if (login == null) login = "";
		if (password == null) password = "";
		
		if (request.getMethod().equals("POST") && login.equals("Y@ssine") && password.equals("1983")) {

	%>
		<p>Welcome <%=login %></p>
	<% } else { %>
	<form method="post">
		<label for="txtLogin">Login : </label>
		<input id="txtLogin" name="txtLogin" type="text" value="<%=login %>" autofocus /><br/>
		<label for="txtPassword">Login : </label>
		<input id="txtPassword" name="txtPassword" type="password" value="<%=password %>" /><br/>
		<input name="btnConnect" type="submit" /><br/>
	
	</form>
	<% } %>
</body>
</html>