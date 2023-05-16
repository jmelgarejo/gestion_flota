package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Persona;

@Repository
public class PersonaRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;


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
}
