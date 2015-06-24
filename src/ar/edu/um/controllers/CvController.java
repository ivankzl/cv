package ar.edu.um.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.um.dao.Curso;
import ar.edu.um.dao.Cv;
import ar.edu.um.service.CursosService;
import ar.edu.um.service.CvService;


@Controller
public class CvController {
	
	private CvService cvService;
	
	@Autowired
	public void setCursosService(CvService cvService) {
		this.cvService = cvService;
	}
	
	/* muestra los cursos que hay en la BD */
	@RequestMapping(value="/")
	public String showTest (Model model) {


		return "cv";
	}
}