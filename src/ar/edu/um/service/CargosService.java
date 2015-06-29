package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.CargosDAO;
import ar.edu.um.model.Cargos;

@Service("cargosService")
public class CargosService {
	
	private CargosDAO cargosDao;
	

	@Autowired
	public void setCargosDao(CargosDAO cargosDao) {
		this.cargosDao = cargosDao;
	}
	
	public void create(Cargos cargos){
		cargosDao.create(cargos);
	}
}