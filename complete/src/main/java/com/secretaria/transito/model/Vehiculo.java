package com.secretaria.transito.model;

import javax.persistence.*;

@Entity
@Table(name="Vehiculos")
public class Vehiculo extends Cliente{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdVehiculo;
    @Column(name="Placa",length = 10)
    private String Placa;
    @Column(name="idTipoVehiculo",length = 11)
    private Integer idTipoVehiculo;
    @Column(name="idMarcaVehiculo",length = 11)
    private Integer idMarcaVehiculo;
    @Column(name="FechaMatricula")
    private String FechaMatricula;

    public Vehiculo() {
        super();
    }

    public void setIdVehiculo(Integer idVehiculo) {
        IdVehiculo = idVehiculo;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setTipoVehiculo(Integer idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public void setMarca(Integer idMarcaVehiculo) {
        this.idMarcaVehiculo = idMarcaVehiculo;
    }

    public void setFechaMatricula(String FechaMatricula) {
        this.FechaMatricula = FechaMatricula;
    }

    public Integer getIdVehiculo() {
        return IdVehiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public Integer getTipoVehiculo() {
        return idTipoVehiculo;
    }

    public Integer getMarca() {
        return this.idMarcaVehiculo;
    }

    public String getFechaMatricula() {
        return FechaMatricula;
    }

    @Override
    public String toString() {
        return this.Placa +"\n"+
                this.idMarcaVehiculo +"\n"+
                this.idTipoVehiculo+"\n"+
                this.FechaMatricula.toString() +"\n"+
                this.getIdentificacion()+"\n"+
                this.getTipoDocumentoCliente()+"\n"+
                this.getNombre();
    }
}
