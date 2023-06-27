package com.restfull.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
