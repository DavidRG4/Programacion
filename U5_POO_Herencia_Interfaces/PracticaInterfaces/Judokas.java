package com.company.PracticaInterfaces;

public class Judokas extends Participantes implements Luchar{
    int peso;

    public Judokas(String nombre, int edad, int peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+this.nombre+", como judoka juro los valores deportivos mundiales");

    }

    @Override
    public String toString() {
        return "Judokas{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }




}
