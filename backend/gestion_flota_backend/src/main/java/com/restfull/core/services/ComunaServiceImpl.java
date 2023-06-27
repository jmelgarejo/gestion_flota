package com.restfull.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.restfull.core.dao.IComunaDao;
import com.restfull.core.entities.Comuna;

@Service
public class ComunaServiceImpl implements IComunaService{
	@Autowired
	private IComunaDao comunaDao;
	@Override
	@Transactional(readOnly=true)
	public List<Comuna> findAll() {
		
		return (List<Comuna>) comunaDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Comuna findById(Long id) {
		
		return comunaDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Comuna save(Comuna comuna) {
	
		return comunaDao.save(comuna);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		comunaDao.deleteById(id);
	
	}


	
	
}
	


