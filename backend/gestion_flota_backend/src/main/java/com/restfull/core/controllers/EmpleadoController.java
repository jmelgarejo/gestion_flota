package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.EmpleadoRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Empleado;


@RestController
public class EmpleadoController {


	@Autowired
	private EmpleadoRepository empleadoRepository;
	@PostMapping(value = "/empleado")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearEmpleado(@RequestBody Empleado newEmpleado) {
		Empleado empleado = empleadoRepository.crearEmpleado(newEmpleado);
		return new ResponseEntity<>(empleado, HttpStatus.OK);
	}
	
	@PutMapping(value = "/empleado")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaEmpleado(@RequestBody Empleado newEmpleado) {
		Empleado empleado = empleadoRepository.crearEmpleado(newEmpleado);
		return new ResponseEntity<>(empleado, HttpStatus.OK);
	}
	@GetMapping("/empleados")
	public List<Empleado> query() {
		return empleadoRepository.getAllEmpleados();
	}
	@GetMapping("/empleado/{id}")
	public List<Empleado> getEmpleadoById(@PathVariable Long id) {
		return empleadoRepository.getEmpleadoById(id);
	}
}
