<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet"href="resources/bootstrap-3.3.4-dist/css/bootstrap.css" />
<link rel="stylesheet"href="resources/bootstrap-3.3.4-dist/style.css" />
 <link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700,700italic,400italic">
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>

<body>

	<script src="jquery-1.8.3.js"></script>
	<script src="resources/bootstrap-3.3.4-dist/js/bootstrap.js"></script>


	<header>
		<title>Registro de usuario</title>
	</header>

	<div class="col-lg-6 col-lg-offset-3">
	<img src="resources/imagenes/marca.png">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<form:form id="registration-form" class="form-horizontal" method="post"
							action="${pageContext.request.contextPath}/registrado" modelAttribute="user">

							
							<!-- Nro DOCUMENTO -->
							<div class="form-group">
								<label for="inputNumDoc">N° Documento</label> <br>
								<c:out value="${DNI}">${DNI}</c:out>
                                <input path="DNI" id="DNI" class="form-control" type="text" name="DNI" value="${DNI}">
							</div>

							<div class="form-group">
								<label for="inputPass">Contraseña</label> <br>
								<c:out value="${password}">${password}</c:out>
                                <input path="password" id="password" class="form-control" type="password" name="password" value="${password}">
							</div>
							

						
							<button type="submit" class="btn btn-primary">Enviar</button>

						</form:form>
					</div>
				</div>
			</div>
			<!--container-->
		</div>
	</div>

<script src="resources/bootstrap-3.3.4-dist/assets/js/jquery-1.7.1.min.js"></script> 
<script src="resources/bootstrap-3.3.4-dist/assets/js/jquery.validate.js"></script> 
<script src="resources/bootstrap-3.3.4-dist/assets/js/jquery.validate.min.js"></script> 
<script src="resources/bootstrap-3.3.4-dist/script.js"></script> 
	 
<script>
		addEventListener('load', prettyPrint, false);
		$(document).ready(function(){
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
                                             <a class="enlace" target="_blank" href="https://mail.um.edu.ar/horde3/imp/">Webmail</a>
                                        </div>
                                    </div>   
                                    <div class="row">
                                        <div class="col-md-4">
                                           <a class="enlace" target="_blank" href="/es/mapa-sitio.html?lang=es">Mapa del Sitio</a>
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

