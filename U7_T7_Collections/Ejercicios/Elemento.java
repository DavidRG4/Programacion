package com.company.Ejercicios;

import java.util.Objects;

public class Elemento {
    String nombre;
    String precio;
    int unidades;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public Elemento(String nombre, String precio, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elemento elemento = (Elemento) o;
        return nombre.equals(elemento.nombre) && precio.equals(elemento.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return "Elemento " +
                "nombre " + nombre + '\'' +
                "precio " + precio + '\'' +
                "unidades " + unidades;
    }
}
