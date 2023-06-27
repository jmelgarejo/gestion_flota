package com.restfull.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Planificacion;

public interface IPlanificacionDao extends CrudRepository<Planificacion, Long> {

}
