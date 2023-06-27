package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.ConductorRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Conductor;


@RestController
public class ConductorController {


	@Autowired
	private ConductorRepository conductorRepository;
	@PostMapping(value = "/conductor")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearConductor(@RequestBody Conductor newConductor) {
		Conductor conductor = conductorRepository.crearConductor(newConductor);
		return new ResponseEntity<>(conductor, HttpStatus.OK);
	}
	
	@PutMapping(value = "/conductor")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaConductor(@RequestBody Conductor newConductor) {
		Conductor conductor = conductorRepository.crearConductor(newConductor);
		return new ResponseEntity<>(conductor, HttpStatus.OK);
	}
	@GetMapping("/conductors")
	public List<Conductor> query() {
		return conductorRepository.getAllConductors();
	}
	@GetMapping("/conductor/{id}")
	public List<Conductor> getConductorById(@PathVariable Long id) {
		return conductorRepository.getConductorById(id);
	}

}
