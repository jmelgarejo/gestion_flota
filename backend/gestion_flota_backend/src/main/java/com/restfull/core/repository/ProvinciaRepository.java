package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restfull.core.entities.Provincia;
import com.restfull.core.services.IProvinciaService;

import jakarta.transaction.Transactional;

@Repository
public class ProvinciaRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	IProvinciaService provinciaService;
	
	@Transactional
	public Provincia crearProvincia(Provincia newProvincia) {
		Provincia provincia = newProvincia;
		try {
			provinciaService.save(provincia);			
		} catch (Exception e) {
			provincia = null;
		}
		return newProvincia;
	}


	public List<Provincia> getAllProvincias() {
		String sql = "select id_provincia\r\n"
				+ "from provincia;";
		List<Provincia> provinciaList = new ArrayList<Provincia>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Provincia provincia = new Provincia();
			Long provincia_id = ((Number)row.get("id_provincia")).longValue();
			provincia.setIdProvincia((int)provincia_id.intValue());
			provinciaList.add(provincia);
		});
		return provinciaList;
	}

	public List<Provincia> getProvinciaById(Long id) {
		String sql = "select id_provincia\r\n"
				+ "from provincia where id_provincia = "+id+" ;";
		List<Provincia> provinciaList = new ArrayList<Provincia>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Provincia provincia = new Provincia();
			Long provincia_id = ((Number)row.get("id_provincia")).longValue();
			provincia.setIdProvincia((int)provincia_id.intValue());
			provinciaList.add(provincia);
		});
		return provinciaList;
	}


}
