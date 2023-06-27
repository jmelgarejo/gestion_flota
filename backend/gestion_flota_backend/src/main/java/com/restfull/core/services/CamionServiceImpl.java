package com.restfull.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.restfull.core.dao.ICamionDao;
import com.restfull.core.entities.Camion;

@Service
public class CamionServiceImpl implements ICamionService{
	@Autowired
	private ICamionDao camionDao;
	@Override
	@Transactional(readOnly=true)
	public List<Camion> findAll() {
		
		return (List<Camion>) camionDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Camion findById(Long id) {
		
		return camionDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Camion save(Camion camion) {
	
		return camionDao.save(camion);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		camionDao.deleteById(id);
	
	}


	
	
}
	


