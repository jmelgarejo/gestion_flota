package com.restfull.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Login;

public interface ILoginDao extends CrudRepository<Login, Long> {

}
