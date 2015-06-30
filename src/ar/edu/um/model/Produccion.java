package ar.edu.um.model;

import java.math.BigDecimal;

public class Produccion {
	private BigDecimal dni;
	private String articulos_revistas_con_referato;
	private String articulos_revistas_sin_referato;
	private String libros;
	private String partes_libros;
	private String trabajos_eventos_ct_publicados;
	private String trabajos_eventos_ct_no_publicados;
	private String demas_producciones_ct;
	private String con_titulo_prop_int;
	private String sin_titulo_prop_int;
	private String servicio_ct;
	private String informe_tecnico;
	private String musical_sonora;
	private String visual;
	private String audiovisual;
	private String corporal_teatral;
	private String genero_literario_narrativo;
	private String genero_literario_dramatico;
	private String genero_literario_guion;
	private String otro_tipo;
	private String otra_produccion;
	
	public Produccion(){
		
	}

	public BigDecimal getDni() {
		return dni;
	}

	public void setDni(BigDecimal dni) {
		this.dni = dni;
	}

	public String getArticulos_revistas_con_referato() {
		return articulos_revistas_con_referato;
	}

	public void setArticulos_revistas_con_referato(
			String articulos_revistas_con_referato) {
		this.articulos_revistas_con_referato = articulos_revistas_con_referato;
	}

	public String getArticulos_revistas_sin_referato() {
		return articulos_revistas_sin_referato;
	}

	public void setArticulos_revistas_sin_referato(
			String articulos_revistas_sin_referato) {
		this.articulos_revistas_sin_referato = articulos_revistas_sin_referato;
	}

	public String getLibros() {
		return libros;
	}

	public void setLibros(String libros) {
		this.libros = libros;
	}

	public String getPartes_libros() {
		return partes_libros;
	}

	public void setPartes_libros(String partes_libros) {
		this.partes_libros = partes_libros;
	}

	public String getTrabajos_eventos_ct_publicados() {
		return trabajos_eventos_ct_publicados;
	}

	public void setTrabajos_eventos_ct_publicados(
			String trabajos_eventos_ct_publicados) {
		this.trabajos_eventos_ct_publicados = trabajos_eventos_ct_publicados;
	}

	public String getTrabajos_eventos_ct_no_publicados() {
		return trabajos_eventos_ct_no_publicados;
	}

	public void setTrabajos_eventos_ct_no_publicados(
			String trabajos_eventos_ct_no_publicados) {
		this.trabajos_eventos_ct_no_publicados = trabajos_eventos_ct_no_publicados;
	}

	public String getDemas_producciones_ct() {
		return demas_producciones_ct;
	}

	public void setDemas_producciones_ct(String demas_producciones_ct) {
		this.demas_producciones_ct = demas_producciones_ct;
	}

	public String getCon_titulo_prop_int() {
		return con_titulo_prop_int;
	}

	public void setCon_titulo_prop_int(String con_titulo_prop_int) {
		this.con_titulo_prop_int = con_titulo_prop_int;
	}

	public String getSin_titulo_prop_int() {
		return sin_titulo_prop_int;
	}

	public void setSin_titulo_prop_int(String sin_titulo_prop_int) {
		this.sin_titulo_prop_int = sin_titulo_prop_int;
	}

	public String getServicio_ct() {
		return servicio_ct;
	}

	public void setServicio_ct(String servicio_ct) {
		this.servicio_ct = servicio_ct;
	}

	public String getInforme_tecnico() {
		return informe_tecnico;
	}

	public void setInforme_tecnico(String informe_tecnico) {
		this.informe_tecnico = informe_tecnico;
	}

	public String getMusical_sonora() {
		return musical_sonora;
	}

	public void setMusical_sonora(String musical_sonora) {
		this.musical_sonora = musical_sonora;
	}

	public String getVisual() {
		return visual;
	}

	public void setVisual(String visual) {
		this.visual = visual;
	}

	public String getAudiovisual() {
		return audiovisual;
	}

	public void setAudiovisual(String audiovisual) {
		this.audiovisual = audiovisual;
	}

	public String getCorporal_teatral() {
		return corporal_teatral;
	}

	public void setCorporal_teatral(String corporal_teatral) {
		this.corporal_teatral = corporal_teatral;
	}

	public String getGenero_literario_narrativo() {
		return genero_literario_narrativo;
	}

	public void setGenero_literario_narrativo(String genero_literario_narrativo) {
		this.genero_literario_narrativo = genero_literario_narrativo;
	}

	public String getGenero_literario_dramatico() {
		return genero_literario_dramatico;
	}

	public void setGenero_literario_dramatico(String genero_literario_dramatico) {
		this.genero_literario_dramatico = genero_literario_dramatico;
	}

	public String getGenero_literario_guion() {
		return genero_literario_guion;
	}

	public void setGenero_literario_guion(String genero_literario_guion) {
		this.genero_literario_guion = genero_literario_guion;
	}

	public String getOtro_tipo() {
		return otro_tipo;
	}

	public void setOtro_tipo(String otro_tipo) {
		this.otro_tipo = otro_tipo;
	}

	public String getOtra_produccion() {
		return otra_produccion;
	}

	public void setOtra_produccion(String otra_produccion) {
		this.otra_produccion = otra_produccion;
	}

	@Override
	public String toString() {
		return "Produccion [dni=" + dni + ", articulos_revistas_con_referato="
				+ articulos_revistas_con_referato
				+ ", articulos_revistas_sin_referato="
				+ articulos_revistas_sin_referato + ", libros=" + libros
				+ ", partes_libros=" + partes_libros
				+ ", trabajos_eventos_ct_publicados="
				+ trabajos_eventos_ct_publicados
				+ ", trabajos_eventos_ct_no_publicados="
				+ trabajos_eventos_ct_no_publicados
				+ ", demas_producciones_ct=" + demas_producciones_ct
				+ ", con_titulo_prop_int=" + con_titulo_prop_int
				+ ", sin_titulo_prop_int=" + sin_titulo_prop_int
				+ ", servicio_ct=" + servicio_ct + ", informe_tecnico="
				+ informe_tecnico + ", musical_sonora=" + musical_sonora
				+ ", visual=" + visual + ", audiovisual=" + audiovisual
				+ ", corporal_teatral=" + corporal_teatral
				+ ", genero_literario_narrativo=" + genero_literario_narrativo
				+ ", genero_literario_dramatico=" + genero_literario_dramatico
				+ ", genero_literario_guion=" + genero_literario_guion
				+ ", otro_tipo=" + otro_tipo + ", otra_produccion="
				+ otra_produccion + "]";
	}
	
	
}