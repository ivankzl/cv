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
import ar.edu.um.service.DatosPersonalesService;


@Controller
public class DataController {

	private DatosPersonalesService datosPersonalesService;
	
	@Autowired
	public void setDatosPersonalesService(DatosPersonalesService datosPersonalesService) {
		this.datosPersonalesService = datosPersonalesService;
	}
	
	@RequestMapping(value="/creardatos", method=RequestMethod.POST)
	public String creaDatos(Model model, @RequestParam BigDecimal dni, @RequestParam String dia, @RequestParam String mes, @RequestParam String anio, @Valid DatosPersonales dp, BindingResult result) {
		if (result.hasErrors()){
			System.out.println("no se valido el formulario");
			List<ObjectError> errors = result.getAllErrors();
			
			for (Object error: errors) {
				System.out.println(error);
			}
			
			return "/";
		}
		
		String fecha = anio + "-" + mes + "-" + dia;
		dp.setFecha_nac(fecha);
		
		datosPersonalesService.create(dp);
		
		model.addAttribute("dni", dp.getDni());
		model.addAttribute("nombre", dp.getNombre());
		model.addAttribute("apellido", dp.getApellido());
		model.addAttribute("sexo", dp.getSexo());
		model.addAttribute("estado_civil", dp.getEstado_civil());
		model.addAttribute("email", dp.getEmail());
		model.addAttribute("fecha_nac", dp.getFecha_nac());
		model.addAttribute("nacionalidad", dp.getNacionalidad());
		model.addAttribute("CUIL_CUIT", dp.getCUIL_CUIT());
		model.addAttribute("domicilio", dp.getDomicilio());
		model.addAttribute("departamento", dp.getDepartamento());
		model.addAttribute("provincia", dp.getProvincia());
		model.addAttribute("pais", dp.getPais());
		
		
		return "cv";
	}
	
}
