package ar.edu.um.model;

import java.math.BigDecimal;

public class DatosPersonales {
	private BigDecimal dni;
	private String nombre;
	private String apellido;
	private String sexo;
	private String estado_civil;
	private String email;
	private String fecha_nac;
	private int dia;
	private int mes;
	private int anio;
	private String nacionalidad;
	private String CUIL_CUIT;
	private String domicilio;
	private String departamento;
	private String provincia;
	private String pais;
	
	public DatosPersonales(){
		
	}
	
	
	public BigDecimal getDni() {
		return dni;
	}
	public void setDni(BigDecimal dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getCUIL_CUIT() {
		return CUIL_CUIT;
	}
	public void setCUIL_CUIT(String cUIL_CUIT) {
		CUIL_CUIT = cUIL_CUIT;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "DatosPersonales [dni=" + dni + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", sexo=" + sexo
				+ ", estado_civil=" + estado_civil + ", email=" + email
				+ ", fecha_nac=" + fecha_nac + ", dia=" + dia + ", mes=" + mes
				+ ", anio=" + anio + ", nacionalidad=" + nacionalidad
				+ ", CUIL_CUIT=" + CUIL_CUIT + ", domicilio=" + domicilio
				+ ", departamento=" + departamento + ", provincia=" + provincia
				+ ", pais=" + pais + "]";
	}
	
	
	
}
