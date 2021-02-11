package com.company.PracticaHerencias1;

public class Avioneta extends Aereo{
    public Avioneta(String nombre, int numeroPersonas, int altura, String OACI) {
        super(nombre, numeroPersonas, altura, OACI);
    }

    @Override
    public String toString() {
        return "Avioneta " +
                "altura: " + altura +
                ", OACI: " + OACI + '\'' +
                ", Pasajeros: " + numeroPersonas;
    }
}
