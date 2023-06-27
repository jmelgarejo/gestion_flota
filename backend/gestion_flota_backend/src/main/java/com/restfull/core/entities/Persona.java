package com.restfull.core.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")
public class Persona implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_persona")
    private int idPersona;
	@Column(name="run")
    private int run;
	@Column(name="dv")
    private String dv;
	@Column(name="nombre")
    private String nombre;
	@Column(name="primer_apellido")
    private String primerApellido;
	@Column(name="segundo_apellido")
    private String segundoApellido;

    // Constructor vacío
    public Persona() {
    	this.run = (int) (Math.random() * 99999999 + 1);
        this.dv = "K";
        this.nombre = "Pepito";
        this.primerApellido = "Los ";
        this.segundoApellido = "Palotes";
    }

    // Constructor con parámetros
    public Persona(int idPersona, int run, String dv, String nombre, String primerApellido, String segundoApellido) {
        this.idPersona = idPersona;
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    // Getters y setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
