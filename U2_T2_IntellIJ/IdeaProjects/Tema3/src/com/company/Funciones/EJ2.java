package com.company.Funciones;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Dime un numero");
        n1 = sc.nextInt();
        if (primo(n1)) {
            System.out.println("es primo");
        } else {
            System.out.println("NO es primo");
        }
    }

    public static boolean primo(int a) {

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }


}

