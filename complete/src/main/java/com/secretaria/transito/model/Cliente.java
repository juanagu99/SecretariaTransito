package com.secretaria.transito.model;

import javax.persistence.*;

@Entity
@Table(name="Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Identificacion;
    @Column(name="idTipoDocumento",length = 11)
    private Integer idTipoDocumento;
    @Column(name="Nombre",length = 200)
    private String Nombre;
    @Column(name="Direccion",length = 200)
    private String Direccion;

    public Cliente() {
    }

    public Cliente(String Identificacion, Integer idTipoDocumento, String Nombre, String Direccion) {
        this.Identificacion = Identificacion;
        this.idTipoDocumento = idTipoDocumento;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }

    public void setIdentificacion(String identificacion) {
        this.Identificacion = identificacion;
    }

    public void setTipoDocumentoCliente(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public Integer getTipoDocumentoCliente() {
        return idTipoDocumento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }
}
