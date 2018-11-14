<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registro de Incidentes</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Incidente</h2>
 
	<form>
		<table>
            <tr>
				<td><label for="code">Identificacion: </label> </td>
				<td><input id="code"/></td>
		    </tr>
			<tr>
				<td><label for="descripcion">Descripcion: </label> </td>
				<td><input id="descripcion"/></td>
		    </tr>
	    
			<tr>
				<td><label for="fecha">Fecha de ocurrencia: </label> </td>
				<td><input id="fecha"/></td>
		    </tr>

			<tr>
				<td colspan="3">
					<input type="submit" value="Registrar"/>
				</td>
			</tr>
		</table>
	</form>
	<br/>
	<br/>
	Ir a la <a href="<c:url value='/list-empleados' />">Lista de todos los Incidentes</a><br>
	Ir al <a href="<c:url value='/menu' />">Menu principal</a>
</body>
</html>