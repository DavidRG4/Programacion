package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Dime dos numeros");
        n1= sc.nextInt();
        n2= sc.nextInt();
        mostrar(n1,n2);
    }

public static void mostrar(int a,int b){
    if (a<b) {
        for (int i = a; i <b ; i++) {
        System.out.println(i);
        }
    }else {
        for (int i = b; i <a ; i++) {
            System.out.println(i);
        }
    }
}
}
