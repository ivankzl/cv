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
		<title>Curr�culum Vitae</title>
	</header>

	<div class="col-lg-6 col-lg-offset-3">
		<img src="resources/imagenes/marca.png">
		<div class="well">
			<div class="container">

				<h1>Curr�culum Vitae</h1>
				<p>Seleccione una categor�a para ver/editar sus datos:</p>

				<!-- NAVBAR -->
				<nav class="navbar navbar-default">
				    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				      <ul class="nav navbar-nav">
				        <li><a href="http://localhost:8080/spring/datos" role="button">Datos Personales</a></li>
				        <li><a href="http://localhost:8080/spring/formacion" role="button">Formaci�n</a></li>
				        <li><a href="http://localhost:8080/spring/cargos" role="button">Cargos</a></li>
				        <li><a href="http://localhost:8080/spring/antecedentes" role="button">Antecedentes</a></li>
				        <li><a href="http://localhost:8080/spring/produccion" role="button">Producci�n</a></li>
				        <li><a href="http://localhost:8080/spring/otrosantecedentes" role="button">Otros Antecedentes</a></li>
				      </ul>
				    </div>
				</nav>
				<!--  -->
				
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

 					<!-- OTRAS ANTECEDENTES -->

                   <div class="form-group">
                     <h2>OTROS ANTECEDENTES</h2>
                     <h3>Participaci�n u organizaci�n de eventos CyT</h3>
                   </div>                                
                   <!-- Participaci�n u organizaci�n de eventos CyT -->
       				    <div class="form-group">
       				        <label for="inputName">Estancias y pasant�as</label>
       				        <input type="text" class="form-control"  placeholder="Participaci�n u organizaci�n de eventos CyT">
       				    </div> 

                   <!-- Membres�as, redes y/o programas de cooperaci�n -->

                   <div class="form-group">
                     <h3>Membres�as, redes y/o programas de cooperaci�n</h3>
                   </div>             				
                   <!-- Membres�as n asocianiones C-T y/o profesionales -->                
                   <div class="form-group">
                       <label for="inputApellido">Membres�as n asocianiones C-T y/o profesionales</label>
                       <input type="text" class="form-control"  placeholder="Membres�as n asocianiones C-T y/o profesionales">
                   </div>
                   <!-- Participaci�n en redes tem�ticas o institucionales --> 
                   <div class="form-group">
                       <label for="Sexo">Participaci�n en redes tem�ticas o institucionales</label>
                       <input type="text" class="form-control"  placeholder="Participaci�n en redes tem�ticas o institucionales">
                   </div>
                   <!-- Coordinaci�n de proyectos de cooperaci�n acad�mica o  C-T --> 
                   <div class="form-group">
                       <label for="Estado">Coordinaci�n de proyectos de cooperaci�n acad�mica o  C-T</label>
                       <input type="text" class="form-control"  placeholder="Coordinaci�n de proyectos de cooperaci�n acad�mica o  C-T">
                   </div>

                   <!-- PREMIOS Y/O DISTINCIONES -->

                   <div class="form-group">
                       <h3>Premios y/o distinciones</h3>
                   </div>   
                   <!-- Premios y/o distinciones --> 
                   <div class="form-group">
                       <label for="Estado">Premios y/o distinciones</label>
                       <input type="text" class="form-control"  placeholder="Premios y/o distinciones">
                   </div>

                     <!-- OTROS ANTECEDENTES --> 

                   <div class="form-group">
                       <h3>Otros Antecedentes</h3>
                   </div> 
                   
                   <!--Dato Acad�mico --> 
                   <div class="form-group">
                       <label for="Estado">Dato Acad�mico</label>
                       <input type="text" class="form-control"  placeholder="Dato Acad�mico">
                   </div>
                   <!-- Curriculum Vitae --> 
                   <div class="form-group">
                       <label for="Estado">Curriculum Vitae</label>
                       <input type="text" class="form-control"  placeholder="Curriculum Vitae">
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
							Tel�fonos: 54 261 4202017. Fax: 54 261 4202017 (Opci�n 9)</p>
					</div>
				</div><!--col-6-->
			</div>
		</div><!--well-->
	</div>
</footer>
</html>