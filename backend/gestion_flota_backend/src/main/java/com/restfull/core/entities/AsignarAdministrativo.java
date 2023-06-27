package com.restfull.core.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name="asignar_administrativos")
public class AsignarAdministrativo implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String cliente;
	private String rutSolicitante;
	private String patente;
	private String administrativo;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAT;

	@PrePersist
	public void prePersist() {
		createAT = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getRutSolicitante() {
		return rutSolicitante;
	}

	public void setRutSolicitante(String rutSolicitante) {
		this.rutSolicitante = rutSolicitante;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	
	public String getAdministrativo() {
		return administrativo;
	}

	public void setAdministrativo(String administrativo) {
		this.administrativo = administrativo;
	}

	public Date getCreateAT() {
		return createAT;
	}

	public void setCreateAT(Date createAT) {
		this.createAT = createAT;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
