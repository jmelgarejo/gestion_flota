package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Carga;



public interface ICargaService {

public List<Carga> findAll();

	
	public Carga findById(Long id);
	
	public Carga save(Carga carga);
	
	public void delete(Long id);
	
	
}
