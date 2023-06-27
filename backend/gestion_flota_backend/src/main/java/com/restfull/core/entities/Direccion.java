package com.restfull.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="direccion")
public class Direccion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)    
	private int idDireccion;
    private String calleNumero;
    private String adicional;
    private int regionId;
    private int provinciaId;
    private int comunaId;

    // Constructor vacío
    public Direccion() {
    }

    // Constructor con parámetros
    public Direccion(int idDireccion, String calleNumero, String adicional, int regionId, int provinciaId, int comunaId) {
        this.idDireccion = idDireccion;
        this.calleNumero = calleNumero;
        this.adicional = adicional;
        this.regionId = regionId;
        this.provinciaId = provinciaId;
        this.comunaId = comunaId;
    }

    // Getters y setters
    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalleNumero() {
        return calleNumero;
    }

    public void setCalleNumero(String calleNumero) {
        this.calleNumero = calleNumero;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public int getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(int provinciaId) {
        this.provinciaId = provinciaId;
    }

    public int getComunaId() {
        return comunaId;
    }

    public void setComunaId(int comunaId) {
        this.comunaId = comunaId;
    }
}
