package ar.edu.um.dao;

import java.util.Date;

public class Curso {
	private int cur_id;
	private String cur_titulo;
	private String cur_descripcion;
	private Date cur_inicio;
	private int cur_duracion;
	private String cur_profesor;
	private String cur_url;
	private int cur_habilitado;
	
	public Curso() {
		
	}

	public int getCur_id() {
		return cur_id;
	}

	public void setCur_id(int cur_id) {
		this.cur_id = cur_id;
	}
	
	

	public int getCur_habilitado() {
		return cur_habilitado;
	}

	public void setCur_habilitado(int cur_habilitado) {
		this.cur_habilitado = cur_habilitado;
	}

	public String getCur_titulo() {
		return cur_titulo;
	}

	public void setCur_titulo(String cur_titulo) {
		this.cur_titulo = cur_titulo;
	}

	public String getCur_descripcion() {
		return cur_descripcion;
	}

	public void setCur_descripcion(String cur_descripcion) {
		this.cur_descripcion = cur_descripcion;
	}

	public Date getCur_inicio() {
		return cur_inicio;
	}

	public void setCur_inicio(Date cur_inicio) {
		this.cur_inicio = cur_inicio;
	}

	public int getCur_duracion() {
		return cur_duracion;
	}

	public void setCur_duracion(int cur_duracion) {
		this.cur_duracion = cur_duracion;
	}

	public String getCur_profesor() {
		return cur_profesor;
	}

	public void setCur_profesor(String cur_profesor) {
		this.cur_profesor = cur_profesor;
	}

	public String getCur_url() {
		return cur_url;
	}

	public void setCur_url(String cur_url) {
		this.cur_url = cur_url;
	}

	@Override
	public String toString() {
		return "Curso [cur_id=" + cur_id + ", cur_titulo=" + cur_titulo
				+ ", cur_descripcion=" + cur_descripcion + ", cur_inicio="
				+ cur_inicio + ", cur_duracion=" + cur_duracion
				+ ", cur_profesor=" + cur_profesor + ", cur_url=" + cur_url
				+ "]";
	}
	
	
}