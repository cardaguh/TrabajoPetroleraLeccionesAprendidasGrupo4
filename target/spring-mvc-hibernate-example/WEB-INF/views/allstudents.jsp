<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lista de Proveedores</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>Lista de Proveedores</h2>	
	<table>
		<tr>
			<td>Nombre</td><td>Fecha de ingreso</td><td>Correo</td><td>Codigo</td><td></td>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr>
			<td>${student.name}</td>
			<td>${student.enteringDate}</td>
			<td>${student.nationality}</td>
			<td><a href="<c:url value='/edit-${student.code}-student' />">${student.code}</a></td>
			<td><a href="<c:url value='/delete-${student.code}-student' />">eliminar</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/new' />">Agregar nuevo Proveedor</a><br>
	Ir al <a href="<c:url value='/menu' />">Menu principal</a>
</body>
</html>