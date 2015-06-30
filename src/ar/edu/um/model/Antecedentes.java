package ar.edu.um.model;

import java.math.BigDecimal;

public class Antecedentes{
	
	public BigDecimal dni;
	public String becario;
	public String tesista_doctoral;
	public String tesista_maestria;
	public String tesista_grado;
	public String investigadores;
	public String pasantes_id_y_facademica;
	public String personal_apoyo_id;
	public String financiamiento_cientifico_tecnologico;
	public String actividades_divulgacion;
	public String extension_rural_industrial;
	public String prestacion_servicios_sociales;
	public String produccion_divulgacion_artistica;
	public String otro_tipo_actividad;
	public String evaluacion_personal;
	public String evaluacion_programas;
	public String evaluacion_institucional;
	public String otro_tipo_evaluacion;
	public String becas;
	public String estancias_pasantias;
	public String operacion_mantenimiento;
	public String produccion;
	public String normalizacion;
	public String ejercicio_profesion_ambito_no_academico;
	public String otra_actividad_cyt;
	
	
	public BigDecimal getDni() {
		return dni;
	}
	public void setDni(BigDecimal dni) {
		this.dni = dni;
	}
	public String getBecario() {
		return becario;
	}
	public void setBecario(String becario) {
		this.becario = becario;
	}
	public String getTesista_doctoral() {
		return tesista_doctoral;
	}
	public void setTesista_doctoral(String tesista_doctoral) {
		this.tesista_doctoral = tesista_doctoral;
	}
	public String getTesista_maestria() {
		return tesista_maestria;
	}
	public void setTesista_maestria(String tesista_maestria) {
		this.tesista_maestria = tesista_maestria;
	}
	public String getTesista_grado() {
		return tesista_grado;
	}
	public void setTesista_grado(String tesista_grado) {
		this.tesista_grado = tesista_grado;
	}
	public String getInvestigadores() {
		return investigadores;
	}
	public void setInvestigadores(String investigadores) {
		this.investigadores = investigadores;
	}
	public String getPasantes_id_y_facademica() {
		return pasantes_id_y_facademica;
	}
	public void setPasantes_id_y_facademica(String pasantes_id_y_facademica) {
		this.pasantes_id_y_facademica = pasantes_id_y_facademica;
	}
	public String getPersonal_apoyo_id() {
		return personal_apoyo_id;
	}
	public void setPersonal_apoyo_id(String personal_apoyo_id) {
		this.personal_apoyo_id = personal_apoyo_id;
	}
	public String getFinanciamiento_cientifico_tecnologico() {
		return financiamiento_cientifico_tecnologico;
	}
	public void setFinanciamiento_cientifico_tecnologico(
			String financiamiento_cientifico_tecnologico) {
		this.financiamiento_cientifico_tecnologico = financiamiento_cientifico_tecnologico;
	}
	public String getActividades_divulgacion() {
		return actividades_divulgacion;
	}
	public void setActividades_divulgacion(String actividades_divulgacion) {
		this.actividades_divulgacion = actividades_divulgacion;
	}
	public String getExtension_rural_industrial() {
		return extension_rural_industrial;
	}
	public void setExtension_rural_industrial(String extension_rural_industrial) {
		this.extension_rural_industrial = extension_rural_industrial;
	}
	public String getPrestacion_servicios_sociales() {
		return prestacion_servicios_sociales;
	}
	public void setPrestacion_servicios_sociales(
			String prestacion_servicios_sociales) {
		this.prestacion_servicios_sociales = prestacion_servicios_sociales;
	}
	public String getProduccion_divulgacion_artistica() {
		return produccion_divulgacion_artistica;
	}
	public void setProduccion_divulgacion_artistica(
			String produccion_divulgacion_artistica) {
		this.produccion_divulgacion_artistica = produccion_divulgacion_artistica;
	}
	public String getOtro_tipo_actividad() {
		return otro_tipo_actividad;
	}
	public void setOtro_tipo_actividad(String otro_tipo_actividad) {
		this.otro_tipo_actividad = otro_tipo_actividad;
	}
	public String getEvaluacion_personal() {
		return evaluacion_personal;
	}
	public void setEvaluacion_personal(String evaluacion_personal) {
		this.evaluacion_personal = evaluacion_personal;
	}
	public String getEvaluacion_programas() {
		return evaluacion_programas;
	}
	public void setEvaluacion_programas(String evaluacion_programas) {
		this.evaluacion_programas = evaluacion_programas;
	}
	public String getEvaluacion_institucional() {
		return evaluacion_institucional;
	}
	public void setEvaluacion_institucional(String evaluacion_institucional) {
		this.evaluacion_institucional = evaluacion_institucional;
	}
	public String getOtro_tipo_evaluacion() {
		return otro_tipo_evaluacion;
	}
	public void setOtro_tipo_evaluacion(String otro_tipo_evaluacion) {
		this.otro_tipo_evaluacion = otro_tipo_evaluacion;
	}
	public String getBecas() {
		return becas;
	}
	public void setBecas(String becas) {
		this.becas = becas;
	}
	public String getEstancias_pasantias() {
		return estancias_pasantias;
	}
	public void setEstancias_pasantias(String estancias_pasantias) {
		this.estancias_pasantias = estancias_pasantias;
	}
	public String getOperacion_mantenimiento() {
		return operacion_mantenimiento;
	}
	public void setOperacion_mantenimiento(String operacion_mantenimiento) {
		this.operacion_mantenimiento = operacion_mantenimiento;
	}
	public String getProduccion() {
		return produccion;
	}
	public void setProduccion(String produccion) {
		this.produccion = produccion;
	}
	public String getNormalizacion() {
		return normalizacion;
	}
	public void setNormalizacion(String normalizacion) {
		this.normalizacion = normalizacion;
	}
	public String getEjercicio_profesion_ambito_no_academico() {
		return ejercicio_profesion_ambito_no_academico;
	}
	public void setEjercicio_profesion_ambito_no_academico(
			String ejercicio_profesion_ambito_no_academico) {
		this.ejercicio_profesion_ambito_no_academico = ejercicio_profesion_ambito_no_academico;
	}
	public String getOtra_actividad_cyt() {
		return otra_actividad_cyt;
	}
	public void setOtra_actividad_cyt(String otra_actividad_cyt) {
		this.otra_actividad_cyt = otra_actividad_cyt;
	}
	@Override
	public String toString() {
		return "Antecedentes [dni=" + dni + ", becario=" + becario
				+ ", tesista_doctoral=" + tesista_doctoral
				+ ", tesista_maestria=" + tesista_maestria + ", tesista_grado="
				+ tesista_grado + ", investigadores=" + investigadores
				+ ", pasantes_id_y_facademica=" + pasantes_id_y_facademica
				+ ", personal_apoyo_id=" + personal_apoyo_id
				+ ", financiamiento_cientifico_tecnologico="
				+ financiamiento_cientifico_tecnologico
				+ ", actividades_divulgacion=" + actividades_divulgacion
				+ ", extension_rural_industrial=" + extension_rural_industrial
				+ ", prestacion_servicios_sociales="
				+ prestacion_servicios_sociales
				+ ", produccion_divulgacion_artistica="
				+ produccion_divulgacion_artistica + ", otro_tipo_actividad="
				+ otro_tipo_actividad + ", evaluacion_personal="
				+ evaluacion_personal + ", evaluacion_programas="
				+ evaluacion_programas + ", evaluacion_institucional="
				+ evaluacion_institucional + ", otro_tipo_evaluacion="
				+ otro_tipo_evaluacion + ", becas=" + becas
				+ ", estancias_pasantias=" + estancias_pasantias
				+ ", operacion_mantenimiento=" + operacion_mantenimiento
				+ ", produccion=" + produccion + ", normalizacion="
				+ normalizacion
				+ ", ejercicio_profesional_ambito_no_academico="
				+ ejercicio_profesion_ambito_no_academico
				+ ", otra_actividad_cyt=" + otra_actividad_cyt + "]";
	}
	
	
	
}