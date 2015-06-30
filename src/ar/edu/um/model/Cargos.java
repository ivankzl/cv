package ar.edu.um.model;

import java.math.BigDecimal;

public class Cargos{
	
	private BigDecimal dni;
	private String nivel_superior_universitario;
	private String nivel_terciario_no_universitario;
	private String nivel_basico;
	private String cursos_posgrado_y_capacitaciones;
	private String cargos_organismos_ct;
	private String categorizacion_programa_incentivos;
	private String cargos_id_otro;
	private String cargos_gestion_institucional;
	private String otros_cargos;
	
	public Cargos(){
			
	}
	
	public BigDecimal getDni(){
		return dni;
	}
	
	public void setDni(BigDecimal dni) {
		this.dni = dni;
	}
	
	public String getNivel_superior_universitario() {
		return nivel_superior_universitario;
	}

	public void setNivel_superior_universitario(String nivel_superior_universitario) {
		this.nivel_superior_universitario = nivel_superior_universitario;
	}

	public String getNivel_terciario_no_universitario() {
		return nivel_terciario_no_universitario;
	}

	public void setNivel_terciario_no_universitario(
			String nivel_terciario_no_universitario) {
		this.nivel_terciario_no_universitario = nivel_terciario_no_universitario;
	}

	public String getNivel_basico() {
		return nivel_basico;
	}

	public void setNivel_basico(String nivel_basico) {
		this.nivel_basico = nivel_basico;
	}

	public String getCursos_posgrado_y_capacitaciones() {
		return cursos_posgrado_y_capacitaciones;
	}

	public void setCursos_posgrado_y_capacitaciones(
			String cursos_posgrado_y_capacitaciones) {
		this.cursos_posgrado_y_capacitaciones = cursos_posgrado_y_capacitaciones;
	}

	public String getCargos_organismos_ct() {
		return cargos_organismos_ct;
	}

	public void setCargos_organismos_ct(String cargos_organismos_ct) {
		this.cargos_organismos_ct = cargos_organismos_ct;
	}

	public String getCategorizacion_programa_incentivos() {
		return categorizacion_programa_incentivos;
	}

	public void setCategorizacion_programa_incentivos(
			String categorizacion_programa_incentivos) {
		this.categorizacion_programa_incentivos = categorizacion_programa_incentivos;
	}

	public String getCargos_id_otro() {
		return cargos_id_otro;
	}

	public void setCargos_id_otro(String cargos_id_otro) {
		this.cargos_id_otro = cargos_id_otro;
	}

	public String getCargos_gestion_institucional() {
		return cargos_gestion_institucional;
	}

	public void setCargos_gestion_institucional(String cargos_gestion_institucional) {
		this.cargos_gestion_institucional = cargos_gestion_institucional;
	}

	public String getOtros_cargos() {
		return otros_cargos;
	}

	public void setOtros_cargos(String otros_cargos) {
		this.otros_cargos = otros_cargos;
	}

	@Override
	public String toString() {
		return "Cargos [dni=" + dni + ", nivel_superior_universitario="
				+ nivel_superior_universitario
				+ ", nivel_terciario_no_universitario="
				+ nivel_terciario_no_universitario + ", nivel_basico="
				+ nivel_basico + ", cursos_posgrado_y_capacitaciones="
				+ cursos_posgrado_y_capacitaciones + ", cargos_organismos_ct="
				+ cargos_organismos_ct
				+ ", categorizacion_programa_incentivos="
				+ categorizacion_programa_incentivos + ", cargos_id_otro="
				+ cargos_id_otro + ", cargos_gestion_institucional="
				+ cargos_gestion_institucional + ", otros_cargos="
				+ otros_cargos + "]";
	}


}