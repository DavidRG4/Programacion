package com.company.PracticaInterfaces;

import java.util.Arrays;

public class Atletismo extends Deporte{
   private int numPruebas;

    public Atletismo(String nombreDep, String pabellon, int numPruebas) {
        super(nombreDep, pabellon);
        this.numPruebas = numPruebas;
    }

    public int getNumPruebas() {
        return numPruebas;
    }

    public void setNumPruebas(int numPruebas) {
        this.numPruebas = numPruebas;
    }

    @Override
    public String toString() {
        return "Atletismo{" +
                "numPruebas=" + numPruebas +
                ", nombreDep='" + nombreDep + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", listaPart=" + Arrays.toString(listaPart) +
                '}';
    }
}
