package com.company;

import java.util.Scanner;

public class Ej2_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String patata;
        double n1, n2 , n3=0;
        System.out.print("Dime un numero positivo entero: ");
        n1 = sc.nextInt();

        while (n1 <= 0) {
            System.out.print("Dime otro numero ese no era un numero positivo entero: ");
            n1 = sc.nextInt();
        }


    }
}
