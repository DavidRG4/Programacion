package com.company;

import java.util.Scanner;

public class Ej8_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,max,min,aux;
        System.out.println("dime el maximo del intervalo ");
        max= sc.nextInt();
        System.out.println("dime el minimo del intervalo");
        min= sc.nextInt();
        if (max<min){
            aux=min;
            max=min;
            max=aux;
        }
        n1=min;
        System.out.println("dime un numero dentro de ese intervalo");
        while (n1<=min || n1>=max){
            n1= sc.nextInt();
            if(n1<=min || n1>=max){
                System.out.println("Ese numero no esta en el intervalo vuelve a intentarlo");
            }
        }
        System.out.println("Bien ese numero esta bien");
    }
}
