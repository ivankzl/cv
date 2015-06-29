package ar.edu.um.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ar.edu.um.model.Formacion;

@Component("formacionDao")
public class FormacionDAO {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	

	/*Crear datos formacion*/
	public boolean create(Formacion formacion) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(formacion);
		return jdbc.update("insert into formacion (dni, nivel_universitario_posgrado, nivel_universitario_posgrado_especializacion, nivel_universitario_grado, nivel_terciario_no_universitario, especialidad_certificada, posdoctorado, cursos_posgrado_y_capacitaciones, idiomas) values (:dni, :nivel_universitario_posgrado, :nivel_universitario_posgrado_especializacion, :nivel_universitario_grado, :nivel_terciario_no_universitario, :especialidad_certificada, :posdoctorado, :cursos_posgrado_y_capacitaciones, :idiomas)", params) == 1;

	}
}
