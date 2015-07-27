package ar.edu.um.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.um.model.DatosPersonales;
import ar.edu.um.model.User;
import ar.edu.um.service.DatosPersonalesService;
import ar.edu.um.service.FormacionService;


@Controller
public class CvController {
	/*
	private CvService cvService;
	
	
	@Autowired
	public void setCursosService(CvService cvService) {
		this.cvService = cvService;
	}
	
	/* muestra los cursos que hay en la BD */ 
	
	private DatosPersonalesService datosPersonalesService;
	private FormacionService formacionService;
	
	@Autowired
	public void setDatosPersonalesService(DatosPersonalesService datosPersonalesService) {
		this.datosPersonalesService = datosPersonalesService;
	}
	
	
	@RequestMapping(value="/registro")
	public String showTest (Model model) {


		return "registro";
	}
	
	@RequestMapping(value="/cv")
	public String cv (Model model){
		
		return "cv";
	}
	
	/*** DATOS ***/
	
	@RequestMapping(value="/datos")
	public String datos(Model model){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String username = auth.getName(); /*trae el usuario logueado en el sistema */
	    System.out.println("USER: " + username);
	    BigDecimal dni = new BigDecimal (username);
	    model.addAttribute("dni", dni);
		
		
		
		/* Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	     String username = auth.getName();
	     System.out.println("USER: " + username);
	      
		DatosPersonales dp = datosPersonalesService.getData(Integer.parseInt(username));
		System.out.println("dp = " + dp);
		
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
		model.addAttribute("pais", dp.getPais());*/
		
		return "datos";
	}
	
	/*** DATOS EDITAR ***/
	
	@RequestMapping(value="/datosEditar")
	public String datosEditar(Model model){
		
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	     String username = auth.getName(); /*trae el usuario logueado en el sistema */
	     System.out.println("USER: " + username);
	      
		DatosPersonales dp = datosPersonalesService.getData(Integer.parseInt(username));
		
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
		
		return "datosEditar";
	}

	/*** FORMACION ***/
	
	@RequestMapping(value="/formacion")
	public String formacion(Model model){
	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String username = auth.getName(); /*trae el usuario logueado en el sistema */
	    System.out.println("USER: " + username);
	    BigDecimal dni = new BigDecimal (username);
	    model.addAttribute("dni", dni);
	
	    /*
		Formacion dp = formacionService.getData(Integer.parseInt(username));
		System.out.println("pasamos formacion dp en cv controller");
		if (dp == null){
			System.out.println("formacion es null");
			return "formacion";
		}
		model.addAttribute("dni", dp.getDni());
		model.addAttribute("nivel_universitario_posgrado", dp.getNivel_universitario_posgrado());
		model.addAttribute("nivel_universitario_posgrado_especializacion", dp.getNivel_universitario_posgrado_especializacion());
		model.addAttribute("nivel_universitario_grado", dp.getNivel_universitario_grado());
		model.addAttribute("nivel_terciario_no_universitario", dp.getNivel_terciario_no_universitario());
		model.addAttribute("especialidad_certificada", dp.getEspecialidad_certificada());
		model.addAttribute("posdoctorado", dp.getPosdoctorado());
		model.addAttribute("cursos_posgrado_y_capacitaciones", dp.getCursos_posgrado_y_capacitaciones());
		model.addAttribute("idiomas", dp.getIdiomas());
		*/
		return "formacion";
	}
	
	/*** FORMACION EDITAR ***/
	/*
	@RequestMapping(value="/formacionEditar")
	public String formacionEditar(Model model){
	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String username = auth.getName(); /*trae el usuario logueado en el sistema */
	   /*
		System.out.println("USER: " + username);
	     
		Formacion dp = formacionService.getData(Integer.parseInt(username));
				
		model.addAttribute("dni", dp.getDni());
		model.addAttribute("nivel_universitario_posgrado", dp.getNivel_universitario_posgrado());
		model.addAttribute("nivel_universitario_posgrado_especializacion", dp.getNivel_universitario_posgrado_especializacion());
		model.addAttribute("nivel_universitario_grado", dp.getNivel_universitario_grado());
		model.addAttribute("nivel_terciario_no_universitario", dp.getNivel_terciario_no_universitario());
		model.addAttribute("especialidad_certificada", dp.getEspecialidad_certificada());
		model.addAttribute("posdoctorado", dp.getPosdoctorado());
		model.addAttribute("cursos_posgrado_y_capacitaciones", dp.getCursos_posgrado_y_capacitaciones());
		model.addAttribute("idiomas", dp.getIdiomas());
		
		return "formacionEditar";
	}
	
	*/
	@RequestMapping(value="/cargos")
	public String cargos(Model model){

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String username = auth.getName(); /*trae el usuario logueado en el sistema */
	    System.out.println("USER: " + username);
	    BigDecimal dni = new BigDecimal (username);
	    model.addAttribute("dni", dni);
		
		
		return "cargos";
	}
	

	@RequestMapping(value="/produccion")
	public String produccion(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String username = auth.getName(); /*trae el usuario logueado en el sistema */
	    System.out.println("USER: " + username);
	    BigDecimal dni = new BigDecimal (username);
	    model.addAttribute("dni", dni);
		return "produccion";
	}
	
	@RequestMapping(value="/antecedentes")
	public String antecedentes(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String username = auth.getName(); /*trae el usuario logueado en el sistema */
	    System.out.println("USER: " + username);
	    BigDecimal dni = new BigDecimal (username);
	    model.addAttribute("dni", dni);
		return "antecedentes";
	}
	
	@RequestMapping(value="/otrosantecedentes")
	public String otrosAntecedentes(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String username = auth.getName(); /*trae el usuario logueado en el sistema */
	    System.out.println("USER: " + username);
	    BigDecimal dni = new BigDecimal (username);
	    model.addAttribute("dni", dni);
		return "otrosantecedentes";
	}
}