package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Login;
import com.restfull.core.services.ILoginService;

import jakarta.transaction.Transactional;

@Repository
public class LoginRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	ILoginService loginService;
	
	@Transactional
	public Login crearLogin(Login newLogin) {
		Login login = newLogin;
		try {
			loginService.save(login);			
		} catch (Exception e) {
			login = null;
		}
		return newLogin;
	}


	public List<Login> getAllLogins() {
		String sql = "select \r\n"
				+ "id_login,l.usuario,l.password,p.nombre,p.primer_apellido , p2.nombre_perfil\r\n"
				+ "from login l, persona p, perfil p2\r\n"
				+ "where l.persona_id = p.id_persona\r\n"
				+ "and l.perfil_id = p2.id_perfil;";


		List<Login> loginList = new ArrayList<Login>();


		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Login login = new Login();
			login.setIdLogin((Long)row.get("id_login"));
			login.setUsuario((String) row.get("nombre"));
			login.setPassword((String) row.get("password"));
			loginList.add(login);
		});
		return loginList;

	}

	public List<Login> getUserByLogin(String usuario) {
		String sql = "select \r\n"
				+ "id_login,l.usuario,l.password,p.nombre,p.primer_apellido , p2.nombre_perfil\r\n"
				+ "from login l, persona p, perfil p2\r\n"
				+ "where l.persona_id = p.id_persona\r\n"
				+ "and l.perfil_id = p2.id_perfil "
				+" and l.usuario = '"+usuario+"';";
		List<Login> loginList = new ArrayList<Login>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Login login = new Login();
			login.setIdLogin((Long)row.get("id_login"));
			login.setUsuario((String) row.get("nombre"));
			login.setPassword((String) row.get("password"));
			loginList.add(login);
		});
		return loginList;

	}
}
