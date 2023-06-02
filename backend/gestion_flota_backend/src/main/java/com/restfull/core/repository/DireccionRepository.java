package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Direccion;

@Repository
public class DireccionRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Direccion> getAllDireccions() {
		String sql = "select id_direccion\r\n"
				+ "from direccion;";
		List<Direccion> direccionList = new ArrayList<Direccion>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Direccion direccion = new Direccion();
			Long direccion_id = ((Number)row.get("id_direccion")).longValue();
			direccion.setIdDireccion((int)direccion_id.intValue());
			direccionList.add(direccion);
		});
		return direccionList;
	}

	public List<Direccion> getDireccionById(Long id) {
		String sql = "select id_direccion\r\n"
				+ "from direccion where id_direccion = "+id+" ;";
		List<Direccion> direccionList = new ArrayList<Direccion>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Direccion direccion = new Direccion();
			Long direccion_id = ((Number)row.get("id_direccion")).longValue();
			direccion.setIdDireccion((int)direccion_id.intValue());
			direccionList.add(direccion);
		});
		return direccionList;
	}


}
