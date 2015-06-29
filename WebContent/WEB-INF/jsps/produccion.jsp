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
					action="${pageContext.request.contextPath}/crearproduccion"
					modelAttribute="produccion">

					<!-- DNI // sacar y traer del login -->
					<div class="form-group">
						<label for="inputName">DNI</label> <input type="text" id="dni"
							class="form-control" path="dni" name="dni" placeholder="DNI">
						<form:errors cssClass="error" path="dni"></form:errors>
					</div>

        			<!-- PRODUCCION -->

                   <div class="form-group">
                       <h2>PRODUCCION</h2>
                       <h3>Producción científica</h3>
                   </div>   
                   <!-- Artículos publicados en revistas con/sin referato --> 
                   <div class="form-group">
                       <label for="Estado">Artículos publicados en revistas con/sin referato</label>
                       <input type="text" class="form-control"  placeholder="Artículos publicados en revistas con/sin referato">
                   </div>
                   <!-- Libros --> 
                   <div class="form-group">
                       <label for="Estado">Libros</label>
                       <input type="text" class="form-control"  placeholder="Libros">
                   </div>
                   <!-- Partes de Libros --> 
                   <div class="form-group">
                       <label for="Estado">Partes de Libros</label>
                       <input type="text" class="form-control"  placeholder="Partes de Libros">
                   </div>
                   <!-- Trabajos en eventos C-T publicados --> 
                   <div class="form-group">
                       <label for="Estado">Trabajos en eventos C-T publicados</label>
                       <input type="text" class="form-control"  placeholder="Trabajos en eventos C-T publicados">
                   </div>
                   <!-- Trabajos en eventos C-T no publicados --> 
                   <div class="form-group">
                       <label for="Estado">Trabajos en eventos C-T no publicados</label>
                       <input type="text" class="form-control"  placeholder="Trabajos en eventos C-T no publicados">
                   </div>
                   <!-- Demás producciones C-T --> 
                   <div class="form-group">
                       <label for="Estado">Demás producciones C-T</label>
                       <input type="text" class="form-control"  placeholder="Demás producciones C-T">
                   </div>

                   <!-- PRODUCCION TECNOLOGICA-->

                   <div class="form-group">
                       <h3>Producción Tecnológica</h3>
                   </div> 
                   <!-- Con titulo de propiedad intelectual --> 
                   <div class="form-group">
                       <label for="Estado">Con titulo de propiedad intelectual</label>
                       <input type="text" class="form-control"  placeholder="Con titulo de propiedad intelectual">
                   </div>
                   <!-- sin titulo de propiedad intelectual --> 
                   <div class="form-group">
                       <label for="Estado">Sin titulo de propiedad intelectuall</label>
                       <input type="text" class="form-control"  placeholder="Sin titulo de propiedad intelectual">
                   </div>
                   <!-- servicio científico-tecnológico --> 
                   <div class="form-group">
                       <label for="Estado">Servicio científico-tecnológico</label>
                       <input type="text" class="form-control"  placeholder="Servicio científico-tecnológico">
                   </div>
                   <!-- Informe técnico --> 
                   <div class="form-group">
                       <label for="Estado">Informe técnico</label>
                       <input type="text" class="form-control"  placeholder="Informe técnico">
                   </div>
                   
                   <!-- PRODUCCION ARTÍSICA-->

                   <div class="form-group">
                       <h3>Producción Artística</h3>
                   </div>     
                   <!-- Musical-sonora --> 
                   <div class="form-group">
                       <label for="Estado">Musical-sonora</label>
                       <input type="text" class="form-control"  placeholder="Musical-sonora">
                   </div>
                   <!-- Visual --> 
                   <div class="form-group">
                       <label for="Estado">Visual</label>
                       <input type="text" class="form-control"  placeholder="Visual">
                   </div>
                   <!-- Audiovisual multimedial --> 
                   <div class="form-group">
                       <label for="Estado">Audiovisual multimedial</label>
                       <input type="text" class="form-control"  placeholder="Audiovisual multimedial">
                   </div>
                   <!-- Corporal teatral --> 
                   <div class="form-group">
                       <label for="Estado">Corporal teatral</label>
                       <input type="text" class="form-control"  placeholder="Corporal teatral">
                   </div>
                   <!-- Genero literario narrativo --> 
                   <div class="form-group">
                       <label for="Estado">Genero literario narrativo</label>
                       <input type="text" class="form-control"  placeholder="Genero literario narrativo">
                   </div>
                   <!-- Genero literario dramático, poético o ensayo --> 
                   <div class="form-group">
                       <label for="Estado">Genero literario dramático, poético o ensayo</label>
                       <input type="text" class="form-control"  placeholder="Genero literario dramático, poético o ensayo">
                   </div>
                   <!-- Genero literario guión --> 
                   <div class="form-group">
                       <label for="Estado">Genero literario guión</label>
                       <input type="text" class="form-control"  placeholder="Genero literario guión">
                   </div>
                   <!-- otro tipo de Genero literario --> 
                   <div class="form-group">
                       <label for="Estado">Otro tipo de Genero literario</label>
                       <input type="text" class="form-control"  placeholder="Otro tipo de Genero literario">
                   </div>
                   <!-- otra producción artística --> 
                   <div class="form-group">
                       <label for="Estado">Otra producción artística</label>
                       <input type="text" class="form-control"  placeholder="Otra producción artística">
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