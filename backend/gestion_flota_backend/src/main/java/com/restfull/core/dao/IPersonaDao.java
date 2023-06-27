package com.restfull.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long> {

}
