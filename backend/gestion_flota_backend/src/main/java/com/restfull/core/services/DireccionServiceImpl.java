package com.restfull.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.restfull.core.dao.IDireccionDao;
import com.restfull.core.entities.Direccion;

@Service
public class DireccionServiceImpl implements IDireccionService{
	@Autowired
	private IDireccionDao direccionDao;
	@Override
	@Transactional(readOnly=true)
	public List<Direccion> findAll() {
		
		return (List<Direccion>) direccionDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Direccion findById(Long id) {
		
		return direccionDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Direccion save(Direccion direccion) {
	
		return direccionDao.save(direccion);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		direccionDao.deleteById(id);
	
	}


	
	
}
	


