package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Comuna;



public interface IComunaService {

public List<Comuna> findAll();

	
	public Comuna findById(Long id);
	
	public Comuna save(Comuna comuna);
	
	public void delete(Long id);
	
	
}
