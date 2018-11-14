<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registro de Empleados</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Registro de empleados nuevos</h2>
 
	<form:form method="POST" modelAttribute="empleado">
		<form:input type="hidden" path="id" id="id"/>
		<table>
			<tr>
				<td><label for="nombres">Nombres: </label> </td>
				<td><form:input path="nombres" id="nombres"/></td>
				<td><form:errors path="nombres" cssClass="error"/></td>
		    </tr>
	    
			<tr>
				<td><label for="apellidos">Apellidos: </label> </td>
				<td><form:input path="apellidos" id="apellidos"/></td>
				<td><form:errors path="apellidos" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="direccion">Direccion: </label> </td>
				<td><form:input path="direccion" id="direccion"/></td>
				<td><form:errors path="direccion" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="correo">Correo: </label> </td>
				<td><form:input path="correo" id="correo"/></td>
				<td><form:errors path="correo" cssClass="error"/></td>
		    </tr>

            <tr>
				<td><label for="telefono">Telefono: </label> </td>
				<td><form:input path="telefono" id="telefono"/></td>
				<td><form:errors path="telefono" cssClass="error"/></td>
		    </tr>

            <tr>
				<td><label for="cargo">Departamento: </label> </td>
				<td><form:input path="cargo" id="cargo"/></td>
				<td><form:errors path="cargo" cssClass="error"/></td>
		    </tr>

            <tr>
				<td><label for="cargo">Cargo: </label> </td>
				<td><form:input path="cargo" id="cargo"/></td>
				<td><form:errors path="cargo" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td colspan="3">
					<c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Actualizar"/>
						</c:when>
						<c:otherwise>
							<input type="submit" value="Registrar"/>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Ir a la <a href="<c:url value='/list-empleados' />">Lista de todos los empleados</a><br>
	Ir al <a href="<c:url value='/menu' />">Menu principal</a>
</body>
</html>