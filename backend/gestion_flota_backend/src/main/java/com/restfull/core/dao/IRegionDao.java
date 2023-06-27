package com.restfull.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Region;

public interface IRegionDao extends CrudRepository<Region, Long> {

}
