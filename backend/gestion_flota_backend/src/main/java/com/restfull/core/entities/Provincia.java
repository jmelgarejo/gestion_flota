package com.restfull.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="provincia")
public class Provincia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idProvincia;
    private String nombreProvincia;
    private int regionId;

    public Provincia() {
    }

    public Provincia(int idProvincia, String nombreProvincia, int regionId) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.regionId = regionId;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }
}
