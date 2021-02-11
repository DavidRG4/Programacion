package com.company.PracticaInterfaces;

import java.util.Arrays;

public class Judo extends Deporte{
    int tatamis;

    public Judo(String nombreDep, String pabellon, int tatamis) {
        super(nombreDep, pabellon);
        this.tatamis = tatamis;
    }

    @Override
    public String toString() {
        return "Judo{" +
                "nombreDep='" + nombreDep + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", listaPart=" + Arrays.toString(listaPart) +
                ", tatamis=" + tatamis +
                '}';
    }
}
