package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.ProvinciaRepository;
import org.springframework.web.bind.annotation.*;

import com.restfull.core.entities.Provincia;


@RestController
public class ProvinciaController {


	@Autowired
	private ProvinciaRepository provinciaRepository;
	@PostMapping(value = "/provincia")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearProvincia(@RequestBody Provincia newProvincia) {
		Provincia provincia = provinciaRepository.crearProvincia(newProvincia);
		return new ResponseEntity<>(provincia, HttpStatus.OK);
	}
	
	@PutMapping(value = "/provincia")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaProvincia(@RequestBody Provincia newProvincia) {
		Provincia provincia = provinciaRepository.crearProvincia(newProvincia);
		return new ResponseEntity<>(provincia, HttpStatus.OK);
	}
	@GetMapping("/provincias")
	public List<Provincia> query() {
		return provinciaRepository.getAllProvincias();
	}
	@GetMapping("/provincia/{id}")
	public List<Provincia> getProvinciaById(@PathVariable Long id) {
		return provinciaRepository.getProvinciaById(id);
	}
}
