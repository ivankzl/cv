package ar.edu.um.dao;

public class Alumno {
	
	private int alu_dni;
	private int alu_doc_id;
	private String alu_apellido;
	private String alu_nombre;
	private String alu_fechanac;
	private int alu_dia;
	private int alu_mes;
	private int alu_anio;
	private String alu_email;
	private String alu_telefono;
	private String alu_domicilio;
	private String alu_sexo;
	private int alu_id;
	
	public Alumno(){
		
	}

	public int getAlu_dni() {
		return alu_dni;
	}

	public void setAlu_dni(int alu_dni) {
		this.alu_dni = alu_dni;
	}

	public int getAlu_doc_id() {
		return alu_doc_id;
	}

	public void setAlu_doc_id(int alu_doc_id) {
		this.alu_doc_id = alu_doc_id;
	}

	public String getAlu_apellido() {
		return alu_apellido;
	}

	public void setAlu_apellido(String alu_apellido) {
		this.alu_apellido = alu_apellido;
	}

	public String getAlu_nombre() {
		return alu_nombre;
	}

	public void setAlu_nombre(String alu_nombre) {
		this.alu_nombre = alu_nombre;
	}

	public String getAlu_fechanac() {
		return alu_fechanac;
	}

	public void setAlu_fechanac(String alu_fechanac) {
		this.alu_fechanac = alu_fechanac;
	}

	public int getAlu_dia() {
		return alu_dia;
	}

	public void setAlu_dia(int alu_dia) {
		this.alu_dia = alu_dia;
	}

	public int getAlu_mes() {
		return alu_mes;
	}

	public void setAlu_mes(int alu_mes) {
		this.alu_mes = alu_mes;
	}

	public int getAlu_anio() {
		return alu_anio;
	}

	public void setAlu_anio(int alu_anio) {
		this.alu_anio = alu_anio;
	}

	public String getAlu_email() {
		return alu_email;
	}

	public void setAlu_email(String alu_email) {
		this.alu_email = alu_email;
	}

	public String getAlu_telefono() {
		return alu_telefono;
	}

	public void setAlu_telefono(String alu_telefono) {
		this.alu_telefono = alu_telefono;
	}

	public String getAlu_domicilio() {
		return alu_domicilio;
	}

	public void setAlu_domicilio(String alu_domicilio) {
		this.alu_domicilio = alu_domicilio;
	}

	public String getAlu_sexo() {
		return alu_sexo;
	}

	public void setAlu_sexo(String alu_sexo) {
		this.alu_sexo = alu_sexo;
	}

	public int getAlu_id() {
		return alu_id;
	}

	public void setAlu_id(int alu_id) {
		this.alu_id = alu_id;
	}

	@Override
	public String toString() {
		return "Alumno [alu_dni=" + alu_dni + ", alu_doc_id=" + alu_doc_id
				+ ", alu_apellido=" + alu_apellido + ", alu_nombre="
				+ alu_nombre + ", alu_fechanac=" + alu_fechanac + ", alu_dia="
				+ alu_dia + ", alu_mes=" + alu_mes + ", alu_anio=" + alu_anio
				+ ", alu_email=" + alu_email + ", alu_telefono=" + alu_telefono
				+ ", alu_domicilio=" + alu_domicilio + ", alu_sexo=" + alu_sexo
				+ ", alu_id=" + alu_id + "]";
	}

	

}

