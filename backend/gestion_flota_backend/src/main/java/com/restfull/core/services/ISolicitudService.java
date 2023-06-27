package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Solicitud;



public interface ISolicitudService {

public List<Solicitud> findAll();

	
	public Solicitud findById(Long id);
	
	public Solicitud save(Solicitud solicitud);
	
	public void delete(Long id);
	
	
}
