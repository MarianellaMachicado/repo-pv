package ar.edu.unju.fi.pvisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
	
	/**
	 * Muestra la pagina de inicio.
	 */
	@GetMapping("/inicio")
	public String mostrarInicio() {
		return "inicio";
	}
}
