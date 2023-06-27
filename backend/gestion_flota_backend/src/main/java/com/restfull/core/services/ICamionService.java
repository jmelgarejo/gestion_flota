package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Camion;



public interface ICamionService {

public List<Camion> findAll();

	
	public Camion findById(Long id);
	
	public Camion save(Camion camion);
	
	public void delete(Long id);
	
	
}
