package com.restfull.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="comuna")
public class Comuna {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idComuna;
    private String nombreComuna;
    private int provinciaId;
    private int regionId;

    public Comuna() {
    }

    public Comuna(int idComuna, String nombreComuna, int provinciaId, int regionId) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
        this.provinciaId = provinciaId;
        this.regionId = regionId;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public int getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(int provinciaId) {
        this.provinciaId = provinciaId;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }
}
