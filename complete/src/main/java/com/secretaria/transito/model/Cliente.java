package com.secretaria.transito.model;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    @Column(name = "identificacion", updatable = false, nullable = false, unique = true)
    private String identificacion;

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento TipoDocumento;

    @Column(name="Nombre",length = 200)
    private String Nombre;
    @Column(name="Direccion",length = 200)
    private String Direccion;

    public Cliente() {
    }

    public Cliente(String Identificacion, TipoDocumento TipoDocumento, String Nombre, String Direccion) {
        this.identificacion = Identificacion;
        this.TipoDocumento = TipoDocumento;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setTipoDocumentoCliente(TipoDocumento TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public TipoDocumento getTipoDocumentoCliente() {
        return TipoDocumento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Identificacion='" + identificacion + '\'' +
                ", TipoDocumento=" + TipoDocumento.getNombre() +
                ", Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }
}
