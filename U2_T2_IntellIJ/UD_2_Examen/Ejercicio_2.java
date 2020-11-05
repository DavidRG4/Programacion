package com.company;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero;
        int num, inic, fin;
        System.out.print("Dime un numero entero positivo");
        num = sc.nextInt();
        while (num < 0) {
            System.out.println("Ese numero no vale, dime otro ");
            num = sc.nextInt();
        }
        System.out.print("introduce la posicion inicial ");
        inic = sc.nextInt();
        System.out.print("introduce la posicion final ");
        fin = sc.nextInt();
        numero = Integer.toString(num);
        System.out.print(numero.substring(0, inic - 1));
        System.out.print(numero.substring(fin, numero.length() - 1));
    }
}
