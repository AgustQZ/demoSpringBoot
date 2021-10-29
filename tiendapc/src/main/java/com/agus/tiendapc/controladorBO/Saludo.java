package com.agus.tiendapc.controladorBO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	@RequestMapping("/")
	public String saludo() {
		return "Hola Agus";
	}
}
