package com.restfull.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLogin;

    private String usuario;

    private String password;

    private int perfilId;

    private int personaId;

    // Constructor empty
    public Login() {
    }

    // Constructor parameters
    public Login(Long idLogin, String usuario, String password, int perfilId, int personaId) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.password = password;
        this.perfilId = perfilId;
        this.personaId = personaId;
    }

    // Getters y setters
    public Long getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Long idLogin) {
        this.idLogin = idLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(int perfilId) {
        this.perfilId = perfilId;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

	public Login orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}
