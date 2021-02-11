package com.company.PracticaInterfaces;

public class Pais {
  private   String nombre;
  private   int NumParticipantes;

    public Pais(String nombre, int numParticipantes) {
        this.nombre = nombre;
        NumParticipantes = numParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumParticipantes() {
        return NumParticipantes;
    }

    public void setNumParticipantes(int numParticipantes) {
        NumParticipantes = numParticipantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", NumParticipantes=" + NumParticipantes +
                '}';
    }
}
