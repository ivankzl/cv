<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>Currículum Vitae</title>

<meta charset="UTF-8">
<link rel="stylesheet"
	href="resources/bootstrap-3.3.4-dist/css/bootstrap.css" />
<link rel="stylesheet" href="resources/bootstrap-3.3.4-dist/style.css" />
</head>
<body onload='document.loginForm.username.focus();'>


	<div class="col-lg-4 col-lg-offset-4">
		<img src="resources/images/marca.png">
		<div class="well">
			<div class="container2">
				<div class="row">
					<div class="verific">

						<div id="login-box">


							<c:if test="${not empty error}">
								<div class="error">${error}</div>
							</c:if>
							<c:if test="${not empty msg}">
								<div class="msg">${msg}</div>
							</c:if>
							
							<p>a cerrado sesion correctamente</p>

							<form name='loginForm'
								action="<c:url value='/j_spring_security_check' />"
								method='POST'>


								<div class="form-group">
									<label for="inputNumDoc">N° Documento</label> <input
										type="text" name="username" placeholder="N° Documento">
								</div>
								<div class="form-group">
									<label for="inputPass">Contraseña</label> <input
										type="password" name="password">
								</div>
								<input name="submit" type="submit" value="submit" />

								<div class="form-group">
									¿No tenés una cuenta? <a href="<c:url value="/registro" />">Registrate
										aquí.</a>
								</div>

								<input type="hidden" name="${_csrf.parameterName}"
									value="${_csrf.token}" />

							</form>
						</div>
					</div>
				</div>
			</div>
			<!--container-->
		</div>
	</div>

</body>
</html>