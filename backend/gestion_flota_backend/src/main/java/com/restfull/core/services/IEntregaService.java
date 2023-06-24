package com.restfull.core.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.restfull.core.entities.Entrega;



public interface IEntregaService {

public List<Entrega> findAll();

	
	public Entrega findById(Long id);
	
	public Entrega save(Entrega entrega);
	
	public void delete(Long id);
	
	
}
