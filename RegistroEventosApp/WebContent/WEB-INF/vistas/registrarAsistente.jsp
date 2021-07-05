<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container mt-6">
<c:if test="${mensaje != null}">
	<div class="columns is-centered mb-6">
		<div class="columns is-6">
			<div class="notification is-info">
				<p>${mensaje}</p>
			</div>
		</div>
	</div>
</c:if>
	<div class="columns is-centered">
		<div class="column is-6">
			<form method="POST" action="RegistrarAsistente.do">
				<div class="card">
					<div class="card-header has-background-warning">
						<div class="card-footer-item">

							<span class="card-header-tittle">Registrar Asistente</span>
						</div>
					</div>
					<div class="card-content">
						<div class="field">
							<label class="label" for="nombre-txt">Rut</label>
							<div class="control">
								<input type="text" class="input" id="rut-txt" name="rut-txt" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="nombre-txt">Nombre</label>
							<div class="control">
								<input type="text" class="input" id="nombre-txt"
									name="nombre-txt" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="nombre-txt">Apellido</label>
							<div class="control">
								<input type="text" class="input" id="Apellido-txt"
									name="Apellido-txt" />
							</div>
							<div class="field">
								<label class="label" for="nombre-txt">Edad</label>
								<div class="control">
									<input type="text" class="input" id="edad-txt" name="edad-txt" />
								</div>
							</div>
							<div class="field">
								<label class="label" for="nombre-txt">Empresa</label>
								<div class="control">
									<input type="text" class="input" id="empresa-txt"
										name="empresa-txt" />
								</div>
							</div>
							<div class="field">
								<label class="label" for="estado-select">Estado</label>
								<div class="control">
									<div class="select">
										<select name="estado-select" id="estado-select">
											<option>Pagada</option>
											<option>Con deuda</option>
										</select>
									</div>
								</div>
							</div>
							<div class="field">
								<label class="label" for="estado-select">Región</label>
								<div class="control">
									<div class="select">
										<select name="estado-select" id="estado-select">
											<option>Valparaiso</option>
											<option>Santiago</option>
											<option>Norte de chile</option>
											<option>Sur de chile</option>
											<option>Internacional</option>
										</select>
									</div>
								</div>
							</div>
							<div class="card-footer"></div>
							<div class="card-footer-item">
								<button type="submit" class="button is-primary">Registrar</button>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>

</main>
</body>
</html>