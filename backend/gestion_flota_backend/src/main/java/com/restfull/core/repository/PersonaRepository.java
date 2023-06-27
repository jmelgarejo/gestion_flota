package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Persona;
import com.restfull.core.services.IPersonaService;

import jakarta.transaction.Transactional;

@Repository
public class PersonaRepository {

	public PersonaRepository() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	IPersonaService personaService;
	
	@Transactional
	public Persona crearPersona(Persona newPersona) {
		Persona persona = newPersona;
		try {
			personaService.save(persona);			
		} catch (Exception e) {
			persona = null;
		}
		return newPersona;
	}
	public List<Persona> getAllPersonas() {
		String sql = "select id_persona,run     ,dv,nombre   ,primer_apellido,segundo_apellido\r\n"
				+ "from persona ;";
		List<Persona> personaList = new ArrayList<Persona>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Persona persona = new Persona();
			Long persona_id = ((Number)row.get("id_persona")).longValue();
			persona.setIdPersona((int)persona_id.intValue());
			persona.setRun(((Number)row.get("run")).intValue());
			persona.setDv((String)row.get("dv"));
			persona.setNombre((String)row.get("nombre"));
			persona.setPrimerApellido((String)row.get("primer_apellido"));
			persona.setSegundoApellido((String)row.get("segundo_apellido"));
			personaList.add(persona);
		});
		return personaList;

	}

	public List<Persona> getPersonaById(Long id) {
		String sql = "select id_persona,run     ,dv,nombre   ,primer_apellido,segundo_apellido\r\n"
				+ "from persona where id_persona = "+id+" ;";
		List<Persona> personaList = new ArrayList<Persona>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Persona persona = new Persona();
			Long persona_id = ((Number)row.get("id_persona")).longValue();
			persona.setIdPersona((int)persona_id.intValue());
			persona.setRun(((Number)row.get("run")).intValue());
			persona.setDv((String)row.get("dv"));
			persona.setNombre((String)row.get("nombre"));
			persona.setPrimerApellido((String)row.get("primer_apellido"));
			persona.setSegundoApellido((String)row.get("primer_apellido"));
			personaList.add(persona);
		});
		return personaList;
	}
	public List<Persona> getPersonaByRut(Long rut) {
		String sql = "select id_persona,run     ,dv,nombre   ,primer_apellido,segundo_apellido\r\n"
				+ "from persona where run = "+rut+" ;";
		List<Persona> personaList = new ArrayList<Persona>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Persona persona = new Persona();
			Long persona_id = ((Number)row.get("id_persona")).longValue();
			persona.setIdPersona((int)persona_id.intValue());
			persona.setRun(((Number)row.get("run")).intValue());
			persona.setDv((String)row.get("dv"));
			persona.setNombre((String)row.get("nombre"));
			persona.setPrimerApellido((String)row.get("primer_apellido"));
			persona.setSegundoApellido((String)row.get("primer_apellido"));
			personaList.add(persona);
		});
		return personaList;
	}
	
	
}
