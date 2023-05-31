package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.restfull.core.entities.Solicitud;

@Repository
public class SolicitudRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public List<Solicitud> getAllSolicitud() {
		String sql = "select id_solicitud,cliente_id, planificacion_id, estado, origen \r\n"
				+ ", destino, fecha_solicitud, fecha_entrega\r\n"
				+ "from solicitud c2 ;";
		List<Solicitud> solicitudList = new ArrayList<Solicitud>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Solicitud solicitud = new Solicitud();
			Long id_solicitud = ((Number)row.get("id_solicitud")).longValue();
			Long cliente_id = ((Number)row.get("cliente_id")).longValue();
			Long planificacion_id = ((Number)row.get("planificacion_id")).longValue();
			solicitud.setIdSolicitud(id_solicitud.intValue());
			solicitud.setClienteId(cliente_id.intValue());
			solicitud.setPlanificacionId(planificacion_id.intValue());
			solicitud.setEstado((String)row.get("estado"));
			solicitudList.add(solicitud);
		});
		return solicitudList;

	}
}

