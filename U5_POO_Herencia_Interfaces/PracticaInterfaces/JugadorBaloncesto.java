package com.company.PracticaInterfaces;

import com.company.Personas;

import java.util.Arrays;

public class JugadorBaloncesto extends Participantes implements Encestar {
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public JugadorBaloncesto(String nombre, int edad, double altura) {
        super(nombre, edad);
        this.altura = altura;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+this.nombre+", como jugador Baloncesto juro los valores deportivos mundiales");

    }


    @Override
    public String toString() {
        return "JugadorBaloncesto{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
