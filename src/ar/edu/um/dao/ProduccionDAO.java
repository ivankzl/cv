package ar.edu.um.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ar.edu.um.model.Produccion;

@Component("produccionDao")
public class ProduccionDAO {
private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	

	/*Crear datos formacion*/
	public boolean create(Produccion produccion) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(produccion);
		return jdbc.update("insert into produccion (dni, articulos_revistas_con_referato, articulos_revistas_sin_referato, libros, partes_libros, trabajos_eventos_ct_publicados, trabajos_eventos_ct_no_publicados, demas_producciones_ct, con_titulo_prop_int, sin_titulo_prop_int, servicio_ct, informe_tecnico, musical_sonora, visual, audiovisual, corporal_teatral, genero_literario_narrativo, genero_literario_dramatico, genero_literario_guion, otro_tipo, otra_produccion) values (:dni, :articulos_revistas_con_referato, :articulos_revistas_sin_referato, :libros, :partes_libros, :trabajos_eventos_ct_publicados, :trabajos_eventos_ct_no_publicados, :demas_producciones_ct, :con_titulo_prop_int, :sin_titulo_prop_int, :servicio_ct, :informe_tecnico, :musical_sonora, :visual, :audiovisual, :corporal_teatral, :genero_literario_narrativo, :genero_literario_dramatico, :genero_literario_guion, _otro_tipo, :otra_produccion)", params) == 1;

	}
}
