package com.restfull.core.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="conductor")
public class Conductor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idConductor;
    private int empleadoId;
    private String tipoLicencia;
    private String numeroLicencia;
    private LocalDateTime fechaVencimiento;

    // Constructor vacío
    public Conductor() {
    }

    // Constructor con parámetros
    public Conductor(int idConductor, int empleadoId, String tipoLicencia, String numeroLicencia, LocalDateTime fechaVencimiento) {
        this.idConductor = idConductor;
        this.empleadoId = empleadoId;
        this.tipoLicencia = tipoLicencia;
        this.numeroLicencia = numeroLicencia;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getters y setters
    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
