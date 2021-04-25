package com.secretaria.transito.model;

public class Cliente {

    private String identificacion;
    private String tipoDocumentoCliente;
    private String nombre;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String identificacion, String tipoDocumentoCliente, String nombre, String direccion) {
        this.identificacion = identificacion;
        this.tipoDocumentoCliente = tipoDocumentoCliente;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setTipoDocumentoCliente(String tipoDocumentoCliente) {
        this.tipoDocumentoCliente = tipoDocumentoCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTipoDocumentoCliente() {
        return tipoDocumentoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
