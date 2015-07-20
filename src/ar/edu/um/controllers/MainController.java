package ar.edu.um.controllers;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.um.model.User;
import ar.edu.um.model.UserRole;
import ar.edu.um.service.UsersService;
 
@Controller
public class MainController {
 
	private UsersService usersService;
		
	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	
	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public String defaultPage() {

	  return "login";
 
	}
	
	/*@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout() {
	    SecurityContextHolder.clearContext();
	    return "redirect:/j_spring_security_logout";
	} */
 
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
 
	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Spring Security Login Form - Database Authentication");
	  model.addObject("message", "This page is for ROLE_ADMIN only!");
	  model.setViewName("admin");
	  return model;
 
	}
 
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {
 
	  ModelAndView model = new ModelAndView();
	  if (error != null) {
		model.addObject("error", "Usuario o contraseña inválidos");
	  }
 
	  if (logout != null) {
		model.addObject("msg", "Usted ha cerrado sesión correctamente");
	  }
	  model.setViewName("login");
 
	  return model;
 
	}
	
	@RequestMapping(value = "/registro", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error) {
 
	  ModelAndView model = new ModelAndView();
	  if (error != null) {
		model.addObject("error", "Usuario o contraseña inválidos");
	  }
 
	  model.setViewName("registro");
 
	  return model;
 
	}
	
	@RequestMapping(value="/registrado", method=RequestMethod.POST)
	public String confirmaRegistro(Model model, @RequestParam("DNI") BigDecimal DNI, @RequestParam("password") String password) {


		
		User user = new User();
		user.setDNI(DNI);
		user.setPassword(password);
	   	System.out.println(user);
		usersService.create(user);
		
		UserRole userRole = new UserRole();
		userRole.setDNI(DNI);
		userRole.setRole("ROLE_USER");	
		System.out.println(userRole);
		
		usersService.createRole(userRole);
		
		return "registrado";
	}
	
	
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {
 
	  ModelAndView model = new ModelAndView();
 
	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		UserDetails userDetail = (UserDetails) auth.getPrincipal();	
		model.addObject("username", userDetail.getUsername());
	  }
 
	  model.setViewName("403");
	  return model;
 
	}
 
}