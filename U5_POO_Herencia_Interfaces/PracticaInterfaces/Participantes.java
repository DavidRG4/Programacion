package com.company.PracticaInterfaces;

public abstract class Participantes implements Comparable<Participantes>{
  protected   String nombre;
  protected   int edad;
    public abstract void hacerJuramento();
    public Participantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

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

    @Override
    public int compareTo(Participantes o) {
        return this.edad-o.getEdad();
    }

    @Override
    public String toString() {
        return "Participantes{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
