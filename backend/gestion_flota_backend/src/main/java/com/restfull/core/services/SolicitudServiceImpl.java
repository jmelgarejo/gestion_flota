package com.restfull.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.restfull.core.dao.ISolicitudDao;
import com.restfull.core.entities.Solicitud;

@Service
public class SolicitudServiceImpl implements ISolicitudService{
	@Autowired
	private ISolicitudDao solicitudDao;
	@Override
	@Transactional(readOnly=true)
	public List<Solicitud> findAll() {
		
		return (List<Solicitud>) solicitudDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Solicitud findById(Long id) {
		
		return solicitudDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Solicitud save(Solicitud solicitud) {
	
		return solicitudDao.save(solicitud);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		solicitudDao.deleteById(id);
	
	}


	
	
}
	


