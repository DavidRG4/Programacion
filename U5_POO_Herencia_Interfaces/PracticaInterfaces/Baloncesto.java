package com.company.PracticaInterfaces;

import java.util.Arrays;

public class Baloncesto extends Deporte {
  private   int numEquipos;

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public Baloncesto(String nombreDep, String pabellon, int numEquipos) {
        super(nombreDep, pabellon);
        this.numEquipos = numEquipos;
    }

    @Override
    public String toString() {
        return "Baloncesto{" +
                "numEquipos=" + numEquipos +
                ", nombreDep='" + nombreDep + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", listaPart=" + Arrays.toString(listaPart) +
                '}';
    }
}
