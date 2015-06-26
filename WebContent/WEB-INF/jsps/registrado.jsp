<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmación de registración</title>
<link rel="stylesheet"
	href="resources/bootstrap-3.3.4-dist/css/bootstrap.css" />
	 <link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700,700italic,400italic">
</head>
<body>

	<div class="container">
	<img src="resources/images/marca.png">
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="contenido2"><h1 class="universidadFondo">Confirmación de Inscripción</h1></div>	
			</div>
			<div class="panel-body">
				<p>Usted se registró correctamente. </p><br>
				<p>
					<a href="${pageContext.request.contextPath}/"> Volver a la página principal</a>
				</p>
			</div>
			<!--panel body-->
		</div>
		<!--panel heading-->
	</div>
	<!--panel panel-default-->
	</div>
	<!--container-->
	
</body>