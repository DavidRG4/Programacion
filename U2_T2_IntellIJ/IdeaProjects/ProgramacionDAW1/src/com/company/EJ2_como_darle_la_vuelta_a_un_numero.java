package com.David.practicar;

import java.util.Scanner;

public class EJ2_como_darle_la_vuelta_a_un_numero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double n1=0,n2=0,n3=0,igualdad=0;
        System.out.println("introduzca un numero entero positivo");
        n1= sc.nextDouble();
       igualdad=n1;
        while(n1!=0){
            n2=n1/10;
            n1=Math.floor(n2);
            n2=n2-Math.floor(n2);
            n3=n3*10+(n2*10);
            n3=Math.round(n3);
        }
        if(igualdad==n3){
            System.out.println("El "+(int)igualdad+" es capicua");
        }else {
            System.out.println("El "+(int)igualdad+" no es capicua");
        }

    }
}
