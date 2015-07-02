package ar.edu.um.controllers;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.um.model.DatosPersonales;
import ar.edu.um.model.Formacion;
import ar.edu.um.service.FormacionService;

@Controller
public class FormacionController {

	private FormacionService formacionService;
	
	@Autowired
	public void setFormacionService(FormacionService formacionService) {
		this.formacionService = formacionService;
	}
	
	@RequestMapping(value="/crearformacion", method=RequestMethod.POST)
	public String creaDatos(Model model, @Valid Formacion formacion, BindingResult result) {
		if (result.hasErrors()){
			System.out.println("no se valido el formulario");
			List<ObjectError> errors = result.getAllErrors();
			
			for (Object error: errors) {
				System.out.println(error);
			}
			
			return "/";
			}
		
		formacionService.create(formacion);
		
		model.addAttribute("dni", formacion.getDni());
		model.addAttribute("nivel_universitario_posgrado", formacion.getNivel_universitario_posgrado());
		model.addAttribute("nivel_universitario_posgrado_especializacion", formacion.getNivel_universitario_posgrado_especializacion());
		model.addAttribute("nivel_universitario_grado", formacion.getNivel_universitario_grado());
		model.addAttribute("nivel_terciario_no_universitario", formacion.getNivel_terciario_no_universitario());
		model.addAttribute("especialidad_certificada", formacion.getEspecialidad_certificada());
		model.addAttribute("posdoctorado", formacion.getPosdoctorado());
		model.addAttribute("cursos_posgrado_y_capacitaciones", formacion.getCursos_posgrado_y_capacitaciones());
		model.addAttribute("idiomas", formacion.getIdiomas());
		
		
		return "cv";
	}
	
}
