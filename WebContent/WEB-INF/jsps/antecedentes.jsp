<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="resources/bootstrap-3.3.4-dist/css/bootstrap.css" />
	<link rel="stylesheet" href="resources/bootstrap-3.3.4-dist/style.css" />
	<link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700,700italic,400italic">
	<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
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

				<h1>Currículum Vitae</h1>
				<p>Seleccione una categoría para ver/editar sus datos:</p>
				<p>
					<a class="btn btn-default btn-lg"
						href="http://localhost:8080/spring/datos" role="button">Datos
						Personales</a> 
						<a class="btn btn-primary btn-lg"
						href="http://localhost:8080/spring/formacion" role="button">Formación</a>
					<a class="btn btn-default btn-lg" href="#" role="button">Cargos</a>
					<a class="btn btn-default btn-lg" href="#" role="button">Antecedentes</a>
					<a class="btn btn-default btn-lg" href="#" role="button">Producción</a>
					<a class="btn btn-default btn-lg" href="#" role="button">Otros Antecedentes</a>
				</p>

				<form:form id="registration-form" class="form-horizontal"
					method="post"
					action="${pageContext.request.contextPath}/crearantecedentes"
					modelAttribute="antedecentes">

					<!-- DNI // sacar y traer del login -->
					<div class="form-group">
						<label for="inputName">DNI</label> <input type="text" id="dni"
							class="form-control" path="dni" name="dni" placeholder="DNI">
						<form:errors cssClass="error" path="dni"></form:errors>
					</div>

     				<div class="form-group">
                        <h2>ANTECEDENTES</h2>
                        <h3>Formación de recursos humanos en CyT</h3>
                    </div>                                
                    <!-- Becarios -->
				    <div class="form-group">
				        <label for="inputBecarios">Becarios</label>
				        <input type="text" class="form-control" id="becario" path="becario" placeholder="Becarios">
				    </div>            				
                    <!-- Tesistas doctorado-->                
                    <div class="form-group">
                        <label for="inputTesistaDoctorado">Tesistas</label>
                        <input type="text" class="form-control" id="tesista_doctoral" path="tesista_doctoral" placeholder="Tesistas Doctorado">
                    </div>
                    <!-- Tesistas maestria -->                
                    <div class="form-group">
                        <label for="inputTesistaMaestria">Tesistas</label>
                        <input type="text" class="form-control" id="tesista_maestria" path="tesista_maestria" placeholder="Tesistas Maestría">
                    </div>
                    <!-- Tesistas grado -->                
                    <div class="form-group">
                        <label for="inputTesistaGrado">Tesistas</label>
                        <input type="text" class="form-control" id="tesista_grado" path="tesista_grado" placeholder="Tesistas Grado">
                    </div>
                    <!-- Investigadores --> 
                    <div class="form-group">
                        <label for="inputInvestigadores">Investigadores</label>
                        <input type="text" class="form-control" id="investigadores" path="investigadores" placeholder="Investigadores">
                    </div>
                    <!-- Pasantes de I+D y/o formación académica --> 
                    <div class="form-group">
                        <label for="inputPasantesDeIDFormacionAcademcia">Pasantes de I+D y/o formación académica</label>
                        <input type="text" class="form-control" id="pasantes_id_y_facademica" path="pasantes_id_y_facademica" placeholder="Pasantes de I+D y/o formación académica">
                    </div>
                    <!-- Personal de apoyo a la I+D --> 
                    <div class="form-group">
                        <label for="inputPersonalDeApoyoID">Personal de apoyo a la I+D</label>
                        <input type="text" class="form-control" id="personal_apoyo_id" path="personal_apoyo_id"  placeholder="Personal de apoyo a la I+D">
                    </div>

                    <!-- FINANCIAMIENTO -->

                    <div class="form-group">
                        <h3>Financiamiento CyT</h3>
                    </div>   
                    <!-- Financiamiento cientifico y tecnologico --> 
                    <div class="form-group">
                        <label for="inputFinanciamientoCientificoTecnologico">Financiamiento cientifico y tecnológico</label>
                        <input type="text" class="form-control" id="financiamiento_cientifico_tecnologico" path="financiamiento_cientifico_tecnologico"
                         placeholder="Financiamiento cientifico y tecnologico">
                    </div>

                     <!--EXTENSION -->

                     <div class="form-group">
                        <h3>Extensión</h3>
                    </div>   
                    <!-- Actividades de divulgación CyT --> 
                    <div class="form-group">
                        <label for="inputActividadesDeDivulgacion">Actividades de divulgación CyT</label>
                        <input type="text" class="form-control" id="actividades_divulgacion" path="actividades_divulgacion"
                         placeholder="Actividades de divulgación CyT">
                    </div> 
                    <!-- Extension rural o industrial --> 
                    <div class="form-group">
                        <label for="inputExtensionRuralIndustrial">Extensión rural o industrial</label>
                        <input type="text" class="form-control" id="extension_rural_industrial" path="extension_rural_industrial"
                         placeholder="Extensión rural o industrial">
                    </div>
                    <!-- Prestación de servicios sociales y/o comunitarios --> 
                    <div class="form-group">
                        <label for="inputPrestacionServiciosSocialesComunitarios">Prestación de sericios sociales y/o comunitarios</label>
                        <input type="text" class="form-control" id="prestacion_servicios_sociales" path="prestacion_servicios_sociales" placeholder="Prestación de servicios sociales y/o comunitarios">
                    </div>
                    <!-- Producción y/o divulgación artística o cultural --> 
                    <div class="form-group">
                        <label for="inputProduccionDivulgacionArtisticaCultural">Producción y/o divulgación artística o cultural</label>
                        <input type="text" class="form-control" id="produccion_divulgacion_artistica" path="produccion_divulgacion_artistica" 
                        placeholder="Producción y/o divulgación artística o cultural">
                    </div>
                    <!-- Otro tipo de actividad de extensión --> 
                    <div class="form-group">
                        <label for="inputOtroTipoActividadExtension">Otro tipo de actividad de extensión</label>
                        <input type="text" class="form-control" id="otro_tipo_actividad" path="otro_tipo_actividad" placeholder="Otro tipo de actividad de extensión">
                    </div>

                    <!--EVALUACION -->
                     
                    <div class="form-group">
                        <h3>Evaluación</h3>
                    </div>
                    <!-- Evaluación de personal CyT Y jurado de tesis y/o premios --> 
                    <div class="form-group">
                        <label for="inputEvaluacionDePersonal">Evaluación de personal CyT Y jurado de tesis y/o premios</label>
                        <input type="text" class="form-control" id="evaluacion_personal" path="evaluacion_personal" placeholder="Evaluación de personal CyT Y jurado de tesis y/o premios">
                    </div>
                    <!-- Evaluación de programas/proyectos de I+D y/o extensión --> 
                    <div class="form-group">
                        <label for="inputEvaluacionProgramas">Evaluación de programas/proyectos de I+D y/o extensión</label>
                        <input type="text" class="form-control" id="evaluacion_programas" path="evaluacion_programas" placeholder="Evaluación de programas/proyectos de I+D y/o extensión">
                    </div>
                    <!-- Evaluacion institucional --> 
                    <div class="form-group">
                        <label for="inputEvaluacionInstitucional">Evaluacion institucional</label>
                        <input type="text" class="form-control" id="evaluacion_institucional" path="evaluacion_institucional" placeholder="Evaluacion institucional">
                    </div>
                    <!-- Otro tipo de evaluación --> 
                    <div class="form-group">
                        <label for="inputOtroTipoEvaluacion">Otro tipo de evaluación</label>
                        <input type="text" class="form-control" id="otro_tipo_evaluacion" path="otro_tipo_evaluacion" placeholder="Otro tipo de evaluación">
                    </div>

                    <!--  BECAS -->
                     
                    <div class="form-group">
                        <h3>Becas</h3>
                    </div>
                    <!-- Becas --> 
                    <div class="form-group">
                        <label for="inputBecas">Becas</label>
                        <input type="text" class="form-control" id="becas" path="becas" placeholder="Becas">
                    </div>        

                    <!-- OTRAS ACTIVIDADES -->

                    <div class="form-group">
                        <h3>Otras Actividades CyT</h3>
                    </div>                                
                    <!-- Estancias y pasantías -->
                    <div class="form-group">
                        <label for="inputEstanciasPasantias">Estancias y pasantías</label>
                        <input type="text" class="form-control" id="estancias_pasantias" path="estancias_pasantias" placeholder="Estancias y pasantías">
                    </div>                          
                    <!-- Operación y mantenimiento de sistemas de alta complejidad -->                
                    <div class="form-group">
                        <label for="inputOperacionyMantenimiento">Operación y mantenimiento de sistemas de alta complejidad</label>
                        <input type="text" class="form-control" id="operacion_mantenimiento" path="operacion_mantenimiento" placeholder="Operación y mantenimiento de sistemas de alta complejidad">
                    </div>
                    <!-- Producción --> 
                    <div class="form-group">
                        <label for="inputProduccion">Producción</label>
                        <input type="text" class="form-control" id="produccion" path="produccion" placeholder="Producción">
                    </div>
                    <!-- Normalización --> 
                    <div class="form-group">
                        <label for="inputNormalizacion">Normalización</label>
                        <input type="text" class="form-control" id="normalizacion" path="normalizacion" placeholder="Normalización">
                    </div>
                    <!-- Ejercicio de la profesión en el ámbito no académico --> 
                    <div class="form-group">
                        <label for="inputEjercicioProfesionalAmbitoNoAcademico">Ejercicio de la profesión en el ámbito no académico</label>
                        <input type="text" class="form-control" id="ejercicio_profesional_ambito_no_academico" 
                        path=" ejercicio_profesional_ambito_no_academico" placeholder="Ejercicio de la profesión en el ámbito no académico">
                    </div>
                    <!-- Otra actividad CyT --> 
                    <div class="form-group">
                        <label for="inputOtraActividad">Otra actividad CyT</label>
                        <input type="text" class="form-control" id="otra_actividad_cyt" path="otra_actividad_cyt" placeholder="Otra actividad CyT">
                    </div>

                    <!-- BOTON SIGUIENTE -->
                    <div class="row">
                      <div class="col-md-4"></div>
                      <div class="col-md-4"><button type="submit" class="btn-siguiente">Siguiente</button></div>
                      <div class="col-md-4"></div>
                    </div>

				</form:form>
			</div>	<!--container-->
		</div>
	</div>

	<script	src="resources/bootstrap-3.3.4-dist/assets/js/jquery-1.7.1.min.js"></script>
	<script	src="resources/bootstrap-3.3.4-dist/assets/js/jquery.validate.js"></script>
	<script	src="resources/bootstrap-3.3.4-dist/assets/js/jquery.validate.min.js"></script>
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
				</div><!--col-6-->
			</div>
		</div><!--well-->
	</div>
</footer>
</html>