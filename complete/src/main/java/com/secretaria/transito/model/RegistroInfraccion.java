package com.secretaria.transito.model;

public class RegistroInfraccion {

    private String placaVehiculo;
    private String identificacionAgenteTransito;
    private String nombreAgenteTransito;
    private String fechaInfraccion;

    public RegistroInfraccion(String placaVehiculo, String identificacionAgenteTransito, String fechaInfraccion) {
        this.placaVehiculo = placaVehiculo;
        this.identificacionAgenteTransito = identificacionAgenteTransito;
        this.fechaInfraccion = fechaInfraccion;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getIdentificacionAgenteTransito() {
        return identificacionAgenteTransito;
    }

    public void setIdentificacionAgenteTransito(String identificacionAgenteTransito) {
        this.identificacionAgenteTransito = identificacionAgenteTransito;
    }

    public String getNombreAgenteTransito() {
        return nombreAgenteTransito;
    }

    public void setNombreAgenteTransito(String nombreAgenteTransito) {
        this.nombreAgenteTransito = nombreAgenteTransito;
    }

    public String getFechaInfraccion() {
        return fechaInfraccion;
    }

    public void setFechaInfraccion(String fechaInfraccion) {
        this.fechaInfraccion = fechaInfraccion;
    }

    @Override
    public String toString() {
        return "RegistroInfraccion{" +
                "placaVehiculo='" + placaVehiculo + '\'' +
                ", identificacionAgenteTransito='" + identificacionAgenteTransito + '\'' +
                ", nombreAgenteTransito='" + nombreAgenteTransito + '\'' +
                ", fechaInfraccion='" + fechaInfraccion + '\'' +
                '}';
    }
}
