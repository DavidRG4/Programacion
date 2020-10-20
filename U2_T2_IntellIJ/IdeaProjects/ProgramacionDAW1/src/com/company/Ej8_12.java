package com.company;

import java.util.Scanner;

public class Ej8_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        System.out.println("Dime una de las cinco notas");
        n1 = sc.nextInt();
        System.out.println("Dime una de las cinco notas");
        n2 = sc.nextInt();
        System.out.println("Dime una de las cinco notas");
        n3 = sc.nextInt();
        System.out.println("Dime una de las cinco notas");
        n4 = sc.nextInt();
        System.out.println("Dime una de las cinco notas");
        n5 = sc.nextInt();
        if (n1 < 5 || n2 < 5 || n3 < 5 || n4 < 5 || n5 < 5) {
            System.out.println("Hay estudiantes con examenes supendidos");
        } else {
            System.out.println("Nadie a suspendido");
        }
    }
}
