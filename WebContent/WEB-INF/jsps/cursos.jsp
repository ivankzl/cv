<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>

	<head>
		<link type="text/css" rel="stylesheet"href="http://fonts.googleapis.com/css?family=Archivo+Narrow:400,700,700italic,400italic">
		<meta charset="UTF-8">
		<title>Inscribirse a un curso</title>
		<link rel="stylesheet" href="resources/bootstrap-3.3.4-dist/css/bootstrap.css"/>
	</head>
	
	<body>
	
		<div class="container">
			<img src="resources/images/marca.png">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="contenido2">
						<h1 class="universidadFondo">Grilla de Cursos a Distancia</h1>
					</div>
				</div><!--panel-heading-->
				
				<div class="panel-body">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Título</th>
								<th>Inicio</th>
								<th>Duración</th>
								<th>Profesor</th>
								<th>URL</th>
							</tr>
						</thead>
						<c:forEach var="curso" items="${cursos}">
							<tr>
								<td>
									<p><span title="${curso.cur_descripcion}">
											<c:out value="${curso.cur_titulo}"></c:out>
										</span></p>
								</td>
								<td>
									<p><c:out value="${curso.cur_inicio}"></c:out></p>
								</td>
								<td>
									<p><c:out value="${curso.cur_duracion} horas"></c:out></p>
								</td>
								
								<td>
									<p><c:out value="${curso.cur_profesor}"></c:out></p>
								</td>
								
								<td>
									
									
							
                              
										<a href="http://${curso.cur_url}">
									<c:out value="Ir al sitio"></c:out>
									</a>									
								
								</td>
								
								<td>

  									<c:if test="${curso.cur_habilitado == 1 }">
 										<a href="${pageContext.request.contextPath}/verificacion?cur_id=${curso.cur_id}"><button type="button" class="btn btn-warning">   Inscribirse</button></a>
  									</c:if>
                                    <c:if test="${curso.cur_habilitado == 0 }">
										<c:out value="En sitio web"></c:out>  									
									</c:if>
   
								</td>
							</tr>
						</c:forEach>
					</table>
				</div> <!--panel body-->
			</div> <!--panel heading-->
		</div> <!--panel panel-default-->
	
	</body>
	<footer>
		<div class="container">
	   		<div class="well">
	       		<div class="row">  
					<div class="col-lg-12">
	 	             	<div class="col-md-5"> <!-- columna 1 -->
	                      
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
				 
				 		</div> <!-- col-md-5 -->               
	                         
	                    <div class="col-md-7"> <!-- columna 2 -->
                       
                               <p>Boulogne Sur Mer 683. CP 5500. Mendoza, Argentina.</p>
                               <p> Teléfonos: 54 261 4202017. Fax: 54 261 4202017 (Opción 9)</p>
	                       
	                    </div><!-- col-md-7 --> 
              		</div><!--col-12-->
               	</div><!-- row -->
           	</div><!--well-->
       </div> 
	</footer> 
</html>