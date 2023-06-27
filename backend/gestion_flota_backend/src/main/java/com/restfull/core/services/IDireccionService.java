package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Direccion;



public interface IDireccionService {

public List<Direccion> findAll();

	
	public Direccion findById(Long id);
	
	public Direccion save(Direccion direccion);
	
	public void delete(Long id);
	
	
}
