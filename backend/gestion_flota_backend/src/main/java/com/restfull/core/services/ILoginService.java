package com.restfull.core.services;

import java.util.List;

import com.restfull.core.entities.Login;



public interface ILoginService {

public List<Login> findAll();

	
	public Login findById(Long id);
	
	public Login save(Login login);
	
	public void delete(Long id);
	
	
}
