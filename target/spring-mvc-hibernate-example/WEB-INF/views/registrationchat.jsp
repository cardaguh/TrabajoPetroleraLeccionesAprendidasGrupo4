<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Chat de Lecciones Aprendidas</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Chat de Lecciones Aprendidas</h2>

    <input type="submit" value="Entrar al chat grupal"/><br><br>
    <input type="submit" value="Enviar mensaje privado"/><br>

	<br/>
	<br/>
	Ir al <a href="<c:url value='/menu' />">Menu principal</a>
</body>
</html>