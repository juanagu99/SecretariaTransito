package com.secretaria.transito.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipodocumentos")
public class TipoDocumento {

    @Id
    @Column(name="id_tipo_documento",length = 11)
    private Integer id_tipo_documento;

    @Column(name="Nombre",length = 100)
    private String Nombre;

    public void setId_tipo_documento(Integer id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getId_tipo_documento() {
        return id_tipo_documento;
    }

    public String getNombre() {
        return Nombre;
    }
}
