<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registro de Lecciones aprendidas</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Leccion Aprendida</h2>
 
	<form>

		<table>
			<tr>
				<td><label for="code">Identificacion: </label> </td>
				<td><input id="code"/></td>

		    </tr>
	    
			<tr>
				<td><label for="leccion">Nombre de la leccion: </label> </td>
				<td><input id="leccion"/></td>
		    </tr>
	
			<tr>
				<td><label for="descripcion">Descripcion: </label> </td>
				<td><input id="descripcion"/></td>

		    </tr>
	
			<tr>
				<td><label for="incidente">Incidente Asociado: </label> </td>
				<td><input id="incidente"/></td>

		    </tr>

			<tr>
				<td colspan="3">
					<input type="submit" value="Registrar"/>
					<input type="submit" value="Adjuntar Archivo"/></td>
			</tr>
		</table>
	</form>
	<br/>
	<br/>
	Ir a la <a href="<c:url value='/list-empleados' />">Lista de todos de las lecciones aprendidas</a><br>
	Ir al <a href="<c:url value='/menu' />">Menu principal</a>
</body>
</html>