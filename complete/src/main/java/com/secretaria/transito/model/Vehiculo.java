package com.secretaria.transito.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="vehiculos")
public class Vehiculo {

    @Id
    @Column(name="placa",length = 10)
    private String Placa;

    @ManyToOne
    @JoinColumn(name = "id_tipo_vehiculo")
    private TipoVehiculo TipoVehiculo;

    @ManyToOne
    @JoinColumn(name = "id_marca_automovil")
    private MarcaVehiculo MarcaVehiculo;

    @ManyToOne
    @JoinColumn(name = "identificacion_cliente")
    private Cliente Cliente;


    @Column(name="fecha_matricula")
    private String FechaMatricula;

    public Vehiculo() {
        super();
    }


    public com.secretaria.transito.model.MarcaVehiculo getMarcaVehiculo() {
        return MarcaVehiculo;
    }

    public com.secretaria.transito.model.Cliente getCliente() {
        return Cliente;
    }

    public void setMarcaVehiculo(com.secretaria.transito.model.MarcaVehiculo marcaVehiculo) {
        MarcaVehiculo = marcaVehiculo;
    }
    public void setCliente(com.secretaria.transito.model.Cliente cliente) {
        Cliente = cliente;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setTipoVehiculo(TipoVehiculo TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public void setMarca(MarcaVehiculo idMarcaVehiculo) {
        this.MarcaVehiculo = idMarcaVehiculo;
    }

    public void setFechaMatricula(String FechaMatricula) {
        this.FechaMatricula = FechaMatricula;
    }

    public String getPlaca() {
        return Placa;
    }

    public TipoVehiculo getTipoVehiculo() {
        return TipoVehiculo;
    }

    public MarcaVehiculo getMarca() {
        return this.MarcaVehiculo;
    }

    public String getFechaMatricula() {
        return FechaMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return getPlaca().equals(vehiculo.getPlaca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlaca());
    }

    @Override
    public String toString() {
        return
                this.TipoVehiculo.getNombre()+"\n"+
                this.Placa +"\n"+
                this.MarcaVehiculo.getNombre() +"\n"+
                this.FechaMatricula.toString() +"\n";
    }
}
