package com.restfull.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Long> {

}
