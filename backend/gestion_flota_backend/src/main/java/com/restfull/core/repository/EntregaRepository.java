package com.restfull.core.repository;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restfull.core.entities.Entrega;
import com.restfull.core.services.IEntregaService;

import jakarta.transaction.Transactional;



@Repository
public class EntregaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	IEntregaService entregaService;
	
	@Transactional
	public Entrega crearEntrega(Entrega newEntrega) {
		Entrega entrega = newEntrega;
		try {
			entregaService.save(entrega);			
		} catch (Exception e) {
			entrega = null;
		}
		return newEntrega;
	}


	public List<Entrega> getAllEntregaEstado() {
		DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String sql = "SELECT id, cliente, estado, create_at from entregas where estado='PENDIENTE';";
		List<Entrega> entregaList = new ArrayList<Entrega>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Entrega entrega = new Entrega();
			Long id = ((Number)row.get("id")).longValue();
			entrega.setId((long)id.intValue());
			entrega.setCliente((String)row.get("cliente"));
			//entrega.setCreateAT((Date)row.get("create_at"));
			entrega.setEstado((String)row.get("estado"));
			try {
				LocalDateTime fecha = (LocalDateTime)row.get("create_at");
				String strBaja = fecha.format(CUSTOM_FORMATTER);
				Date fechaNew =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strBaja);
				entrega.setCreateAT(fechaNew);
			}catch(Exception e) {
				entrega.setCreateAT(null);
			}		
			entregaList.add(entrega);
		});
		return entregaList;
}
}
