package com.restfull.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restfull.core.dao.IAsignarAdministrativoDao;
import com.restfull.core.entities.AsignarAdministrativo;


@Service
public class AsignarAdministrativoServiceImpl implements IAsignarAdministrativoService{

	@Autowired
	private IAsignarAdministrativoDao asignarAdministrativoDao;
	@Override
	@Transactional(readOnly=true)
	public List<AsignarAdministrativo> findAll() {
		
		return (List<AsignarAdministrativo>) asignarAdministrativoDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public AsignarAdministrativo findById(Long id) {
		
		return asignarAdministrativoDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public AsignarAdministrativo save(AsignarAdministrativo asignarAdministrativo) {
	
		return asignarAdministrativoDao.save(asignarAdministrativo);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		asignarAdministrativoDao.deleteById(id);
	
	}
	
	}
	
