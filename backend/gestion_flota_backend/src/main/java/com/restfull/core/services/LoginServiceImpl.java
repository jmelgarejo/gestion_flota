package com.restfull.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.restfull.core.dao.ILoginDao;
import com.restfull.core.entities.Login;

@Service
public class LoginServiceImpl implements ILoginService{
	@Autowired
	private ILoginDao loginDao;
	@Override
	@Transactional(readOnly=true)
	public List<Login> findAll() {
		
		return (List<Login>) loginDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Login findById(Long id) {
		
		return loginDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Login save(Login login) {
	
		return loginDao.save(login);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		loginDao.deleteById(id);
	
	}


	
	
}
	


