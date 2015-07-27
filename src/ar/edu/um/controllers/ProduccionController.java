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

import ar.edu.um.model.Produccion;
import ar.edu.um.service.ProduccionService;

@Controller
public class ProduccionController {
private ProduccionService produccionService;
	
	@Autowired
	public void setProduccionService(ProduccionService produccionService) {
		this.produccionService = produccionService;
	}
	

	@RequestMapping(value="/crearproduccion", method=RequestMethod.POST)
	public String creaDatos(Model model, @Valid Produccion produccion, BindingResult result) {
		if (result.hasErrors()){
			System.out.println("no se valido el formulario");
			List<ObjectError> errors = result.getAllErrors();
			
			for (Object error: errors) {
				System.out.println(error);
			}
			
			return "/";
			}
		
		produccionService.create(produccion);
		
		model.addAttribute("dni", produccion.getDni());
		model.addAttribute("articulos_revistas_con_referato", produccion.getArticulos_revistas_con_referato());
		model.addAttribute("articulos_revistas_sin_referato", produccion.getArticulos_revistas_sin_referato());
		model.addAttribute("libros", produccion.getLibros());
		model.addAttribute("partes_libros", produccion.getPartes_libros());
		model.addAttribute("trabajos_eventos_ct_publicados", produccion.getTrabajos_eventos_ct_publicados());
		model.addAttribute("trabajos_eventos_ct_no_publicados", produccion.getTrabajos_eventos_ct_no_publicados());
		model.addAttribute("demas_producciones_ct", produccion.getDemas_producciones_ct());
		model.addAttribute("con_titulo_prop_int", produccion.getCon_titulo_prop_int());
		model.addAttribute("sin_titulo_prop_int", produccion.getSin_titulo_prop_int());
		model.addAttribute("servicio_ct", produccion.getServicio_ct());
		model.addAttribute("informe_tecnico", produccion.getInforme_tecnico());
		model.addAttribute("musical_sonora", produccion.getMusical_sonora());
		model.addAttribute("visual", produccion.getVisual());
		model.addAttribute("audiovisual", produccion.getAudiovisual());
		model.addAttribute("corporal_teatral", produccion.getCorporal_teatral());
		model.addAttribute("genero_literario_narrativo", produccion.getGenero_literario_narrativo());
		model.addAttribute("genero_literario_dramatico", produccion.getGenero_literario_dramatico());
		model.addAttribute("genero_literario_guion", produccion.getGenero_literario_guion());
		model.addAttribute("otro_tipo", produccion.getOtro_tipo());
		model.addAttribute("otra_produccion", produccion.getOtra_produccion());
		
		return "cv";
	}
}
