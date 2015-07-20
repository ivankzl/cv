package ar.edu.um.dao;

import java.math.BigDecimal;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ar.edu.um.model.OtrosAntecedentes;

@Component("otrosantecedentesDao")
public class OtrosAntecedentesDAO {
private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	

	/*Crear datos cargos*/
	public boolean create(OtrosAntecedentes otrosAntecedentes) {
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(otrosAntecedentes);
		return jdbc.update("insert into otros_antecedentes (dni, estancias_pasantias, membresias_asociaciones_ct, coordinacion_proyectos_cooperacion, premios_distinciones, dato_academico, curriculum_vitae, participacion_redes_tematicas)"
				+ " values (:dni, :estancias_pasantias, :membresias_asociaciones_ct, :coordinacion_proyectos_cooperacion, :premios_distinciones, :dato_academico, :curriculum_vitae, :participacion_redes_tematicas)", params) == 1;

	}
}
