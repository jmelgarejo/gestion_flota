package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Cliente;


@RestController
public class ClienteController {


	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping(value = "/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearCliente(@RequestBody Cliente newCliente) {
		Cliente cliente = clienteRepository.crearCliente(newCliente);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	@PutMapping(value = "/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaCliente(@RequestBody Cliente newCliente) {
		Cliente cliente = clienteRepository.crearCliente(newCliente);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	@GetMapping("/clientes")
	public List<Cliente> query() {
		return clienteRepository.getAllClientes();
	}
	@GetMapping("/clientes/{id}")
	public List<Cliente> getClienteById(@PathVariable Long id) {
		return clienteRepository.getClienteById(id);
	}
}
