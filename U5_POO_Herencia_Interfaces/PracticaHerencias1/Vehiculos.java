package com.company.PracticaHerencias1;

public abstract class Vehiculos {
    protected String nombre;
    protected int numeroPersonas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Vehiculos(String nombre, int numeroPersonas) {
        this.nombre = nombre;
        this.numeroPersonas = numeroPersonas;
    }
    public  void transportar(int n){
        numeroPersonas+=n;
    }


}
