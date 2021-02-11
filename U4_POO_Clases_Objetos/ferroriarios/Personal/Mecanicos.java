package com.company.ferroriarios.Personal;

public class Mecanicos {
    public String nombre;
    public int telefono;
    public String especialidad;

    public Mecanicos(String nombre, int telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanicos{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
