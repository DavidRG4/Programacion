package com.company.ferroriarios.Personal;

public class Maquinistas {
    public String nombre;
    public String DNI;
    public int saldo;
    public String rango;

    public Maquinistas(String nombre, String DNI, int saldo, String rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = saldo;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinistas{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", saldo=" + saldo +
                ", rango='" + rango + '\'' +
                '}';
    }
}
