package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.FormacionDAO;
import ar.edu.um.model.Formacion;

@Service("formacionService")
public class FormacionService {
	private FormacionDAO formacionDao;
	

	@Autowired
	public void setFormacionDao(FormacionDAO formacionDao) {
		this.formacionDao = formacionDao;
	}
	
	public void create(Formacion formacion){
		formacionDao.create(formacion);
	}
	/*
	public Formacion getData(int dni){
		System.out.println("formacion get data");
		return formacionDao.getData(dni);
	}
	*/
}
