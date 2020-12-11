package com.company;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cd1, cr1;
        int fd, fr, cd2 = 0, cr2 = 0;
        String[] columnas = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int[] filas = {8, 7, 6, 5, 4, 3, 2, 1};
        int[][] tablero = new int[8][8];
        System.out.println("Las columnas van de la a-h y las filas del 1-8");
        System.out.println("Dime la columna de la reina");
        cd1 = sc.nextLine();
        System.out.println("Dime la fila de la reina");
        fd = sc.nextInt();
        System.out.println("Dime la columna del rey");
        sc.nextLine();
        cr1 = sc.nextLine();
        System.out.println("Dime la fila del rey");
        fr = sc.nextInt();
        //REINA
        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i].equals(cd1)) {
                cd2 = i;
            }
        }
        //REY
        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i].equals(cr1)) {
                cr2 = i;
            }
        }
        if (cr2 == cd2 && fr == fd) {
            System.out.println("La Reina y el rey estan en la misma posicion. Eso significa que el Rey a muerto y la Reina ha ganado la parida");
        }else if (jaque(fr, cr2, fd, cd2)) {
            System.out.println("El rey esta e jaque con la reina");
        } else {
            System.out.println("El Rey esta seguro");
        }
    }

    public static boolean jaque(int frey, int crey, int freina, int creina) {
        boolean jaque = false;
        if (crey + frey == creina + freina || crey - frey == creina - freina || crey == creina || freina == frey) {
            jaque = true;

        }
        return jaque;

    }
}
