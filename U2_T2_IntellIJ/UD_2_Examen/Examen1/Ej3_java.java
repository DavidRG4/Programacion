package com.company;

import java.util.Scanner;

public class Ej3_java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean suerte=false;
        String loteria,n1,n2,n3;
        System.out.println("Introduzca sus numeros de la suerte");
        n1= sc.nextLine();
        n2= sc.nextLine();
        n3= sc.nextLine();
        System.out.print("Dime tu numero de la loteria");
        loteria= sc.nextLine();
        if (loteria.contains(n1) && loteria.contains(n2) && loteria.contains(n3)){
            suerte=true;
        }else {
            suerte=false;
        }
        if (suerte){
            System.out.println("Ese numero te dara suerte");
        }else if (!suerte){
            System.out.println("Ese numero no te dara suerte");
        }



    }
}
