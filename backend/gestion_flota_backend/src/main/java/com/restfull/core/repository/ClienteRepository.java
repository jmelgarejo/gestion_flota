package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restfull.core.entities.Cliente;
import com.restfull.core.services.IClienteService;

import jakarta.transaction.Transactional;

@Repository
public class ClienteRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	IClienteService clienteService;
	
	@Transactional
	public Cliente crearCliente(Cliente newCliente) {
		Cliente cliente = newCliente;
		try {
			clienteService.save(cliente);			
		} catch (Exception e) {
			cliente = null;
		}
		return newCliente;
	}


	public List<Cliente> getAllClientes() {
		String sql = "select id_cliente,cliente_id,razon_social,direccion_id\r\n"
				+ "from cliente c2 ;";
		List<Cliente> clienteList = new ArrayList<Cliente>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Cliente cliente = new Cliente();
			Long cliente_id = ((Number)row.get("cliente_id")).longValue();
			cliente.setPersonaId((int)cliente_id.intValue());
			cliente.setDireccionId(((Number)row.get("direccion_id")).longValue());
			cliente.setIdCliente((Long)row.get("id_cliente"));
			cliente.setRazonSocial((String)row.get("razon_social"));
			clienteList.add(cliente);
		});
		return clienteList;

	}

	public List<Cliente> getClienteById(Long id) {
		String sql = "select id_cliente,cliente_id,razon_social,direccion_id\r\n"
				+ "from cliente c2 where id_cliente = "+id+";";
		List<Cliente> clienteList = new ArrayList<Cliente>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Cliente cliente = new Cliente();
			Long cliente_id = ((Number)row.get("cliente_id")).longValue();
			cliente.setPersonaId((int)cliente_id.intValue());
			cliente.setDireccionId(((Number)row.get("direccion_id")).longValue());
			cliente.setIdCliente((Long)row.get("id_cliente"));
			cliente.setRazonSocial((String)row.get("razon_social"));
			clienteList.add(cliente);
		});
		return clienteList;

	}
}
