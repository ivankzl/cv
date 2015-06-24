package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.CvDAO;

@Service("cvService")
public class CvService {
	
	private CvDAO cvDao;
	
	@Autowired
	public void setCvDao(CvDAO cvDao) {
		this.cvDao = cvDao;
	}
	
	
}
