package ar.edu.um.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.Alumno;
import ar.edu.um.dao.AlumnosDAO;


@Service("alumnosService")
public class AlumnosService {
	
	private AlumnosDAO alumnosDao;
	
	@Autowired
	public void setAlumnosDao(AlumnosDAO alumnosDao) {
		this.alumnosDao = alumnosDao;
	}
	
	public List<Alumno> getCurrent() {

		return alumnosDao.getAlumnos();

	}
	
	public void create(Alumno alumno){
		alumnosDao.create(alumno);
	}
	
	public Alumno getAlumno(int alu_dni, int alu_doc_id) {

		return alumnosDao.getAlumno(alu_dni, alu_doc_id);

	}
}
