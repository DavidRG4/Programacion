package com.company;

import java.util.Scanner;

public class Ej14_bucles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1;
        System.out.println("Dime un numero para el triangulo");
        n1= sc.nextInt();
        for (int i = 0; i < n1 ; i++) {
            for (int j = 0; j < n1-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
