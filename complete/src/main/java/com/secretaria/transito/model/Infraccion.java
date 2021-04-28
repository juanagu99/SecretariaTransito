package com.secretaria.transito.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "infracciones")
public class Infraccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private Long id;

    @Column(name = "fecha_infraccion")
    private String fechaInfraccion;

    @ManyToOne
    @JoinColumn(name = "placa_vehiculo")
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "identificacion_agente_transito")
    private AgenteTransito agenteTransito;

    public Infraccion() {
    }

    public Infraccion(String fechaInfraccion, Vehiculo vehiculo, AgenteTransito agenteTransito) {
        this.fechaInfraccion = fechaInfraccion;
        this.vehiculo = vehiculo;
        this.agenteTransito = agenteTransito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaInfraccion() {
        return fechaInfraccion;
    }

    public void setFechaInfraccion(String fechaInfraccion) {
        this.fechaInfraccion = fechaInfraccion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public AgenteTransito getAgenteTransito() {
        return agenteTransito;
    }

    public void setAgenteTransito(AgenteTransito agenteTransito) {
        this.agenteTransito = agenteTransito;
    }

    @Override
    public String toString() {
        return "Infracciones{" +
                "id=" + id +
                ", fechaInfraccion=" + fechaInfraccion +
                ", vehiculo=" + vehiculo +
                ", agenteTransito=" + agenteTransito +
                '}';
    }
}
