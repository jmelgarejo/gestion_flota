package com.restfull.core.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="solicitud")
public class Solicitud {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idSolicitud;
    private int clienteId;
    private Integer planificacionId;
    private String estado;
    private String origen;
    private String destino;
    private Date fechaSolicitud;
    private Date fechaEntrega;

    // Constructor vacío
    public Solicitud() {
    }

    // Constructor con parámetros
    public Solicitud(int idSolicitud, int clienteId, Integer planificacionId, String estado, String origen, String destino, Date fechaSolicitud, Date fechaEntrega) {
        this.idSolicitud = idSolicitud;
        this.clienteId = clienteId;
        this.planificacionId = planificacionId;
        this.estado = estado;
        this.origen = origen;
        this.destino = destino;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaEntrega = fechaEntrega;
    }

    // Getters y setters
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getPlanificacionId() {
        return planificacionId;
    }

    public void setPlanificacionId(Integer planificacionId) {
        this.planificacionId = planificacionId;
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

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
