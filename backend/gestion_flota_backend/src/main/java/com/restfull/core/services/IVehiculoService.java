package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Vehiculo;



public interface IVehiculoService {

public List<Vehiculo> findAll();

	
	public Vehiculo findById(Long id);
	
	public Vehiculo save(Vehiculo vehiculo);
	
	public void delete(Long id);
	
	
}
