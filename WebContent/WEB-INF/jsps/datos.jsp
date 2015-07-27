<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="ISO-8859-1"%>
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
					<a href="http://www.um.edu.ar/cv/login">Salir</a>
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
					action="${pageContext.request.contextPath}/creardatos"
					modelAttribute="produccion">

					<!-- DNI -->
					<div class="form-group">
						<label for="dni">DNI
						<input type="text"
							id="dni" class="form-control" path="dni"
							name="dni" placeholder="DNI" value="${dni}"></label>
					</div>
					
	
					<!-- NOMBRE -->
					<div class="form-group">
						<label for="inputName">Nombre</label> <input type="text"
							id="nombre" class="form-control" path="nombre"
							name="nombre" placeholder="Nombre">
						<form:errors cssClass="error" path="nombre"></form:errors>
					</div>
										<!-- APELLIDO -->
					<div class="form-group">
						<label for="inputApellido">Apellido</label> <input type="text"
							class="form-control" id="alu_apellido" path="apellido"
							name="apellido" placeholder="Apellido">
						<form:errors cssClass="error" path="apellido"></form:errors>
					</div>

					<!-- SEXO -->
					<div class="form-group">
						<div class="dropdown">
							<label for="inputNumDoc">Sexo</label><br> <select
								class="form-control" path="sexo" id="sexo"
								name="sexo"><form:errors cssClass="error"
									path="sexo"></form:errors>
								
								<option value="M">Masculino</option>
								<option value="F">Femenino</option>
							</select>
						</div>
					</div>

					<!-- ESTADO CIVIL -->
					<div class="form-group">
						<label for="inputEstadoCivil">Estado civil</label> <select
							class="form-control" id="estado_civil" path="estado_civil"
							name="estado_civil" placeholder="estado_civil" value="${estado_civil}">
							<option value="S">Soltero</option>
							<option value="C">Casado</option>
							<option value="V">Viudo</option>
							
						</select>
						<form:errors cssClass="error" path="estado_civil"></form:errors>
					</div>



					<!-- EMAIL -->
					<div class="form-group">
						<label for="inputEmail">Email</label> <input type="email"
							class="form-control" id="email" path="email"
							name="email" placeholder="Email">
						<form:errors cssClass="error" path="email"></form:errors>
					</div>

					<!-- FECHA DE NACIMIENTO -->
					<div class="form-group">
						<label for="inputFechaNac">Fecha de Nacimiento</label> <select
							class="form-control" id="dia" name="dia" >
							
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							<option value="24">24</option>
							<option value="25">25</option>
							<option value="26">26</option>
							<option value="27">27</option>
							<option value="28">28</option>
							<option value="29">29</option>
							<option value="30">30</option>
							<option value="31">31</option>
						</select> <select class="form-control" id="mes" name="mes" value="${mes}">
							
							<option value="01">Enero</option>
							<option value="02">Febrero</option>
							<option value="03">Marzo</option>
							<option value="04">Abril</option>
							<option value="05">Mayo</option>
							<option value="06">Junio</option>
							<option value="07">Julio</option>
							<option value="08">Agosto</option>
							<option value="09">Septiembre</option>
							<option value="10">Octubre</option>
							<option value="11">Noviembre</option>
							<option value="12">Diciembre</option>
						</select> <select class="form-control" id="anio" name="anio" value="${anio}">
							
							<option value="2001">2001</option>
							<option value="2000">2000</option>
							<option value="1999">1999</option>
							<option value="1998">1998</option>
							<option value="1997">1997</option>
							<option value="1996">1996</option>
							<option value="1995">1995</option>
							<option value="1994">1994</option>
							<option value="1993">1993</option>
							<option value="1992">1992</option>
							<option value="1991">1991</option>
							<option value="1990">1990</option>
							<option value="1989">1989</option>
							<option value="1988">1988</option>
							<option value="1987">1987</option>
							<option value="1986">1986</option>
							<option value="1985">1985</option>
							<option value="1984">1984</option>
							<option value="1983">1983</option>
							<option value="1982">1982</option>
							<option value="1981">1981</option>
							<option value="1980">1980</option>
							<option value="1979">1979</option>
							<option value="1978">1978</option>
							<option value="1977">1977</option>
							<option value="1976">1976</option>
							<option value="1975">1975</option>
							<option value="1974">1974</option>
							<option value="1973">1973</option>
							<option value="1972">1972</option>
							<option value="1971">1971</option>
							<option value="1970">1970</option>
							<option value="1969">1969</option>
							<option value="1968">1968</option>
							<option value="1967">1967</option>
							<option value="1966">1966</option>
							<option value="1965">1965</option>
							<option value="1964">1964</option>
							<option value="1963">1963</option>
							<option value="1962">1962</option>
							<option value="1961">1961</option>
							<option value="1960">1960</option>
							<option value="1959">1959</option>
							<option value="1958">1958</option>
							<option value="1957">1957</option>
							<option value="1956">1956</option>
							<option value="1955">1955</option>
							<option value="1954">1954</option>
							<option value="1953">1953</option>
							<option value="1952">1952</option>
							<option value="1951">1951</option>
							<option value="1950">1950</option>
							<option value="1949">1949</option>
							<option value="1948">1948</option>
							<option value="1947">1947</option>
							<option value="1946">1946</option>
							<option value="1945">1945</option>
							<option value="1944">1944</option>
							<option value="1943">1943</option>
							<option value="1942">1942</option>
							<option value="1941">1941</option>
							<option value="1940">1940</option>
							<option value="1939">1939</option>
							<option value="1938">1938</option>
							<option value="1937">1937</option>
							<option value="1936">1936</option>
							<option value="1935">1935</option>
							<option value="1934">1934</option>
							<option value="1933">1933</option>
							<option value="1932">1932</option>
							<option value="1931">1931</option>
							<option value="1930">1930</option>

						</select>

					</div>

					<div class="form-group">
						<label for="inputNacionalidad">Nacionalidad</label> <select
							class="form-control" id="nacionalidad" path="nacionalidad"
							name="nacionalidad" placeholder="nacionalidad" value="${nacionalidad}">
							
							<option value="AF">Afganistán</option>
							<option value="AL">Albania</option>
							<option value="DE">Alemania</option>
							<option value="AD">Andorra</option>
							<option value="AO">Angola</option>
							<option value="AI">Anguilla</option>
							<option value="AQ">Antártida</option>
							<option value="AG">Antigua y Barbuda</option>
							<option value="AN">Antillas Holandesas</option>
							<option value="SA">Arabia Saudí</option>
							<option value="DZ">Argelia</option>
							<option value="AR" selected>Argentina</option>
							<option value="AM">Armenia</option>
							<option value="AW">Aruba</option>
							<option value="AU">Australia</option>
							<option value="AT">Austria</option>
							<option value="AZ">Azerbaiyán</option>
							<option value="BS">Bahamas</option>
							<option value="BH">Bahrein</option>
							<option value="BD">Bangladesh</option>
							<option value="BB">Barbados</option>
							<option value="BE">Bélgica</option>
							<option value="BZ">Belice</option>
							<option value="BJ">Benin</option>
							<option value="BM">Bermudas</option>
							<option value="BY">Bielorrusia</option>
							<option value="MM">Birmania</option>
							<option value="BO">Bolivia</option>
							<option value="BA">Bosnia y Herzegovina</option>
							<option value="BW">Botswana</option>
							<option value="BR">Brasil</option>
							<option value="BN">Brunei</option>
							<option value="BG">Bulgaria</option>
							<option value="BF">Burkina Faso</option>
							<option value="BI">Burundi</option>
							<option value="BT">Bután</option>
							<option value="CV">Cabo Verde</option>
							<option value="KH">Camboya</option>
							<option value="CM">Camerún</option>
							<option value="CA">Canadá</option>
							<option value="TD">Chad</option>
							<option value="CL">Chile</option>
							<option value="CN">China</option>
							<option value="CY">Chipre</option>
							<option value="VA">Ciudad del Vaticano (Santa Sede)</option>
							<option value="CO">Colombia</option>
							<option value="KM">Comores</option>
							<option value="CG">Congo</option>
							<option value="CD">Congo, República Democrática del</option>
							<option value="KR">Corea</option>
							<option value="KP">Corea del Norte</option>
							<option value="CI">Costa de Marfíl</option>
							<option value="CR">Costa Rica</option>
							<option value="HR">Croacia (Hrvatska)</option>
							<option value="CU">Cuba</option>
							<option value="DK">Dinamarca</option>
							<option value="DJ">Djibouti</option>
							<option value="DM">Dominica</option>
							<option value="EC">Ecuador</option>
							<option value="EG">Egipto</option>
							<option value="SV">El Salvador</option>
							<option value="AE">Emiratos Árabes Unidos</option>
							<option value="ER">Eritrea</option>
							<option value="SI">Eslovenia</option>
							<option value="ES">España</option>
							<option value="US">Estados Unidos</option>
							<option value="EE">Estonia</option>
							<option value="ET">Etiopía</option>
							<option value="FJ">Fiji</option>
							<option value="PH">Filipinas</option>
							<option value="FI">Finlandia</option>
							<option value="FR">Francia</option>
							<option value="GA">Gabón</option>
							<option value="GM">Gambia</option>
							<option value="GE">Georgia</option>
							<option value="GH">Ghana</option>
							<option value="GI">Gibraltar</option>
							<option value="GD">Granada</option>
							<option value="GR">Grecia</option>
							<option value="GL">Groenlandia</option>
							<option value="GP">Guadalupe</option>
							<option value="GU">Guam</option>
							<option value="GT">Guatemala</option>
							<option value="GY">Guayana</option>
							<option value="GF">Guayana Francesa</option>
							<option value="GN">Guinea</option>
							<option value="GQ">Guinea Ecuatorial</option>
							<option value="GW">Guinea-Bissau</option>
							<option value="HT">Haití</option>
							<option value="HN">Honduras</option>
							<option value="HU">Hungría</option>
							<option value="IN">India</option>
							<option value="ID">Indonesia</option>
							<option value="IQ">Irak</option>
							<option value="IR">Irán</option>
							<option value="IE">Irlanda</option>
							<option value="BV">Isla Bouvet</option>
							<option value="CX">Isla de Christmas</option>
							<option value="IS">Islandia</option>
							<option value="KY">Islas Caimán</option>
							<option value="CK">Islas Cook</option>
							<option value="CC">Islas de Cocos o Keeling</option>
							<option value="FO">Islas Faroe</option>
							<option value="HM">Islas Heard y McDonald</option>
							<option value="FK">Islas Malvinas</option>
							<option value="MP">Islas Marianas del Norte</option>
							<option value="MH">Islas Marshall</option>
							<option value="UM">Islas menores de Estados Unidos</option>
							<option value="PW">Islas Palau</option>
							<option value="SB">Islas Salomón</option>
							<option value="SJ">Islas Svalbard y Jan Mayen</option>
							<option value="TK">Islas Tokelau</option>
							<option value="TC">Islas Turks y Caicos</option>
							<option value="VI">Islas Vírgenes (EEUU)</option>
							<option value="VG">Islas Vírgenes (Reino Unido)</option>
							<option value="WF">Islas Wallis y Futuna</option>
							<option value="IL">Israel</option>
							<option value="IT">Italia</option>
							<option value="JM">Jamaica</option>
							<option value="JP">Japón</option>
							<option value="JO">Jordania</option>
							<option value="KZ">Kazajistán</option>
							<option value="KE">Kenia</option>
							<option value="KG">Kirguizistán</option>
							<option value="KI">Kiribati</option>
							<option value="KW">Kuwait</option>
							<option value="LA">Laos</option>
							<option value="LS">Lesotho</option>
							<option value="LV">Letonia</option>
							<option value="LB">Líbano</option>
							<option value="LR">Liberia</option>
							<option value="LY">Libia</option>
							<option value="LI">Liechtenstein</option>
							<option value="LT">Lituania</option>
							<option value="LU">Luxemburgo</option>
							<option value="MK">Macedonia, Ex-República Yugoslava de</option>
							<option value="MG">Madagascar</option>
							<option value="MY">Malasia</option>
							<option value="MW">Malawi</option>
							<option value="MV">Maldivas</option>
							<option value="ML">Malí</option>
							<option value="MT">Malta</option>
							<option value="MA">Marruecos</option>
							<option value="MQ">Martinica</option>
							<option value="MU">Mauricio</option>
							<option value="MR">Mauritania</option>
							<option value="YT">Mayotte</option>
							<option value="MX">México</option>
							<option value="FM">Micronesia</option>
							<option value="MD">Moldavia</option>
							<option value="MC">Mónaco</option>
							<option value="MN">Mongolia</option>
							<option value="MS">Montserrat</option>
							<option value="MZ">Mozambique</option>
							<option value="NA">Namibia</option>
							<option value="NR">Nauru</option>
							<option value="NP">Nepal</option>
							<option value="NI">Nicaragua</option>
							<option value="NE">Níger</option>
							<option value="NG">Nigeria</option>
							<option value="NU">Niue</option>
							<option value="NF">Norfolk</option>
							<option value="NO">Noruega</option>
							<option value="NC">Nueva Caledonia</option>
							<option value="NZ">Nueva Zelanda</option>
							<option value="OM">Omán</option>
							<option value="NL">Países Bajos</option>
							<option value="PA">Panamá</option>
							<option value="PG">Papúa Nueva Guinea</option>
							<option value="PK">Paquistán</option>
							<option value="PY">Paraguay</option>
							<option value="PE">Perú</option>
							<option value="PN">Pitcairn</option>
							<option value="PF">Polinesia Francesa</option>
							<option value="PL">Polonia</option>
							<option value="PT">Portugal</option>
							<option value="PR">Puerto Rico</option>
							<option value="QA">Qatar</option>
							<option value="UK">Reino Unido</option>
							<option value="CF">República Centroafricana</option>
							<option value="CZ">República Checa</option>
							<option value="ZA">República de Sudáfrica</option>
							<option value="DO">República Dominicana</option>
							<option value="SK">República Eslovaca</option>
							<option value="RE">Reunión</option>
							<option value="RW">Ruanda</option>
							<option value="RO">Rumania</option>
							<option value="RU">Rusia</option>
							<option value="EH">Sahara Occidental</option>
							<option value="KN">Saint Kitts y Nevis</option>
							<option value="WS">Samoa</option>
							<option value="AS">Samoa Americana</option>
							<option value="SM">San Marino</option>
							<option value="VC">San Vicente y Granadinas</option>
							<option value="SH">Santa Helena</option>
							<option value="LC">Santa Lucía</option>
							<option value="ST">Santo Tomé y Príncipe</option>
							<option value="SN">Senegal</option>
							<option value="SC">Seychelles</option>
							<option value="SL">Sierra Leona</option>
							<option value="SG">Singapur</option>
							<option value="SY">Siria</option>
							<option value="SO">Somalia</option>
							<option value="LK">Sri Lanka</option>
							<option value="PM">St Pierre y Miquelon</option>
							<option value="SZ">Suazilandia</option>
							<option value="SD">Sudán</option>
							<option value="SE">Suecia</option>
							<option value="CH">Suiza</option>
							<option value="SR">Surinam</option>
							<option value="TH">Tailandia</option>
							<option value="TW">Taiwán</option>
							<option value="TZ">Tanzania</option>
							<option value="TJ">Tayikistán</option>
							<option value="TF">Territorios franceses del Sur</option>
							<option value="TP">Timor Oriental</option>
							<option value="TG">Togo</option>
							<option value="TO">Tonga</option>
							<option value="TT">Trinidad y Tobago</option>
							<option value="TN">Túnez</option>
							<option value="TM">Turkmenistán</option>
							<option value="TR">Turquía</option>
							<option value="TV">Tuvalu</option>
							<option value="UA">Ucrania</option>
							<option value="UG">Uganda</option>
							<option value="UY">Uruguay</option>
							<option value="UZ">Uzbekistán</option>
							<option value="VU">Vanuatu</option>
							<option value="VE">Venezuela</option>
							<option value="VN">Vietnam</option>
							<option value="YE">Yemen</option>
							<option value="YU">Yugoslavia</option>
							<option value="ZM">Zambia</option>
							<option value="ZW">Zimbabue</option>
						</select>
						<form:errors cssClass="error" path="nacionalidad"></form:errors>
					</div>



					<!-- CUIL/CUIT -->
					<div class="form-group">
						<label for="inputCuil">CUIL/CUIT</label> <input type="text"
							class="form-control" id="CUIL_CUIT" path="CUIL_CUIT"
							name="CUIL_CUIT" placeholder="CUIL/CUIT">
						<form:errors cssClass="error" path="CUIL"></form:errors>
					</div>


					<!-- DOMICILIO -->
					<div class="form-group">
						<label for="inputDomicilio">Domicilio</label> <input type="text"
							class="form-control" path="domicilio" id="domicilio "
							name="domicilio" placeholder="Domicilio" >
						<form:errors cssClass="error" path="domicilio"></form:errors>
					</div>
					
					<!-- DEPARTAMENTO -->
					<div class="form-group">
						<label for="inputDepartamento">Departamento</label> <input type="text"
							class="form-control" path="departamento" id="departamento"
							name="departamento" placeholder="Departamento">
						<form:errors cssClass="error" path="departamento"></form:errors>
					</div>

						<!-- PROVINCIA -->
					<div class="form-group">
						<label for="inputProvincia">Provincia</label> <input type="text"
							class="form-control" path="provincia" id="provincia"
							name="provincia" placeholder="Provincia">
						<form:errors cssClass="error" path="provincia"></form:errors>
					</div>
					
							<!-- PAIS -->
					<div class="form-group">
						<label for="inputPais">País</label><br> <input type="text"
							class="form-control" path="pais" id="pais"
							name="pais" placeholder="Pais">
						<form:errors cssClass="error" path="pais"></form:errors>
					</div>
					<button type="submit" class="btn btn-primary">Enviar</button>

			

				</form:form>
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