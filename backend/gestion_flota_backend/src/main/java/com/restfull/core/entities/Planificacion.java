package com.restfull.core.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="planificacion")
public class Planificacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPlanificacion;
    private int conductorId;
    private int camionId;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaPlanificacion;
    private LocalTime horaSalida;
    private LocalTime horaRetorno;
    private String estado;
    private String origen;
    private String destino;

    // Constructor vacío
    public Planificacion() {
    }

    // Constructor con parámetros
    public Planificacion(int idPlanificacion, int conductorId, int camionId, LocalDateTime fechaCreacion,
                         LocalDateTime fechaPlanificacion, LocalTime horaSalida, LocalTime horaRetorno,
                         String estado, String origen, String destino) {
        this.idPlanificacion = idPlanificacion;
        this.conductorId = conductorId;
        this.camionId = camionId;
        this.fechaCreacion = fechaCreacion;
        this.fechaPlanificacion = fechaPlanificacion;
        this.horaSalida = horaSalida;
        this.horaRetorno = horaRetorno;
        this.estado = estado;
        this.origen = origen;
        this.destino = destino;
    }

    // Getters y setters
    public int getIdPlanificacion() {
        return idPlanificacion;
    }

    public void setIdPlanificacion(int idPlanificacion) {
        this.idPlanificacion = idPlanificacion;
    }

    public int getConductorId() {
        return conductorId;
    }

    public void setConductorId(int conductorId) {
        this.conductorId = conductorId;
    }

    public int getCamionId() {
        return camionId;
    }

    public void setCamionId(int camionId) {
        this.camionId = camionId;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaPlanificacion() {
        return fechaPlanificacion;
    }

    public void setFechaPlanificacion(LocalDateTime fechaPlanificacion) {
        this.fechaPlanificacion = fechaPlanificacion;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(LocalTime horaRetorno) {
        this.horaRetorno = horaRetorno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
