package org.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.veterinaria.model.Usuario;

@Controller
@RequestMapping(path = "/")
public class UsuariController {

	@GetMapping("/")
	public String cargarPag(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}

	@GetMapping("/Administrador")
	public String cargarAdministrador(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "MenuAdmin";
	}
	
	@GetMapping("/Cliente")
	public String cargarcliente(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "principal";
	}
	
	
	

}
