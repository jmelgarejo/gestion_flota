package com.restfull.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Perfil {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPerfil;
    private String nombrePerfil;
    private String descripcionPerfil;
    private String codigoPerfil;
    private String estado;

    // Constructor vacío
    public Perfil() {
    }

    // Constructor con parámetros
    public Perfil(int idPerfil, String nombrePerfil, String descripcionPerfil, String codigoPerfil, String estado) {
        this.idPerfil = idPerfil;
        this.nombrePerfil = nombrePerfil;
        this.descripcionPerfil = descripcionPerfil;
        this.codigoPerfil = codigoPerfil;
        this.estado = estado;
    }

    // Getters y setters
    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getDescripcionPerfil() {
        return descripcionPerfil;
    }

    public void setDescripcionPerfil(String descripcionPerfil) {
        this.descripcionPerfil = descripcionPerfil;
    }

    public String getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(String codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
	