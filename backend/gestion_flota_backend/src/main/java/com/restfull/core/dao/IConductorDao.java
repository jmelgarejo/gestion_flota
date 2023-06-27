package com.restfull.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Conductor;

public interface IConductorDao extends CrudRepository<Conductor, Long> {

}
