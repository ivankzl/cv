package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.AntecedentesDAO;
import ar.edu.um.model.Antecedentes;

@Service("antecedentesService")
public class AntecedentesService {

	private AntecedentesDAO antecedentesDao;
	

	@Autowired
	public void setAntecedentesDao(AntecedentesDAO antecedentesDao) {
		this.antecedentesDao = antecedentesDao;
	}
	
	public void create(Antecedentes antecedentes){
		antecedentesDao.create(antecedentes);
	}
}
