package com.David.practicar;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        int n1, exp=0, dig=0;
        double binario=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero >= 0: ");
        n1 = sc.nextInt();
        while(n1!=0){
            dig = n1 % 2;
            binario = binario + dig * Math.pow(10, exp);
            exp++;
            n1 = n1/2;
        }
        System.out.printf("Binario:"+(int)binario);


    }
}
/*
  Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Introduzca un numero");
        n1=sc.nextInt();

        while (n1 != 0 && n1 != 1) {

            if (n1 % 2 == 0) {
                System.out.print("0");
            } else if (n1 % 2 == 1){
                System.out.print("1");
            }
            n1=n1/2;
        }
 */