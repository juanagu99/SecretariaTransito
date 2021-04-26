package com.secretaria.transito.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class RegistroAutomovil {

    //campos del cliente
    private String Identificacion;
    private String idTipoDocumento;
    private String Nombre;
    private String Direccion;

    //campos del automovil
    private String IdVehiculo;
    private String Placa;
    private String idTipoVehiculo;
    private String idMarcaVehiculo;
    private String FechaMatricula;

        public RegistroAutomovil(String identificacion, String idTipoDocumento, String nombre, String direccion, String idVehiculo, String placa, String idTipoVehiculo, String idMarcaVehiculo, String fechaMatricula) {
        Identificacion = identificacion;
        this.idTipoDocumento = idTipoDocumento;
        Nombre = nombre;
        Direccion = direccion;
        IdVehiculo = idVehiculo;
        Placa = placa;
        this.idTipoVehiculo = idTipoVehiculo;
        this.idMarcaVehiculo = idMarcaVehiculo;
        FechaMatricula = fechaMatricula;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    public void setIdTipoDocumento(String idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setIdVehiculo(String idVehiculo) {
        IdVehiculo = idVehiculo;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public void setTipoVehiculo(String idTipoVehiculo) {
        idTipoVehiculo = idTipoVehiculo;
    }

    public void setIdMarcaVehiculo(String idMarcaVehiculo) {
        this.idMarcaVehiculo = idMarcaVehiculo;
    }

    public void setFechaMatricula(String fechaMatricula) {
        FechaMatricula = fechaMatricula;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public String getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getIdVehiculo() {
        return IdVehiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getTipoVehiculo() {
        return idTipoVehiculo;
    }

    public String getIdMarcaVehiculo() {
        return idMarcaVehiculo;
    }

    public String getFechaMatricula() {
        return FechaMatricula;
    }

    @Override
    public String toString() {
        return "RegistroAutomovil{" +
                "Identificacion='" + Identificacion + '\'' +
                ", idTipoDocumento=" + idTipoDocumento +
                ", Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", IdVehiculo=" + IdVehiculo +
                ", Placa='" + Placa + '\'' +
                ", idTipoVehiculo=" + idTipoVehiculo +
                ", idMarcaVehiculo=" + idMarcaVehiculo +
                ", FechaMatricula='" + FechaMatricula + '\'' +
                '}';
    }
}
