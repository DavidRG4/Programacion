package com.company;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int altura,anchura;
        altura=sc.nextInt();
        anchura=(altura/2)+1;
        //parte de arriba
        for (int i = 0; i <anchura; i++) {
            for (int j = 0; j <anchura-(i+1) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("*");
            }
            if( i==anchura-1){
                System.out.print("*****");
                System.out.println("");
            }else  {
                System.out.println("");
            }
        }
        //parte de abajo

        for (int i = 0; i <anchura-1; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <anchura-(i+1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
