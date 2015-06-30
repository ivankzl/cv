package ar.edu.um.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.um.model.Antecedentes;
import ar.edu.um.service.AntecedentesService;

@Controller
public class AntecedentesController {
	private AntecedentesService antecedentesService;
	
	@Autowired
	public void setAntecedentesService(AntecedentesService antecedentesService) {
		this.antecedentesService = antecedentesService;
	}
	
	@RequestMapping(value="/crearantecedentes", method=RequestMethod.POST)
	public String creaCargos(Model model, @Valid Antecedentes antecedentes, BindingResult result) {
		if (result.hasErrors()){
			System.out.println("no se valido el formulario");
			List<ObjectError> errors = result.getAllErrors();
			
			for (Object error: errors) {
				System.out.println(error);
			}
			
			return "/";
		}
		
		
		antecedentesService.create(antecedentes);
		
		model.addAttribute("dni", antecedentes.getDni());
		model.addAttribute("becario", antecedentes.getBecario());
		model.addAttribute("tesista_doctoral", antecedentes.getTesista_doctoral());
		model.addAttribute("tesista_maestria", antecedentes.getTesista_maestria());
		model.addAttribute("tesista_grado", antecedentes.getTesista_grado());
		model.addAttribute("investigadores", antecedentes.getInvestigadores());
		model.addAttribute("pasantes_id_y_facademica", antecedentes.getPasantes_id_y_facademica());
		model.addAttribute("personal_apoyo_id", antecedentes.getPersonal_apoyo_id());
		model.addAttribute("financiamiento_cientifico_tecnologico", antecedentes.getFinanciamiento_cientifico_tecnologico());
		model.addAttribute("actividades_divulgacion", antecedentes.getActividades_divulgacion());
		model.addAttribute("extension_rural_industrial", antecedentes.getExtension_rural_industrial());
		model.addAttribute("prestacion_servicios_sociales", antecedentes.getPrestacion_servicios_sociales());
		model.addAttribute("produccion_divulgacion_artistica", antecedentes.getProduccion_divulgacion_artistica());
		model.addAttribute("otro_tipo_actividad", antecedentes.getOtro_tipo_actividad());
		model.addAttribute("evaluacion_personal", antecedentes.getEvaluacion_personal());
		model.addAttribute("evaluacion_programas", antecedentes.getEvaluacion_programas());
		model.addAttribute("evaluacion_institucional", antecedentes.getEvaluacion_institucional());
		model.addAttribute("otro_tipo_evaluacion", antecedentes.getOtro_tipo_evaluacion());
		model.addAttribute("becas", antecedentes.getBecas());
		model.addAttribute("estancias_pasantias", antecedentes.getEstancias_pasantias());
		model.addAttribute("operacion_mantenimiento", antecedentes.getOperacion_mantenimiento());
		model.addAttribute("produccion", antecedentes.getProduccion());
		model.addAttribute("normalizacion", antecedentes.getNormalizacion());
		model.addAttribute("ejercicio_profsion_ambito_no_academico", antecedentes.getEjercicio_profesion_ambito_no_academico());
		model.addAttribute("otra_actividad_cyt", antecedentes.getOtra_actividad_cyt());
		
		return "cv";
	}
}
