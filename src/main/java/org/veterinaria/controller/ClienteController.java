package org.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.veterinaria.model.Cliente;


@Controller
@RequestMapping(path = "/Cliente")
public class ClienteController {

	
	@GetMapping("/")
	public String cargarcliente(Model model) {
		model.addAttribute("usuario", new Cliente());
		return "principal";
	}
	@GetMapping("/Mantenimiento")
	public String CrudCliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "crudCliente/ListarCliente";
	}
}
