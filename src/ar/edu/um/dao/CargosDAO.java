package ar.edu.um.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ar.edu.um.model.Cargos;

@Component("cargosDao")
public class CargosDAO {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	

	/*Crear datos cargos*/
	public boolean create(Cargos cargos) {
		System.out.println(cargos.toString());
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(cargos);
		return jdbc.update("insert into cargos (dni, nivel_superior_universitario, nivel_terciario_no_universitario, nivel_basico, cursos_posgrado_y_capacitaciones, cargos_organismos_ct, categorizacion_programa_incentivos, cargos_id_otro, cargos_gestion_institucional, otros_cargos)"
				+ " values (:dni, :nivel_superior_universitario, :nivel_terciario_no_universitario, :nivel_basico, :cursos_posgrado_y_capacitaciones, :cargos_organismos_ct, :categorizacion_programa_incentivos, :cargos_id_otro, :cargos_gestion_institucional, :otros_cargos)", params) == 1;

	}
}
