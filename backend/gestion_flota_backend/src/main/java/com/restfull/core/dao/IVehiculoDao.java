package com.restfull.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Vehiculo;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Long> {

}
