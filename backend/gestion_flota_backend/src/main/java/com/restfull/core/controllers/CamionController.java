package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.CamionRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Camion;
import com.restfull.core.entities.Camion;


@RestController
public class CamionController {


	@Autowired
	private CamionRepository camionRepository;

	@PostMapping(value = "/camion")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearCamion(@RequestBody Camion newCamion) {
		Camion camion = camionRepository.crearCamion(newCamion);
		return new ResponseEntity<>(camion, HttpStatus.OK);
	}
	
	@PutMapping(value = "/camion")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaCamion(@RequestBody Camion newCamion) {
		Camion camion = camionRepository.crearCamion(newCamion);
		return new ResponseEntity<>(camion, HttpStatus.OK);
	}

	
	@GetMapping("/camiones")
	public List<Camion> query() {
		return camionRepository.getAllCamions();
	}
	@GetMapping("/camion/{id}")
	public List<Camion> getCamionById(@PathVariable Long id) {
		return camionRepository.getCamionById(id);
	}
}
