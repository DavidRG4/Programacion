package com.company.EJ2;

import java.util.Arrays;

public class Piano extends Instrumento{

    @Override
    public void interpretar() {
        System.out.println("Soy un piano");
        for (NotasEnum n:notas) {
            System.out.print(n+"-");
        }
    }
}
