package com.company.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List cartas = new ArrayList<Cartas>();
        String[] palo = {"basto", "espada", "oro", "copa"};
        String[] numero = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "Rey"};
        while (cartas.size() <= 10) {
            String p = palo[(int) (Math.random() * 4)];
            String n = numero[(int) (Math.random() * 10)];
            Cartas c = new Cartas(n, p);
            if (!cartas.contains(c)) {
                cartas.add(c);
            }
        }
        System.out.println(cartas);
    }
}
