package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.ProduccionDAO;
import ar.edu.um.model.Produccion;

@Service("produccionService")
public class ProduccionService {
	private ProduccionDAO produccionDao;
	

	@Autowired
	public void setProduccionDao(ProduccionDAO produccionDao) {
		this.produccionDao = produccionDao;
	}
	
	public void create(Produccion produccion){
		produccionDao.create(produccion);
	}
}

