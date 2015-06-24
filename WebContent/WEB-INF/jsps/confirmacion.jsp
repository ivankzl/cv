<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700,700italic,400italic">
<title>Confirmación de inscripción</title>
<link rel="stylesheet"
	href="resources/bootstrap-3.3.4-dist/css/bootstrap.css" />
</head>
<body>

	<div class="container">
		<img src="resources/images/marca.png">
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="contenido2">
					<h1 class="universidadFondo">Confirmación de Inscripción</h1>
				</div>
			</div>
			<div class="panel-body">


				<form:form class="myform" method="post"
					action="${pageContext.request.contextPath}/registrado"
					modelAttribute="inscripcion">

					<input type="hidden" name="cur_id" value="${cur_id}">
					<input type="hidden" name="alu_dni" value="${alu_dni}">
					<input type="hidden" name="alu_doc_id" value="${alu_doc_id}">
					<input type="hidden" name="alu_email" value="${alu_email}">
					
					<p>				
									¿Desea confirmar la inscripción para el curso <b><c:out
							value="${cur_titulo}"></c:out></<b>?

							<button type="submit" class="btn btn-primary">Confirmar</button>
				</form:form>
				
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
</html>