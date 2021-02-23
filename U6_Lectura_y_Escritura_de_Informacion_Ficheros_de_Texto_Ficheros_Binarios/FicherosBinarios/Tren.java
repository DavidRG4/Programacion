package com.company.FicherosBinarios;

import java.io.Serializable;

public class Tren implements Serializable {
    private String nombre;
    private int peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Tren(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Tren"+
                "nombre: " + nombre + '\'' +
                "peso:" + peso;
    }
}
