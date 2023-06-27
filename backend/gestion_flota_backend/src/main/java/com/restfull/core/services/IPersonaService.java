package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Persona;



public interface IPersonaService {

public List<Persona> findAll();

	
	public Persona findById(Long id);
	
	public Persona save(Persona persona);
	
	public void delete(Long id);
	
	
}
