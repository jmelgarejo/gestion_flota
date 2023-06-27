package com.restfull.core.controllers;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.PersonaRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Persona;

@RestController
public class PersonaController {
	final static Logger logger = Logger.getLogger(PersonaController.class);
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@PostMapping(value = "/persona")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearPersona(@RequestBody Persona newPersona) {
		Persona persona = personaRepository.crearPersona(newPersona);
		return new ResponseEntity<>(persona, HttpStatus.OK);
	}
	
	@PutMapping(value = "/persona")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaPersona(@RequestBody Persona newPersona) {
		Persona persona = personaRepository.crearPersona(newPersona);
		return new ResponseEntity<>(persona, HttpStatus.OK);
	}

	@GetMapping("/personas")
	public List<Persona> query() {
		return personaRepository.getAllPersonas();
	}
	@GetMapping("/persona/{id}")
	public List<Persona> getPersonaById(@PathVariable Long id) {
		return personaRepository.getPersonaById(id);
	}
	@GetMapping("/persona/rut/{rut}")
	public List<Persona> getPersonaByRut(@PathVariable Long rut) {
		return personaRepository.getPersonaByRut(rut);
	}
}
