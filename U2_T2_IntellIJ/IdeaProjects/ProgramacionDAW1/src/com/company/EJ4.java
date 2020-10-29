package com.David.practicar;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        System.out.println("Dime la altura de la flecha");
        altura = sc.nextInt();

            for (int j = 0; j < altura / 2; j++) {
                for (int k = 0; k < ((altura / 2) - j); k++) {
                    System.out.printf(" ");
                }
                System.out.println("*    *");
            }
            System.out.println("*    *");
            for (int j = 0; j <altura/2; j++) {


                for (int k = 0; k < (((altura - (altura / 2)) / 4) + j); k++) {
                    System.out.printf(" ");
                }
                System.out.println("*    *");
            }



    }
}
/*

 */