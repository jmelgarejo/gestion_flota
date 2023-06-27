package com.restfull.core.repository;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.restfull.core.entities.Vehiculo;
import com.restfull.core.services.IVehiculoService;

import jakarta.transaction.Transactional;

@Repository
public class VehiculoRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	IVehiculoService vehiculoService;
	
	@Transactional
	public Vehiculo crearVehiculo(Vehiculo newVehiculo) {
		Vehiculo vehiculo = newVehiculo;
		try {
			vehiculoService.save(vehiculo);			
		} catch (Exception e) {
			vehiculo = null;
		}
		return newVehiculo;
	}


	public List<Vehiculo> getAllVehiculos() {
		DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String sql = "select id_vehiculo,patente,numero_motor,fecha_revision_tecnica"
				+ ",marca,anio,modelo,concesionario,aseguradora,poliza,fecha_poliza,fecha_ingreso"
				+ ",fecha_baja,tipo,estado\r\n"
				+ "from vehiculo;";
		List<Vehiculo> vehiculoList = new ArrayList<Vehiculo>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Vehiculo vehiculo = new Vehiculo();
			Long vehiculo_id = ((Number)row.get("id_vehiculo")).longValue();
			Long anio = ((Number)row.get("id_vehiculo")).longValue();
			vehiculo.setIdVehiculo((int)vehiculo_id.intValue());
			vehiculo.setPatente((String)row.get("patente"));
			vehiculo.setNumeroMotor((String)row.get("numero_motor"));
			//vehiculo.setFechaRevisionTecnica((Date)row.get("fecha_revision_tecnica"));
			vehiculo.setMarca((String)row.get("marca"));
			vehiculo.setAnio((int)anio.intValue());
			vehiculo.setModelo((String)row.get("modelo"));
			vehiculo.setConcesionario((String)row.get("concesionario"));
			vehiculo.setAseguradora((String)row.get("aseguradora"));
			vehiculo.setPoliza((String)row.get("poliza"));
			try {
				LocalDateTime fechaBaja = (LocalDateTime)row.get("fecha_baja");
				String strBaja = fechaBaja.format(CUSTOM_FORMATTER);
				Date dateBaja =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strBaja);
				vehiculo.setFechaBaja(dateBaja);
			}catch(Exception e) {
				vehiculo.setFechaBaja(null);
			}
			try {
				LocalDateTime fechaPoliza = (LocalDateTime)row.get("fecha_poliza");
				LocalDateTime fechaIngreso = (LocalDateTime)row.get("fecha_ingreso");
				String strPoliza= fechaPoliza.format(CUSTOM_FORMATTER);
				String strIngreso= fechaIngreso.format(CUSTOM_FORMATTER);
				Date datePoliza =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strPoliza);
				Date dateIngreso =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strIngreso);
				vehiculo.setFechaPoliza(datePoliza);
				vehiculo.setFechaIngreso(dateIngreso);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			vehiculo.setTipo((String)row.get("tipo"));
			vehiculo.setEstado((String)row.get("estado"));
			vehiculoList.add(vehiculo);
		});
		return vehiculoList;
	}

	public List<Vehiculo> getVehiculoById(Long id) {
		String sql = "select id_vehiculo,patente,numero_motor,fecha_revision_tecnica"
				+ ",marca,anio,modelo,concesionario,aseguradora,poliza,fecha_poliza,fecha_ingreso"
				+ ",fecha_baja,tipo,estado\r\n"
				+ "from vehiculo where id_vehiculo = "+id+" ;";
		List<Vehiculo> vehiculoList = new ArrayList<Vehiculo>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Vehiculo vehiculo = new Vehiculo();
			Long vehiculo_id = ((Number)row.get("id_vehiculo")).longValue();
			Long anio = ((Number)row.get("id_vehiculo")).longValue();
			vehiculo.setIdVehiculo(vehiculo_id.intValue());
			vehiculo.setPatente((String)row.get("patente"));
			vehiculo.setNumeroMotor((String)row.get("numero_motor"));
			//vehiculo.setFechaRevisionTecnica((Date)row.get("fecha_revision_tecnica"));
			vehiculo.setMarca((String)row.get("marca"));
			vehiculo.setAnio((int)anio.intValue());
			vehiculo.setModelo((String)row.get("modelo"));
			vehiculo.setConcesionario((String)row.get("concesionario"));
			vehiculo.setAseguradora((String)row.get("aseguradora"));
			vehiculo.setPoliza((String)row.get("poliza"));
			Date date1=null;
			try {
				date1=new SimpleDateFormat("yyyy-MM-dd").parse((String)row.get("fecha_poliza"));
				vehiculo.setFechaPoliza(date1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			//vehiculo.setFechaPoliza((Date)row.get("fecha_poliza"));
			//vehiculo.setFechaIngreso((Date)row.get("fecha_ingreso"));
			//vehiculo.setFechaBaja((Date)row.get("fecha_baja"));
			vehiculo.setTipo((String)row.get("tipo"));
			vehiculo.setEstado((String)row.get("estado"));
			vehiculoList.add(vehiculo);
		});
		return vehiculoList;
	}


}
