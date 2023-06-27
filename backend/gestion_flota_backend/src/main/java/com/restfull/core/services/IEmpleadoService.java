package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Empleado;



public interface IEmpleadoService {

public List<Empleado> findAll();

	
	public Empleado findById(Long id);
	
	public Empleado save(Empleado empleado);
	
	public void delete(Long id);
	
	
}
