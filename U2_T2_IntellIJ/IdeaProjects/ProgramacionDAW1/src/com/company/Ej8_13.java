package com.company;

import java.util.Scanner;

public class Ej8_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,a=0,c=0,s=0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Dime una de las 6 notas");
            n1= sc.nextInt();
            if (n1==4) {
                c++;
            }
            if (n1 < 4) {
                s++;
            }
            if (n1 > 4) {
                a++;
            }
        }
        System.out.println("Hay "+a+" aprobados, "+c+" son acondicionados, "+s+" han suspendido");
    }
}
