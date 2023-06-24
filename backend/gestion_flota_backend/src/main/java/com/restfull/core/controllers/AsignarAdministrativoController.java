package com.restfull.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.restfull.core.entities.AsignarAdministrativo;
import com.restfull.core.services.IAsignarAdministrativoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class AsignarAdministrativoController {

	
	@Autowired
	private IAsignarAdministrativoService asignarAdministrativoService;
	
	@GetMapping("/asignadmin")
	public List<AsignarAdministrativo> index(){
		return asignarAdministrativoService.findAll();
	}	
	
	@GetMapping("/asignadmin/{id}")
	public AsignarAdministrativo show(@PathVariable Long id) {
		return asignarAdministrativoService.findById(id);

	}
	
	@PostMapping("/asignadmin")
	@ResponseStatus(HttpStatus.CREATED)
	public AsignarAdministrativo create(@RequestBody AsignarAdministrativo asignarAdministrativo){
		return asignarAdministrativoService.save(asignarAdministrativo);
	}
	
	@PutMapping("/asignadmin/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public AsignarAdministrativo update(@RequestBody AsignarAdministrativo asignarAdministrativo, @PathVariable long id) {
		
		AsignarAdministrativo asignarAdministrativoActual = asignarAdministrativoService.findById(id);
		
		asignarAdministrativoActual.setCliente(asignarAdministrativo.getCliente());
		asignarAdministrativoActual.setRutSolicitante(asignarAdministrativo.getRutSolicitante());
		asignarAdministrativoActual.setPatente(asignarAdministrativo.getPatente());
		asignarAdministrativoActual.setAdministrativo(asignarAdministrativo.getAdministrativo());
		return asignarAdministrativoService.save(asignarAdministrativoActual);
	}
	
	@DeleteMapping("/asignadmin/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		asignarAdministrativoService.delete(id);
	}
}




