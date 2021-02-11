package com.company.ferroriarios.Personal;

public class Jefe_estacion {
    public String nombre_completo;
    public String DNI;

    public Jefe_estacion(String nombre_completo, String DNI) {
        this.nombre_completo = nombre_completo;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Jefe_estacion{" +
                "nombre_completo='" + nombre_completo + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
