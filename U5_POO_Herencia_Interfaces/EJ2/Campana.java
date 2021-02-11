package com.company.EJ2;

import java.util.Arrays;

public class Campana extends Instrumento{
    @Override
    public void interpretar() {
        System.out.println("Soy una Campana");
        for (NotasEnum n:notas) {
            System.out.print(n+"-");
        }
    }
}
