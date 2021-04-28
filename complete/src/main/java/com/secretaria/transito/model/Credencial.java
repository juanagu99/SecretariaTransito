package com.secretaria.transito.model;

public class Credencial {

    private String identificacion;

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Credencial(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Credencial{" +
                "identificacion='" + identificacion + '\'' +
                '}';
    }
}
