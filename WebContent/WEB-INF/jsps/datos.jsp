<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet"
	href="resources/bootstrap-3.3.4-dist/css/bootstrap.css" />
<link rel="stylesheet" href="resources/bootstrap-3.3.4-dist/style.css" />
<link type="text/css" rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700,700italic,400italic">
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>

<body>

	<script src="jquery-1.8.3.js"></script>
	<script src="resources/bootstrap-3.3.4-dist/js/bootstrap.js"></script>


	<header>
		<title>Curr�culum Vitae</title>
	</header>

	<div class="col-lg-6 col-lg-offset-3">
		<img src="resources/imagenes/marca.png">
		<div class="well">
			<div class="container">

				<h1>Curr�culum Vitae</h1>
				<p>Seleccione una categor�a para ver/editar sus datos:</p>
				<p>
					<a class="btn btn-primary btn-lg" href="#" role="button">Datos
						Personales</a> <a class="btn btn-default btn-lg"
						href="http://localhost:8080/spring/cv" role="button">Formaci�n</a>
					<a class="btn btn-default btn-lg" href="http://localhost:8080/spring/cargos" role="button">Cargos</a>
					<a class="btn btn-default btn-lg" href="http://localhost:8080/spring/antecedentes" role="button">Antecedentes</a>
					<a class="btn btn-default btn-lg" href="http://localhost:8080/spring/produccion" role="button">Producci�n</a>
					<a class="btn btn-default btn-lg" href="#" role="button">Otros
						Antecedentes</a>
				</p>


					<div class="form-group">
						<label for="inputName">DNI</label><br>
						<c:out value="${dni}"></c:out>
					</div>

			
					<div class="form-group">
						<label for="inputName">Nombre</label><br>
						<c:out value="${nombre}"></c:out>
					</div>

					<div class="form-group">
						<label for="inputName">Apellido</label><br>
						<c:out value="${apellido}"></c:out>
					</div>

					<div class="form-group">
						<label for="inputName">Sexo</label><br>
						<c:out value="${sexo}"></c:out>
					</div>
					
					<div class="form-group">
						<label for="inputName">Estado Civil</label><br>
						<c:out value="${estado_civil}"></c:out>
					</div>
					
					<div class="form-group">
						<label for="inputName">Email</label><br>
						<c:out value="${email}"></c:out>
					</div>
					
					<div class="form-group">
						<label for="inputName">Fecha de Nacimiento</label><br>
						<c:out value="${fecha_nac}"></c:out>
					</div>
					
					<div class="form-group">
						<label for="inputName">Nacionalidad</label><br>
						<c:out value="${nacionalidad}"></c:out>
					</div>
					
					<div class="form-group">
						<label for="inputName">CUIT/CUIL</label><br>
						<c:out value="${CUIL_CUIT}"></c:out>
					</div>
					
					<div class="form-group">
						<label for="inputName">Domicilio</label><br>
						<c:out value="${domicilio}"></c:out>
					</div>
					
					<div class="form-group">
						<label for="inputName">Departamento</label><br>
						<c:out value="${departamento}"></c:out>
					</div>
					
					<div class="form-group">
						<label for="inputName">Provincia</label><br>
						<c:out value="${provincia}"></c:out>
					</div>
					<div class="form-group">
						<label for="inputName">Pa�s</label><br>
						<c:out value="${pais}"></c:out>
					</div>
					
					<div align="right" "form-group">
									<a href="<c:url value="/datosEditar" />">Editar Datos Personales
										</a>
								</div>

			</div>
			<!--container-->
		</div>
	</div>

	<script
		src="resources/bootstrap-3.3.4-dist/assets/js/jquery-1.7.1.min.js"></script>
	<script
		src="resources/bootstrap-3.3.4-dist/assets/js/jquery.validate.js"></script>
	<script
		src="resources/bootstrap-3.3.4-dist/assets/js/jquery.validate.min.js"></script>
	<script src="resources/bootstrap-3.3.4-dist/script.js"></script>

	<script>
		addEventListener('load', prettyPrint, false);
		$(document).ready(function() {
			$('pre').addClass('prettyprint linenums');
		});
	</script>


</body>
<footer>
	<div class="col-lg-6 col-lg-offset-3">
		<div class="well">
			<div class="row">

				<div class="col-lg-12">

					<div class="col-md-4">
						<div class="row">
							<div class="col-md-4">
								<a class="enlace" target="_blank"
									href="https://mail.um.edu.ar/horde3/imp/">Webmail</a>
							</div>
						</div>
						<div class="row">
							<div class="col-md-4">
								<a class="enlace" target="_blank"
									href="/es/mapa-sitio.html?lang=es">Mapa del Sitio</a>
							</div>
						</div>

					</div>

					<div class="col-md-7">
						<p>Boulogne Sur Mer 683. CP 5500. Mendoza, Argentina
							Tel�fonos: 54 261 4202017. Fax: 54 261 4202017 (Opci�n 9)</p>
					</div>
				</div>
				<!--col-6-->
			</div>
		</div>
		<!--well-->
	</div>
</footer>
</html>