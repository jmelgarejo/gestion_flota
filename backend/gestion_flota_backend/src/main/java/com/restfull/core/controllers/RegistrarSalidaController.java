package com.restfull.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.restfull.core.entities.RegistrarSalida;
import com.restfull.core.services.IRegistrarSalidaService;
@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class RegistrarSalidaController {
	@Autowired
	private IRegistrarSalidaService registrarSalidaService;
	
	@GetMapping("/registrarsalida")
	public List<RegistrarSalida> index(){
		return registrarSalidaService.findAll();
	}	
	
	@GetMapping("/registrarsalida/{id}")
	public RegistrarSalida show(@PathVariable Long id) {
		return registrarSalidaService.findById(id);

	}
	
	@PostMapping("/registrarsalida")
	@ResponseStatus(HttpStatus.CREATED)
	public RegistrarSalida create(@RequestBody RegistrarSalida registrarSalida){
		return registrarSalidaService.save(registrarSalida);
	}
	
	@PutMapping("/registrarsalida/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public RegistrarSalida update(@RequestBody RegistrarSalida registrarSalida, @PathVariable long id) {
		
		RegistrarSalida registrarSalidaActual = registrarSalidaService.findById(id);
		
		
		registrarSalidaActual.setSalida(registrarSalida.getSalida());
		registrarSalidaActual.setPatente(registrarSalida.getPatente());
		registrarSalidaActual.setEstado(registrarSalida.getEstado());
		return registrarSalidaService.save(registrarSalidaActual);
	}
	
	@DeleteMapping("/registrarsalida/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		registrarSalidaService.delete(id);
	}
}

