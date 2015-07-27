package ar.edu.um.model;

import java.math.BigDecimal;

public class OtrosAntecedentes{
	
	public BigDecimal dni;
	public String estancias_pasantias;
	public String membresias_asociaciones_ct;
	public String coordinacion_proyectos_cooperacion;
	public String premios_distinciones;
	public String dato_academico;
	public String curriculum_vitae;
	public String participacion_redes_tematicas;
	
	public BigDecimal getDni() {
		return dni;
	}
	public void setDni(BigDecimal dni) {
		this.dni = dni;
	}
	
	
	public String getEstancias_pasantias() {
		return estancias_pasantias;
	}
	public void setEstancias_pasantias(String estancias_pasantias) {
		this.estancias_pasantias = estancias_pasantias;
	}
	public String getMembresias_asociaciones_ct() {
		return membresias_asociaciones_ct;
	}
	public void setMembresias_asociaciones_ct(String membresias_asociaciones_ct) {
		this.membresias_asociaciones_ct = membresias_asociaciones_ct;
	}
	public String getCoordinacion_proyectos_cooperacion() {
		return coordinacion_proyectos_cooperacion;
	}
	public void setCoordinacion_proyectos_cooperacion(
			String coordinacion_proyectos_cooperacion) {
		this.coordinacion_proyectos_cooperacion = coordinacion_proyectos_cooperacion;
	}
	public String getPremios_distinciones() {
		return premios_distinciones;
	}
	public void setPremios_distinciones(String premios_distinciones) {
		this.premios_distinciones = premios_distinciones;
	}
	public String getDato_academico() {
		return dato_academico;
	}
	public void setDato_academico(String dato_academico) {
		this.dato_academico = dato_academico;
	}
	public String getCurriculum_vitae() {
		return curriculum_vitae;
	}
	public void setCurriculum_vitae(String curriculum_vitae) {
		this.curriculum_vitae = curriculum_vitae;
	}
	public String getParticipacion_redes_tematicas() {
		return participacion_redes_tematicas;
	}
	public void setParticipacion_redes_tematicas(
			String participacion_redes_tematicas) {
		this.participacion_redes_tematicas = participacion_redes_tematicas;
	}
	
	@Override
	public String toString() {
		return "OtrosAntecedentes [dni=" + dni + ", estancias_pasantias="
				+ estancias_pasantias + ", membresias_asociaciones_ct="
				+ membresias_asociaciones_ct
				+ ", coordinacion_proyectos_cooperacion="
				+ coordinacion_proyectos_cooperacion
				+ ", premios_distinciones=" + premios_distinciones
				+ ", dato_academico=" + dato_academico + ", curriculum_vitae="
				+ curriculum_vitae + ", participacion_redes_tematicas="
				+ participacion_redes_tematicas + "]";
	}
	
	
	
}