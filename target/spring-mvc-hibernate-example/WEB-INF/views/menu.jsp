<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lecciones Aprendidas</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Lecciones Aprendidas</h2>
 
	<a href="<c:url value='/list-empleados' />">Empleados</a><br>
    <a href="<c:url value='/list' />">Proveedores</a><br>
    <a href="<c:url value='/new-incidente' />">Incidentes</a><br>
    <a href="<c:url value='/new-leccion' />">Lecciones Aprendidas</a><br>
    <a href="<c:url value='/new-notificacion' />">Notificaciones</a><br>
    <a href="<c:url value='/new-chat' />">Chat de Lecciones Aprendidas</a><br>
</body>
</html>