package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.PersonaRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Persona;


@RestController
public class PersonaController {


	@Autowired
	private PersonaRepository personaRepository;
	@PostMapping("/purchase")
	public synchronized ResponseEntity<?> postSeat(@RequestBody Persona persona){
			return new ResponseEntity<>(persona, HttpStatus.OK);
	}
	
	@PostMapping(value = "/persona")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Void> ejemploPost(@RequestBody Persona persona) {
        // Realiza cualquier lógica necesaria aquí

        // Si no hay contenido adicional para devolver, simplemente retorna un ResponseEntity vacío
        return ResponseEntity.ok().build();
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
