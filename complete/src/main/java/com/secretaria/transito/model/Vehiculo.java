package com.secretaria.transito.model;

import java.util.Date;

public class Vehiculo extends Cliente{

    private String placa;
    private String tipoVehiculo;
    private String marca;
    private String fechaMatricula;

    public Vehiculo() {
        super();
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    @Override
    public String toString() {
        return this.placa +"\n"+
                this.marca +"\n"+
                this.tipoVehiculo+"\n"+
                this.fechaMatricula.toString() +"\n"+
                this.getIdentificacion()+"\n"+
                this.getTipoDocumentoCliente()+"\n"+
                this.getNombre();
    }
}
