package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.core.repository.CamionRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Camion;


@RestController
public class CamionController {


	@Autowired
	private CamionRepository camionRepository;

	@GetMapping("/camiones")
	public List<Camion> query() {
		return camionRepository.getAllCamions();
	}
	@GetMapping("/camion/{id}")
	public List<Camion> getCamionById(@PathVariable Long id) {
		return camionRepository.getCamionById(id);
	}
}
