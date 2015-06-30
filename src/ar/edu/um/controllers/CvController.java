package ar.edu.um.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.um.model.Cv;
import ar.edu.um.service.CvService;


@Controller
public class CvController {
	/*
	private CvService cvService;
	
	
	@Autowired
	public void setCursosService(CvService cvService) {
		this.cvService = cvService;
	}
	
	/* muestra los cursos que hay en la BD */ 
	@RequestMapping(value="/registro")
	public String showTest (Model model) {


		return "registro";
	}
	
	@RequestMapping(value="/cv")
	public String cv (Model model){
		
		return "cv";
	}
	
	@RequestMapping(value="/datos")
	public String datos(Model model){
		
		return "datos";
	}
	

	@RequestMapping(value="/formacion")
	public String formacion(Model model){
		
		return "formacion";
	}
	
	@RequestMapping(value="/cargos")
	public String cargos(Model model){
		
		return "cargos";
	}
	

	@RequestMapping(value="/produccion")
	public String produccion(Model model){
		
		return "produccion";
	}
	
}