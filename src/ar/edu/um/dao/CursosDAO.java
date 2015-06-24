package ar.edu.um.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("cursosDao")
public class CursosDAO {
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	
	public List<Curso> getCursos() {

		return jdbc.query("select * from curso", new RowMapper<Curso>() {

			public Curso mapRow(ResultSet rs, int rowNum) throws SQLException {

				Curso curso = new Curso();
				
				curso.setCur_id(rs.getInt("cur_id"));
				curso.setCur_titulo(rs.getString("cur_titulo"));
				curso.setCur_descripcion(rs.getString("cur_descripcion"));
				curso.setCur_inicio(rs.getDate("cur_inicio"));
				curso.setCur_duracion(rs.getInt("cur_duracion"));
				curso.setCur_profesor(rs.getString("cur_profesor"));
				curso.setCur_url(rs.getString("cur_url"));
				curso.setCur_habilitado(rs.getInt("cur_habilitado"));
				
				return curso;
			}

		});

	}
	
	public Curso getCurso(int cur_id) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("cur_id", cur_id);

		return jdbc.queryForObject("select * from curso where cur_id = :cur_id", params, new RowMapper<Curso>() {

					public Curso mapRow(ResultSet rs, int rowNum)
							throws SQLException {

						Curso curso = new Curso();
						
						curso.setCur_id(rs.getInt("cur_id"));
						curso.setCur_titulo(rs.getString("cur_titulo"));
						curso.setCur_descripcion(rs.getString("cur_descripcion"));
						curso.setCur_inicio(rs.getDate("cur_inicio"));
						curso.setCur_duracion(rs.getInt("cur_duracion"));
						curso.setCur_profesor(rs.getString("cur_profesor"));
						curso.setCur_url(rs.getString("cur_url"));
						curso.setCur_habilitado(rs.getInt("cur_habilitado"));
						
						return curso;
					}

				});
	}
	
}
	
	