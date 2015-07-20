package ar.edu.um.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ar.edu.um.service.FormacionService;
import ar.edu.um.service.ProduccionService;

@Controller
public class ProduccionController {
private ProduccionService produccionService;
	
	@Autowired
	public void setProduccionService(ProduccionService produccionService) {
		this.produccionService = produccionService;
	}
	
}
