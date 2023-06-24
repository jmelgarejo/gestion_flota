package com.restfull.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.restfull.core.entities.Entrega;

public interface IEntregaDao extends CrudRepository<Entrega, Long> {

}
