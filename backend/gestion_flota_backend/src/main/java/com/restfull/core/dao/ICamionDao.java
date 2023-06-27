package com.restfull.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Camion;

public interface ICamionDao extends CrudRepository<Camion, Long> {

}
