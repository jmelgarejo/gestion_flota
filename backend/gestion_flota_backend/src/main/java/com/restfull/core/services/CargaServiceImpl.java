package com.restfull.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.restfull.core.dao.ICargaDao;
import com.restfull.core.entities.Carga;

@Service
public class CargaServiceImpl implements ICargaService{
	@Autowired
	private ICargaDao cargaDao;
	@Override
	@Transactional(readOnly=true)
	public List<Carga> findAll() {
		
		return (List<Carga>) cargaDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Carga findById(Long id) {
		
		return cargaDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Carga save(Carga carga) {
	
		return cargaDao.save(carga);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		cargaDao.deleteById(id);
	
	}


	
	
}
	


