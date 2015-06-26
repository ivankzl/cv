package ar.edu.um.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ar.edu.um.model.DatosPersonales;

@Component("datosPersonalesDao")
public class DatosPersonalesDAO {
private NamedParameterJdbcTemplate jdbc;

	
	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	
	//trae los datos de la bd
	public DatosPersonales getData(int dni) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("dni", dni);

	      
		try {
			return jdbc.queryForObject("select * from datos_personales where DNI = :DNI ", params, new RowMapper<DatosPersonales>() {
	
						public DatosPersonales mapRow(ResultSet rs, int rowNum) throws SQLException {
	
						
							DatosPersonales dp = new DatosPersonales();
							
							dp.setDni(rs.getBigDecimal("DNI"));
							dp.setNombre(rs.getString("nombre"));
							dp.setApellido(rs.getString("apellido"));
							dp.setSexo(rs.getString("sexo"));
							dp.setEstado_civil(rs.getString("estado_civil"));
							dp.setEmail(rs.getString("email"));
							dp.setFecha_nac(rs.getString("fecha_nac"));
							dp.setNacionalidad(rs.getString("nacionalidad"));
							dp.setCUIL_CUIT(rs.getString("CUIL_CUIT"));
							dp.setDomicilio(rs.getString("domicilio"));
							dp.setDepartamento(rs.getString("departamento"));
							dp.setProvincia(rs.getString("provincia"));
							dp.setPais(rs.getString("pais"));
							
							
							
							System.out.println("ALU DENTRO DAO: " + dp);
	
							return dp;
						}
	
					});
		}
		   catch(EmptyResultDataAccessException erdae) {
		       return null;
		   }
	}

}
