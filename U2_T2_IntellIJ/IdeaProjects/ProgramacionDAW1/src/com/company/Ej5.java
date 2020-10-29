package com.David.practicar;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;
        System.out.println("Introduce la atura");
        altura = sc.nextInt();
        anchura = ((altura * 2) - 1);
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ((anchura / 2) - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (((i * 2) + 2 + j) / 2); j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = 1; i < altura; i++) {
            for (int j = 0; j < i; j++) {// primero se imprimen los espacios
                System.out.print(" ");
            }
            for (int j = 0; j < anchura - i * 2; j++) { //imprimo asteriscos
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

