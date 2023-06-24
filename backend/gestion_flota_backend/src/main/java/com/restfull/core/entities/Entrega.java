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
@Table (name="entregas")
public class Entrega implements Serializable{
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String cliente;
	private String estado;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAT;

	@PrePersist
	public void prePersist() {
		createAT = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
