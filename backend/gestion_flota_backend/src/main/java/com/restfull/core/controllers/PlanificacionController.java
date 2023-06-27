package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.PlanificacionRepository;
import org.springframework.web.bind.annotation.*;

import com.restfull.core.entities.Planificacion;


@RestController
public class PlanificacionController {


	@Autowired
	private PlanificacionRepository planificacionRepository;
	@PostMapping(value = "/planificacion")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearPlanificacion(@RequestBody Planificacion newPlanificacion) {
		Planificacion planificacion = planificacionRepository.crearPlanificacion(newPlanificacion);
		return new ResponseEntity<>(planificacion, HttpStatus.OK);
	}
	
	@PutMapping(value = "/planificacion")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaPlanificacion(@RequestBody Planificacion newPlanificacion) {
		Planificacion planificacion = planificacionRepository.crearPlanificacion(newPlanificacion);
		return new ResponseEntity<>(planificacion, HttpStatus.OK);
	}
	
	@GetMapping("/planificacions")
	public List<Planificacion> query() {
		return planificacionRepository.getAllPlanificacions();
	}
	@GetMapping("/planificacion/{id}")
	public List<Planificacion> getPlanificacionById(@PathVariable Long id) {
		return planificacionRepository.getPlanificacionById(id);
	}
}
