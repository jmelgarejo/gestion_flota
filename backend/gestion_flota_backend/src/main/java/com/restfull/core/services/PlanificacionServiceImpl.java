package com.restfull.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.restfull.core.dao.IPlanificacionDao;
import com.restfull.core.entities.Planificacion;

@Service
public class PlanificacionServiceImpl implements IPlanificacionService{
	@Autowired
	private IPlanificacionDao planificacionDao;
	@Override
	@Transactional(readOnly=true)
	public List<Planificacion> findAll() {
		
		return (List<Planificacion>) planificacionDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Planificacion findById(Long id) {
		
		return planificacionDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Planificacion save(Planificacion planificacion) {
	
		return planificacionDao.save(planificacion);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		planificacionDao.deleteById(id);
	
	}


	
	
}
	


