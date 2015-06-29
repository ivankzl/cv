package ar.edu.um.model;

import java.math.BigDecimal;

public class Formacion {
	private BigDecimal dni;
	private String nivel_universitario_posgrado;
	private String nivel_universitario_posgrado_especializacion;
	private String nivel_universitario_grado;
	private String nivel_terciario_no_universitario;
	private String especialidad_certificada;
	private String posdoctorado;
	private String cursos_posgrado_y_capacitaciones;
	private String idiomas;
	
	public Formacion(){
		
	}

	public BigDecimal getDni() {
		return dni;
	}

	public void setDni(BigDecimal dni) {
		this.dni = dni;
	}

	public String getNivel_universitario_posgrado() {
		return nivel_universitario_posgrado;
	}

	public void setNivel_universitario_posgrado(String nivel_universitario_posgrado) {
		this.nivel_universitario_posgrado = nivel_universitario_posgrado;
	}

	public String getNivel_universitario_posgrado_especializacion() {
		return nivel_universitario_posgrado_especializacion;
	}

	public void setNivel_universitario_posgrado_especializacion(
			String nivel_universitario_posgrado_especializacion) {
		this.nivel_universitario_posgrado_especializacion = nivel_universitario_posgrado_especializacion;
	}

	public String getNivel_universitario_grado() {
		return nivel_universitario_grado;
	}

	public void setNivel_universitario_grado(String nivel_universitario_grado) {
		this.nivel_universitario_grado = nivel_universitario_grado;
	}

	public String getNivel_terciario_no_universitario() {
		return nivel_terciario_no_universitario;
	}

	public void setNivel_terciario_no_universitario(
			String nivel_terciario_no_universitario) {
		this.nivel_terciario_no_universitario = nivel_terciario_no_universitario;
	}

	public String getEspecialidad_certificada() {
		return especialidad_certificada;
	}

	public void setEspecialidad_certificada(String especialidad_certificada) {
		this.especialidad_certificada = especialidad_certificada;
	}

	public String getPosdoctorado() {
		return posdoctorado;
	}

	public void setPosdoctorado(String posdoctorado) {
		this.posdoctorado = posdoctorado;
	}

	public String getCursos_posgrado_y_capacitaciones() {
		return cursos_posgrado_y_capacitaciones;
	}

	public void setCursos_posgrado_y_capacitaciones(
			String cursos_posgrado_y_capacitaciones) {
		this.cursos_posgrado_y_capacitaciones = cursos_posgrado_y_capacitaciones;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	
	
	
	
	
}
