package com.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {

	@Autowired // con esto se inyecta una clase desde el controlador, esto ayuda
	// mucho a mantener el software
	@Qualifier ("MiServicioComplejo") // Esto se usa para llamar a la clase concreta que desee, asi no tenga la anotación @primary 
	private IServicio servicio; //Llamada a Interface

	// @Autowired // con esto se inyecta una clase desde el controlador, por el
	// Constructor, es posible no usar el Qautowired, ya que el sistema entiende que
	// es una inyecion
//	public IndexController(IServicio servicio) {
//		this.servicio = servicio;
//	}



//	@Autowired  // con esto se inyecta una clase desde el controlador, por el metodo set
//	public void setServicio(IServicio servicio) {
//		this.servicio = servicio;
//	}

	@GetMapping({ "/", "", "/index" })
	public String index(Model model) {

		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}


}