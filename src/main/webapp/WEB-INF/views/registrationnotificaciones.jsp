<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Notificaciones</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Notificaciones</h2>
 
	<form>
		<table>
			<tr>
				<td><label for="code">Identificacion de la investigacion realizada: </label> </td>
				<td><input id="code"/></td>

		    </tr>
	    
			<tr>
				<td><label for="descripcion">Descripcion de la investigacion: </label> </td>
				<td><input id="descripcion"/></td>

		    </tr>

			<tr>
				<td colspan="3">
				   <input type="submit" value="Enviar notificacion a los empleados"/>
				</td>
			</tr>
		</table>
	</form>
	<br/>
	<br/>
	Ir a la <a href="<c:url value='/list-empleados' />">Lista de todas las notificaciones</a><br>
	Ir al <a href="<c:url value='/menu' />">Menu principal</a>
</body>
</html>