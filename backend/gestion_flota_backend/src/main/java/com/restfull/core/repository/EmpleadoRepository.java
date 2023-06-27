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
		String sql = "select id_empleado\r\n"
				+ "from empleado;";
		List<Empleado> empleadoList = new ArrayList<Empleado>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Empleado empleado = new Empleado();
			Long empleado_id = ((Number)row.get("id_empleado")).longValue();
			empleado.setIdEmpleado((int)empleado_id.intValue());
			empleadoList.add(empleado);
		});
		return empleadoList;
	}

	public List<Empleado> getEmpleadoById(Long id) {
		String sql = "select id_empleado\r\n"
				+ "from empleado where id_empleado = "+id+" ;";
		List<Empleado> empleadoList = new ArrayList<Empleado>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Empleado empleado = new Empleado();
			Long empleado_id = ((Number)row.get("id_empleado")).longValue();
			empleado.setIdEmpleado((int)empleado_id.intValue());
			empleadoList.add(empleado);
		});
		return empleadoList;
	}


}
