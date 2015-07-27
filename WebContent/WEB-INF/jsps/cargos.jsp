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
		<title>Currículum Vitae</title>
	</header>

	<div class="col-lg-6 col-lg-offset-3">
		<img src="resources/imagenes/marca.png">
		<div class="well">
			<div class="container">
				<c:url value="/j_spring_security_logout" var="logoutUrl" />
				
				<form action="${logoutUrl}" method="post" id="logoutForm">
					<input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}" />
				</form>
				<div class="logout">
					<a href="http://localhost:8080/spring/login">Salir</a>
				</div>	
				<h1>Currículum Vitae</h1>
				<p>Seleccione una categoría para cargar/editar sus datos:</p>
				
				<!-- NAVBAR -->
				<nav class="navbar navbar-default">
				    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				      <ul class="nav navbar-nav">
				        <li><a href="http://localhost:8080/spring/datos" role="button">Datos Personales</a></li>
				        <li><a href="http://localhost:8080/spring/formacion" role="button">Formación</a></li>
				        <li><a href="http://localhost:8080/spring/cargos" role="button">Cargos</a></li>
				        <li><a href="http://localhost:8080/spring/antecedentes" role="button">Antecedentes</a></li>
				        <li><a href="http://localhost:8080/spring/produccion" role="button">Producción</a></li>
				        <li><a href="http://localhost:8080/spring/otrosantecedentes" role="button">Otros Antecedentes</a></li>
				      </ul>
				    </div>
				</nav>
				<!--  -->

				<form:form id="registration-form" class="form-horizontal"
					method="post"
					action="${pageContext.request.contextPath}/crearcargos"
					modelAttribute="formacion">
					<div class="form-group">
						<label for="dni">DNI
						<input type="text"
							id="dni" class="form-control" path="dni"
							name="dni" placeholder="DNI" value="${dni}"></label>
					</div>
					<!-- DOCENCIA -->
					
					<div class="form-group">
						<h2>CARGOS</h2>
						<h3>Docencia</h3>
					</div>
					<!-- nivel superior universitario y/o posgrado -->
					<div class="form-group">
						<label for="inputNivelSuperiorUniversitarioyPosgrado">Nivel
							superior universitario y/o posgrado</label> <input type="text"
							class="form-control" id="nivel_superior_universitario"
							path="nivel_superior_universitario"
							name="nivel_superior_universitario"
							placeholder="Nivel superioruniversitario y/o posgrado">
					</div>
					<!-- nivel terciario no universitario -->
					<div class="form-group">
						<label for="inputNivelTerciarioNoUniversitario">Nivel
							terciario no universitario</label> <input type="text"
							class="form-control" id="nivel_terciario_no_universitario"
							path="nivel_terciario_no_universitario" name="nivel_terciario_no_universitario"
							placeholder="Nivel terciario no universitario">
					</div>
					<!-- Nivel basico y/o medio -->
					<div class="form-group">
						<label for="inputNivelBasicoyMedio">Nivel basico y/o medio</label>
						<input type="text" class="form-control" id="nivel_basico"
							path="nivel_basico" name ="nivel_basico"
							placeholder="Nivel terciario no universitario">
					</div>
					<!-- Cursos de posgrado y/o capacitaciones extracurriculares -->
					<div class="form-group">
						<label for="inputCursosPosgradoyCapacitacionesExtracurriculares">Cursos
							de posgrado y/o capacitaciones extracurriculares</label> <input
							type="text" class="form-control"
							id="cursos_posgrado_y_capacitaciones"
							path="cursos_posgrado_y_capacitaciones" name="cursos_posgrado_y_capacitaciones"
							placeholder="Cursos de posgrado y/o capacitaciones extracurriculares">
					</div>

					<!-- CARGOS I+D -->

					<div class="form-group">
						<h3>Cargos I+D</h3>
					</div>
					<!-- cargos en organismos científico-tecnológicos -->
					<div class="form-group">
						<label for="inputCargosEnOrganismosCT">Cargos en
							organismos científico-tecnológicos</label> <input type="text"
							class="form-control" id="cargos_organismos_ct"
							path="cargos_organismos_ct" name="cargos_organismos_ct"
							placeholder="Cargos en organismos científico-tecnológicos">
					</div>
					<!-- Categorización del programa de incentivos -->
					<div class="form-group">
						<label for="inputCategorizacionProgramaIncentivos">Categorización
							del programa de incentivos</label> <input type="text"
							class="form-control" id="categorizacion_programa_incentivos"
							path="categorizacion_programa_incentivos" name="categorizacion_programa_incentivos"
							placeholder="Categorización del programa de incentivos">
					</div>
					<!-- Cargos I+D en otro tipo de institucines -->
					<div class="form-group">
						<label for="inputCargosIDenOtroTipodeInstituciones">Cargos
							I+D en otro tipo de institucines</label> <input type="text"
							class="form-control" id="cargos_id_otro" path="cargos_id_otro" name="cargos_id_otro"
							placeholder="Cargos I+D en otro tipo de institucines">
					</div>

					<!-- CARGOS EN GESTION INSTITUCIONAL -->

					<div class="form-group">
						<h3>Cargos en Gestion Institucional</h3>
					</div>
					<!-- cargos en gestion institucional -->
					<div class="form-group">
						<label for="inputCargosenGestionInstitucional">Cargos en
							gestion institucional</label> <input type="text" class="form-control"
							id="cargos_gestion_institucional"
							path="cargos_gestion_institucional" name="cargos_gestion_institucional"
							placeholder="Cargos en gestion institucional">
					</div>

					<!-- OTROS CARGOS -->

					<div class="form-group">
						<h3>Otros Cargos</h3>
					</div>
					<!-- Otros Cargos -->
					<div class="form-group">
						<label for="inputOtrosCargos">Otros Cargos</label> <input
							type="text" class="form-control" id="otros_cargos"
							path="otros_cargos" name="otros_cargos" placeholder="Otros Cargos">
					</div>

						<button type="submit" class="btn btn-primary">Enviar</button>

				</form:form>
			</div>
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
							Teléfonos: 54 261 4202017. Fax: 54 261 4202017 (Opción 9)</p>
					</div>
				</div>
				<!--col-6-->
			</div>
		</div>
		<!--well-->
	</div>
</footer>
</html>

