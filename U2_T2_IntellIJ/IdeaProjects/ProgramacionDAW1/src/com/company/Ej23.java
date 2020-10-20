package com.company;

import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,secret;
       secret=(int)(Math.random()*101-1);

        System.out.println("Adivina en que numero estoy pensando entre 1-100, si te rindes pon -1");
        n1= sc.nextInt();

        while (n1!=-1){
            n1= sc.nextInt();
            if (n1>secret){
                System.out.println("El numero es demasiado mayor");
            }else if (n1<secret){
                System.out.println("El numero es demasiado pequeño");
            }else {
                System.out.println("has acertado");
                break;
            }
        }
    }
}
