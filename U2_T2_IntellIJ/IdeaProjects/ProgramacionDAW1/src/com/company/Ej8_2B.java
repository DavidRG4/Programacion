package com.company;

import java.util.Scanner;

public class Ej8_2B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0,suma=0,num_alum=0,alum_adult=0;
        System.out.println("Introduce las edades");
        num= sc.nextInt();
        while (num>0){
            num_alum++;
            suma +=num;
            if (num>=18){
                alum_adult++;
            }
            System.out.println("Introduce las edades");
            num= sc.nextInt();
        }
        System.out.println("La suma de alumnos es "+suma);
        System.out.println("La media de alumnos es "+(suma/num_alum));
        System.out.println("el numero de mayores de edad son "+alum_adult);

    }
}
