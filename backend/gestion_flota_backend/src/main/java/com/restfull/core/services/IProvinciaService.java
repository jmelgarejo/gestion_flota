package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Provincia;



public interface IProvinciaService {

public List<Provincia> findAll();

	
	public Provincia findById(Long id);
	
	public Provincia save(Provincia provincia);
	
	public void delete(Long id);
	
	
}
