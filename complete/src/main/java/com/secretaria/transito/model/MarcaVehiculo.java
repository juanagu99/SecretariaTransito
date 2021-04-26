package com.secretaria.transito.model;

import javax.persistence.*;

@Entity
@Table(name="tipovehiculos")
public class TipoVehiculo {

    @Id
    @Column(name="id_tipo_vehiculo",length = 11)
    private Integer id_tipo_vehiculo;

    @Column(name="Nombre",length = 100)
    private String Nombre;

    public void setIdTipoVehiculo(Integer idTipoVehiculo) {
        this.id_tipo_vehiculo = id_tipo_vehiculo;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getIdTipoVehiculo() {
        return id_tipo_vehiculo;
    }

    public String getNombre() {
        return Nombre;
    }
}
