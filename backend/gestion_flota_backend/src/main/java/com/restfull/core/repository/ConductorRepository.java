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
import com.restfull.core.entities.Conductor;
import com.restfull.core.services.IConductorService;

import jakarta.transaction.Transactional;

@Repository
public class ConductorRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	IConductorService conductorService;
	
	@Transactional
	public Conductor crearConductor(Conductor newConductor) {
		Conductor conductor = newConductor;
		try {
			conductorService.save(conductor);			
		} catch (Exception e) {
			conductor = null;
		}
		return newConductor;
	}


	public List<Conductor> getAllConductors() {
		DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String sql = "select id_conductor, empleado_id, tipo_licencia, numero_licencia, fecha_vencimiento\r\n"
				+ "from conductor;";
		List<Conductor> conductorList = new ArrayList<Conductor>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Conductor conductor = new Conductor();
			Long conductor_id = ((Number)row.get("id_conductor")).longValue();
			Long empleado_id = ((Number)row.get("empleado_id")).longValue();
			conductor.setIdConductor((int)conductor_id.intValue());
			conductor.setEmpleadoId((int)empleado_id.intValue());
			conductor.setTipoLicencia((String)row.get("tipo_licencia"));
			conductor.setNumeroLicencia(((String)row.get("numero_licencia"))) ;
			try {
				LocalDateTime fechaVencimiento = (LocalDateTime)row.get("fecha_vencimiento");
				String strBaja = fechaVencimiento.format(CUSTOM_FORMATTER);
				Date dateVencimiento =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strBaja);
				conductor.setFechaVencimiento(dateVencimiento);
			}catch(Exception e) {
				conductor.setFechaVencimiento(null);
			}
			
		});
		return conductorList;
	}

	public List<Conductor> getConductorById(Long id) {
		DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String sql = "select id_conductor, empleado_id, tipo_licencia, numero_licencia, fecha_vencimiento\r\n"
				+ "from conductor where id_conductor = "+id+" ;";
		List<Conductor> conductorList = new ArrayList<Conductor>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Conductor conductor = new Conductor();
			Long conductor_id = ((Number)row.get("id_conductor")).longValue();
			Long empleado_id = ((Number)row.get("empleado_id")).longValue();
			conductor.setIdConductor((int)conductor_id.intValue());
			conductor.setEmpleadoId((int)empleado_id.intValue());
			conductor.setTipoLicencia((String)row.get("tipo_licencia"));
			conductor.setNumeroLicencia(((String)row.get("numero_licencia"))) ;
			try {
				LocalDateTime fechaVencimiento = (LocalDateTime)row.get("fecha_vencimiento");
				String strBaja = fechaVencimiento.format(CUSTOM_FORMATTER);
				Date dateVencimiento =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strBaja);
				conductor.setFechaVencimiento(dateVencimiento);
			}catch(Exception e) {
				conductor.setFechaVencimiento(null);
			}
			
			conductorList.add(conductor);
		});
		return conductorList;
	}


}
