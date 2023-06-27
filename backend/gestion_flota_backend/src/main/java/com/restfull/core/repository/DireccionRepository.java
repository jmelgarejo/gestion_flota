package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Direccion;
import com.restfull.core.services.IDireccionService;

import jakarta.transaction.Transactional;

@Repository
public class DireccionRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	IDireccionService direccionService;
	
	@Transactional
	public Direccion crearDireccion(Direccion newDireccion) {
		Direccion direccion = newDireccion;
		try {
			direccionService.save(direccion);			
		} catch (Exception e) {
			direccion = null;
		}
		return newDireccion;
	}


	public List<Direccion> getAllDireccions() {
		String sql = "SELECT id_direccion, calle_numero, adicional, region_id, provincia_id, comuna_id\r\n"
				+ "from direccion;";
		List<Direccion> direccionList = new ArrayList<Direccion>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Direccion direccion = new Direccion();
			Long direccion_id = ((Number)row.get("id_direccion")).longValue();
			Long provincia_id = ((Number)row.get("provincia_id")).longValue();
			Long region_id = ((Number)row.get("region_id")).longValue();
			Long comuna_id = ((Number)row.get("comuna_id")).longValue();
			direccion.setIdDireccion((int)direccion_id.intValue());
			direccion.setCalleNumero((String)row.get("calle_numero"));
			direccion.setAdicional((String)row.get("adicional"));
			direccion.setProvinciaId((int)provincia_id.intValue());
			direccion.setRegionId((int)region_id.intValue());
			direccion.setComunaId((int)comuna_id.intValue());
			direccionList.add(direccion);
		});
		return direccionList;
	}

	public List<Direccion> getDireccionById(Long id) {
		String sql = "SELECT id_direccion, calle_numero, adicional, region_id, provincia_id, comuna_id\r\n"
				+ "from direccion where id_direccion = "+id+" ;";
		List<Direccion> direccionList = new ArrayList<Direccion>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Direccion direccion = new Direccion();
			Long direccion_id = ((Number)row.get("id_direccion")).longValue();
			Long provincia_id = ((Number)row.get("provincia_id")).longValue();
			Long region_id = ((Number)row.get("region_id")).longValue();
			Long comuna_id = ((Number)row.get("comuna_id")).longValue();
			direccion.setIdDireccion((int)direccion_id.intValue());
			direccion.setCalleNumero((String)row.get("calle_numero"));
			direccion.setAdicional((String)row.get("adicional"));
			direccion.setProvinciaId((int)provincia_id.intValue());
			direccion.setRegionId((int)region_id.intValue());
			direccion.setComunaId((int)comuna_id.intValue());
			direccionList.add(direccion);
		});
		return direccionList;
	}


}
