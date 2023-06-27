package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Planificacion;



public interface IPlanificacionService {

public List<Planificacion> findAll();

	
	public Planificacion findById(Long id);
	
	public Planificacion save(Planificacion planificacion);
	
	public void delete(Long id);
	
	
}
