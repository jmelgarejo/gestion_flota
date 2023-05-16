package com.restfull.core.entities;

public class Cliente {
    private Long idCliente;
    private int personaId;
    private String razonSocial;
    private Long direccionId;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(Long idCliente, int personaId, String razonSocial, Long direccionId) {
        this.idCliente = idCliente;
        this.personaId = personaId;
        this.razonSocial = razonSocial;
        this.direccionId = direccionId;
    }

    // Getters y setters
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Long getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(Long direccionId) {
        this.direccionId = direccionId;
    }
}
