package com.company.PracticaExamen;

public class Perros {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunas;
    private Propietario propietario;
    private String raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Perros(String nombre, int edad, double peso, boolean vacunas, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.propietario = propietario;
        this.raza = raza;
    }

}
