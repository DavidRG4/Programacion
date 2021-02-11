package com.company.PracticaHerencias1;

public class Helicoptero extends Aereo{
    public Helicoptero(String nombre, int numeroPersonas, int altura, String OACI) {
        super(nombre, numeroPersonas, altura, OACI);
    }

    @Override
    public String toString() {
        return "Helicoptero " +
                "altura : " + altura +
                ", OACI : " + OACI + '\'' +
                ", Pasajeros : " + numeroPersonas ;
    }
}
