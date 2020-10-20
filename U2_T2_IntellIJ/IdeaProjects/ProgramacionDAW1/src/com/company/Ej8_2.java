package com.company;

import java.util.Scanner;

public class Ej8_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0,rest=0;
        System.out.println("dime las edades");
        while(n1>=0){
            n1= sc.nextInt();
            if (n1>0){if (n1>=18){
                System.out.println("Es mayor de edad");
            }
                rest=rest+n1;
            }
            else if(n1<0){
                break;
            }
        }
        System.out.println("La suma total es"+rest);

    }
}
