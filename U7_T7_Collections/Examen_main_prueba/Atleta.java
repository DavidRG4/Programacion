package com.company;

import java.io.Serializable;

public class Atleta implements Serializable {
    private String nombre;
    private String pais;
    private int marca;
    private Categoria categoria;
    private boolean finisher;

    public Atleta(String nombre, String pais, Categoria categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;
        this.marca=0;
        this.finisher=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    @Override
    public String toString() {
        return  "Atleta : " +
                " nombre : " + nombre + '\'' +
                " pais : " + pais + '\'' +
                " categoria : " + categoria;

    }
}
