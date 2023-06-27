package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Empleado;
import com.restfull.core.services.IEmpleadoService;

import jakarta.transaction.Transactional;

@Repository
public class EmpleadoRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	IEmpleadoService empleadoService;
	
	@Transactional
	public Empleado crearEmpleado(Empleado newEmpleado) {
		Empleado empleado = newEmpleado;
		try {
			empleadoService.save(empleado);			
		} catch (Exception e) {
			empleado = null;
		}
		return newEmpleado;
	}


	public List<Empleado> getAllEmpleados() {
		String sql = "SELECT id_empleado, persona_id, tipo_empleado, tipo_contrato\r\n"
				+ "from empleado;";
		List<Empleado> empleadoList = new ArrayList<Empleado>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Empleado empleado = new Empleado();
			Long empleado_id = ((Number)row.get("id_empleado")).longValue();
			Long persona_id = ((Number)row.get("persona_id")).longValue();
			empleado.setIdEmpleado((int)empleado_id.intValue());
			empleado.setPersonaId((int)persona_id.intValue());
			empleado.setTipoEmpleado((String)row.get("tipo_empleado"));
			empleado.setTipoContrato((String)row.get("tipo_contrato"));
			empleadoList.add(empleado);
		});
		return empleadoList;
	}

	public List<Empleado> getEmpleadoById(Long id) {
		String sql = "SELECT id_empleado, persona_id, tipo_empleado, tipo_contrato\r\n"
				+ "from empleado where id_empleado = "+id+" ;";
		List<Empleado> empleadoList = new ArrayList<Empleado>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Empleado empleado = new Empleado();
			Long empleado_id = ((Number)row.get("id_empleado")).longValue();
			Long persona_id = ((Number)row.get("persona_id")).longValue();
			empleado.setIdEmpleado((int)empleado_id.intValue());
			empleado.setPersonaId((int)persona_id.intValue());
			empleado.setTipoEmpleado((String)row.get("tipo_empleado"));
			empleado.setTipoContrato((String)row.get("tipo_contrato"));
			empleadoList.add(empleado);
		});
		return empleadoList;
	}


}
