<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lista de Empleados</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>Lista de Empleados</h2>	
	<table>
		<tr>
			<td>Nombres</td><td>Apellidos</td><td>Direccion</td><td>Correo</td><td>Telefono</td><td>Departamento</td><td>Cargo</td><td></td>
		</tr>
		<c:forEach items="${empleados}" var="empleado">
			<tr>
			<td>${empleado.nombres}</td>
			<td>${empleado.apellidos}</td>
			<td>${empleado.direccion}</td>
            <td>${empleado.correo}</td>
			<td>${empleado.telefono}</td>
			<td>${empleado.departamento}</td>
            <td>${empleado.cargo}</td>
			<td><a href="<c:url value='/edit-${student.code}-student' />">${student.code}</a></td>
			<td><a href="<c:url value='/delete-${student.code}-student' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/new-empleado' />">Agregar nuevo Empleado</a><br>
	Ir al <a href="<c:url value='/menu' />">Menu principal</a>
</body>
</html>