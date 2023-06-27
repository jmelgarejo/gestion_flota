package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.RegionRepository;
import org.springframework.web.bind.annotation.*;

import com.restfull.core.entities.Region;


@RestController
public class RegionController {


	@Autowired
	private RegionRepository regionRepository;
	@PostMapping(value = "/region")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearRegion(@RequestBody Region newRegion) {
		Region region = regionRepository.crearRegion(newRegion);
		return new ResponseEntity<>(region, HttpStatus.OK);
	}
	
	@PutMapping(value = "/region")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaRegion(@RequestBody Region newRegion) {
		Region region = regionRepository.crearRegion(newRegion);
		return new ResponseEntity<>(region, HttpStatus.OK);
	}
	@GetMapping("/regions")
	public List<Region> query() {
		return regionRepository.getAllRegions();
	}
	@GetMapping("/region/{id}")
	public List<Region> getRegionById(@PathVariable Long id) {
		return regionRepository.getRegionById(id);
	}
}
