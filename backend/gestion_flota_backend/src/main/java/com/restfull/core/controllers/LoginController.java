package com.restfull.core.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.core.repository.LoginRepository;
import org.springframework.web.bind.annotation.*;
import com.restfull.core.entities.Login;


@RestController
public class LoginController {


	@Autowired
	private LoginRepository loginRepository;
	@PostMapping(value = "/login")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> crearLogin(@RequestBody Login newLogin) {
		Login login = loginRepository.crearLogin(newLogin);
		return new ResponseEntity<>(login, HttpStatus.OK);
	}
	
	@PutMapping(value = "/login")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> actualizaLogin(@RequestBody Login newLogin) {
		Login login = loginRepository.crearLogin(newLogin);
		return new ResponseEntity<>(login, HttpStatus.OK);
	}

	public List<Login> getAllLogins(){

		return loginRepository.getAllLogins();
	}


	@GetMapping("/users")
	public List<Login> query() {
		return getAllLogins();
	}
	@GetMapping("/users/{usuario}")
	public List<Login> getUserByLogin(@PathVariable String usuario) {
		return loginRepository.getUserByLogin(usuario);
	}
}
