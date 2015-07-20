package ar.edu.um.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ar.edu.um.model.User;
import ar.edu.um.model.UserRole;

@Component("userDao")
public class UsersDAO {
private NamedParameterJdbcTemplate jdbc;

	
	@Autowired
	public void setDatasource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	/*Crear un usuario nuevo*/
	public boolean create(User user) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(user);
		System.out.println();
		return jdbc.update("insert into users (DNI, password, enabled) values (:DNI, :password, 1)", params) == 1;

	}
	
	public boolean createRole(UserRole userRole) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(userRole);
		return jdbc.update("insert into user_roles (DNI, role) values (:DNI, :role)", params) == 1;
	}
}
