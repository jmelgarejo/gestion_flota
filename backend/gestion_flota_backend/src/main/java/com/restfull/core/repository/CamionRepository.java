package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Camion;

@Repository
public class CamionRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Camion> getAllCamions() {
		String sql = "select id_camion,vehiculo_id,capacidad,tipo\r\n"
				+ "from camion;";
		List<Camion> camionList = new ArrayList<Camion>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Camion camion = new Camion();
			Long camion_id = ((Number)row.get("id_camion")).longValue();
			Long vehiculo_id = ((Number)row.get("vehiculo_id")).longValue();
			camion.setIdCamion((int)camion_id.intValue());
			camion.setVehiculoId((int)vehiculo_id.intValue());
			camion.setTipo((String)row.get("tipo"));
			camion.setCapacidad((float)row.get("capacidad"));
			camionList.add(camion);
		});
		return camionList;
	}

	public List<Camion> getCamionById(Long id) {
		String sql = "select id_camion,vehiculo_id,capacidad,tipo\r\n"
				+ "from camion where id_camion = "+id+" ;";
		List<Camion> camionList = new ArrayList<Camion>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Camion camion = new Camion();
			Long camion_id = ((Number)row.get("id_camion")).longValue();
			Long vehiculo_id = ((Number)row.get("vehiculo_id")).longValue();
			camion.setIdCamion((int)camion_id.intValue());
			camion.setVehiculoId((int)vehiculo_id.intValue());
			camion.setTipo((String)row.get("tipo"));
			camion.setCapacidad((float)row.get("capacidad"));
			camionList.add(camion);
		});
		return camionList;
	}


}
