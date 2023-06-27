package com.restfull.core.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.SolicitudRepository;
import com.restfull.core.entities.Solicitud;


@RestController
public class SolicitudController {


	@Autowired
	private SolicitudRepository solicitudRepository;
	@PostMapping(value = "/solicitud")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearSolicitud(@RequestBody Solicitud newSolicitud) {
		Solicitud solicitud = solicitudRepository.crearSolicitud(newSolicitud);
		return new ResponseEntity<>(solicitud, HttpStatus.OK);
	}
	
	@PutMapping(value = "/solicitud")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaSolicitud(@RequestBody Solicitud newSolicitud) {
		Solicitud solicitud = solicitudRepository.crearSolicitud(newSolicitud);
		return new ResponseEntity<>(solicitud, HttpStatus.OK);
	}
	
	@GetMapping("/solicitud")
	public List<Solicitud> query() {
		return solicitudRepository.getAllSolicitud();
	}
	
	
}

