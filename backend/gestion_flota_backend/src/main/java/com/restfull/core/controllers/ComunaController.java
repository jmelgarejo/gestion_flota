package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.ComunaRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Comuna;


@RestController
public class ComunaController {


	@Autowired
	private ComunaRepository comunaRepository;
	@PostMapping(value = "/comuna")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearComuna(@RequestBody Comuna newComuna) {
		Comuna comuna = comunaRepository.crearComuna(newComuna);
		return new ResponseEntity<>(comuna, HttpStatus.OK);
	}
	
	@PutMapping(value = "/comuna")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaComuna(@RequestBody Comuna newComuna) {
		Comuna comuna = comunaRepository.crearComuna(newComuna);
		return new ResponseEntity<>(comuna, HttpStatus.OK);
	}
	@GetMapping("/comunas")
	public List<Comuna> query() {
		return comunaRepository.getAllComunas();
	}
	@GetMapping("/comuna/{id}")
	public List<Comuna> getComunaById(@PathVariable Long id) {
		return comunaRepository.getComunaById(id);
	}
}
