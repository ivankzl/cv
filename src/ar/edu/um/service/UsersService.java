package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.UsersDAO;
import ar.edu.um.model.User;


@Service("usersService")
public class UsersService {
	private UsersDAO usersDao;
	
	@Autowired
	public void setUsersDao(UsersDAO usersDao) {
		this.usersDao = usersDao;
	}
	
	public void create(User user){
		usersDao.create(user);
	}
	
}