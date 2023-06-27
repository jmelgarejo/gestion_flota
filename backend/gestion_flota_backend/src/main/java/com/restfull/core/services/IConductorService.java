package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Conductor;



public interface IConductorService {

public List<Conductor> findAll();

	
	public Conductor findById(Long id);
	
	public Conductor save(Conductor conductor);
	
	public void delete(Long id);
	
	
}
