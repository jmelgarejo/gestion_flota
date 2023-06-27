package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.VehiculoRepository;
import org.springframework.web.bind.annotation.*;

import com.restfull.core.entities.Vehiculo;


@RestController
public class VehiculoController {


	@Autowired
	private VehiculoRepository vehiculoRepository;
	@PostMapping(value = "/vehiculo")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearVehiculo(@RequestBody Vehiculo newVehiculo) {
		Vehiculo vehiculo = vehiculoRepository.crearVehiculo(newVehiculo);
		return new ResponseEntity<>(vehiculo, HttpStatus.OK);
	}
	
	@PutMapping(value = "/vehiculo")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaVehiculo(@RequestBody Vehiculo newVehiculo) {
		Vehiculo vehiculo = vehiculoRepository.crearVehiculo(newVehiculo);
		return new ResponseEntity<>(vehiculo, HttpStatus.OK);
	}
	
	@GetMapping("/vehiculos")
	public List<Vehiculo> query() {
		return vehiculoRepository.getAllVehiculos();
	}
	@GetMapping("/vehiculo/{id}")
	public List<Vehiculo> getVehiculoById(@PathVariable Long id) {
		return vehiculoRepository.getVehiculoById(id);
	}
}
