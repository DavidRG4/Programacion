package com.company;

import java.util.Scanner;

public class Ej8_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, i = 0;
        System.out.println("tamaño arbol");
        while (n1 > -1) {
            n1 = sc.nextInt();
            if (n1 > -1) {
                System.out.println("codigo arbol " + i);
                System.out.println("tamaño del arbol " + n1 + "cm");
                i++;
                System.out.println("tamaño siguiente arbol");
            }
        }

    }
}
