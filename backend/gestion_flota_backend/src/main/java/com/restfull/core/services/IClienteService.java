package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Cliente;



public interface IClienteService {

public List<Cliente> findAll();

	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	
}
