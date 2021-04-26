package com.secretaria.transito.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marcavehiculos")
public class MarcaVehiculo {

    @Id
    @Column(name="id_marca_vehiculo",length = 11)
    private Integer id_marca_vehiculo;

    @Column(name="Nombre",length = 100)
    private String Nombre;

    public void setIdMarcaVehiculo(Integer id_marca_vehiculo) {
        this.id_marca_vehiculo = id_marca_vehiculo;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getIdMarcaVehiculo() {
        return id_marca_vehiculo;
    }

    public String getNombre() {
        return Nombre;
    }
}
