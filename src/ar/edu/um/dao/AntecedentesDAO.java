package ar.edu.um.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ar.edu.um.model.Antecedentes;

@Component("antecedentesDao")
public class AntecedentesDAO {
private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	

	/*Crear datos cargos*/
	public boolean create(Antecedentes antecedentes) {
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(antecedentes);
		return jdbc.update("insert into antecedentes (dni, becario, tesista_doctoral, tesista_maestria, tesista_grado, investigadores, pasantes_id_y_facademica, personal_apoyo_id, financiamiento_cientifico_tecnologico, actividades_divulgacion, extension_rural_industrial, prestacion_servicios_sociales, produccion_divulgacion_artistica, otro_tipo_actividad, evaluacion_personal, evaluacion_programas, evaluacion_institucional, otro_tipo_evaluacion, becas, estancias_pasantias, operacion_mantenimiento, produccion, normalizacion, ejercicio_profesion_ambito_no_academico, otra_actividad_cyt)"
				+ " values (:dni, :becario, :tesista_doctoral, :tesista_maestria, :tesista_grado, :investigadores, :pasantes_id_y_facademica, :personal_apoyo_id, :financiamiento_cientifico_tecnologico, :actividades_divulgacion, :extension_rural_industrial, :prestacion_servicios_sociales, :produccion_divulgacion_artistica, :otro_tipo_actividad, :evaluacion_personal, :evaluacion_programas, :evaluacion_institucional, :otro_tipo_evaluacion, :becas, :estancias_pasantias, :operacion_mantenimiento, :produccion, :normalizacion, :ejercicio_profesion_ambito_no_academico, :otra_actividad_cyt)", params) == 1;

	}
}
