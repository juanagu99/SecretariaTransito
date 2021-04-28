package com.secretaria.transito.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agentes_transito")
public class AgenteTransito {

    @Id
    @Column(name = "identificacion", updatable = false, nullable = false, unique = true)
    private String identificacion;

    @Column(name = "")
    private String nombre;

    public AgenteTransito() {
    }

    public AgenteTransito(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "AgenteTransito{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
