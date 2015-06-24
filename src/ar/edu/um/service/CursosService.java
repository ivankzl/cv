package ar.edu.um.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.Curso;
import ar.edu.um.dao.CursosDAO;


@Service("cursosService")
public class CursosService {
	private CursosDAO cursosDao;
	
	@Autowired
	public void setCursosDao(CursosDAO cursosDao) {
		this.cursosDao = cursosDao;
	}
	
	public List<Curso> getCurrent() {

		return cursosDao.getCursos();

	}
	
	public Curso getCurso(int cur_id) {

		return cursosDao.getCurso(cur_id);

	}
}