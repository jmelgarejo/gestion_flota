package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Region;



public interface IRegionService {

public List<Region> findAll();

	
	public Region findById(Long id);
	
	public Region save(Region region);
	
	public void delete(Long id);
	
	
}
