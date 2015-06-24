package ar.edu.um.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.Alumno;
import ar.edu.um.dao.Documento;
import ar.edu.um.dao.DocumentosDAO;
import ar.edu.um.dao.Inscripcion;
import ar.edu.um.dao.InscripcionesDAO;

@Service("documentosService")
public class DocumentosService {

private DocumentosDAO documentosDao;
	
	@Autowired
	public void setDocumentosDao(DocumentosDAO documentosDao) {
		this.documentosDao = documentosDao;
	}
	
	public List<Documento> getCurrent() {

		return documentosDao.getDocumentos();

	}
	

	public Documento getDocumento(int doc_id) {

		return documentosDao.getDocumento(doc_id);

	}
	
}
