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

import com.restfull.core.entities.Entrega;
import com.restfull.core.services.IEntregaService;



@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EntregaController {

	@Autowired
	private IEntregaService entregaService;
	
	@GetMapping("/entrega")
	public List<Entrega> index(){
		return entregaService.findAll();
		
	}	
	
	
	@GetMapping("/entrega/{id}")
	public Entrega show(@PathVariable Long id) {
		return entregaService.findById(id);

	}
	
	@PostMapping("/entrega")
	@ResponseStatus(HttpStatus.CREATED)
	public Entrega create(@RequestBody Entrega entrega){
		return entregaService.save(entrega);
	}
	
	@PutMapping("/entrega/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Entrega update(@RequestBody Entrega entrega, @PathVariable long id) {
		
		Entrega entregaActual = entregaService.findById(id);
		
		entregaActual.setCliente(entrega.getCliente());
		entregaActual.setEstado(entrega.getEstado());
		return entregaService.save(entregaActual);
	}
	
	@DeleteMapping("/entrega/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		entregaService.delete(id);
	}
}




