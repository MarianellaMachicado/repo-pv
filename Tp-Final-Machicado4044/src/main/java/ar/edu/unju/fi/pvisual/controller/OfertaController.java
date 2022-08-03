package ar.edu.unju.fi.pvisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ofertas")
public class OfertaController {
	
	@GetMapping("/mis_ofertas")
	public String mostrarMisOfertas() {
		return "ofertas_laborales/mis_ofertas";
	}
}
