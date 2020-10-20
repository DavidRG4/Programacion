package com.company;

import java.util.Scanner;

public class Ej8_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1;
        boolean esprimo =true;
        System.out.println("Dime un numero");
        n1= sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            esprimo=true;
            for (int j = 2; j <i ; j++) {
                if (i%j == 0) {
                    esprimo=false;
                    break;
                }
            }
            if (esprimo){
                System.out.println(i+" es primo");
            }else  {
                System.out.println(i+" no es primo");
            }
        }

    }
}
