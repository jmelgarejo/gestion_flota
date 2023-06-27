package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.DireccionRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Direccion;


@RestController
public class DireccionController {


	@Autowired
	private DireccionRepository direccionRepository;
	@PostMapping(value = "/direccion")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearDireccion(@RequestBody Direccion newDireccion) {
		Direccion direccion = direccionRepository.crearDireccion(newDireccion);
		return new ResponseEntity<>(direccion, HttpStatus.OK);
	}
	
	@PutMapping(value = "/direccion")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaDireccion(@RequestBody Direccion newDireccion) {
		Direccion direccion = direccionRepository.crearDireccion(newDireccion);
		return new ResponseEntity<>(direccion, HttpStatus.OK);
	}
	@GetMapping("/direccions")
	public List<Direccion> query() {
		return direccionRepository.getAllDireccions();
	}
	@GetMapping("/direccion/{id}")
	public List<Direccion> getDireccionById(@PathVariable Long id) {
		return direccionRepository.getDireccionById(id);
	}
}
