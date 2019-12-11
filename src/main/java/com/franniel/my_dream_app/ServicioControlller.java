package com.franniel.my_dream_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/servicios"})
public class ServicioControlller {
	
	@Autowired
	ServicioService service;
	
	@GetMapping
	public List<Servicio>listar(){
		
		return service.listar();
		
	}
	
	@PostMapping
	public Servicio agregar(@RequestBody Servicio s) {
		
		System.out.println("Servicio por agregar: " + s);

		return service.add(s);
		
	}

}
