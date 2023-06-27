package com.restfull.core.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idVehiculo;
    private String patente;
    private String numeroMotor;
    private Date fechaRevisionTecnica;
    private String marca;
    private int anio;
    private String modelo;
    private String concesionario;
    private String aseguradora;
    private String poliza;
    private Date fechaPoliza;
    private Date fechaIngreso;
    private Date fechaBaja;
    private String tipo;
    private String estado;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(int idVehiculo, String patente, String numeroMotor, Date fechaRevisionTecnica, String marca,
                    int anio, String modelo, String consecionario, String aseguradora, String poliza,
                    Date fechaPoliza, Date fechaIngreso, Date fechaBaja, String tipo,
                    String estado) {
        this.idVehiculo = idVehiculo;
        this.patente = patente;
        this.numeroMotor = numeroMotor;
        this.fechaRevisionTecnica = fechaRevisionTecnica;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.concesionario = consecionario;
        this.aseguradora = aseguradora;
        this.poliza = poliza;
        this.fechaPoliza = fechaPoliza;
        this.fechaIngreso = fechaIngreso;
        this.fechaBaja = fechaBaja;
        this.tipo = tipo;
        this.estado = estado;
    }

    // Getters y setters
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public Date getFechaRevisionTecnica() {
        return fechaRevisionTecnica;
    }

    public void setFechaRevisionTecnica(Date fechaRevisionTecnica) {
        this.fechaRevisionTecnica = fechaRevisionTecnica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(String concesionario) {
        this.concesionario = concesionario;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public Date getFechaPoliza() {
    	return fechaPoliza;
    }
    public void setFechaPoliza(Date fechaPoliza) {
        this.fechaPoliza = fechaPoliza;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
