package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.CargaRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Carga;


@RestController
public class CargaController {


	@Autowired
	private CargaRepository cargaRepository;
	
	@PostMapping(value = "/carga")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearCarga(@RequestBody Carga newCarga) {
		Carga carga = cargaRepository.crearCarga(newCarga);
		return new ResponseEntity<>(carga, HttpStatus.OK);
	}
	
	@PutMapping(value = "/carga")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaCarga(@RequestBody Carga newCarga) {
		Carga carga = cargaRepository.crearCarga(newCarga);
		return new ResponseEntity<>(carga, HttpStatus.OK);
	}
	
	@GetMapping("/cargas")
	public List<Carga> query() {
		return cargaRepository.getAllCargas();
	}
	@GetMapping("/carga/{id}")
	public List<Carga> getCargaById(@PathVariable Long id) {
		return cargaRepository.getCargaById(id);
	}
}
