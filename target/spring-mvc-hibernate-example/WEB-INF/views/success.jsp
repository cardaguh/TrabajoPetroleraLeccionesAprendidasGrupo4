<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina de confirmacion de registro</title>
</head>
<body>
	${success}
	<br/>
	<br/>
	Ir a la <a href="<c:url value='/list' />">Lista de todos los proveedores</a><br>
	Ir al <a href="<c:url value='/menu' />">Menu principal</a>
	
</body>

</html>