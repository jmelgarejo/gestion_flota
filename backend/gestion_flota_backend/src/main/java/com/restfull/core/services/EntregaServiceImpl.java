package com.restfull.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.restfull.core.dao.IEntregaDao;
import com.restfull.core.entities.Entrega;

@Service
public class EntregaServiceImpl implements IEntregaService{
	@Autowired
	private IEntregaDao entregaDao;
	@Override
	@Transactional(readOnly=true)
	public List<Entrega> findAll() {
		
		return (List<Entrega>) entregaDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Entrega findById(Long id) {
		
		return entregaDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Entrega save(Entrega entrega) {
	
		return entregaDao.save(entrega);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		entregaDao.deleteById(id);
	
	}


	
	
}
	


