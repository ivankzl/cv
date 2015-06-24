package ar.edu.um.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("inscripcionesDao")
public class InscripcionesDAO {
	
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	
	public List<Inscripcion> getInscripciones() {

		return jdbc.query("select * from inscripcion", new RowMapper<Inscripcion>() {

			public Inscripcion mapRow(ResultSet rs, int rowNum) throws SQLException {

				Inscripcion inscripcion = new Inscripcion();
				
				inscripcion.setIns_alu_id(rs.getInt("ins_alu_id"));
				inscripcion.setIns_cur_id(rs.getInt("ins_cur_id"));
				inscripcion.setIns_fecha(rs.getString("ins_fecha"));
				inscripcion.setIns_id(rs.getInt("ins_id"));
				
				return inscripcion;
			}

		});
	}
	
	/*Crear una inscripcion nueva*/
	@Transactional
	public boolean create(Inscripcion inscripcion) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(inscripcion);
		
		/* cómo hacer? porque tengo que insertar primero la entidad alumno y luego la entidad inscripcion con 
		 * el ID de ese alumno, por ende tengo que perimero meter el alumno y después consultar el ID para poder meter
		 * la inscripcion! El DNI puede servir como clave primaria?????
		 */

		return jdbc.update("insert into inscripcion (ins_alu_id, ins_cur_id, ins_fecha) values (:ins_alu_id, :ins_cur_id, :ins_fecha)", params) == 1;

	}
	
	//Get inscripcion
	public Inscripcion getInscripcion(int ins_alu_id, int ins_cur_id) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("ins_alu_id", ins_alu_id);
		params.addValue("ins_cur_id", ins_cur_id);

	      
		try {
			return jdbc.queryForObject("select * from inscripcion where ins_alu_id = :ins_alu_id and ins_cur_id = :ins_cur_id", params, new RowMapper<Inscripcion>() {
	
						public Inscripcion mapRow(ResultSet rs, int rowNum) throws SQLException {
	
							Inscripcion inscripcion = new Inscripcion();
							
							inscripcion.setIns_alu_id(rs.getInt("ins_alu_id"));
							inscripcion.setIns_cur_id(rs.getInt("ins_cur_id"));
							inscripcion.setIns_fecha(rs.getString("ins_fecha"));
							inscripcion.setIns_id(rs.getInt("ins_id"));
							
							
							
							System.out.println("INS DENTRO DAO: " + inscripcion);
	
							return inscripcion;
						}
	
					});
		}
		   catch(EmptyResultDataAccessException erdae) {
		       return null;
		   }
	}

}
