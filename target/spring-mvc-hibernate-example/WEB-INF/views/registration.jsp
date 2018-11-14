<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Formulario de registro de proveedores</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Proveedor</h2>
 
	<form:form method="POST" modelAttribute="student">
		<form:input type="hidden" path="id" id="id"/>
		<table>
			<tr>
				<td><label for="name">Nombres: </label> </td>
				<td><form:input path="name" id="name"/></td>
				<td><form:errors path="name" cssClass="error"/></td>
		    </tr>
	    
			<tr>
				<td><label for="enteringDate">Fecha de ingreso: </label> </td>
				<td><form:input path="enteringDate" id="enteringDate"/></td>
				<td><form:errors path="enteringDate" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="nationality">Correo: </label> </td>
				<td><form:input path="nationality" id="nationality"/></td>
				<td><form:errors path="nationality" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td><label for="code">Codigo: </label> </td>
				<td><form:input path="code" id="code"/></td>
				<td><form:errors path="code" cssClass="error"/></td>
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
	Ir a la <a href="<c:url value='/list' />">Lista de todos los proveedores</a><br>
	Ir al <a href="<c:url value='/menu' />">Menu principal</a>
</body>
</html>