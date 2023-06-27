package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Carga;
import com.restfull.core.services.ICargaService;

import jakarta.transaction.Transactional;

@Repository
public class CargaRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	ICargaService cargaService;
	
	@Transactional
	public Carga crearCarga(Carga newCarga) {
		Carga carga = newCarga;
		try {
			cargaService.save(carga);			
		} catch (Exception e) {
			carga = null;
		}
		return newCarga;
	}

	public List<Carga> getAllCargas() {
		String sql = "select id_carga, solicitud_id, tipo, peso, dimension, detalle\r\n"
				+ "from carga;";
		List<Carga> cargaList = new ArrayList<Carga>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Carga carga = new Carga();
			Long carga_id = ((Number)row.get("id_carga")).longValue();
			Long solicitud_id = ((Number)row.get("solicitud_id")).longValue();
			carga.setIdCarga((int)carga_id.intValue());
			carga.setSolicitudId((int)solicitud_id.intValue());
			carga.setTipo((String)row.get("tipo"));
			carga.setPeso((float)row.get("peso"));
			carga.setDimension((String)row.get("dimension"));
			carga.setDetalle((String)row.get("detalle"));
			cargaList.add(carga);
		});
		return cargaList;
	}

	public List<Carga> getCargaById(Long id) {
		String sql = "select id_carga, solicitud_id, tipo, peso, dimension, detalle\r\n"
				+ "from carga where id_carga = "+id+" ;";
		List<Carga> cargaList = new ArrayList<Carga>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Carga carga = new Carga();
			Long carga_id = ((Number)row.get("id_carga")).longValue();
			Long solicitud_id = ((Number)row.get("solicitud_id")).longValue();
			carga.setIdCarga((int)carga_id.intValue());
			carga.setSolicitudId((int)solicitud_id.intValue());
			carga.setTipo((String)row.get("tipo"));
			carga.setPeso((float)row.get("peso"));
			carga.setDimension((String)row.get("dimension"));
			carga.setDetalle((String)row.get("detalle"));
			cargaList.add(carga);
		});
		return cargaList;
	}


}
