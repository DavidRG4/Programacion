package com.company.Funciones;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Dime un numero");
        n1 = sc.nextInt();

        divisoreprimos(n1);


    }

    public static void divisoreprimos(int a) {
        boolean primo = false;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
    }
}
